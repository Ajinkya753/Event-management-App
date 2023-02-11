package com.service;

import com.model.Event;

public interface EventManagementService {
	
	public void createEvent(Event event);
	
	public void updateEvent( Event event,int id);
}
