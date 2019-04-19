package com.jkb.entity;

import lombok.Data;

//1.学生信息表
@Data
public class Students {
    private long Sno;

    private String Sname;

    private String password;

    private String Ssex;

    private String Sbirth;

    private String Sdept;

    private String institute;

    private Integer Sclass;

    private String phone;

    private String email;

    /*@Override
    public String toString() {
        return "Stu{"
                + "Sno='"
                + Sno + '\'' + ", Sname='"
                + Sname + '\'' + ", password='"
                + password + '\'' + ", Ssex='"
                + Ssex + '\'' + ", Sage='"
                + Sage + '\'' + ", Sdept='"
                + Sdept + '\'' + ", Sclass='"
                + Sclass + '\'' + ", phone='"
                + phone + '\'' + ", email='"
                + email + '\'' + '}';
    }*/

}
