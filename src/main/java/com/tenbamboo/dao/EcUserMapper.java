package com.tenbamboo.dao;

import com.tenbamboo.bean.EcUser;
import com.tenbamboo.bean.EcUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcUserMapper {
    int countByExample(EcUserExample example);

    int deleteByExample(EcUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(EcUser record);

    int insertSelective(EcUser record);

    List<EcUser> selectByExample(EcUserExample example);

    EcUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") EcUser record, @Param("example") EcUserExample example);

    int updateByExample(@Param("record") EcUser record, @Param("example") EcUserExample example);

    int updateByPrimaryKeySelective(EcUser record);

    int updateByPrimaryKey(EcUser record);
}