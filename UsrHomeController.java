package com.sbs.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.Getter;

@Controller
public class UsrHomeController {
	@RequestMapping("usr/home/getString")
	@ResponseBody
	public String getString() {
		return "hi";
	}
	
	@RequestMapping("usr/home/getInt")
	@ResponseBody
	public int getInt() {
		return 10;
	}	
	@RequestMapping("usr/home/getFloat")
	@ResponseBody
	public float getFloat() {
		return 10.5f;
	}
	@RequestMapping("usr/home/getBoolean")
	@ResponseBody
	public boolean getBoolean() {
		return true;
	}

	@RequestMapping("usr/home/getList")
	@ResponseBody
	public List<String> getList() {
//		Map<String, Object> map = new HashMap<>();
		List<String> list = new ArrayList<>();
//		map.put("철수나이", 22);
//		map.put("영수나이", 21);
		list.add("철수나이");
		list.add("영희나이");
		
		return list;
	}
class Article {
	@Getter
	private int id;
	private String title;
	
	public Article() {
		id = 1;
		title = "제목1";


		}
	}
}
