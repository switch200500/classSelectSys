package com.jkb.service;

import com.jkb.entity.ClassMsg;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassMsgService {
    List<ClassMsg> getAllClassMsg();
    List<ClassMsg> getClassMsg(@Param("classCode") long classCode);
    int updateClassMsg(ClassMsg classMsg);
    int updateClassMsgScore(@Param("classCode") long classCode);
}
