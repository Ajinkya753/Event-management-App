package com.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.AttendeeInfromation;
import com.service.AttendeeManagementService;


@RestController
@RequestMapping("/attendeeManagement")
public class AttendeeManagementController {
	
	private static final Logger logger = LoggerFactory.getLogger(AttendeeManagementController.class);
	
	@Autowired
	private AttendeeManagementService attendeeManagementService;
	@PostMapping("/registration")
	public void registration(@RequestBody AttendeeInfromation infromation) {
		logger.info("Inside Registration");
		attendeeManagementService.Registration(infromation);
	}
	@GetMapping("/allAttendees")
	public List<AttendeeInfromation> getAllAttendees(){
		logger.info("Inside get all attendee info");
		return attendeeManagementService.getAllAttendee();
	}
	@PatchMapping("/updateAttendeeInformation/{id}")
	public void updateAttendeeInformation(@RequestBody AttendeeInfromation infromation,@PathVariable ("id") int id) {
		logger.info("Inside Update attendee info");
		attendeeManagementService.updateAttendeeInformation(infromation, id);
	}
}
