package com.jkb.mapper;
import com.jkb.entity.ClassTag;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//2.接口
@Mapper
public interface ClassTagMapper {
    List<ClassTag> getAllClassTag(@Param("classCode") long classCode);
    int updateClassTag(ClassTag classTag);
    int insertClassTag(ClassTag classTag);
    int deleteClassTag(@Param("id") Integer tagId);
}
