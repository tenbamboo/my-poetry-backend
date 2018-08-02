package com.tenbamboo.util;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

public class StringUtil {
	public static String replaceEnterstr(String str){
		Pattern wp = Pattern.compile("\n{2,}", Pattern.CASE_INSENSITIVE | Pattern.DOTALL);   
        Matcher m = wp.matcher(str);  
        String result = m.replaceAll("\n\n");  
        return result;
	}
	
	/** 
     * 获得一个UUID 
     * @return String UUID 
     */ 
    public static String getUUID(){ 
        String s = UUID.randomUUID().toString();
        //去掉“-”符号 
        return s.substring(0,8)+s.substring(9,13)+s.substring(14,18)+s.substring(19,23)+s.substring(24); 
    }
    
    /** 
     * 大陆手机号码11位数，匹配格式：前三位固定格式+后8位任意数 
     * 此方法中前三位格式有： 
     * 13+任意数 
     * 15+除4的任意数 
     * 18+除1和4的任意数 
     * 17+除9的任意数 
     * 147
     */
	public static boolean ValidatePhone(String phone){		
        String regExp = "^((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}$";  
        Pattern p = Pattern.compile(regExp);  
        Matcher m = p.matcher(phone);  
        //System.out.println(m.matches());
        return m.matches();
	}
    
	/** 
	 * 将驼峰式命名的字符串转换为下划线大写方式。如果转换前的驼峰式命名的字符串为空，则返回空字符串。</br> 
	 * 例如：HelloWorld->HELLO_WORLD 
	 * @param name 转换前的驼峰式命名的字符串 
	 * @return 转换后下划线大写方式命名的字符串 
	 */  
	public static String underscoreName(String name) {  
	    StringBuilder result = new StringBuilder();  
	    if (name != null && name.length() > 0) {  
	        // 将第一个字符处理成大写  
	        result.append(name.substring(0, 1).toUpperCase());  
	        // 循环处理其余字符  
	        for (int i = 1; i < name.length(); i++) {  
	            String s = name.substring(i, i + 1);  
	            // 在大写字母前添加下划线  
	            if (s.equals(s.toUpperCase()) && !Character.isDigit(s.charAt(0))) {  
	                result.append("_");  
	            }  
	            // 其他字符直接转成大写  
	            result.append(s.toUpperCase());  
	        }  
	    }  
	    return result.toString();  
	}  
	   
	/** 
	 * 将下划线大写方式命名的字符串转换为驼峰式。如果转换前的下划线大写方式命名的字符串为空，则返回空字符串。</br> 
	 * 例如：HELLO_WORLD->HelloWorld 
	 * @param name 转换前的下划线大写方式命名的字符串 
	 * @return 转换后的驼峰式命名的字符串 
	 */  
	public static String camelName(String name) {  
	    StringBuilder result = new StringBuilder();  
	    // 快速检查  
	    if (name == null || name.isEmpty()) {  
	        // 没必要转换  
	        return "";  
	    } else if (!name.contains("_")) { 
	    	// 不含下划线，如果都是大写，转成小写
	    	if (isAllUpperCase(name)) {
	    		name = name.toLowerCase();
	    	}
	        
	        return name;  
	    }  
	    // 用下划线将原始字符串分割  
	    String camels[] = name.split("_");  
	    for (String camel :  camels) {  
	        // 跳过原始字符串中开头、结尾的下换线或双重下划线  
	        if (camel.isEmpty()) {  
	            continue;  
	        }  
	        // 处理真正的驼峰片段  
	        if (result.length() == 0) {  
	            // 第一个驼峰片段，全部字母都小写  
	            result.append(camel.toLowerCase());  
	        } else {  
	            // 其他的驼峰片段，首字母大写  
	            result.append(camel.substring(0, 1).toUpperCase());  
	            result.append(camel.substring(1).toLowerCase());  
	        }  
	    }  
	    return result.toString();  
	}
	
	public static boolean isAllUpperCase(String word) {
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (!Character.isUpperCase(c)) {
				return false;
			}
		}
		return true;
	}
	
	public static String findString(String rule, String message) {
		String patternString = rule.replace("%s", "([a-zA-Z0-9_!=\\(\\)\"\\s]+)");
		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(message);

		while (matcher.find()) {
			return matcher.group(1);
		}
		
		return null;
	}
	
	/**
	  * 判断是否为整数 
	  * @param str 传入的字符串 
	  * @return 是整数返回true,否则返回false 
	*/
	public static boolean isInteger(String str) {  
	      Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");  
	      return pattern.matcher(str).matches();  
	}
	
	public static boolean isBlank(Object o) {
		return "null".equals(String.valueOf(o)) || StringUtils.isBlank(String.valueOf(o));
	}
	
	public static boolean isNotBlank(Object o) {
		return !isBlank(o);
	}
	
	public static void main (String[] args){
	}
	
	
	public static String upperCaseFirst(String str) {  
	    char[] ch = str.toCharArray();  
	    if (ch[0] >= 'a' && ch[0] <= 'z') {  
	        ch[0] = (char) (ch[0] - 32);  
	    }  
	    return new String(ch);  
	}
	
	/**
	 * 分隔方法，特殊字符不分隔（'()）
	 * @Title: split
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @author: dante
	 * @param: @param str
	 * @param: @return 
	 * @return: List<String> 
	 * @throws
	 */
	public static List<String> split(String str, char regex) {
		List<String> fieldList = new ArrayList<>();
		int danyin = 0;
		int kuohao = 0;
		int strEnd = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == regex && danyin%2==0 && kuohao==0) {
				String subStr = str.substring(strEnd, i);
				fieldList.add(subStr);
				strEnd = i+1;
			} else if (c == '\'') {
				danyin++;
			} else if (c == '(' && danyin%2==0) {
				kuohao++;
			} else if (c == ')' && danyin%2==0) {
				kuohao--;
			}
		}
		String subStr = str.substring(strEnd);
		fieldList.add(subStr);
		return fieldList;
	}
}
