package com.jkb.service;

import com.jkb.entity.Students;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentsService {
    List<Students> getAllStudents(@Param("Sno")long Sno, @Param("password")String password);
    int updateStudents(Students students);
}
