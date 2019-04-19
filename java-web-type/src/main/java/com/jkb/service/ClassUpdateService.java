package com.jkb.service;

import com.jkb.entity.ClassUpdate;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassUpdateService {
    List<ClassUpdate> getAllClassUpdate(@Param("Sno")long Sno, @Param("classCode")long classCode);

    int updateClassUpdate(ClassUpdate classUpdate);
    int insertClassUpdate(ClassUpdate classUpdate);
}
