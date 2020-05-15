package com.example.demo.test;

import com.alibaba.fastjson.JSON;

import javax.annotation.Resource;
import javax.xml.registry.infomodel.User;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.Tag;
import com.example.demo.model.Teaching;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class HashTest {
    private static Logger logger = Logger.getLogger(HashTest.class);
    @Resource
    private UserMapper userMapper;

    @Test
    public void test1() {
        List<Teaching> allTeaching = userMapper.getAllTeaching();
        logger.info(JSON.toJSONString(allTeaching));
    }
}
