package com.wukong.weixin.tools;

import java.io.IOException;
import java.security.cert.X509Certificate;
import java.util.List;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.sf.json.JSONObject;
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
			try {
                client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
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
                return EntityUtils.toString(response.getEntity(),"UTF-8");
            } else {
                throw new IllegalArgumentException("获取数据失败");
            }
		} finally {
			try {
                client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
		}
	}
	
	public static String POSTS(String url, String postJson) throws ClientProtocolException, Exception {
		HttpPost post = new HttpPost(url);
		CloseableHttpClient  client = HttpsClient.createHttpsClient();  
		try {
			StringEntity entity = new StringEntity(postJson, "UTF-8");
			post.setEntity(entity);
			CloseableHttpResponse response = client.execute(post);
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                return EntityUtils.toString(response.getEntity(),"UTF-8");
            } else {
                throw new IllegalArgumentException("获取数据失败");
            }
		} finally {
			 try {
                client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
		}
	}
	
	public static String POST(String url, List<NameValuePair> formparams) throws ClientProtocolException, IOException {
		HttpPost post = new HttpPost(url);
		CloseableHttpClient  client = HttpClients.createDefault();  
		try {
			post.setEntity(new UrlEncodedFormEntity(formparams,"UTF-8"));
			CloseableHttpResponse response = client.execute(post);
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                return EntityUtils.toString(response.getEntity(),"UTF-8");
            } else {
                throw new IllegalArgumentException("获取数据失败");
            }
		} finally {
			 try {
                client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
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
	public static void main(String[] args) {
		/*JSONObject ret = new JSONObject();
		try{
			String access_token = ParseResourceUtil.getProperty("access_token");
			String access_token_url = access_token + "?grant_type=client_credential&appid=wx9f959cbaf7c150a0&secret=dd41ff2ce710328e2258ce1960d216c8";
			ret = JSONObject.fromObject(HttpUtil.GETS(access_token_url));
		}catch(Exception ex){
			ex.printStackTrace();
			ret.put("errcode", "61450");
			ret.put("errmsg",  "API异常getAccessToken["+ex.getMessage()+"]");
		}*/
		//h1uVNfZ5qx3hQlvm2ThvOCs9ynAVhmbx1eu0UPjbbKPSHyHZ0nftVnwNfVusjcJUH4nk3sCqEjKFEHssQSWnh2Tm3QDbHB7xCBLA2I2plAJvThrDjrtvmcMThQ-RbjqeDRPjAEAPDB
		String access_token = "_0PEVOioholeGOKw34U7Ia63RBvmwAJK26uxX6Hy_YvwGWnJwxaKhKuRU6J4y18jMWosoT9XKiIwKrdr7IukoQwGZ-NAIC-dbdea9oJw2lk51aqh064aOKHqynlSac_SRLMdAIAXRS";
			JSONObject ret = new JSONObject();
		try{
			String access_token_url ="https://api.weixin.qq.com/cgi-bin/poi/getpoilist?access_token="+access_token;
			JSONObject j = new JSONObject();
			j.put("begin", 0);
			j.put("limit", 10);
			ret = JSONObject.fromObject(HttpUtil.POSTS(access_token_url,j.toString()));
		}catch(Exception ex){
			ex.printStackTrace();
			ret.put("errcode", "61450");
			ret.put("errmsg",  "API异常getAccessToken["+ex.getMessage()+"]");
		}
		System.out.println(ret);
	}
}