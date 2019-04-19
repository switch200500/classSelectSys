package com.jkb.service.serviceImpl;

import com.jkb.entity.Job;
import com.jkb.mapper.JobMapper;
import com.jkb.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService{
    @Autowired
    JobMapper jobMapper;

    @Override
    public List<Job> getAllJob() {
        return jobMapper.getAllJob();
    }
}
