package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.Tag;
import com.example.demo.model.Teaching;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("test")
@Controller
public class testController {

    @Autowired
    private UserMapper userMapper;
//    @Autowired
//    private RedisTemplate redisTemplate;

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
        List<Teaching> allTeaching = userMapper.getAllTeaching();
        System.out.println(allTeaching);
        List<Tag> tag = userMapper.getTag();
//        redisTest();
    }


//    public void redisTest() {
//        System.out.println(redisTemplate.hasKey("user:10001"));
//        redisTemplate.delete("user:10001");
//        redisTemplate.delete("ahuang");
//        System.out.println(redisTemplate.hasKey("ahuang"));
//        redisTemplate.opsForValue().set("ahuang", "123");
//        System.out.println(redisTemplate.hasKey("ahuang"));
//        System.out.println(redisTemplate.opsForValue().get("ahuang"));
//    }

    @RequestMapping("index")
    public String index () {
        return "index";
    }

}
