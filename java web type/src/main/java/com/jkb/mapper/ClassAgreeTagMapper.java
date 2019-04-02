package com.jkb.mapper;
import com.jkb.entity.ClassAgreeTag;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//2.接口
@Mapper
public interface ClassAgreeTagMapper {
    List<ClassAgreeTag> getClassAgreeTag(@Param("Sno") long Sno,@Param("classCode") long classCode);
    int insertClassAgreeTag(ClassAgreeTag classAgreeTag);
    int deleteClassAgreeTag(@Param("id") Integer agreeTagId);
}
