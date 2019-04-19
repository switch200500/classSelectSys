package com.jkb.service;
import com.jkb.entity.Booked;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookedService {
    List<Booked> getAllBooked(@Param("Sno")long Sno);
    int updateBooked(Booked booked);
    int insertBooked(Booked booked);
}
