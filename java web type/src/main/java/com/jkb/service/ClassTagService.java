package com.jkb.service;

import com.jkb.entity.ClassTag;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassTagService {
    List<ClassTag> getAllClassTag(@Param("classCode") long classCode);
    int updateClassTag(ClassTag classTag);
    int insertClassTag(ClassTag classTag);
    int deleteClassTag(@Param("id") Integer tagId);
}
