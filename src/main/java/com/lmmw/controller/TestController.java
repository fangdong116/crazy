package com.lmmw.controller;


import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/test")
public class TestController {
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String helloWorld(){
		return "你好混蛋";
	}
	
	@RequestMapping(value="/fastJosn",method=RequestMethod.GET)
	public Map<String, Object> fastJson(){
		Map<String, Object> map = new HashMap<>();
		map.put("int", null);
		map.put("list", null);
		map.put("list", new ArrayList<Integer>());
		return map;
	}
}
