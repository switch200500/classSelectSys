package com.jkb.service;

import com.jkb.entity.User;
import com.jkb.entity.UserName;

import java.util.List;

public interface UserNameService {
    List<UserName> getAllUserName(String username, String password);
    int insertUserName(UserName userName);
}
