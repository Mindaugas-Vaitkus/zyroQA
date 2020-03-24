package com.zyro.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.zyro.tests.helper.TestsHelper;

public class Welcome extends TestsHelper {

	public static void checkIfWelcomeMessageIsDisplayed(WebDriver driver) {
		String actionCase = AutoMethod.getCurrentMethodAndClassName();
		
		String actionMessage = "'Let’s create your first website' welcome message";
		By by = By.xpath("//h2[@class = 'welcome__title h1 h3--desktop ']");
		AutoMethod.checkElementIsDisplayedBy(driver, new AutoMethodModel(actionMessage, by, actionCase));
	}
	
	public static void clickGetStartedButton(WebDriver driver) {
		String actionCase = AutoMethod.getCurrentMethodAndClassName();
		
		String actionMessage = "'Get Started' button";
		By by = By.xpath("//a[@class = 'button button--ripple welcome__button button--medium button--medium-mobile button--plump-purple']");
		AutoMethod.clickBy(driver, new AutoMethodModel(actionMessage, by, actionCase));
	}
}