package com.cognizant.springlearn.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

@Service
public class CountryService {

	public Country getCountry(@PathVariable String code) throws CountryNotFoundException{
		ApplicationContext context=new ClassPathXmlApplicationContext("country.xml");
		List<Country> listOfCountries =(ArrayList) context.getBean("countryList");
		Country country=null;
		for(Country coun:listOfCountries) {
			if(coun.getCode().equals(code)) {
				country=coun;
			}
		}
		if (country == null) {			
			throw new CountryNotFoundException();
		}
		return country;
	}
}
