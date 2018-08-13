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

public class Test {
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		Test t = new Test();
//		https://www.gushiwen.org/ 作者 赏析
//		http://www.shicimingju.com 作者
		
//		[{"title":"送乡先生林磻黄石讲会","operFileName":"poet.song.195000.json","errorMsg":"\r\n### Error updating database.  Cause: java.sql.SQLException: Incorrect string value: '\\xFE\\x96\\xB4\\x91\\xBB\\xC6...' for column 'title' at row 1\r\n### The error may involve com.tenbamboo.dao.PoetryBaseMapper.insert-Inline\r\n### The error occurred while setting parameters\r\n### SQL: insert into poetry_base (base_id, title, author,        view_count, favorites_count, create_date,        base_type, source)     values (?, ?, ?,        ?, ?, ?,        ?, ?)\r\n### Cause: java.sql.SQLException: Incorrect string value: '\\xFE\\x96\\xB4\\x91\\xBB\\xC6...' for column 'title' at row 1\n; uncategorized SQLException for SQL []; SQL state [HY000]; error code [1366]; Incorrect string value: '\\xFE\\x96\\xB4\\x91\\xBB\\xC6...' for column 'title' at row 1; nested exception is java.sql.SQLException: Incorrect string value: '\\xFE\\x96\\xB4\\x91\\xBB\\xC6...' for column 'title' at row 1"},{"title":"和单君范古意六首 ","operFileName":"poet.song.223000.json","errorMsg":"\r\n### Error updating database.  Cause: java.sql.SQLException: Incorrect string value: '\\xFE\\x96' for column 'title' at row 1\r\n### The error may involve com.tenbamboo.dao.PoetryBaseMapper.insert-Inline\r\n### The error occurred while setting parameters\r\n### SQL: insert into poetry_base (base_id, title, author,        view_count, favorites_count, create_date,        base_type, source)     values (?, ?, ?,        ?, ?, ?,        ?, ?)\r\n### Cause: java.sql.SQLException: Incorrect string value: '\\xFE\\x96' for column 'title' at row 1\n; uncategorized SQLException for SQL []; SQL state [HY000]; error code [1366]; Incorrect string value: '\\xFE\\x96' for column 'title' at row 1; nested exception is java.sql.SQLException: Incorrect string value: '\\xFE\\x96' for column 'title' at row 1"},{"title":"张翰思莼鲈图","operFileName":"poet.song.241000.json","errorMsg":"\r\n### Error updating database.  Cause: java.sql.SQLException: Incorrect string value: '\\xAA\\xA1\\xDD\\xBB\\xF6\\xD4...' for column 'title' at row 1\r\n### The error may involve com.tenbamboo.dao.PoetryBaseMapper.insert-Inline\r\n### The error occurred while setting parameters\r\n### SQL: insert into poetry_base (base_id, title, author,        view_count, favorites_count, create_date,        base_type, source)     values (?, ?, ?,        ?, ?, ?,        ?, ?)\r\n### Cause: java.sql.SQLException: Incorrect string value: '\\xAA\\xA1\\xDD\\xBB\\xF6\\xD4...' for column 'title' at row 1\n; uncategorized SQLException for SQL []; SQL state [HY000]; error code [1366]; Incorrect string value: '\\xAA\\xA1\\xDD\\xBB\\xF6\\xD4...' for column 'title' at row 1; nested exception is java.sql.SQLException: Incorrect string value: '\\xAA\\xA1\\xDD\\xBB\\xF6\\xD4...' for column 'title' at row 1"},{"title":"字颂","operFileName":"poet.song.57000.json","errorMsg":"\r\n### Error updating database.  Cause: java.sql.SQLException: Incorrect string value: '\\xAA\\xB3\\xD7\\xD6\\xCB\\xCC' for column 'title' at row 1\r\n### The error may involve com.tenbamboo.dao.PoetryBaseMapper.insert-Inline\r\n### The error occurred while setting parameters\r\n### SQL: insert into poetry_base (base_id, title, author,        view_count, favorites_count, create_date,        base_type, source)     values (?, ?, ?,        ?, ?, ?,        ?, ?)\r\n### Cause: java.sql.SQLException: Incorrect string value: '\\xAA\\xB3\\xD7\\xD6\\xCB\\xCC' for column 'title' at row 1\n; uncategorized SQLException for SQL []; SQL state [HY000]; error code [1366]; Incorrect string value: '\\xAA\\xB3\\xD7\\xD6\\xCB\\xCC' for column 'title' at row 1; nested exception is java.sql.SQLException: Incorrect string value: '\\xAA\\xB3\\xD7\\xD6\\xCB\\xCC' for column 'title' at row 1"}]

		
		File rootPath = new File("E:\\chinese-poetry-zhCN-master\\poetry\\poet.song.0.json");
		JSONArray list = t.convertToSimple(rootPath);
		
		
		
		
		JSONObject item = (JSONObject) list.get(0);
		item.get("title");
		String baseId = Uid.getUUID();
		String date = DateUtil.formatDate5();
		
		PoetryBase base = new PoetryBase();	
		base.setAuthor(String.valueOf(item.get("author")));
		base.setTitle(String.valueOf(item.get("title")));
//		base.setBaseId(baseId);
		base.setCreateDate(date);
		base.setBaseType("1");
		
		
		PoetryContent content = null;
		
		
		List<String> paragraphsList = JSONArray.parseArray(String.valueOf(item.get("paragraphs")), String.class);
		List<String> strainsList = JSONArray.parseArray(String.valueOf(item.get("strains")), String.class);
		
		
		int size = paragraphsList.size();
		for(int i=0;i<size;i++) {
			paragraphsList.get(i);
			content =new PoetryContent();
			content.setBaseId(baseId);
			content.setContentId(Uid.getUUID());
			content.setCreateDate(DateUtil.formatDate5());
			content.setStrains(strainsList.get((i)));
			content.setContent(paragraphsList.get((i)));
		}
		
		
//		list.get(0).toString()
//		System.out.println(ZhConverterUtil.convertToSimple("𡨢"));
//		File[] list = rootPath.listFiles();
//		for(File item : list) {
//			
//
//			
//		}
		
	}

	public JSONArray convertToSimple(File file) throws UnsupportedEncodingException, IOException {
		String res = FileUtils.readFile(file.getAbsolutePath());
		// System.out.println(res);
		res = ZhConverterUtil.convertToSimple(res);
		System.out.println(res);
		return JSONArray.parseArray(res);

	}
}
