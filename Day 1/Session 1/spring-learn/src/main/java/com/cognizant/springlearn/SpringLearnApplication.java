package com.cognizant.springlearn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) throws ParseException {
		SpringApplication.run(SpringLearnApplication.class, args);
		
		SpringLearnApplication.displayDate();
		SpringLearnApplication.displayCountry();
		SpringLearnApplication.displayCountries();
	}

	public static void displayDate() throws ParseException {
		LOGGER.info("START");

		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
		Date d = format.parse("31/12/2018");
		LOGGER.debug("date", d);

		LOGGER.info("END");
	}

	public static void displayCountry() {
		LOGGER.info("START");

		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = context.getBean("country", Country.class);
		LOGGER.debug("Country : {}", country.toString());
		
		Country anotherCountry = context.getBean("country", Country.class);
		
		LOGGER.info("END");
	}
	
	public static void displayCountries() {
		LOGGER.info("START");
		
		ApplicationContext context=new ClassPathXmlApplicationContext("country.xml");
		List<Country> bean =context.getBean("countryList", ArrayList.class);
		LOGGER.debug("List of Countries : {}", bean);		
		
		LOGGER.info("END");
	}

}
