package com.jkb.entity;
import lombok.Data;

@Data
public class ClassTimePosition {
    private Integer id;

    private long classCode;

    private String campus;

    private Integer time;

    private String weekD;

    private String position;

}
