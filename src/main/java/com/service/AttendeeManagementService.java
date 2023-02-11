package com.service;

import java.util.List;

import com.model.AttendeeInfromation;

public interface AttendeeManagementService {
	public void Registration (AttendeeInfromation infromation);
	
	public List<AttendeeInfromation> getAllAttendee();
	
	public void updateAttendeeInformation(AttendeeInfromation infromation,int id);
}
