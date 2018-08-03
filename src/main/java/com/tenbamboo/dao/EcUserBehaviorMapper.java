package com.tenbamboo.dao;

import com.tenbamboo.bean.EcUserBehavior;
import com.tenbamboo.bean.EcUserBehaviorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcUserBehaviorMapper {
    int countByExample(EcUserBehaviorExample example);

    int deleteByExample(EcUserBehaviorExample example);

    int deleteByPrimaryKey(Integer behaviorId);

    int insert(EcUserBehavior record);

    int insertSelective(EcUserBehavior record);

    List<EcUserBehavior> selectByExample(EcUserBehaviorExample example);

    EcUserBehavior selectByPrimaryKey(Integer behaviorId);

    int updateByExampleSelective(@Param("record") EcUserBehavior record, @Param("example") EcUserBehaviorExample example);

    int updateByExample(@Param("record") EcUserBehavior record, @Param("example") EcUserBehaviorExample example);

    int updateByPrimaryKeySelective(EcUserBehavior record);

    int updateByPrimaryKey(EcUserBehavior record);
}