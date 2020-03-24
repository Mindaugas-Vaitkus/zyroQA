package com.zyro.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.zyro.tests.helper.TestsHelper;

public class Cookies extends TestsHelper {

	public static void clickGotItButton(WebDriver driver) {
		String actionCase = AutoMethod.getCurrentMethodAndClassName();

		String actionMessage = "'Got it' button in cookies dialog box";
		By by = By.cssSelector("button[data-qa = 'cookiesmodal-message-gotit']");
		AutoMethod.clickBy(driver, new AutoMethodModel(actionMessage, by, actionCase));
	}
}
