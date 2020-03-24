package com.zyro.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.zyro.tests.helper.TestsHelper;

public class Sites extends TestsHelper {

	public static void checkYouDontHaveAnyWebsiteMessage(WebDriver driver) {
		String actionCase = AutoMethod.getCurrentMethodAndClassName();
		
		String actionMessage = "'X' button in overlay";
		By by = By.xpath("//h5[@class = 'sites__title max-width-540 h5 h5--desktop ']");
		AutoMethod.checkElementIsDisplayedBy(driver, new AutoMethodModel(actionMessage, by, actionCase));
	}
}