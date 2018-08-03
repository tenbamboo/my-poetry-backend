package com.tenbamboo.dao;

import com.tenbamboo.bean.PoetryError;
import com.tenbamboo.bean.PoetryErrorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PoetryErrorMapper {
    int countByExample(PoetryErrorExample example);

    int deleteByExample(PoetryErrorExample example);

    int deleteByPrimaryKey(String errorId);

    int insert(PoetryError record);

    int insertSelective(PoetryError record);

    List<PoetryError> selectByExample(PoetryErrorExample example);

    PoetryError selectByPrimaryKey(String errorId);

    int updateByExampleSelective(@Param("record") PoetryError record, @Param("example") PoetryErrorExample example);

    int updateByExample(@Param("record") PoetryError record, @Param("example") PoetryErrorExample example);

    int updateByPrimaryKeySelective(PoetryError record);

    int updateByPrimaryKey(PoetryError record);
}