package com.jkb.service.serviceImpl;

import com.jkb.entity.ClassTable;
import com.jkb.mapper.ClassTableMapper;
import com.jkb.service.ClassTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//注意一定要implements实现接口定义的抽象方法
@Service
public class ClassTableServiceImpl  implements ClassTableService {
    @Autowired
    ClassTableMapper classTableMapper;

    @Override
    public List<ClassTable> getAllClassTable(long Sno, Integer term){
        return classTableMapper.getAllClassTable(Sno,term);
    }

    @Override
    public int updateClassTable(ClassTable classTable){
        return classTableMapper.updateClassTable(classTable);
    }
}
