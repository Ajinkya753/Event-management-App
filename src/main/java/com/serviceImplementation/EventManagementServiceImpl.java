package com.serviceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Event;
import com.repository.EventManagementRepo;
import com.service.EventManagementService;
@Service
public class EventManagementServiceImpl implements EventManagementService{
	@Autowired
	private EventManagementRepo eventManagementRepo;
	@Override
	public void createEvent(Event event) {
		// TODO Auto-generated method stub
		eventManagementRepo.save(event);
	}
	@Override
	public void updateEvent(Event eventInput,int id) {
		// TODO Auto-generated method stub
		Event eventRepo=eventManagementRepo.findById(id);
		if(eventInput.getName()!=null) {
			eventRepo.setName(eventInput.getName());
		}
		if(eventInput.getInformation()!=null) {
			eventRepo.setInformation(eventInput.getInformation());
		}
		if(eventInput.getDate()!=null) {
			eventRepo.setDate(eventInput.getDate());
		}
		if(eventInput.getTime()!=null) {
			eventRepo.setTime(eventInput.getTime());
		}
		if(eventInput.getLocation()!=null) {
			eventRepo.setLocation(eventInput.getLocation());
		}
		if(eventInput.getSpeakers()!=null) {
			eventRepo.setSpeakers(eventInput.getSpeakers());
		}
		eventManagementRepo.save(eventRepo);
	}

}
