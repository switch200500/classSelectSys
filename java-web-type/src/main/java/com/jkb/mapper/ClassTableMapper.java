package com.jkb.mapper;
import com.jkb.entity.ClassTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//2.接口
@Mapper
public interface ClassTableMapper {
    List<ClassTable> getAllClassTable(@Param("Sno") long Sno,@Param("term") Integer term);
    int updateClassTable(ClassTable classTable);
}
