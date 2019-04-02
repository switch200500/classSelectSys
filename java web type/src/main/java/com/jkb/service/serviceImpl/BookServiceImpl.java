package com.jkb.service.serviceImpl;

import com.jkb.entity.Book;
import com.jkb.mapper.BookMapper;
import com.jkb.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl  implements BookService{
    @Autowired
    BookMapper bookMapper;

    @Override
    public List<Book> getAllBook() {
        return bookMapper.getAllBook();
    }

   /* @Override
    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }*/
}
