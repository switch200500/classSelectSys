package com.jkb.service.serviceImpl;

import com.jkb.entity.UserName;
import com.jkb.mapper.UserNameMapper;
import com.jkb.service.UserNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserNameServiceImpl implements UserNameService {
    @Autowired
    UserNameMapper userNameMapper;




    @Override
    public List<UserName> getAllUserName(String username, String password) {
        return userNameMapper.getAllUserName(username,password);
    }

    @Override
    public int insertUserName(UserName userName) {
        return userNameMapper.insertUserName(userName);
    }
}
