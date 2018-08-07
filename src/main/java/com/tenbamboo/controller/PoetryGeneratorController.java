package com.tenbamboo.controller;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.tenbamboo.base.GlobalResult;
import com.tenbamboo.bean.PoetryAuthor;
import com.tenbamboo.bean.PoetryBase;
import com.tenbamboo.bean.PoetryContent;
import com.tenbamboo.bean.PoetryDone;
import com.tenbamboo.bean.PoetryError;
import com.tenbamboo.dao.PoetryAuthorMapper;
import com.tenbamboo.dao.PoetryBaseMapper;
import com.tenbamboo.dao.PoetryContentMapper;
import com.tenbamboo.dao.PoetryDoneMapper;
import com.tenbamboo.dao.PoetryErrorMapper;
import com.tenbamboo.util.DateUtil;
import com.tenbamboo.util.FileUtils;
import com.tenbamboo.util.Uid;

@Controller
@RequestMapping(value = "/poetryGenerator", produces = "application/json;charset=UTF-8", method = RequestMethod.GET)
@ResponseBody
public class PoetryGeneratorController {

	private static Logger logger = Logger.getLogger(PoetryGeneratorController.class);

	@Resource
	private PoetryBaseMapper poetryBaseMapper;

	@Resource
	private PoetryContentMapper poetryContentMapper;
	@Resource
	private PoetryErrorMapper poetryErrorMapper;
	@Resource
	private PoetryDoneMapper poetryDoneMapper;
	@Resource
	private PoetryAuthorMapper poetryAuthorMapper;
	
	

	private String operFileName; // 现在操作的文件
	private List<Map> errorList = new ArrayList<Map>();
	
//	select title ,group_concat(content order by sort_index SEPARATOR '/n')from poetry_base base 
//	left join poetry_content on poetry_content.base_id = base.base_id
//	where base.base_id in ('fd356644-8a63-421b-bef9-0c647cf1acb4','ae4fc5d8-cabd-4c31-aef8-3c73189864df')
//	group by base.base_id,title




	private List<JSONObject> convertToSimple(File file) throws UnsupportedEncodingException, IOException {
		String res = FileUtils.readFile(file.getAbsolutePath());
		// System.out.println(res);
		// res = ZhConverterUtil.convertToSimple(res);
		// System.out.println(res);
		return JSONArray.parseArray(res, JSONObject.class);

	}

	private void saveListOper(List<JSONObject> list) {
		for (JSONObject item : list) {
			this.saveSingleOper(item);
		}

	}
	
