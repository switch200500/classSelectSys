package com.jkb.service;

import com.jkb.entity.ClassAgreeTag;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassAgreeTagService {
    List<ClassAgreeTag> getClassAgreeTag(@Param("Sno") long Sno, @Param("classCode") long classCode);
    int insertClassAgreeTag(ClassAgreeTag classAgreeTag);
    int deleteClassAgreeTag(@Param("id") Integer agreeTagId);
}
