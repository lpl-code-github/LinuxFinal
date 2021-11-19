package com.lpl.hello.service.impl;

import com.alibaba.fastjson.JSON;
import com.lpl.hello.mapper.HelloinfoMapper;
import com.lpl.hello.pojo.HelloinfoDO;
import com.lpl.hello.pojo.HelloinfoDOExample;
import com.lpl.hello.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class HelloServiceImpl implements HelloService {

    @Autowired
    private HelloinfoMapper helloinfoMapper;

    @Autowired
    private RedisTemplate<String,String> redisTemplate;


    public List<HelloinfoDO> findAll(){

        String helloInfoListJsonStr = redisTemplate.opsForValue().get("helloInfo.findAll");
        /**
         *  判断缓存中是否存在：
         *  如果存在，从缓存中查询
         *  如果不存在，从数据库中查询并放入缓存
         */
        if (StringUtils.isNoneBlank(helloInfoListJsonStr)){
            List<HelloinfoDO> helloInfoList = JSON.parseArray(helloInfoListJsonStr, HelloinfoDO.class);
            log.info("从缓存查询");
            return helloInfoList;
        }else {
            HelloinfoDOExample helloInfoExample = new HelloinfoDOExample();
            //查询所有
            helloInfoExample.or().andContentIsNotNull()
                    .andIpIsNotNull();
            List<HelloinfoDO> helloInfoList = helloinfoMapper.selectByExample(helloInfoExample);
            // 放入缓存 10分钟后失效
            redisTemplate.opsForValue().set("helloInfo.findAll",JSON.toJSONString(helloInfoList),10, TimeUnit.MINUTES);

            log.info("从数据库中查询");
            return helloInfoList;
        }
    }
}
