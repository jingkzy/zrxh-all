package com.wukong.weixin.tools;

import java.io.IOException;
import java.security.cert.X509Certificate;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * https工具类
 * 
 * @author wukong
 *
 */
public class HttpUtil {
	static Logger logger = LoggerFactory.getLogger(HttpUtil.class);
	/**
	 * https
	 * @param url
	 * @return
	 * @throws ClientProtocolException
	 * @throws Exception
	 */
	public static String GETS(String url) throws ClientProtocolException, Exception {
		HttpGet get = new HttpGet(url);
		CloseableHttpClient  client = HttpsClient.createHttpsClient();  
		try {
			CloseableHttpResponse response = client.execute(get);
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                return EntityUtils.toString(response.getEntity(),"UTF-8");
            } else {
                throw new IllegalArgumentException("获取数据失败");
            }
		} finally {
			
		}
	}
	/**
	 * http
	 * @param url
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	public static String GET(String url) throws ClientProtocolException, IOException {
		HttpGet get = new HttpGet(url);
		CloseableHttpClient  client = HttpClients.createDefault();  
		try {
			CloseableHttpResponse response = client.execute(get);
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                return EntityUtils.toString(response.getEntity());
            } else {
                throw new IllegalArgumentException("获取数据失败");
            }
		} finally {
			
		}
	}
	/**
	 * https 特殊client
	 *
	 */
	static class HttpsClient {
		public static CloseableHttpClient createHttpsClient() throws Exception {
			X509TrustManager x509mgr = new X509TrustManager() {
				@Override
				public void checkClientTrusted(X509Certificate[] xcs, String string) {
				}

				@Override
				public void checkServerTrusted(X509Certificate[] xcs, String string) {
				}

				@Override
				public X509Certificate[] getAcceptedIssuers() {
					return null;
				}
			};
			SSLContext sslContext = SSLContext.getInstance("TLS");
			sslContext.init(null, new TrustManager[] { x509mgr }, new java.security.SecureRandom());
			SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslContext,SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
			return HttpClients.custom().setSSLSocketFactory(sslsf).build();
		}
	}
}