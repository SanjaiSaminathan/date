package com.main;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.services.StudentService;

public class StudentMain {
	
	
	private static final Logger LOGGER= LogManager.getLogger(StudentMain.class);
	public static void main(String[] args) {
		
		LOGGER.info(" enter into the main program ");
		
		StudentService service = new StudentService();
		
		LOGGER.info(" created Student Services object  and calling add()");
		int ans = service.add(10, 6);
		//System.out.println("vales" +" "  +ans);
		LOGGER.info("addition of number"+ ans);
	}

}
