package com.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.Event;
@Repository
public interface EventManagementRepo extends CrudRepository<Event, Serializable>{
	
	public Event findById(int id);
}
