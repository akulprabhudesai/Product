package com.walmart.example;

import java.util.HashMap;
import java.util.List;

import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class Controller {

	@Autowired
	FetchDataService fetchdataservice;
	
	@Autowired
	AuthenticationService authenticationservice;
	
	@RequestMapping("/")
	public ModelAndView welcome() {
	ModelAndView model = new ModelAndView("login");
	return model;
	}

	
	@RequestMapping("/login")
	public ModelAndView findAll(@RequestParam("username") String username, @RequestParam("password") String password){
	ModelAndView model;
	List<Authenticate> user = authenticationservice.findAll();
	for(int i = 0; i < user.size();i++) {
		if(user.get(i).getUSERNAME().equals(username)) {
			if(user.get(i).getPASSWORD().equals(password)) {
				model = new ModelAndView("index");
				model.addObject("username", username);
				List<Products> data =  fetchdataservice.findAll();
				model.addObject("data",data);
				return model;
			}
		}
	}
	model = new ModelAndView("signInFail");
	return model;
	}
}
