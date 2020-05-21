package com.example.demo.mapper;

import com.example.demo.model.Role;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@MapperScan
public interface RoleMapper {

    @Select("select * from sys_role where user_id = #{id}")
    List<Role> findByUser(@Param(value = "id") Long id);
}
