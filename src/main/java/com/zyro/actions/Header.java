package com.zyro.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.zyro.tests.helper.TestsHelper;

public class Header extends TestsHelper {

	public static void clickJoinZyroButton(WebDriver driver) {
		String actionCase = AutoMethod.getCurrentMethodAndClassName();
		
		String actionMessage = "'Join Zyro' button in header";
		By by = By.cssSelector("a[data-qa = 'signup-link']");
		AutoMethod.clickBy(driver, new AutoMethodModel(actionMessage, by, actionCase));
	}
	
	public static void hoverUserProfileBubble(WebDriver driver) {
		String actionCase = AutoMethod.getCurrentMethodAndClassName();
		
		String actionMessage = "user profile bubble";
		By by = By.cssSelector("div[data-qa = 'popupwindow-icon-userprofile']");
		AutoMethod.hoverOverBy(driver, new AutoMethodModel(actionMessage, by, actionCase));
	}
	
	public static void checkUsersName(WebDriver driver, String expectedUsersName) {
		String actionCase = AutoMethod.getCurrentMethodAndClassName();
		
		String actionMessage = "'" + expectedUsersName + "' users name in user profile bubble";
		By by = By.xpath("//div[@class = 'user-data']/div[@class = 'user-name' and contains(text(), '" + expectedUsersName + "')]");
		AutoMethod.checkElementIsDisplayedBy(driver, new AutoMethodModel(actionMessage, by, actionCase));
	}
	
	public static void checkUsersEmail(WebDriver driver, String expectedUsersEmail) {
		String actionCase = AutoMethod.getCurrentMethodAndClassName();
		
		String actionMessage = "'" + expectedUsersEmail + "' users email in user profile bubble";
		By by = By.xpath("//div[@class = 'user-data']/div[@class = 'user-email' and contains(text(), '" + expectedUsersEmail + "')]");
		AutoMethod.checkElementIsDisplayedBy(driver, new AutoMethodModel(actionMessage, by, actionCase));
	}
}