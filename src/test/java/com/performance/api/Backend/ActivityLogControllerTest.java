package com.performance.api.Backend;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.http.MediaType;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class ActivityLogControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetAllLogs() throws Exception {
        mockMvc.perform(get("/api/activity/logs"))
                .andExpect(status().isOk());
    }

    @Test
    public void testLogActivity() throws Exception {
        String payload = "{" +
                "\"userId\":1," +
                "\"activityType\":\"Coding\"," +
                "\"startTime\":\"2025-08-06T09:00:00\"," +
                "\"endTime\":\"2025-08-06T10:00:00\"," +
                "\"application\":\"IntelliJ IDEA\"," +
                "\"efficiencyScore\":95.5," +
                "\"createdAt\":\"2025-08-06T10:01:00\"}";
        mockMvc.perform(post("/api/activity/log")
                .contentType(MediaType.APPLICATION_JSON)
                .content(payload))
                .andExpect(status().isOk());
    }
}
