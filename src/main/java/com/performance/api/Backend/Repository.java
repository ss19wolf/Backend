package com.performance.api.Backend;

import org.springframework.data.jpa.repository.JpaRepository;

public class Repository {
    public interface ActivityLogRepository extends JpaRepository<ActivityLog, Integer> {}

}
