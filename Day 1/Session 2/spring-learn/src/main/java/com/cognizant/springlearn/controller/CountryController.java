package com.cognizant.springlearn.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.SpringLearnApplication;
import com.cognizant.springlearn.service.CountryService;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

@RestController
public class CountryController {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public CountryController() {
		LOGGER.debug("Constructor of CountryController");
	}
	
	@RequestMapping(value="/country",method=RequestMethod.GET)
	public Country getCountryIndia() {
		ApplicationContext context=new ClassPathXmlApplicationContext("country.xml");
		Country c = (Country) context.getBean("in");
		return c;
	}
	
	@GetMapping("/countries")
	public List<Country> getAllCountries() {
		ApplicationContext context=new ClassPathXmlApplicationContext("country.xml");
		List<Country> listOfCountries =(ArrayList<Country>) context.getBean("countryList");
		return listOfCountries;
	}
	
	@GetMapping("/country/{code}")
	public Country getCountry(@PathVariable String code) throws CountryNotFoundException{
		CountryService cs=new CountryService();
		Country country=cs.getCountry(code);
		return country;
	}
}
