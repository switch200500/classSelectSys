package com.jkb.service.serviceImpl;

import com.jkb.entity.ClassMsg;
import com.jkb.mapper.ClassMsgMapper;
import com.jkb.service.ClassMsgService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

//注意一定要implements实现接口定义的抽象方法
@Service
public class ClassMsgServiceImpl  implements ClassMsgService{
    @Autowired
    ClassMsgMapper classMsgMapper;

    @Override
    public List<ClassMsg> getAllClassMsg() {
        return classMsgMapper.getAllClassMsg();
    }

    @Override
    public List<ClassMsg> getClassMsg(long classCode){
        return classMsgMapper.getClassMsg(classCode);
    }

    @Override
    public int updateClassMsg(ClassMsg classMsg){
        return classMsgMapper.updateClassMsg(classMsg);
    }

    @Override
    public int updateClassMsgScore(long classCode){
        return classMsgMapper.updateClassMsgScore(classCode);
    }

}
