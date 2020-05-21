package com.example.demo.mapper;

import com.example.demo.model.Authority;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

@MapperScan
@Repository
public interface AuthorityMapper {

    @Select("select a.code from sys_user_role ur inner join sys_role r on r.id = ur.role_id " +
            " inner join sys_role_authority ra on  r.id = ra.role_id  " +
            "inner join sys_authority a on a.id = ra.authority_id  where ur.user_id = #{id}")
    List<String> findByUser(@Param(value = "id") Long id);

}
