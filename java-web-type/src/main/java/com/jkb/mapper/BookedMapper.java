package com.jkb.mapper;

import com.jkb.entity.Booked;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//2.接口
@Mapper
public interface BookedMapper {
    List<Booked> getAllBooked(@Param("Sno")long Sno);

    int updateBooked(Booked booked);
    int insertBooked(Booked booked);
}
