package com.jkb.entity;
import lombok.Data;

import java.util.List;

@Data
public class ClassTable {
    private long id;

    private Integer classTime;

    private long Sno;

    private Integer term;

    private long monD;

    private long tuesD;

    private long wedD;

    private long thursD;

    private long friD;

    private long satD;

    private long sunD;

    private List<ClassMsg> monDM;

    private List<ClassMsg> tuesDM;

    private List<ClassMsg> wedDM;

    private List<ClassMsg> thursDM;

    private List<ClassMsg> friDM;

    private List<ClassMsg> satDM;

    private List<ClassMsg> sunDM;
}
