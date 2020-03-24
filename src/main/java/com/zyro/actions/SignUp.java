package com.zyro.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.zyro.tests.helper.TestsHelper;

public class SignUp extends TestsHelper {

	public static void enterEmailAddress(WebDriver driver, String emailAddress) {
		String actionCase = AutoMethod.getCurrentMethodAndClassName();
		
		String actionMessage = "'E-mail' field";
		By by = By.cssSelector("input[data-qa = 'signup-inputfield-emailaddress']");
		AutoMethod.enterTextBy(driver, emailAddress, new AutoMethodModel(actionMessage, by, actionCase));
	}
	
	public static void clickContinueButton(WebDriver driver) {
		String actionCase = AutoMethod.getCurrentMethodAndClassName();
		
		String actionMessage = "'Continue' button";
		By by = By.cssSelector("button[data-qa = 'auth-submit-button']");
		AutoMethod.clickBy(driver, new AutoMethodModel(actionMessage, by, actionCase));
	}
	
	public static void enterPassword(WebDriver driver, String password) {
		String actionCase = AutoMethod.getCurrentMethodAndClassName();
		
		String actionMessage = "'Password' field";
		By by = By.id("password");
		AutoMethod.enterTextBy(driver, password, new AutoMethodModel(actionMessage, by, actionCase));
	}
	
	public static void enterName(WebDriver driver, String name) {
		String actionCase = AutoMethod.getCurrentMethodAndClassName();
		
		String actionMessage = "'Your Name' field";
		By by = By.id("name");
		AutoMethod.enterTextBy(driver, name, new AutoMethodModel(actionMessage, by, actionCase));
	}
}