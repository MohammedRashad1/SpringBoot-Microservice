package com.ibstraining.springbootmicroservice.trips.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ibstraining.springbootmicroservice.trips.common.ResponseTemplateVO;
import com.ibstraining.springbootmicroservice.trips.common.User;
import com.ibstraining.springbootmicroservice.trips.entity.Trips;
import com.ibstraining.springbootmicroservice.trips.repository.TripsRepository;

@Service
public class TripsService {
	
	@Autowired
	private TripsRepository tripsRepository;
	
	@Autowired
    private RestTemplate restTemplate;

	public Trips saveDepartment(Trips trips) {
		return tripsRepository.save(trips);
	}

	public ResponseTemplateVO getTripsWithUser(Long id) {
		
		ResponseTemplateVO vo = new ResponseTemplateVO();
        Trips trips = tripsRepository.findTripsById(id);

        User user =
        		restTemplate.getForObject("http://USER-SERVICE/users/" + trips.getUserId()
                ,User.class);

        vo.setUser(user);
        vo.setTrips(trips);

        return  vo;
    }
}
	
	
	

