package com.jkb.controller;
import com.jkb.entity.Students;
import com.jkb.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
 import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
//@RestController主要起到@Controller + @ResponseBody的作用,它使得整个Controller的每一个方法都返回json数据
//@RequestMapping("/rest")
public class StudentsController {
    @Autowired
    StudentsService studentsService;

    @RequestMapping(value = "/handle_login")    //ajax传的url值
    public Boolean Login( Students user) {
        List<Students> students = studentsService.getAllStudents(user.getSno() ,user.getPassword());
        System.out.println(students);
        if(students.size()!=0){
            return Boolean.TRUE;
        }else{
            return Boolean.FALSE;
        }
    }

    @RequestMapping(value = "/get_msg")    //ajax传的url值
    public List Msg( Students user) {
        List<Students> students = studentsService.getAllStudents(user.getSno() ,user.getPassword());
//        System.out.println(students);
        return students;
    }

    @RequestMapping(value = "/update_student")
    public Boolean handleStudent( Students user) {
       int rtn = studentsService.updateStudents(user);
        System.out.println(rtn);
        System.out.println(user);
        if(rtn == 1){
            return Boolean.TRUE;
        }else{
            return Boolean.FALSE;
        }

    }

}
