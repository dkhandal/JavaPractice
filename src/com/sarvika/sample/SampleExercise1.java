package com.sarvika.sample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;  

public class SampleExercise1 {

	public static void main(String[] args) {
		
		// to get SystemProperties
//		getSystemProperties();
		
		// to get DB properties
		getDBProperties();
	}
	
	public static void getSystemProperties(){
		// List all System properties
	      Properties pros = System.getProperties();
	      pros.list(System.out);
	  
	      // Get a particular System property given its key
	      // Return the property value or null
	      System.out.println(System.getProperty("java.home"));
	      System.out.println(System.getProperty("java.library.path"));
	      System.out.println(System.getProperty("java.ext.dirs"));
	      System.out.println(System.getProperty("java.class.path"));
	      
	      System.out.println(System.getProperty("user.name"));
	}
	
	public static void getDBProperties(){
		FileReader reader;
		Properties p = null;
		try {
			reader = new FileReader("input/db.properties");
		    p=new Properties();  
		    p.load(reader);  
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      

	      
	    System.out.println(p.getProperty("user"));  
	    System.out.println(p.getProperty("password")); 
	}

}
