package com.lpl.test2.servive.Impl;

import com.lpl.test2.mapper.StudentMapper;
import com.lpl.test2.pojo.Student;
import com.lpl.test2.servive.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    //通过id查找
    public Student findById(Integer id){
        return studentMapper.selectById(id);
    }
}
