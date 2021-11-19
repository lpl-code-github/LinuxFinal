package com.lpl.test2.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lpl.test2.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * 使用Mybatis Plus只需要集成BaseMapper，可以点源码查看有哪些实现方法
 * 如果需要复杂查询，可以自己定义方法、写sql语句
 * 此实验继承BaseMapper已经满足需要
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {
}
