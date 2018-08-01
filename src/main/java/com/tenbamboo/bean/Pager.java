package com.tenbamboo.bean;

public class Pager {
	
	private int pageNo = 0;
	private int pageSize = 10;
	
	public int getPageNo() {
		return pageSize * pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	
	

}
