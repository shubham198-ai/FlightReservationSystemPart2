package com.flight.checkIn.integration;

import org.springframework.web.bind.annotation.RequestBody;


import com.flight.checkIn.integration.dto.Reservation;
import com.flight.checkIn.integration.dto.ReservationUpdateRequest;

public interface ReservationRestfulClient {
public Reservation findReservation(Long id);
public Reservation updateReservation(@RequestBody ReservationUpdateRequest request);
}
