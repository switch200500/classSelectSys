package com.jkb.controller;
import com.jkb.entity.Job;
import com.jkb.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
public class JobController {
    @Autowired
    JobService jobService;

    @RequestMapping(value = "/handle_job")
    public List Job() {
        List<Job> job = jobService.getAllJob();
//        System.out.println(job);
        return job;
    }

}
