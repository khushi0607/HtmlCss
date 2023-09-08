
package org.gainsight.mvc.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import org.gainsight.mvc.dao.BookingDao;
import org.gainsight.mvc.dao.PassengerDao;
import org.gainsight.mvc.entity.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookingController {
	
	@Autowired
	BookingDao bdao;
	
	@Autowired
	PassengerDao pdao;
	
	@GetMapping("/Booking")
	public String addDetails(@RequestParam String bookingId, @RequestParam String flightId, @RequestParam String passengerId,@RequestParam String firstName, @RequestParam String lastName ,@RequestParam Long mobile ,@RequestParam String email , @RequestParam String travelDate,Model model)
	{
		boolean c1=bdao.addBookingDetails(bookingId, flightId, passengerId, travelDate);
		boolean c2=pdao.addPassengersDetails(passengerId, firstName, lastName, mobile, email);
		
		String message="Booking not added";
		if(c1 && c2)
			message="Booking added successfully";
		else
			return "NotValid";
		
		return "SearchPnrForm";
	}
	

}
