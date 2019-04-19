package com.jkb.service;

import com.jkb.entity.ClassTimePosition;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassTimePositionService {
    List<ClassTimePosition> getAllClassTimePosition();
    List<ClassTimePosition> getClassTimePosition(@Param("classCode") long classCode,@Param("campus") String campus);

}
