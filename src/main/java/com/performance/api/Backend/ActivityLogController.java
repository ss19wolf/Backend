package com.performance.api.Backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

     @RestController
@RequestMapping("/api/activity")
public class ActivityLogController {
    @Autowired
    private ActivityLogRepository repo;

    @PostMapping("/post/log")
    public ActivityLog logActivity(@RequestBody ActivityLog log) {
        return repo.save(log);
    }

    @GetMapping("/get/logs")
    public List<ActivityLog> getAllLogs() {
        return repo.findAll();
    }
}


