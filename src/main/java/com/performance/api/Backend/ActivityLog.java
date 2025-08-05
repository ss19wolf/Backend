package com.performance.api.Backend;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class ActivityLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer userId;
    private String activityType;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String application;
    private Double efficiencyScore;
    private LocalDateTime createdAt;

}


