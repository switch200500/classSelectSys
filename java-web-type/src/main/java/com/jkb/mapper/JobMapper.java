package com.jkb.mapper;
import com.jkb.entity.Job;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//2.接口
@Mapper
public interface JobMapper {
    //查询学生表方法，因为查询的是整张表，返回一个list数组
//    public List<Students> getAllJob();
    List<Job> getAllJob();

}
