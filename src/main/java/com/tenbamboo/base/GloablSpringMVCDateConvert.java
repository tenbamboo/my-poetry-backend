package com.tenbamboo.base;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.convert.converter.Converter;


public class GloablSpringMVCDateConvert implements Converter<String, Date> {

    public Date convert(String timestamp) {
    	 if(StringUtils.isBlank(timestamp)){
    		 return null;
    	 }
    	 long lt = new Long(timestamp);
    	 return new Date(lt);
    }

}