package com.jkb.entity;
import lombok.Data;

import java.util.Set;
import java.util.List;

@Data
public class ClassMsg {
    private long classCode;

    private String classType;

    private String className;

    private String classInstitute;

    private String classTeacher;

    private Integer selected;

    private Integer unselected;

    private String developDirection;

    private Float score;

    private String classIntroduction;

    private List<ClassTimePosition> ctpN;

    private List<ClassTimePosition> ctpO;

    private List<ClassTag> tag;

    private List<ClassUpdate> classUp;

}
