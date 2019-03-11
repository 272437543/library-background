package com.drake.utils;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
	
	private static final ObjectMapper MAPPER = new ObjectMapper();
	
	/**
	 * 传入对象变成Json字符串
	 * @param data 
	 * @return
	 */
	public static String objectToJson(Object data)
	{
		try{
			String objString = MAPPER.writeValueAsString(data);
			return objString;
		}catch(JsonProcessingException e){
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 讲Json字符串转换为对象
	 * @param jsonData
	 * @param beanType
	 * @return
	 */
	public static <T> T jsonToPoj(String jsonData, Class<T> beanType)
	{
		try{
			T t = MAPPER.readValue(jsonData, beanType);
			return t;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 将Json字符串转换为链表
	 * @param jsonData
	 * @param beanType
	 * @return
	 */
	public static <T> List<T> jsonToList(String jsonData, Class<T> beanType)
	{
		JavaType javaType = MAPPER.getTypeFactory().constructParametricType(List.class, beanType);
		try{
			List<T> list = MAPPER.readValue(jsonData, javaType);
			return list;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
