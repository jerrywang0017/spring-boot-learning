package com.jerry.demo.springboot.mybatis.mapper;

import com.jerry.demo.springboot.mybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    void insert(User user);

    User findById(Integer id);

    List<User> list();
}
