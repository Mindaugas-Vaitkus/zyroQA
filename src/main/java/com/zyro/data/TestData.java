package com.zyro.data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestData {
	
	public static String TESTS_DATE_FORMAT = "yyyyMMddHHmmssSSS";
	public static String SIMPLE_DATE_FORMAT = "dd/MM/yyyy HH:mm:ss";
	
	public static String PRODUCTION_URL = "https://zyro.com/";
	
	public static String TEST_SIGNUP_PASSWORD = "SignUpTest1";
	public static String TEST_SIGNUP_NAME = "Test Name";
	
	public static String GENERATED_EMAIL = "testemail" + getFormattedData(TESTS_DATE_FORMAT) + "@nonexisting.com";
	
	public static String getFormattedData(String format) {
		
		DateFormat dateFormat = new SimpleDateFormat(format);
		Date date = new Date();
		
		return dateFormat.format(date);
	}
}