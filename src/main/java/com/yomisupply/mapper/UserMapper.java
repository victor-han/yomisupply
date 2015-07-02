package com.yomisupply.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.yomisupply.domain.User;

public interface UserMapper {

	@Select("select * from user where username = #{username} and password = #{password}")
	User getUserById(@Param("username") String username, @Param("passwoed") String password);

	@Insert("insert into user(username) values(#{username})")
	void insertUser(@Param("username") String username);

}
