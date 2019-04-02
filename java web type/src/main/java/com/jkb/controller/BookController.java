package com.jkb.controller;
import com.jkb.entity.Book;
import com.jkb.entity.Booked;
import com.jkb.service.BookService;
import com.jkb.service.BookedService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;
    @Autowired
    BookedService bookedService;

    @RequestMapping(value = "/handle_book")
    public List book(long Sno) {
        List<Book> book = bookService.getAllBook();
        List<Booked> booked = bookedService.getAllBooked(Sno);
//        System.out.println(booked);
        for(int i=0;i<book.size();i++){
            for(int j=0;j<booked.size();j++){
                if(book.get(i).getCode() == booked.get(j).getCode()){
                    book.get(i).setBuy(booked.get(j).getBuy());
                    book.get(i).setPersonRec(booked.get(j).getPersonRec());
                    book.get(i).setSno(booked.get(j).getSno());
                }
                /*else{
                    book.get(i).setBuy((byte)0);
                    book.get(i).setPersonRec(0.0f);
                }*/
            }
        }
//        System.out.println(book);
        return book;
    }

    @RequestMapping(value = "/update_booked")
    public Boolean handleBook( Booked booked) {
        int rtn = bookedService.updateBooked(booked);
        if(rtn == 1){
            return Boolean.TRUE;
        }else{
            return Boolean.FALSE;
        }
    }

    @RequestMapping(value = "/insert_booked")
    public Boolean insertBook( Booked booked) {
        int rtn = bookedService.insertBooked(booked);
        if(rtn == 1){
            return Boolean.TRUE;
        }else{
            return Boolean.FALSE;
        }
    }
}
