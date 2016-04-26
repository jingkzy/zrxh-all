package com.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field.Store;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.IndexWriterConfig.OpenMode;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;

/**
 * 多文件搜索
 * 
 * @Project Lucene-test
 *
 * @Filename MultLuceneTest2.java
 *
 * @author Jack.Zhou
 *
 * @Date 2013-8-29
 *
 */
public class LuceneTest {
	private static final String QUERY_STR = "新闻";
	private static final String FILE_TARGET = "D:\\lucene\\luceneData";
	private static final String FILE_INDEX = "D:\\lucene\\luceneIndex";

	public static void main(String[] args) {
		try {
			LuceneTest t = new LuceneTest();
			//t.createIndex();
			t.searchByKeyWords(QUERY_STR);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 创建索引
	 * 
	 * @throws Exception
	 */
	private void createIndex() throws Exception {
		Long startTime = System.currentTimeMillis();
		File indexDir = new File(FILE_INDEX);
		Analyzer luceneAnalyzer = new StandardAnalyzer(Version.LUCENE_44);
		IndexWriterConfig config = new IndexWriterConfig(Version.LUCENE_44, luceneAnalyzer);
		config.setOpenMode(OpenMode.CREATE);
		Directory directory = FSDirectory.open(indexDir);
		IndexWriter indexWriter = new IndexWriter(directory, config);
		List<String> fileList = new ArrayList();
		FileUtils.listFile(new File(FILE_TARGET), fileList);
		for (String filePath : fileList) {
			System.out.println("文件:" + filePath + "正在被索引....");
			String content = readFile(filePath);
			Document doc = new Document();
			doc.add(new TextField("content", content.toString(), Store.YES));
			doc.add(new TextField("path", filePath, Store.YES));
			indexWriter.addDocument(doc);
		}
		indexWriter.close();
		Long endTime = System.currentTimeMillis();
		System.out.println("花费了" + (endTime - startTime) + "毫秒来创建索引文件");
	}

	/**
	 * 读取文件内容
	 * 
	 * @param filePath
	 * @return
	 * @throws Exception
	 */
	private String readFile(String filePath) throws Exception {
		@SuppressWarnings("resource")
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));
		StringBuffer content = new StringBuffer();
		String str = null;
		while ((str = bufferedReader.readLine()) != null) {
			content.append(str).append("\n");
		}
		return content.toString();
	}

	private void searchByKeyWords(String keyWords) throws Exception {
		IndexReader reader = DirectoryReader.open(FSDirectory.open(new File(FILE_INDEX)));
		IndexSearcher searcher = new IndexSearcher(reader);
		Analyzer analyzer = new StandardAnalyzer(Version.LUCENE_44);
		QueryParser parser = new QueryParser(Version.LUCENE_44, "content", analyzer);
		Query query = parser.parse(keyWords);
		TopDocs results = searcher.search(query, 1000);
		ScoreDoc[] score = results.scoreDocs;
		if (score.length == 0) {
			System.out.println("对不起，没有找到您要的结果。");
		} else {
			System.out.println("查找[" + QUERY_STR + "]有" + score.length + "个结果");
			for (int i = 0; i < score.length; i++) {
				try {
					Document doc = searcher.doc(score[i].doc);
					System.out.print("这是第" + i + "个检索到的结果，文件名为：");
					System.out.println(doc.get("path"));
					//System.out.println("内容:\n" + doc.get("content"));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}