package com.jkb.entity;
import lombok.Data;

@Data
public class ClassTag {
    private Integer id;

    private long classCode;

    private String text;

    private Integer agree;

    private byte isAgree;
}
