package com.jkb.mapper;

import com.jkb.entity.UserName;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 1:为了把mapper这个DAO交給Spring管理 http://412887952-qq-com.iteye.com/blog/2392672

 2:为了不再写mapper映射文件 https://blog.csdn.net/phenomenonstell/article/details/79033144

 3:为了给mapper接口 自动根据一个添加@Mapper注解的接口生成一个实现类 http://www.tianshouzhi.com/api/tutorials/mapstruct/292
 */

@Mapper
public interface UserNameMapper {
//作为Dao层的注解，作用是用于传递参数，从而可以与SQL中的的字段名相对应
    List<UserName> getAllUserName(@Param("username")String username, @Param("password")String password);

    int insertUserName(UserName userName);
}
