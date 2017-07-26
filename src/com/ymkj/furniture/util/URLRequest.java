package com.ymkj.furniture.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;


/**
 * Http请求类
 * 
 * @author Sandy
 * 
 */
public class URLRequest {

	// 通用请求
	public static String requestURL(String uri, String par,Object...obj) {
		try {
			URL url = new URL(uri);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoInput(true);

			if(obj.length!=0){
				conn.setRequestMethod("POST");
			}
			
			if (par != null) {
				conn.setDoOutput(true);
				conn.getOutputStream().write(par.getBytes("UTF-8"));
			}

			InputStream is = conn.getInputStream();
			/*byte[] byt = new byte[1024];
			StringBuffer sb = new StringBuffer();
			while (is.read(byt) != -1) {
				sb.append(new String(byt, "UTF-8"));
			}
			is.close();*/
			StringBuffer sb = new StringBuffer();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String str = null;
			while((str = br.readLine())!=null){ 
				sb.append(str);
				} 
			isr.close();
			return sb.toString();
		} catch (Exception e) {
			System.out.println("URLRequest 请求出问题:" + e.getMessage());
			return null;
		}
	}
	
	// 通用请求
			public static String requestURL2(String uri, String par,Object...obj) {
				try {
					URL url = new URL(uri);
					HttpURLConnection conn = (HttpURLConnection) url.openConnection();
					conn.setDoInput(true);
				if(obj.length!=0){
					conn.setRequestMethod("POST");
				}
				
				if (par != null) {
					conn.setDoOutput(true);
					conn.getOutputStream().write(par.getBytes("UTF-8"));
				}

				InputStream is = conn.getInputStream();
				byte[] byt = new byte[1024];
				StringBuffer sb = new StringBuffer();
				while (is.read(byt) != -1) {
					sb.append(new String(byt, "UTF-8"));
				}
				is.close();
				return sb.toString();
			} catch (Exception e) {
				System.out.println("URLRequest 请求出问题:" + e.getMessage());
				return null;
			}
		}
}
