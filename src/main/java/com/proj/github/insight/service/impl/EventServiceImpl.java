package com.proj.github.insight.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.proj.github.insight.service.EventService;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public ResponseEntity<?> getEventsByUserAndRepo(String userName, String repoName) {
        return restTemplate.getForEntity(String.format("https://api.github.com/repos/%s/%s/events", userName,repoName), String.class);
	}

}
