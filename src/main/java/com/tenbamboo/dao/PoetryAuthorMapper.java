package com.tenbamboo.dao;

import com.tenbamboo.bean.PoetryAuthor;
import com.tenbamboo.bean.PoetryAuthorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PoetryAuthorMapper {
    int countByExample(PoetryAuthorExample example);

    int deleteByExample(PoetryAuthorExample example);

    int deleteByPrimaryKey(String authorId);

    int insert(PoetryAuthor record);

    int insertSelective(PoetryAuthor record);

    List<PoetryAuthor> selectByExample(PoetryAuthorExample example);

    PoetryAuthor selectByPrimaryKey(String authorId);

    int updateByExampleSelective(@Param("record") PoetryAuthor record, @Param("example") PoetryAuthorExample example);

    int updateByExample(@Param("record") PoetryAuthor record, @Param("example") PoetryAuthorExample example);

    int updateByPrimaryKeySelective(PoetryAuthor record);

    int updateByPrimaryKey(PoetryAuthor record);
}