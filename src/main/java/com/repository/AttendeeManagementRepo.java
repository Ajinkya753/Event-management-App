package com.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.AttendeeInfromation;
@Repository
public interface AttendeeManagementRepo extends CrudRepository<AttendeeInfromation, Serializable>{

	public List<AttendeeInfromation> findAll();
	public AttendeeInfromation findById(int id);
	@Query(name = "select phone from attendee_information c where phone=?1", nativeQuery = true)
	public String findByPhone(String phone);
}
