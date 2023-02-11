package com.serviceImplementation;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.model.AttendeeInfromation;
import com.repository.AttendeeManagementRepo;
import com.service.AttendeeManagementService;

@Service
public class AttendeeManagementServiceImpl implements AttendeeManagementService{
	
	@Autowired
	private AttendeeManagementRepo attendeeManagementRepo;
	
	@Override
	public void Registration(AttendeeInfromation infromation) {
		String phone=attendeeManagementRepo.findByPhone(infromation.getPhone());
		if(phone ==null) {
			attendeeManagementRepo.save(infromation);
		}
	}

	@Override
	public List<AttendeeInfromation> getAllAttendee() {
		return attendeeManagementRepo.findAll();
	}

	@Override
	public void updateAttendeeInformation(AttendeeInfromation infromation, int id) {
		AttendeeInfromation infromationRepo=attendeeManagementRepo.findById(id);
		if(infromation.getEmail()!=null) {
			infromationRepo.setEmail(infromation.getEmail());
		}if(infromation.getName()!=null){
			infromationRepo.setName(infromation.getName());
		}if(infromation.getPhone()!=null) {
			infromationRepo.setPhone(infromation.getPhone());
		}
		attendeeManagementRepo.save(infromationRepo);
	}

	
	
}
