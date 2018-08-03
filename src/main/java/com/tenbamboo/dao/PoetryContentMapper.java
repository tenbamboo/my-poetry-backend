package com.tenbamboo.dao;

import com.tenbamboo.bean.PoetryContent;
import com.tenbamboo.bean.PoetryContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PoetryContentMapper {
    int countByExample(PoetryContentExample example);

    int deleteByExample(PoetryContentExample example);

    int deleteByPrimaryKey(String contentId);

    int insert(PoetryContent record);

    int insertSelective(PoetryContent record);

    List<PoetryContent> selectByExample(PoetryContentExample example);

    PoetryContent selectByPrimaryKey(String contentId);

    int updateByExampleSelective(@Param("record") PoetryContent record, @Param("example") PoetryContentExample example);

    int updateByExample(@Param("record") PoetryContent record, @Param("example") PoetryContentExample example);

    int updateByPrimaryKeySelective(PoetryContent record);

    int updateByPrimaryKey(PoetryContent record);
}