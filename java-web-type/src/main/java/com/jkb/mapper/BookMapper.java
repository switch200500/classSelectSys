package com.jkb.mapper;
import com.jkb.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//2.接口
@Mapper
public interface BookMapper {
    List<Book> getAllBook();
    List<Book> getBook(@Param("code")long code);
    int updateBook(@Param("code")long code);
}
