package com.proj.github.insight.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestTemplate;

import com.proj.github.insight.service.EventService;
import com.proj.github.insight.service.LoggingService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = EventsController.class)
public class EventsControllerTest {

	 @Autowired
	 private MockMvc mockMvc;
	
	@MockBean
    private RestTemplate restTemplate;
	
	@MockBean
	private EventService eventService;

	@MockBean
	private LoggingService loggingservice;
	
	@Test
    public void getEventsTest() throws Exception {
		
		String userName = "surya-verma";
		String repoName = "DSA_Repo";

        this.mockMvc.perform(get((String.format("/api/repos/%s/%s/events", userName,repoName)))).andExpect(status().isOk());
    }
}
