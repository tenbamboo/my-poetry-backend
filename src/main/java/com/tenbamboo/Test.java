package com.tenbamboo;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.alibaba.fastjson.JSONArray;
import com.github.houbb.opencc4j.util.ZhConverterUtil;
import com.tenbamboo.util.FileUtils;

public class Test {
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		Test t = new Test();
		
		
		File rootPath = new File("E:\\chinese-poetry-master\\json\\poet.song.0.json");
		JSONArray list = t.convertToSimple(rootPath);
//		list.get(0).toString()
//		System.out.println(ZhConverterUtil.convertToSimple("𡨢"));
//		File[] list = rootPath.listFiles();
//		for(File item : list) {
//			
//
//			
//		}
		
	}
	public JSONArray convertToSimple(File file) throws UnsupportedEncodingException, IOException{
		String res = FileUtils.readFile(file.getAbsolutePath());
//		System.out.println(res);
		res =  ZhConverterUtil.convertToSimple(res);
		System.out.println(res);
		return JSONArray.parseArray(res);
		
	}
}
