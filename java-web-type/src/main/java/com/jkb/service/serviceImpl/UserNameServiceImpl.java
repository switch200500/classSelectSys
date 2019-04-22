package com.jkb.service.serviceImpl;

import com.jkb.entity.UserName;
import com.jkb.mapper.UserNameMapper;
import com.jkb.service.UserNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Service
 * 自动注册到Spring容器，不需要再在applicationContext.xml文件定义bean了，类似的还包括@Component、@Repository、@Controller。
 */
@Service
public class UserNameServiceImpl implements UserNameService {
    @Autowired  //对类成员变量、方法及构造函数进行标注，完成自动装配的工作。 通过 @Autowired的使用来消除 set ，get方法。
    UserNameMapper userNameMapper;




    @Override   //如果想重写父类的方法，在方法前面加上@Override 系统可以帮你检查方法的正确性。
    public List<UserName> getAllUserName(String username, String password) {
        return userNameMapper.getAllUserName(username,password);
    }

    @Override
    public int insertUserName(UserName userName) {
        return userNameMapper.insertUserName(userName);
    }
}
