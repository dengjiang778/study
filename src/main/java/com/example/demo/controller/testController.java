package com.example.demo.controller;

import com.example.demo.Dao.TeachingDao;
import com.example.demo.model.Teaching;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@RequestMapping("test")
@Controller
public class testController {

    @Autowired
    private TeachingDao teachingDao;
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @RequestMapping("/test")
    @ResponseBody
    public void test() {
//        List<Teaching> all = teachingDao.find();
//        Teaching teaching = new Teaching();
//        teaching.setTitle("xxxxxxxx");
//        teaching.setSource(1);
//        teaching.setContent("xxxxxxxx");
//        teaching.setCategory(1);
//        teaching.setComment(0);
//        teaching.setBaseCollect(1);
//        teaching.setBaseSupport(1);
//        teaching.setBaseWatch(1);
//        teaching.setCollect(1);
//        teaching.setSupport(1);
//        teaching.setWatch(1);
//        teaching.setDeleted(false);
//        teaching.setCreated(new Date());
//        teachingDao.create(teaching);
//        Teaching teaching1 = all.get(0);
//        teaching1.setContent("11111");
//        teachingDao.update(teaching1);
//        System.out.println(all);
//        Teaching query = new Teaching();
//        query.setId(1L);
//        List<Teaching> teachings = teachingDao.find(query);
//        System.out.println(teachings);
        redisTest();
    }


    public void redisTest() {
        System.out.println(redisTemplate.hasKey("user:10001"));
        redisTemplate.delete("user:10001");
        redisTemplate.delete("ahuang");
        System.out.println(redisTemplate.hasKey("ahuang"));
        redisTemplate.opsForValue().set("ahuang", "123");
        System.out.println(redisTemplate.hasKey("ahuang"));
        System.out.println(redisTemplate.opsForValue().get("ahuang"));
    }

}
