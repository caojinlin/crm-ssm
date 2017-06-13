package com.ncist.edu.crm.utils;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

public class ReadUtil {

	public static String readProperties() {
		Properties properties = new Properties();
		try {
			properties.load(new InputStreamReader(ReadUtil.class.getClassLoader().getResourceAsStream("category.properties"), "UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		String path = properties.getProperty("path");
		
		return path;
	}
	
	public static String characterModify(String searchWord){
		try {
			if(searchWord.equals(new String(searchWord.getBytes("iso8859-1"), "iso8859-1"))){
				searchWord=new String(searchWord.getBytes("iso8859-1"),"utf-8");
			}else if(searchWord.equals(new String(searchWord.getBytes("gbk"), "gbk"))){
				searchWord=new String(searchWord.getBytes("gbk"),"utf-8");
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return searchWord;
	}
	
	public static boolean isNotNull(String data){
		if(data != null && data != null && !"null".equals(data) && !"".equals(data)){
			return true;
		}
		return false;
	}
}
