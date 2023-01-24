package com.api.parkingcontrol.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;

import jakarta.transaction.Transactional;

@Service
public class ParkingSpotService {
	
	@Autowired
	ParkingSpotRepository parkingSpotRepository;
	
 
	@Transactional //garantir o rollback se algo de errado no banco
	public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
		// TODO Auto-generated method stub
		return parkingSpotRepository.save(parkingSpotModel);
	}
	
	

}
