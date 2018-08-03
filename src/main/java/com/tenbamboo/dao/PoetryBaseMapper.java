package com.tenbamboo.dao;

import com.tenbamboo.bean.PoetryBase;
import com.tenbamboo.bean.PoetryBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PoetryBaseMapper {
    int countByExample(PoetryBaseExample example);

    int deleteByExample(PoetryBaseExample example);

    int deleteByPrimaryKey(String baseId);

    int insert(PoetryBase record);

    int insertSelective(PoetryBase record);

    List<PoetryBase> selectByExample(PoetryBaseExample example);

    PoetryBase selectByPrimaryKey(String baseId);

    int updateByExampleSelective(@Param("record") PoetryBase record, @Param("example") PoetryBaseExample example);

    int updateByExample(@Param("record") PoetryBase record, @Param("example") PoetryBaseExample example);

    int updateByPrimaryKeySelective(PoetryBase record);

    int updateByPrimaryKey(PoetryBase record);
}