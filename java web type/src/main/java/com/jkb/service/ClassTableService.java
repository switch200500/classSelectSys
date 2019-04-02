package com.jkb.service;

import com.jkb.entity.ClassTable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassTableService {
    List<ClassTable> getAllClassTable(@Param("Sno") long Sno, @Param("term") Integer term);
    int updateClassTable(ClassTable classTable);
}
