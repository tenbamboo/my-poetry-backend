package com.tenbamboo.service;

import java.util.List;

import com.tenbamboo.bean.BsShop;
import com.tenbamboo.bean.Pager;

public interface BsShopService {
	
	List<BsShop> getShopList();
	
	public List<BsShop> getShopListByPage(BsShop param, Pager pager);
	
	public String helloWould();

}
