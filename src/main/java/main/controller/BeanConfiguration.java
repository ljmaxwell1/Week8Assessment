package main.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import main.beans.Computers;
import main.beans.Specs;
/**
 *Larry J Maxwell - ljmaxwell1@dmacc.edu
 *CIS175 - Spring 2022
 *Mar 11, 2022
 **/

@Configuration
public class BeanConfiguration {

		@Bean
		public Computers computers() {
			Computers bean = new Computers(10001, "IBM", "TRS-80", 12, 14, 1970);
			return bean;
		}
		@Bean
		public Specs spces() {
			Specs bean = new Specs("32GB", "1TB", "3.2Ghz");
			return bean;
		}
}
