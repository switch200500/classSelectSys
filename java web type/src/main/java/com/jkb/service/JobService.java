package com.jkb.service;
import com.jkb.entity.Job;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JobService {
    List<Job> getAllJob();
}
