package com.newer.springbootdemo1.mapper;

import com.newer.springbootdemo1.bean.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {
    @Select("select id,stuname,usersex from userinfo")
    List<Student> findAll();
}
