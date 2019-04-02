package com.jkb.entity;

import lombok.Data;

//工作表
@Data
public class Job {
    private Integer id;

    private String position;

    private String type;

    private String recLesson;

    private String recBook;

    private String salary;

    private String jobIntroduction;

}
