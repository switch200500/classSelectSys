package com.jkb.service.serviceImpl;

import com.jkb.entity.ClassAgreeTag;
import com.jkb.mapper.ClassAgreeTagMapper;
import com.jkb.service.ClassAgreeTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

//注意一定要implements实现接口定义的抽象方法
@Service
public class ClassAgreeTagServiceImpl  implements ClassAgreeTagService{
    @Autowired
    ClassAgreeTagMapper classAgreeTagMapper;

    @Override
    public List<ClassAgreeTag> getClassAgreeTag(long Sno, long classCode){
        return classAgreeTagMapper.getClassAgreeTag(Sno,classCode);
    }

    @Override
    public int insertClassAgreeTag(ClassAgreeTag classAgreeTag){
        return classAgreeTagMapper.insertClassAgreeTag(classAgreeTag);
    }

    @Override
    public int deleteClassAgreeTag(Integer agreeTagId){
        return classAgreeTagMapper.deleteClassAgreeTag(agreeTagId);
    }
}
