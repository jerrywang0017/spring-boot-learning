package com.jerry.demo.springboot.druid.mapper;

import com.jerry.demo.springboot.druid.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    void insert(User user);

    User findById(Integer id);

    List<User> list();
}
