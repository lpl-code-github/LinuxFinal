package com.lpl.hello.controller;

import com.lpl.hello.service.HelloService;
import com.lpl.hello.until.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;


@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping("HelloworldJson")
    public Result<Object> findAll(){
        return Result.getSuccessResultBean("查询成功",helloService.findAll()) ;
    }

    @GetMapping("Helloworld")
    public String hello(HttpServletRequest request){
        String loginIp = request.getRemoteAddr();
        return "hello,world,"+loginIp ;
    }
}
