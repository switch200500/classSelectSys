package com.jkb.entity;
import lombok.Data;

@Data
public class ClassUpdate {
    private long Sno;

    private Integer term;

    private long classCode;

    private byte classSelect;

    private byte classCollect;

    private Float personScore;
}
