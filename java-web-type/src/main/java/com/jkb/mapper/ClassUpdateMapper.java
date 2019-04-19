package com.jkb.mapper;

import com.jkb.entity.ClassUpdate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//2.接口
@Mapper
public interface ClassUpdateMapper {
    List<ClassUpdate> getAllClassUpdate(@Param("Sno")long Sno,@Param("classCode")long classCode);

    int updateClassUpdate(ClassUpdate classUpdate);
    int insertClassUpdate(ClassUpdate classUpdate);
}
