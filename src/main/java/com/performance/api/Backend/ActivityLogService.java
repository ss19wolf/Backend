package com.performance.api.Backend;

import java.util.List;
import java.util.Optional;

public interface ActivityLogService {
    List<ActivityLog> getAllActivityLogs();
    Optional<ActivityLog> getActivityLogById(Integer id);
    ActivityLog saveActivityLog(ActivityLog activityLog);
    void deleteActivityLog(Integer id);
}
