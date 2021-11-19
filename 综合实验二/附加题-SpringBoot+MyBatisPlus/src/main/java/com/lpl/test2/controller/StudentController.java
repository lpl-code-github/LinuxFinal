package com.lpl.test2.controller;

import com.lpl.test2.pojo.Student;
import com.lpl.test2.servive.StudentService;
import com.lpl.test2.until.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController  {
    @Autowired
    private StudentService studentService;

    //通过id查询
    @GetMapping("findById")
    public Result<Student> findById(@RequestParam("id") Integer id){

        return Result.getSuccessResultBean("查询到id为"+id+"的学生信息"
                ,studentService.findById(id));
    }
}
