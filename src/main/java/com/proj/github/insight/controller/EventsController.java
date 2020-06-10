package com.proj.github.insight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proj.github.insight.service.EventService;

/**
 *
 * EventsController
 *
 * @author  Surya Verma
 * @version 1.0
 * @since   2020-06-08
 */

@RestController
@RequestMapping("/api")
public class EventsController {

	@Autowired
	EventService eventService;
	
    @GetMapping("/repos/{userName}/{repoName}/events")
    public ResponseEntity<?> getEventsByUserAndRepo(@PathVariable("userName") String userName,@PathVariable("repoName") String repoName){
        return eventService.getEventsByUserAndRepo(userName, repoName);
    }

}
