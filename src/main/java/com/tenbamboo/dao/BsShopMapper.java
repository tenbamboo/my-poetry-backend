package com.tenbamboo.dao;

import com.tenbamboo.bean.BsShop;
import com.tenbamboo.bean.BsShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BsShopMapper {
    int countByExample(BsShopExample example);

    int deleteByExample(BsShopExample example);

    int deleteByPrimaryKey(Integer clientcode);

    int insert(BsShop record);

    int insertSelective(BsShop record);

    List<BsShop> selectByExample(BsShopExample example);

    BsShop selectByPrimaryKey(Integer clientcode);

    int updateByExampleSelective(@Param("record") BsShop record, @Param("example") BsShopExample example);

    int updateByExample(@Param("record") BsShop record, @Param("example") BsShopExample example);

    int updateByPrimaryKeySelective(BsShop record);

    int updateByPrimaryKey(BsShop record);
}