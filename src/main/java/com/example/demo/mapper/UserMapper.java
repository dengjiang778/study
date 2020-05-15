package com.example.demo.mapper;

import com.example.demo.model.Tag;
import com.example.demo.model.Teaching;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
public interface UserMapper {

    @Select("select * from t_teaching")
    public List<Teaching> getAllTeaching();

    @Select("select * from t_tag")
    @Results(id = "sonTagListMap", value = {
            @Result(property = "sonTagList", javaType = List.class, jdbcType = JdbcType.BIGINT, column = "id", many = @Many(select = "com.example.demo.mapper.UserMapper.getByParentId"))
    })
    public List<Tag> getTag();

    @Select("select * from t_tag where parent_id = #{parentId}")
    @ResultMap(value = "sonTagListMap")
    public List<Tag> getByParentId(@Param(value = "id") Long id);


}