	private void saveCiListOper(List<JSONObject> list) {
		for (JSONObject item : list) {
			this.saveCiSingleOper(item);
		}

	}
	
	
	private void saveCiSingleOper(JSONObject item) {

		String title = String.valueOf(item.get("rhythmic")).replaceAll("\\{(.*?)\\}", "");
		try {
			logger.info("开始插入:" + title);
//			String baseId = id+""; //Uid.getUUID();
			String date = DateUtil.formatDate5();

			PoetryBase base = new PoetryBase();
			base.setAuthor(String.valueOf(item.get("author")));
			base.setTitle(title);
//			base.setBaseId(baseId);
			base.setCreateDate(date);
			base.setBaseType("2");
			base.setSource(this.operFileName);

			poetryBaseMapper.insert(base);

			PoetryContent content = null;

			List<String> paragraphsList = JSONArray.parseArray(String.valueOf(item.get("paragraphs")), String.class);
//			List<String> strainsList = JSONArray.parseArray(String.valueOf(item.get("strains")), String.class);

			int size = paragraphsList.size();
			for (int i = 0; i < size; i++) {
				paragraphsList.get(i);
				content = new PoetryContent();
				content.setBaseId(base.getBaseId());
				content.setContentId(Uid.getUUID());
				content.setCreateDate(DateUtil.formatDate5());
//				content.setStrains(strainsList.get((i)));
				content.setContent(paragraphsList.get((i)));
				content.setSortIndex(i + "");
				poetryContentMapper.insert(content);
			}
			logger.info("完成:" + item.get("title"));

		} catch (Exception e) {
			Map a = new HashMap();
			a.put("title", title);
			a.put("operFileName", this.operFileName);
			a.put("errorMsg", e.getMessage());
			try {
				this.saveErrorInfo(a);
			} catch (Exception ee) {
				logger.error("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				logger.error("出错了");
				errorList.add(a);
				logger.error("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			}

		}

	}

	private void saveSingleOper(JSONObject item) {

		String title = String.valueOf(item.get("title")).replaceAll("\\{(.*?)\\}", "");
		try {
			logger.info("开始插入:" + item.get("title"));
//			String baseId =id+"";// Uid.getUUID();
			String date = DateUtil.formatDate5();

			PoetryBase base = new PoetryBase();
			base.setAuthor(String.valueOf(item.get("author")));
			base.setTitle(title);
//			base.setBaseId(baseId);
			base.setCreateDate(date);
			base.setBaseType("1");
			base.setSource(this.operFileName);

			poetryBaseMapper.insert(base);

			PoetryContent content = null;

			List<String> paragraphsList = JSONArray.parseArray(String.valueOf(item.get("paragraphs")), String.class);
			List<String> strainsList = JSONArray.parseArray(String.valueOf(item.get("strains")), String.class);

			int size = paragraphsList.size();
			for (int i = 0; i < size; i++) {
				paragraphsList.get(i);
				content = new PoetryContent();
				content.setBaseId(base.getBaseId());
				content.setContentId(Uid.getUUID());
				content.setCreateDate(DateUtil.formatDate5());
				content.setStrains(strainsList.get((i)));
				content.setContent(paragraphsList.get((i)));
				content.setSortIndex(i + "");
				poetryContentMapper.insert(content);
			}
			logger.info("完成:" + item.get("title"));

		} catch (Exception e) {
			Map a = new HashMap();
			a.put("title", title);
			a.put("operFileName", this.operFileName);
			a.put("errorMsg", e.getMessage());
			try {
				this.saveErrorInfo(a);
			} catch (Exception ee) {
				logger.error("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				logger.error("出错了");
				errorList.add(a);
				logger.error("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			}

		}

	}

	private void saveErrorInfo(Map a) {

		PoetryError record = new PoetryError();
		record.setErrorFileName(String.valueOf(a.get("operFileName")));
		record.setErrorId(Uid.getUUID());
		record.setErrorTitleName(String.valueOf(a.get("title")));
		record.setErrorMsg(String.valueOf(a.get("errorMsg")));
		poetryErrorMapper.insert(record);
	}

	private void saveAuthorSingleOper(JSONObject item) {

		String name = String.valueOf(item.get("name")).replaceAll("\\{(.*?)\\}", "");
		String desc = String.valueOf(item.get("desc")).replaceAll("\\{(.*?)\\}", "");
		try {
			logger.info("开始插入:" +name);
			String authorId = Uid.getUUID();
			String date = DateUtil.formatDate5();

			PoetryAuthor author = new PoetryAuthor();
			author.setAuthorId(authorId);
			author.setAuthorName(name);
			author.setCreateDate(date);
			author.setAuthorDesc(desc);

			poetryAuthorMapper.insert(author);

			logger.info("完成:" + name);

		} catch (Exception e) {
			Map a = new HashMap();
			a.put("title", name);
			a.put("operFileName", this.operFileName);
			a.put("errorMsg", e.getMessage());
			try {
				this.saveErrorInfo(a);
			} catch (Exception ee) {
				logger.error("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				logger.error("出错了");
				errorList.add(a);
				logger.error("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			}

		}

	}

	private void saveAuthor(List<JSONObject> list) {
		for (JSONObject item : list) {
			this.saveAuthorSingleOper(item);
		}
	}

	/**
	 * @todo 生成=
	 * @param request
	 * @param myDemo
	 * @return
	 * @throws IOException
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping(value = "/author")
	public String post2(HttpServletRequest request) throws UnsupportedEncodingException, IOException {

		File rootPath = new File("E:\\chinese-poetry-zhCN-master\\author\\");
		File[] list = rootPath.listFiles();
		// JSONArray list = null;
		PoetryDone done = null;
		for (File item : list) {

			done = new PoetryDone();
			done.setDoneId(Uid.getUUID());
			done.setStartTime(DateUtil.formatDate5());
			done.setFileName(item.getName());

			logger.info("===============");
			logger.info("开始操作:" + item.getName());
			this.operFileName = item.getName();
			this.saveAuthor(this.convertToSimple(item));
			logger.info("完成操作:" + item.getName());
			logger.info("===============");

			done.setEndTime(DateUtil.formatDate5());
			poetryDoneMapper.insert(done);

		}

		GlobalResult res = new GlobalResult();
		logger.error(JSONArray.toJSONString(errorList));
		logger.error("√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√");

		res.setResult(errorList);
		System.out.println(errorList);
		return res.sendResult(); // JSON.toJSONString(res;
	}

	/**
	 * @todo 生成诗
	 * @param request
	 * @param myDemo
	 * @return
	 * @throws IOException
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping(value = "/generator")
	public String post1(HttpServletRequest request) throws UnsupportedEncodingException, IOException {

		File rootPath = new File("E:\\chinese-poetry-zhCN-master\\poetry\\");
		File[] list = rootPath.listFiles();
		// JSONArray list = null;
		PoetryDone done = null;
		for (File item : list) {

			done = new PoetryDone();
			done.setDoneId(Uid.getUUID());
			done.setStartTime(DateUtil.formatDate5());
			done.setFileName(item.getName());

			logger.info("===============");
			logger.info("开始操作:" + item.getName());
			this.operFileName = item.getName();
			this.saveListOper(this.convertToSimple(item));
			logger.info("完成操作:" + item.getName());
			logger.info("===============");

			done.setEndTime(DateUtil.formatDate5());
			poetryDoneMapper.insert(done);

		}

		GlobalResult res = new GlobalResult();
		logger.error(JSONArray.toJSONString(errorList));
		logger.error("√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√");

		res.setResult(errorList);
		System.out.println(errorList);
		return res.sendResult(); // JSON.toJSONString(res;
	}
	
	
	/**
	 * @todo 生成诗
	 * @param request
	 * @param myDemo
	 * @return
	 * @throws IOException
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping(value = "/generatorCi")
	public String post3(HttpServletRequest request) throws UnsupportedEncodingException, IOException {

		File rootPath = new File("E:\\chinese-poetry-master\\ci\\");
		File[] list = rootPath.listFiles();
		// JSONArray list = null;
		PoetryDone done = null;
		for (File item : list) {

			done = new PoetryDone();
			done.setDoneId(Uid.getUUID());
			done.setStartTime(DateUtil.formatDate5());
			done.setFileName(item.getName());

			logger.info("===============");
			logger.info("开始操作:" + item.getName());
			this.operFileName = item.getName();
			this.saveCiListOper(this.convertToSimple(item));
			logger.info("完成操作:" + item.getName());
			logger.info("===============");

			done.setEndTime(DateUtil.formatDate5());
			poetryDoneMapper.insert(done);

		}

		GlobalResult res = new GlobalResult();
		logger.error(JSONArray.toJSONString(errorList));
		logger.error("√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√");

		res.setResult(errorList);
		System.out.println(errorList);
		return res.sendResult(); // JSON.toJSONString(res;
	}

}
