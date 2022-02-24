package com.ibstraining.springbootmicroservice.trips.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibstraining.springbootmicroservice.trips.entity.Trips;
import com.ibstraining.springbootmicroservice.trips.service.TripsService;


@RestController
@RequestMapping("/trips")
public class TripsController {
	
	@Autowired
	private TripsService tripsService;
	
	@PostMapping("/")
    public Trips saveDepartment(@RequestBody Trips trips) {
        return  tripsService.saveDepartment(trips);
    }
	
	@GetMapping("/{id}")
	public Optional<Trips> getProductById(@PathVariable long id){
		return tripsService.getTrips(id);
	}
	

}
