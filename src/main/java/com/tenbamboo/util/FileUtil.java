package com.tenbamboo.util;

import java.io.File;

import org.apache.log4j.Logger;


public class FileUtil {
	private static Logger logger= Logger.getLogger(FileUtil.class);
	/**
	 * <p>
	 * Title: deleteFile
	 * </p>
	 * <p>
	 * Description:删除文件
	 * </p>
	 * 
	 * @param file
	 * @return
	 * @throw
	 */
	public static Boolean deleteFile(File file) {
		logger.info("deleteFile(File file)  ->start");
		if (file.exists()) {
			if (file.isFile()) {
				file.delete();
			} else if (file.isDirectory()) {
				File files[] = file.listFiles();
				for (int i = 0; i < files.length; i++) {
					deleteFile(files[i]);
				}
			}
			file.delete();
			logger.info("deleteFile(File file) return true  ->end");
			return true;
		} else {
			logger.info("deleteFile(File file) return false ->end");
			return false;
		}
	}

}
