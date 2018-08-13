package com.tenbamboo.test;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.tenbamboo.controller.DemoController2;
import com.tenbamboo.service.BsShopService;
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class MainTest {
	@Resource
	private DemoController2 demoController2;
//	private BsShopService bsShopService;

	private MockMvc mockMvc;

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.standaloneSetup(demoController2).build();
	}

	@Test
	public void Ctest() throws Exception {
		
		
//		System.out.println(bsShopService.helloWould());
		MockHttpServletRequestBuilder post = MockMvcRequestBuilders.post("/demo2/post1");
		post.param("id", "123123");
		post.param("name", "Tom");
		ResultActions resultActions = this.mockMvc.perform(post);
		MvcResult mvcResult = resultActions.andReturn();
		String result = mvcResult.getResponse().getContentAsString();
		System.out.println("=====客户端获得反馈数据:" + result);
//		 也可以从response里面取状态码，header,cookies...
		 System.out.println(mvcResult.getResponse().getStatus());
	}

	private BsShopService helloWould() {
		// TODO Auto-generated method stub
		return null;
	}

}
