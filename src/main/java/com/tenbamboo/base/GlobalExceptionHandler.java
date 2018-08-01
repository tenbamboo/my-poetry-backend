package com.tenbamboo.base;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

public class GlobalExceptionHandler implements HandlerExceptionResolver {

	public ModelAndView resolveException(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3) {
		Map<String,Object> error=new HashMap<String,Object>();
		error.put("errorCode", "-1");//setErrorCode( "-1");
		error.put("errorMsg",arg3.getMessage());//setErrorMsg(arg3.getMessage());
		ModelAndView mv=new ModelAndView();
		mv.addAllObjects(error);
		mv.setView(new MappingJackson2JsonView());
		return mv;
	}

}
