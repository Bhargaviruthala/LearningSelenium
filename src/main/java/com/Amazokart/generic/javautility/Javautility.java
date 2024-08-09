package com.Amazokart.generic.javautility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

import org.apache.poi.hpsf.Date;

public class Javautility {

	public int getRandomNumber() {
		Random random=new Random();
		int ranDomNumber=random.nextInt(5000);
		return ranDomNumber ;
		
	}
	
	public String getSystemDateYYYYDDMM() {
	
		Date dateObj=new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
		String date=sdf.format(dateObj);
		return date;
	}
	
	public String getReruiredDateYYYYDDMM(int days) {
		SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
		
		Calendar cal=sim.getCalendar();
		String reqdate= sim.format(cal.getTime());
		return reqdate;
	}
	











} 