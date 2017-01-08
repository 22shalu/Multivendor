package com.homer.runner;

import java.io.File;
import java.io.IOException;

import com.homer.dao.GenericUtil;
import com.homer.logger.HomerLogger;
import com.homer.setup.RunManager;

public class HomerRunner {

	public static void main(String[] args) throws Exception {	
		
		//Use below method to set PIP UI class to be called - AB testing
		//GenericUtil.setPIPUIClass();
		
		//Use below method to set AUT features - AUT testing
		//GenericUtil.setAUTSwitch();
		RunManager rm = new RunManager();
		rm.runTestCases(args);
	
		
		System.out.println("Automation execution completed successfully");
			
		System.exit(0);
		
for(String prop : System.getProperties().stringPropertyNames()) {
			
			System.out.println("Property name - "+ prop);
			System.out.println("Property val - "+System.getProperty(prop));
		}

		
		
	}
	
	
}
