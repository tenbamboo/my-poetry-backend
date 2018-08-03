package com.tenbamboo.dao;

import com.tenbamboo.bean.PoetryDone;
import com.tenbamboo.bean.PoetryDoneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PoetryDoneMapper {
    int countByExample(PoetryDoneExample example);

    int deleteByExample(PoetryDoneExample example);

    int deleteByPrimaryKey(String doneId);

    int insert(PoetryDone record);

    int insertSelective(PoetryDone record);

    List<PoetryDone> selectByExample(PoetryDoneExample example);

    PoetryDone selectByPrimaryKey(String doneId);

    int updateByExampleSelective(@Param("record") PoetryDone record, @Param("example") PoetryDoneExample example);

    int updateByExample(@Param("record") PoetryDone record, @Param("example") PoetryDoneExample example);

    int updateByPrimaryKeySelective(PoetryDone record);

    int updateByPrimaryKey(PoetryDone record);
}