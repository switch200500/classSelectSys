package com.jkb.mapper;
import com.jkb.entity.ClassMsg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//2.接口
@Mapper
public interface ClassMsgMapper {
    List<ClassMsg> getAllClassMsg();
    List<ClassMsg> getClassMsg(@Param("classCode") long classCode);
    int updateClassMsg(ClassMsg classMsg);
    int updateClassMsgScore(@Param("classCode") long classCode);
}
