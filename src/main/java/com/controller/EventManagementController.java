package com.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Event;
import com.service.EventManagementService;

@RestController
@RequestMapping("/eventManagement")
public class EventManagementController {
	private static final Logger logger = LoggerFactory.getLogger(EventManagementController.class);
	@Autowired
	private EventManagementService eventManagementService;
	@PostMapping("/createEvent")
	public void createEvent(@RequestBody Event event) {
		logger.info("inside create event");
		eventManagementService.createEvent(event);
	}
	@PatchMapping("/updateEvent/{id}")
	public void updateEvent(@RequestBody Event event,@PathVariable ("id") int id) {
		logger.info("inside Update event");
		eventManagementService.updateEvent(event, id);
	}
}
