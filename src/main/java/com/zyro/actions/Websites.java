package com.zyro.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.zyro.tests.helper.TestsHelper;

public class Websites extends TestsHelper {

	public static void checkIfChooseTemplateMessageIsDisplayed(WebDriver driver) {
		String actionCase = AutoMethod.getCurrentMethodAndClassName();
		
		String actionMessage = "'Let’s create your first website' welcome message";
		By by = By.xpath("//h2[@class = 'max-width-920 block-center text h3 h3--desktop ']");
		AutoMethod.checkElementIsDisplayedBy(driver, new AutoMethodModel(actionMessage, by, actionCase));
	}
	
	public static void checkIfTemplatesAreDisplayed(WebDriver driver) {
		String actionCase = AutoMethod.getCurrentMethodAndClassName();
		
		String actionMessage = "visible templates";
		By by = By.xpath("//div[@class = 'template']");
		int templatesCount = AutoMethod.findAllElementsBy(driver, new AutoMethodModel(actionMessage, by, actionCase));
		
		if (templatesCount < 20) {
			Assert.fail("\n *** Error in action '" + actionCase + "'. Count of visible templates should be 20! \n *** Element located by '" + by + "' \n");
		}
	}
	
	public static void closeOverlay(WebDriver driver) {
		String actionCase = AutoMethod.getCurrentMethodAndClassName();
		
		String actionMessage = "'X' button in overlay";
		By by = By.xpath("//div[@class = 'button-close__container']");
		AutoMethod.clickBy(driver, new AutoMethodModel(actionMessage, by, actionCase));
	}
}