package com.tenbamboo;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.houbb.opencc4j.util.ZhConverterUtil;
import com.tenbamboo.bean.PoetryBase;
import com.tenbamboo.bean.PoetryContent;
import com.tenbamboo.util.DateUtil;
import com.tenbamboo.util.FileUtils;
import com.tenbamboo.util.Uid;

public class Test2 {
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		String a= "校书朱君示及园居胜概新篇一轴皆有标目辄成长调格诗奉纪清{属}abc";
		a = a.replaceAll("\\{(.*?)\\}", "");
		System.out.println(a);
	}

}
