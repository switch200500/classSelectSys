package com.jkb.controller;
import com.jkb.entity.ClassTag;
import com.jkb.entity.ClassMsg;
import com.jkb.entity.ClassUpdate;
import com.jkb.entity.ClassAgreeTag;
import com.jkb.entity.ClassTimePosition;
import com.jkb.entity.ClassTable;
import com.jkb.entity.Book;

import com.jkb.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class ClassController {
    @Autowired
    ClassMsgService classMsgService;
    @Autowired
    ClassTagService classTagService;
    @Autowired
    ClassUpdateService classUpdateService;
    @Autowired
    ClassAgreeTagService classAgreeTagService;
    @Autowired
    ClassTimePositionService classTimePositionService;
    @Autowired
    ClassTableService classTableService;
    @Autowired
    BookService bookService;
    /*
    *获取数据
    * */
    @RequestMapping(value = "/get_class")
    public List classMsg(long Sno) {
        List<ClassMsg> classMsg = classMsgService.getAllClassMsg();
        for(ClassMsg classMsg1 : classMsg){
            List<ClassTimePosition> ctpN = classTimePositionService.getClassTimePosition(classMsg1.getClassCode(),"new");
            List<ClassTimePosition> ctpO = classTimePositionService.getClassTimePosition(classMsg1.getClassCode(),"old");
            List<ClassTag> classTag = classTagService.getAllClassTag(classMsg1.getClassCode());
            List<ClassUpdate> classUpdate = classUpdateService.getAllClassUpdate(Sno,classMsg1.getClassCode());
            List<Book> classBook = bookService.getBook(classMsg1.getBookCode());

            classMsg1.setClassBook(classBook);
            classMsg1.setCtpN(ctpN);
            classMsg1.setCtpO(ctpO);
            classMsg1.setTag(classTag);
            classMsg1.setClassUp(classUpdate);
        }
//        System.out.println(classMsg);
        return classMsg;
    }
    @RequestMapping(value = "/get_cTimePosition")
    public List classTP() {
        List<ClassTimePosition> classTimePosition = classTimePositionService.getAllClassTimePosition();
        return classTimePosition;
    }

    @RequestMapping(value = "/get_o_class")
    public List classOMsg(long classCode) {
        List<ClassMsg> classMsg = classMsgService.getClassMsg(classCode);
//        System.out.println(classMsg);
        return classMsg;
    }

    @RequestMapping(value = "/get_tag")
    public List classTag(long Sno,long classCode) {
        List<ClassTag> classTag = classTagService.getAllClassTag(classCode);
        List<ClassAgreeTag> classAgreeTag = classAgreeTagService.getClassAgreeTag(Sno,classCode);
        for(int i=0;i<classTag.size();i++){
            for(int j=0;j<classAgreeTag.size();j++){
                if(classTag.get(i).getId() == classAgreeTag.get(j).getAgreeId()){
                    classTag.get(i).setIsAgree((byte)1);
                }
            }
        }
//        System.out.println(classTag);
        return classTag;
    }

    @RequestMapping(value = "/get_classUpdate")
    public List classUpdate(long Sno,long classCode) {
        List<ClassUpdate> classUpdate = classUpdateService.getAllClassUpdate(Sno,classCode);
        return classUpdate;
    }

    public List setClassTable(long classCode){
        List<ClassMsg> classMsg1 = classMsgService.getClassMsg(classCode);
//        System.out.println(classMsg1);

        List<ClassTimePosition> ctpN = classTimePositionService.getClassTimePosition(classCode,"new");
        List<ClassTimePosition> ctpO = classTimePositionService.getClassTimePosition(classCode,"old");
        classMsg1.get(0).setCtpN(ctpN);
        classMsg1.get(0).setCtpO(ctpO);
        return classMsg1;
    }

    @RequestMapping(value = "/get_classTable")
    public List classTable(long Sno,Integer term) {
        List<ClassTable> classTable = classTableService.getAllClassTable(Sno,term);
        for(ClassTable classTable1 : classTable) {
//            System.out.println(classTable1);
            if(classTable1.getMonD() != 0 && classTable1.getMonD() != -1){
                List classMsg1 = this.setClassTable(classTable1.getMonD());
                classTable1.setMonDM(classMsg1);
            }
            if(classTable1.getTuesD() != 0 && classTable1.getTuesD() != -1){
                List classMsg2 = this.setClassTable(classTable1.getTuesD());
//                System.out.println(classMsg2);
                classTable1.setTuesDM(classMsg2);
            }
            if(classTable1.getWedD() != 0 && classTable1.getWedD() != -1){
                List classMsg3 = this.setClassTable(classTable1.getWedD());
                classTable1.setWedDM(classMsg3);
            }
            if(classTable1.getThursD() != 0 && classTable1.getThursD() != -1){
                List classMsg4 = this.setClassTable(classTable1.getThursD());
                classTable1.setThursDM(classMsg4);
            }
            if(classTable1.getFriD() != 0 && classTable1.getFriD() != -1){
                List classMsg5 = this.setClassTable(classTable1.getFriD());
                classTable1.setFriDM(classMsg5);
            }
            if(classTable1.getSatD() != 0 && classTable1.getSatD() != -1){
                List classMsg6 = this.setClassTable(classTable1.getSatD());
                classTable1.setSatDM(classMsg6);
            }
            if(classTable1.getSunD() != 0 && classTable1.getSunD() != -1){
                List classMsg7 = this.setClassTable(classTable1.getSunD());
                classTable1.setSunDM(classMsg7);
            }
        }
        return classTable;
    }

    /**
     *  选课信息操作更新
     */
    @RequestMapping(value = "/up_classUpdate")
    public Boolean upClassUpdate(ClassUpdate classUpdate) {
        int rtn = classUpdateService.updateClassUpdate(classUpdate);
        if(rtn == 1){
            return Boolean.TRUE;
        }else{
            return Boolean.FALSE;
        }
    }
    @RequestMapping(value = "/add_classUpdate")
    public Boolean addClassUpdate(ClassUpdate classUpdate) {
        int rtn = classUpdateService.insertClassUpdate(classUpdate);
        if(rtn == 1){
            return Boolean.TRUE;
        }else{
            return Boolean.FALSE;
        }
    }

    ////更新信息表，选课人数变化
    @RequestMapping(value = "/up_classMsg")
    public Boolean upClassMsg(ClassMsg classMsg) {
        int rtn = classMsgService.updateClassMsg(classMsg);
        if(rtn == 1){
            return Boolean.TRUE;
        }else{
            return Boolean.FALSE;
        }
    }
    ////更新信息表，评分变化
    @RequestMapping(value = "/up_classMsgScore")
    public Boolean upClassMsgScore(long classCode) {
        int rtn = classMsgService.updateClassMsgScore(classCode);
        if(rtn == 1){
            return Boolean.TRUE;
        }else{
            return Boolean.FALSE;
        }
    }

    //更新课程表，表数据变化
    @RequestMapping(value = "/up_classTable")
    public Boolean upClassTable(ClassTable classTable) {
        int rtn = classTableService.updateClassTable(classTable);
        if(rtn == 1){
            return Boolean.TRUE;
        }else{
            return Boolean.FALSE;
        }
    }

    /**
     *   tag操作
     */
    @RequestMapping(value = "/add_classTag")
    public Integer addClassTag(ClassTag classTag) {
        int rtn = classTagService.insertClassTag(classTag);
//                System.out.println(classTag.getId());  //打印值为最后的id，即刚插入的id
//        参考https://blog.csdn.net/qq_30715329/article/details/80868411
        if(rtn == 1 ){
            return classTag.getId();
        }else{
            return 0;
        }
    }

    @RequestMapping(value = "/add_classAgreeTag")
    public Boolean addClassAgreeTag(ClassAgreeTag classAgreeTag) {
        int rtn = classAgreeTagService.insertClassAgreeTag(classAgreeTag);
        if(rtn == 1 ){
            return Boolean.TRUE;
        }else{
            return Boolean.FALSE;
        }
    }

    @RequestMapping(value = "/del_classTag")
    public Boolean delClassTag(Integer id) {
        int rtn1 = classTagService.deleteClassTag(id);
        int rtn2 = classAgreeTagService.deleteClassAgreeTag(id);
//        System.out.println(rtn);
//        System.out.println(id);
        if(rtn1 == 1 && rtn2 == 1){
            return Boolean.TRUE;
        }else{
            return Boolean.FALSE;
        }
    }

    @RequestMapping(value = "/del_agreeTag")
    public Boolean delAgreeClassTag(Integer id) {
        int rtn = classAgreeTagService.deleteClassAgreeTag(id);
        if( rtn == 1){
            return Boolean.TRUE;
        }else{
            return Boolean.FALSE;
        }
    }

    @RequestMapping(value = "/up_classTag")
    public Boolean handleStudent( ClassTag classTag) {
        int rtn = classTagService.updateClassTag(classTag);
//        System.out.println(rtn);
//        System.out.println(classTag);
        if(rtn == 1){
            return Boolean.TRUE;
        }else{
            return Boolean.FALSE;
        }

    }
}
