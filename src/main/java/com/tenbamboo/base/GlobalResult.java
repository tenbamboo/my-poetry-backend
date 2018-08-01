package com.tenbamboo.base;

import com.alibaba.fastjson.JSON;

/**
 * @author haze.liu
 * @todo 全局返回类
 *
 */
public class GlobalResult{
	
	//所有结果都需要放到此类中
	private Object result;
	//如果有错误时，需要返回错误信息
	private String errorMsg="";
	//0 为正常,负数为系统错误，正数为业务错误
	private String errorCode="0";
	
	
	
	
	public String sendResult(){
		return JSON.toJSONString(this);
	}
	
	

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
	
	
	
	

}
