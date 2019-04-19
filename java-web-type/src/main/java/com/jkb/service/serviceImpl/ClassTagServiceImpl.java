package com.jkb.service.serviceImpl;

import com.jkb.entity.ClassTag;
import com.jkb.mapper.ClassTagMapper;
import com.jkb.service.ClassTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

//注意一定要implements实现接口定义的抽象方法
@Service
public class ClassTagServiceImpl  implements ClassTagService{
    @Autowired
    ClassTagMapper classTagMapper;

    @Override
    public List<ClassTag> getAllClassTag(long classCode) {
        return classTagMapper.getAllClassTag(classCode);
    }

    @Override
    public int updateClassTag(ClassTag classTag) {
        return classTagMapper.updateClassTag(classTag);
    }


    @Override
    public int insertClassTag(ClassTag classTag) {
        return classTagMapper.insertClassTag(classTag);
    }


    @Override
    public int deleteClassTag(Integer tagId) {
        return classTagMapper.deleteClassTag(tagId);
    }
}
