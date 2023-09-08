package org.gainsight.mvc.controller;

import org.gainsight.mvc.dao.BookingDao;
import org.gainsight.mvc.entity.Bookings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchFlightController {
	
	@Autowired
	BookingDao bookingDao;
	
	@GetMapping("/booking")
	public String showPNR()
	{
		return "SearchPnrForm";
	}
	
	@GetMapping("/showBookingDetails")
	public String displayBookedFlight(@RequestParam String bookingId,Model model)
	{
		Bookings b= bookingDao.display(bookingId);
		String message="No DATA";
		if(b!=null)
		message="Booking_ID = "+b.getBooking_id()+"    Flight_ID = "+b.getFlight_id()+"    Passenger_ID = "+b.getPassenger_id()+"    Travel_Date = "+b.getTravel_date();
		model.addAttribute("message",message);
		return "DisplayBookingDetails";
	}
}
