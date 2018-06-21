package com.jerry.demo.springboot.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("")
public class DemoController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping(value = "/{key}/{value}", method = RequestMethod.GET)
    public String set(@PathVariable String key, @PathVariable String value) {
        stringRedisTemplate.opsForValue().set(key, value);

        HashOperations opsForHash = redisTemplate.opsForHash();
        opsForHash.put("he1", "key1", "a");

        Set<String> keys = stringRedisTemplate.keys("*");
        StringBuilder stringBuilder = new StringBuilder();

        for (String k : keys) {
            stringBuilder.append(k).append(":").append(stringRedisTemplate.opsForValue().get(k)).append("\n");
        }

        return stringBuilder.toString();
    }


}
