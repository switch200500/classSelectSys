package com.jkb.service;
import com.jkb.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    List<Book> getAllBook();
    List<Book> getBook(@Param("code")long code);
    int updateBook(@Param("code")long code);
}
