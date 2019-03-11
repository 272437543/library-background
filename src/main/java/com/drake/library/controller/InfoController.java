package com.drake.library.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.drake.mapper.SeatsMapper;

@Controller
public class InfoController {

	@Autowired
	private SeatsMapper seatsMapper;
	
	@ResponseBody
	@RequestMapping("/classified/info")
	public String getInfo(String msg, String key)
	{
		if (!decode(getCurrentDate()).equals(key)) return "fail";
		System.out.println(msg);
		// TODO 根据得到的信息更新数据库
		return "got!!!";
	}
	
	private String decode(String key)
	{
		// TODO 加密
		return key;
	}
	
	public static String getCurrentDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateNowStr = sdf.format(new Date());
		return dateNowStr;
	}
}
