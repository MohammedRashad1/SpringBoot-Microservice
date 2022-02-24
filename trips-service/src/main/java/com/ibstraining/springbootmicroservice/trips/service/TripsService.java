package com.ibstraining.springbootmicroservice.trips.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibstraining.springbootmicroservice.trips.entity.Trips;
import com.ibstraining.springbootmicroservice.trips.repository.TripsRepository;

@Service
public class TripsService {
	
	@Autowired
	private TripsRepository tripsRepository;

	public Trips saveDepartment(Trips trips) {
		return tripsRepository.save(trips);
	}
	
	public Optional<Trips> getTrips(long id) {
		return tripsRepository.findById(id);
	}

}
