package com.proj.github.insight.service;

import org.springframework.http.ResponseEntity;

public interface EventService {
	
	public ResponseEntity<?> getEventsByUserAndRepo(String userName, String repoName);
}
