package com.flight.checkIn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight.checkIn.integration.ReservationRestfulClient;
import com.flight.checkIn.integration.dto.Reservation;
import com.flight.checkIn.integration.dto.ReservationUpdateRequest;

@Controller
public class ReservationController {
	@Autowired
	private ReservationRestfulClient rrc;
@RequestMapping("/showCheckIn")
	public String startCheckIn() {
		return "CheckIn";
	}
@RequestMapping("/proceedCheckIn")
public String proceedCheckIn(@RequestParam("id")Long id,ModelMap modelMap) {
	Reservation reservation = rrc.findReservation(id);
	modelMap.addAttribute("reservation", reservation);
	
	return "displayReservation";
	
}
@RequestMapping("/proceedToCheckIn")
public String proceedToCheckIn(@RequestParam("id")Long id,@RequestParam("numberOfBags")int numberOfBags) {
	ReservationUpdateRequest request=new ReservationUpdateRequest();
	request.setId(id);
	request.setNumberOfBags(numberOfBags);
	request.setCheckedIn(true);
	rrc.updateReservation(request);
	return "confirmReservation";
}
}
