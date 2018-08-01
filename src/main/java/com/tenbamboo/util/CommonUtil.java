package com.tenbamboo.util;

import java.util.UUID;

import org.apache.log4j.Logger;

/**
  *
  * @version 1.0
  * @author liuxinyuan
  * @Description 
  * @date 2014-3-4
  */ 
public class CommonUtil  {
	static Logger logger= Logger.getLogger(CommonUtil.class);
	public static String getUUID(){
		return UUID.randomUUID().toString();
	}
	

}
