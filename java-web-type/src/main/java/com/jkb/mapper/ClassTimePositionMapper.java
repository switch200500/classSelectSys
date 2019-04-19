package com.jkb.mapper;
import com.jkb.entity.ClassTimePosition;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//2.接口
@Mapper
public interface ClassTimePositionMapper {
    List<ClassTimePosition> getAllClassTimePosition();
    List<ClassTimePosition> getClassTimePosition(@Param("classCode") long classCode,@Param("campus") String campus);
}
