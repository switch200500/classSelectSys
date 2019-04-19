package com.jkb.service.serviceImpl;

import com.jkb.entity.ClassUpdate;
import com.jkb.mapper.ClassUpdateMapper;
import com.jkb.service.ClassUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassUpdateServiceImpl implements ClassUpdateService {
    @Autowired
    ClassUpdateMapper classUpdateMapper;

    @Override
    public List<ClassUpdate> getAllClassUpdate(long Sno,long classCode) {
        return classUpdateMapper.getAllClassUpdate(Sno,classCode);
    }

    @Override
    public int updateClassUpdate(ClassUpdate classUpdate) {
        return classUpdateMapper.updateClassUpdate(classUpdate);
    }


    @Override
    public int insertClassUpdate(ClassUpdate classUpdate) {
        return classUpdateMapper.insertClassUpdate(classUpdate);
    }
}
