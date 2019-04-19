package com.jkb.entity;

import lombok.Data;

//书籍表
@Data
public class Booked {
//    private Integer id;

    private long Sno;

    private long code;

    private byte buy;

    private Float personRec;
}
