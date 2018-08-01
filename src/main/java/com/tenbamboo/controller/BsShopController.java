package com.tenbamboo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tenbamboo.base.GlobalResult;
import com.tenbamboo.bean.BsShop;
import com.tenbamboo.bean.Pager;
import com.tenbamboo.service.BsShopService;

@Controller
@RequestMapping(value="/bs",produces="application/json;charset=UTF-8",method = RequestMethod.POST)
@ResponseBody
public class BsShopController {
	private static Logger log = Logger.getLogger(BsShopController.class); 
	
	@Resource
	private BsShopService bsShopService;
	
	
	
	@RequestMapping(value = "/getList")
	public String getList(HttpServletRequest request,String userId){
		
		log.info("=========");
		log.info("userId = "+userId);
		log.info("=============");
		System.out.println("###########################");
		GlobalResult res=new GlobalResult();
//		if (StringUtils.isBlank(userId)) {
//			res.setErrorCode("1");
//			res.setErrorMsg("用户ID不能为空！");
//			return res.sendResult();
//		}
		res.setResult(bsShopService.getShopList());
		return res.sendResult(); 
	}
	
	@RequestMapping(value = "/getListByPager")
	public String getListByPager(HttpServletRequest request,@ModelAttribute BsShop param,Pager pager,String type,int userId){
		GlobalResult res=new GlobalResult();
		if(StringUtils.isBlank(type)){
			res.setErrorCode("1");
			res.setErrorMsg("类型不能为空！");
			return res.sendResult();
		}else if(!NumberUtils.isNumber(String.valueOf(userId))){
			res.setErrorCode("1");
			res.setErrorMsg("用户ID不能为空！");
			return res.sendResult();
		}
		
		res.setResult(bsShopService.getShopListByPage(param, pager));
		return res.sendResult(); 
	}
}
