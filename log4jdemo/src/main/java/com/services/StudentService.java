package com.services;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.main.StudentMain;

public class StudentService {
	private static final Logger LOGGER= LogManager.getLogger(StudentService.class);
	
	
	public int add (int num1,int num2) {
		LOGGER.info( "num1"+num1);
		LOGGER.info( "num2"+num2);
		return num1+num2;
	}


}
