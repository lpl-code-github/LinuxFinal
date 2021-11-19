package com.lpl.hello.mapper;

import com.lpl.hello.pojo.HelloinfoDO;
import com.lpl.hello.pojo.HelloinfoDOExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HelloinfoMapper {
    long countByExample(HelloinfoDOExample example);

    int deleteByExample(HelloinfoDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HelloinfoDO record);

    int insertSelective(HelloinfoDO record);

    List<HelloinfoDO> selectByExample(HelloinfoDOExample example);

    HelloinfoDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HelloinfoDO record, @Param("example") HelloinfoDOExample example);

    int updateByExample(@Param("record") HelloinfoDO record, @Param("example") HelloinfoDOExample example);

    int updateByPrimaryKeySelective(HelloinfoDO record);

    int updateByPrimaryKey(HelloinfoDO record);
}