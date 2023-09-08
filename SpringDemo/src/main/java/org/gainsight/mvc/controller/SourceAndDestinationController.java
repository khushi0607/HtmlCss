package org.gainsight.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.gainsight.mvc.dao.FlightDao;
import org.gainsight.mvc.entity.Flight;
import org.gainsight.mvc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class SourceAndDestinationController {
	
	@Autowired
	FlightDao fdao;
	
	@GetMapping("/displaySourceDestination")
	public String allFlightFromSourcetoDestination(@RequestParam("source")String source, @RequestParam("destination")String destination, Model model) {
		
		ArrayList<Flight> flg= fdao.searchFlight(source, destination);
		model.addAttribute("flg",flg);
		return "Display";
			
	}

}
