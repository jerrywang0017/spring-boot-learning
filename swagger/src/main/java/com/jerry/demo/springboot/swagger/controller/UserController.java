package com.jerry.demo.springboot.swagger.controller;

import com.jerry.demo.springboot.swagger.dto.UserDTO;
import com.jerry.demo.springboot.swagger.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(description = "用户相关接口")
@Controller
@RequestMapping("/user")
public class UserController {

	@ApiOperation(value = "查询用户信息", notes = "根据userId查询用户信息")
	@RequestMapping(value = "get", method = RequestMethod.POST)
	@ResponseBody
	public UserVO get(UserDTO userDTO) {
		if (userDTO.getUserId() == 1) {
			UserVO userVO = new UserVO();
			userVO.setUserId(1L);
			userVO.setUsername("Jerry");
			userVO.setMobile("15210869959");
			return userVO;
		}
		return null;
	}

}
