package org.gainsight.mvc.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.gainsight.mvc.dao.UserDAO;
import org.gainsight.mvc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController
{
	@Autowired
	UserDAO udao;
	
	
	@GetMapping("/loginPage")
	public String getLoginPage()
	{
		return "Login";
	}
	
	
	@PostMapping("/validateUser")
	public String authenticateUser(@RequestParam("uname")String username,@RequestParam("pword")String password,Model model)
	{
		String message="Invalid Username/Password....TryAgain!";
		User user=new User(username,password);
		if(udao.validateUser(user))
		{
			return "Services";
		}
		model.addAttribute("message",message);
		
		return "NotValid";
		
	}
	
}