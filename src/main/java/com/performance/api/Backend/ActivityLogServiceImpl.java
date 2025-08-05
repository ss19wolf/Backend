package com.performance.api.Backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ActivityLogServiceImpl implements ActivityLogService {
    @Autowired
    private ActivityLogRepository activityLogRepository;

    @Override
    public List<ActivityLog> getAllActivityLogs() {
        return activityLogRepository.findAll();
    }

    @Override
    public Optional<ActivityLog> getActivityLogById(Integer id) {
        return activityLogRepository.findById(id);
    }

    @Override
    public ActivityLog saveActivityLog(ActivityLog activityLog) {
        return activityLogRepository.save(activityLog);
    }

    @Override
    public void deleteActivityLog(Integer id) {
        activityLogRepository.deleteById(id);
    }
}
