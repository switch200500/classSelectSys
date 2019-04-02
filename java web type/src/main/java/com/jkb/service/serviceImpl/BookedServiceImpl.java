package com.jkb.service.serviceImpl;

import com.jkb.entity.Booked;
import com.jkb.mapper.BookedMapper;
import com.jkb.service.BookedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

//注意一定要implements实现接口定义的抽象方法
@Service
public class BookedServiceImpl  implements BookedService{
    @Autowired
    BookedMapper bookedMapper;

    @Override
    public List<Booked> getAllBooked(long Sno) {
        return bookedMapper.getAllBooked(Sno);
    }

    @Override
    public int updateBooked(Booked booked) {
        return bookedMapper.updateBooked(booked);
    }


    @Override
    public int insertBooked(Booked booked) {
        return bookedMapper.insertBooked(booked);
    }
}
