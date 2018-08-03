package com.tenbamboo.dao;

import com.tenbamboo.bean.PoetryTags;
import com.tenbamboo.bean.PoetryTagsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PoetryTagsMapper {
    int countByExample(PoetryTagsExample example);

    int deleteByExample(PoetryTagsExample example);

    int deleteByPrimaryKey(String tagsId);

    int insert(PoetryTags record);

    int insertSelective(PoetryTags record);

    List<PoetryTags> selectByExample(PoetryTagsExample example);

    PoetryTags selectByPrimaryKey(String tagsId);

    int updateByExampleSelective(@Param("record") PoetryTags record, @Param("example") PoetryTagsExample example);

    int updateByExample(@Param("record") PoetryTags record, @Param("example") PoetryTagsExample example);

    int updateByPrimaryKeySelective(PoetryTags record);

    int updateByPrimaryKey(PoetryTags record);
}