package com.yomisupply.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yomisupply.domain.User;
import com.yomisupply.mapper.UserMapper;

@Service("userService")
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
//	@Autowired
//	private ModelMapper modelMapper;
	
	@Transactional(readOnly=true)
	public User getUserByUsernamePassword(String username,String password){
		return userMapper.getUserById(username, password);
	}
	
//	@Transactional
//	public void insertUser(String username){
//		userMapper.insertUser(username);
//		modelMapper.insertModel(username);
//	}
}
