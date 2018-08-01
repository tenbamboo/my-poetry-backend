package com.tenbamboo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.tenbamboo.base.GlobalResult;
import com.tenbamboo.bean.BsShop;

@Controller
@RequestMapping(value="/demo2",produces="application/json;charset=UTF-8",method = RequestMethod.POST)
@ResponseBody
public class DemoController2 {
	
	
	private static Logger logger = Logger.getLogger(DemoController2.class);  
	
	
	
	/**
	 * @todo 我是测试返回JSON字符串
	 * @param request
	 * @param myDemo
	 * @return
	 */
	@RequestMapping(value = "/post1")
	public String post1(HttpServletRequest request){
		GlobalResult res=new GlobalResult();
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("name", "123哈哈哈");
		map.put("id", "12");
		map.put("sex", "男");
		res.setResult(map);
		return res.sendResult(); //JSON.toJSONString(res;
	}
	
	
	/**
	 * @todo 我是测试业务异常
	 * @param request
	 * @param myDemo
	 * @return
	 */
	@RequestMapping(value = "/post2")
	public String post2(HttpServletRequest request){
		GlobalResult res=new GlobalResult();
		res.setErrorCode("1001");
		res.setErrorMsg("错误了");
//		Map<String,Object> map=new HashMap<String,Object>();
//		map.put("name", "123哈哈哈");
//		map.put("id", "12");
//		map.put("sex", "男");
//		res.setResult(map);
		return  JSON.toJSONString(res);
	}
	/**
	 * @todo 我是测试系统异常
	 * @param request
	 * @param myDemo
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value = "/post3")
	public String post3(HttpServletRequest request) throws Exception{
		throw new Exception("系统异常");
	}
	
	
	/**
	 * @todo 我是测试通过实体类获取前端数据的方法
	 * @param request
	 * @param myDemo
	 * @return
	 */
	@RequestMapping(value = "/post4")
	public String post4(HttpServletRequest request,@ModelAttribute BsShop myDemo){
		 GlobalResult res=new GlobalResult();
		 System.out.println(myDemo.getCity());
		 System.out.println(myDemo.getChannel());
		 return  JSON.toJSONString(res);
	}
	/**
	 * @todo 我是测试通过其他方式获取前端数据
	 * @param request
	 * @param myDemo
	 * @return
	 */
	@RequestMapping(value = "/post5")
	public String post5(HttpServletRequest request,String name){
		 GlobalResult res=new GlobalResult();
		 System.out.println(request.getParameter("id"));
		 System.out.println(name);
		 return  JSON.toJSONString(res);
	}
	
	
	
	
	
	

	
	

	
	
	
}
