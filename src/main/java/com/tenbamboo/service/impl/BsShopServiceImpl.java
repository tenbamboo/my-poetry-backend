package com.tenbamboo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tenbamboo.bean.BsShop;
import com.tenbamboo.bean.BsShopExample;
import com.tenbamboo.bean.Pager;
import com.tenbamboo.dao.BsShopMapper;
import com.tenbamboo.service.BsShopService;

@Transactional(rollbackFor = Exception.class)
@Service
public class BsShopServiceImpl implements BsShopService {

	@Resource
	private BsShopMapper bsShopMapper;

	public List<BsShop> getShopList() {
		BsShopExample e = new BsShopExample();
		return bsShopMapper.selectByExample(e);
	}

	public List<BsShop> getShopListByPage(BsShop param, Pager pager) {

//		BsShopExample e = new BsShopExample();
//		e.setLimit(pager.getPageSize());
//		e.setOffset(pager.getPageNo());
//		e.setOrderByClause("cash_time desc");
//
//		if ("all".equals(type)) { // 所有
//			e.or().andCashSendIdEqualTo(userId);
//			e.or().andCashReceiveIdEqualTo(userId);
//		} else if ("receive".equals(type)) { // 流入
//			e.createCriteria().andCashReceiveIdEqualTo(userId).andCashTypeEqualTo("1");
//		} else if ("send".equals(type)) { // 流出
//			e.createCriteria().andCashSendIdEqualTo(userId).andCashTypeEqualTo("2");
//		} else if ("frozen".equals(type)) { // 冻结
//
//			e.or().andCashSendIdEqualTo(userId).andCashTypeEqualTo("3");
//			e.or().andCashReceiveIdEqualTo(userId).andCashTypeEqualTo("3");
//
//		}
		return null;

//		return bsShopMapper.selectByExample(e);
	}

	@Override
	public String helloWould() {
		// TODO Auto-generated method stub
		return "metoo";
	}

}
