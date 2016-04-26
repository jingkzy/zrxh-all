package com.test;

import java.io.File;
import java.util.List;

public class FileUtils {
	public static void listFile(File f,List fileList){
	if(f.isDirectory()){
	File[] files = f.listFiles();
	for(int i=0;i<files.length;i++)
	{
	listFile(files[i],fileList) ;
	}
	}else{
	fileList.add(f.getAbsolutePath());
	}
	}
}