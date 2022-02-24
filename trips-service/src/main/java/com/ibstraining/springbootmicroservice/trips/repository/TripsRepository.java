package com.ibstraining.springbootmicroservice.trips.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibstraining.springbootmicroservice.trips.entity.Trips;

public interface TripsRepository extends JpaRepository<Trips, Long>  {


}
