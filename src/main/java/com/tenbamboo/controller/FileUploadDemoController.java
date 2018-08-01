package com.tenbamboo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Scope("prototype")
@Controller 
@RequestMapping("/demo") 
public class FileUploadDemoController {
	
	/**
	 * 文件上传
	 * @param request
	 * @param response
	 * @param file
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "fileUpload", method = RequestMethod.POST, produces = { "text/plain;charset=UTF-8" })
	@ResponseBody
	public String doFileUpload(HttpServletRequest request, HttpServletResponse response,
			 @RequestParam("file") MultipartFile  file) throws Exception {
		file.getOriginalFilename();
//		String result = UploadFile.httpClientUploadFile(file, WeChatInfo.getInstance(wechatNo).getAccessToken(), "image");
		
//		try{
//			String fileName = file.getOriginalFilename();
//			String fileType = fileName.substring(fileName.lastIndexOf(".") + 1, fileName.lastIndexOf(".") + 4);
//			List<Map<String, String>> save= new ArrayList<Map<String, String>>();
//			
//			if(fileType.equals("xls") || fileType.equals("xlsx")){
//				XSSFWorkbook xssfWorkbook = new XSSFWorkbook(file.getInputStream());
//				
//				XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);
//			    
//		        if (xssfSheet != null) {
//		        	int iRows = xssfSheet.getLastRowNum();
//			        for (int rowNum = 1; rowNum <= iRows; rowNum++) {
//			            XSSFRow xssfRow = xssfSheet.getRow(rowNum);
//			            if (xssfRow != null) {
//			            	Map<String, String> m = new HashMap<String, String>();
//			            	
//			            	m.put("a", xssfRow.getCell(0).toString());
//			            	m.put("b", xssfRow.getCell(1).toString());
//			            	m.put("c", xssfRow.getCell(2).toString());
//			            	m.put("d", xssfRow.getCell(3).toString());
//			            	m.put("e", xssfRow.getCell(4).toString());
//			            	m.put("f", xssfRow.getCell(5).toString());
//			            	m.put("g", xssfRow.getCell(6).toString());
//			            	m.put("h", xssfRow.getCell(7).toString());
//			            	m.put("i", xssfRow.getCell(8).toString());
//			            	m.put("j", xssfRow.getCell(9).toString());
//			            	m.put("k", xssfRow.getCell(10).toString());
//			            	m.put("l", xssfRow.getCell(11).toString());
//			            	m.put("m", xssfRow.getCell(12).toString());
//			            	m.put("n", xssfRow.getCell(13).toString());
//			            	m.put("o", xssfRow.getCell(14).toString());
//			            	m.put("p", xssfRow.getCell(15).toString());
//			            	m.put("q", xssfRow.getCell(16).toString());
//			                
//			                save.add(m);
//			            }
//			        }
//		        }
//			}
//			
//			
//			
//			save.subList(0, 1000);
//			
////			save.get
//			
////			baseMapper.batchInsertUser(l);
//			
//			
//
//		}catch (Exception e) {
//			System.out.println(e);
//		}
		
		return "111";
	}
	
	
	
	
}
