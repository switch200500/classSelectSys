package com.jkb.service.serviceImpl;
import com.jkb.entity.ClassTimePosition;
import com.jkb.mapper.ClassTimePositionMapper;
import com.jkb.service.ClassTimePositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassTimePositionServiceImpl implements ClassTimePositionService {
    @Autowired
    ClassTimePositionMapper classTimePositionMapper;

    @Override
    public List<ClassTimePosition> getAllClassTimePosition(){
        return classTimePositionMapper.getAllClassTimePosition();
    }

    @Override
    public List<ClassTimePosition> getClassTimePosition(long classCode,String campus) {
        return classTimePositionMapper.getClassTimePosition(classCode,campus);
    }
}
