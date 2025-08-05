package com.performance.api.Backend;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ActivityLogTest {
    @Test
    public void testActivityLogSettersAndGetters() {
        ActivityLog log = new ActivityLog();
        log.setUserId(1);
        log.setActivityType("Coding");
        log.setApplication("IntelliJ IDEA");
        log.setEfficiencyScore(95.5);
        assertEquals(1, log.getUserId());
        assertEquals("Coding", log.getActivityType());
        assertEquals("IntelliJ IDEA", log.getApplication());
        assertEquals(95.5, log.getEfficiencyScore());
    }
}
