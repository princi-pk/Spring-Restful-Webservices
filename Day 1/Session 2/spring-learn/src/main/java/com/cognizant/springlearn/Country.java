package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);

		private String code;
		private String name;
		
		public Country() {
			LOGGER.debug("Inside Country Constructor");
		}
		
		public String getCode() {
			LOGGER.debug("Inside getter method of code");
			return code;
		}
		public void setCode(String code) {
			LOGGER.debug("Inside setter method of code");
			this.code = code;
		}
		public String getName() {
			LOGGER.debug("Inside getter method of name");
			return name;
		}
		public void setName(String name) {
			LOGGER.debug("Inside setter method of name");
			this.name = name;
		}
		
		@Override
		public String toString() {
			return String.format("Country [code=%s, name=%s]", code, name);
		}
		
}
