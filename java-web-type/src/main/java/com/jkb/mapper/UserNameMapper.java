package com.jkb.mapper;

import com.jkb.entity.UserName;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserNameMapper {

    List<UserName> getAllUserName(@Param("username")String username, @Param("password")String password);

    int insertUserName(UserName userName);
}
