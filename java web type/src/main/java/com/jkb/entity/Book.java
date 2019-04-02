package com.jkb.entity;

import lombok.Data;

//书籍表
@Data
public class Book {
    private Integer code;

    private String name;

    private Float price;

    private Float rec;

    private String publish;

    private String author;

    private String type;

    private Integer page;

    private String pubTime;

    private long ISBN;

//booked
    private long Sno;

    private byte buy;

    private Float personRec;
}
