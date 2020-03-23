package com.zyro.data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestData {
	
	public static final String TESTS_DATE_FORMAT = "yyyyMMddHHmmssSSS";
	public static final String SIMPLE_DATE_FORMAT = "dd/MM/yyyy HH:mm:ss";

	public static String generateEmail() {
		
		String generatedRegistrationEmail = "testemail" + getFormattedData(TESTS_DATE_FORMAT) + "@nonexisting.com";
		
		return generatedRegistrationEmail;
	}
	
	public static String getFormattedData(String format) {
		
		DateFormat dateFormat = new SimpleDateFormat(format);
		Date date = new Date();
		
		return dateFormat.format(date);
	}
}