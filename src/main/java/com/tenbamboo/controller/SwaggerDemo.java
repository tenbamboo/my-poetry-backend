package com.tenbamboo.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Scope("prototype")
@Controller
@RequestMapping("/swDemo")
//@Api(value = "SwaggerDemo", tags = { "Swagger测试接口" })
public class SwaggerDemo {
	//访问URL ：http://localhost:8080/tenbamboo/swagger/index.html

//	// 正常demo
//	@ResponseBody
//	@RequestMapping("/demo1")
//	@ApiOperation(value = "正常demo", httpMethod = "POST", response = String.class, notes = "这里写业务做什么")
//	public Object demo1() {
//		// return JSONObject.parse(res);
//		return "";
//	}
//
//	// 入参demo1
//	@ResponseBody
//	@RequestMapping("/demo2")
//	@ApiOperation(value = "入参demo1", httpMethod = "POST", response = String.class, notes = "这里写业务做什么")
//	@ApiImplicitParams({
//			@ApiImplicitParam(name = "name", value = "用户名", dataType = "string",  example = "xingguo"),
//			@ApiImplicitParam(name = "id", value = "用户id", dataType = "long",  required = true) })
//	public Object demo2() {
//		// return JSONObject.parse(res);
//		return "";
//	}
//
//	// 入参demo2
//	@ResponseBody
//	@RequestMapping("/demo3")
//	@ApiOperation(value = "入参demo2", httpMethod = "POST", response = String.class, notes = "这里写业务做什么")
//	public Object demo3(@ApiParam(name="p1",value="参数1",required=true)
//						@RequestParam
//						String p1,
//						@ApiParam(name="p2",value="参数2",required=true) 
//						@RequestParam
//						String p2) {		
//		// return JSONObject.parse(res);
//		return "";
//	}

}
