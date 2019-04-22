package com.jkb.controller;


import com.jkb.entity.UserName;
import com.jkb.service.UserNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//@RestController主要起到@Controller + @ResponseBody的作用,它使得整个Controller的每一个方法都返回json数据
@RestController //@RestController的意思就是controller里面的方法都以json格式输出，不用再写什么jackjson配置的了！
public class UserNameController {
    @Autowired
    UserNameService userNameService;

    @RequestMapping("/loginUser")   //将 HTTP 请求映射到 MVC 和 REST 控制器的处理方法上。
    public String login(String username, String password){
        List<UserName> allUserName = userNameService.getAllUserName(username, password);
        String result = "";
        if (!allUserName.isEmpty()){
            result = "success";
        }else {
            result = "error";
        }
        return result;
    }

   @RequestMapping("/registerUser")
   public int registerUserName(UserName userName){
       if ("1".equals(userName.getSex())){
            userName.setSex("男");
       }else {
           userName.setSex("女");
       }
       int i = userNameService.insertUserName(userName);
       return i;
   }

}
