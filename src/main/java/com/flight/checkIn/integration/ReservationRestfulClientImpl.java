package com.flight.checkIn.integration;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.flight.checkIn.integration.dto.Reservation;
import com.flight.checkIn.integration.dto.ReservationUpdateRequest;
@Component
public class ReservationRestfulClientImpl implements ReservationRestfulClient {

	@Override
	public Reservation findReservation(Long id) {
		RestTemplate rest=new RestTemplate();
		Reservation reservation = rest.getForObject("http://localhost:8025/reservation/"+id, Reservation.class);
		return reservation;
	}

	@Override
	public Reservation updateReservation(ReservationUpdateRequest request) {
		RestTemplate rest=new RestTemplate();
		Reservation reservation = rest.postForObject("http://localhost:8025/reservation", request, Reservation.class);
		return reservation;
	}

}
