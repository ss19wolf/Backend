package com.performance.api.Backend;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Optional;
import java.util.Arrays;
import java.util.List;

public class ActivityLogServiceImplTest {
    @Mock
    private ActivityLogRepository repo;

    @InjectMocks
    private ActivityLogServiceImpl service;

    public ActivityLogServiceImplTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllActivityLogs() {
        ActivityLog log = new ActivityLog();
        when(repo.findAll()).thenReturn(Arrays.asList(log));
        List<ActivityLog> logs = service.getAllActivityLogs();
        assertEquals(1, logs.size());
    }

    @Test
    public void testGetActivityLogById() {
        ActivityLog log = new ActivityLog();
        when(repo.findById(1)).thenReturn(Optional.of(log));
        Optional<ActivityLog> result = service.getActivityLogById(1);
        assertTrue(result.isPresent());
    }

    @Test
    public void testSaveActivityLog() {
        ActivityLog log = new ActivityLog();
        when(repo.save(log)).thenReturn(log);
        ActivityLog result = service.saveActivityLog(log);
        assertNotNull(result);
    }

    @Test
    public void testDeleteActivityLog() {
        service.deleteActivityLog(1);
        verify(repo, times(1)).deleteById(1);
    }
}
