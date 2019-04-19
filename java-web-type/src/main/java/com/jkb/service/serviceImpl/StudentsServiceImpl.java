package com.jkb.service.serviceImpl;

import com.jkb.entity.Students;
import com.jkb.mapper.StudentsMapper;
import com.jkb.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsServiceImpl implements StudentsService {
    @Autowired
    StudentsMapper studentsMapper;

    @Override
    public List<Students> getAllStudents(long Sno, String password) {
        return studentsMapper.getAllStudents(Sno,password);
    }

    @Override
    public int updateStudents(Students students) {
        return studentsMapper.updateStudents(students);
    }
}
