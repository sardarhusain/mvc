package com.nt.service;

import java.util.Calendar;

public class WishMessageservice implements WishService {

	@Override
	public String wishmessage() {
		int  hour=0;
		Calendar calender=Calendar.getInstance();
		hour=calender.HOUR_OF_DAY;
		if(hour<12) 
			return "good morning";
		
		else if(hour<16)
			return "good afternoon";
		else if(hour<20)
			return "good evening";
		else
			return "good night";
			
		
	}

}
