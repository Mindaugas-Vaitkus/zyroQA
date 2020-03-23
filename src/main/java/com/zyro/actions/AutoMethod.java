package com.zyro.actions;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AutoMethod {

	// Finds element by and returns it
	private static WebElement findElementBy(WebDriver driver, AutoMethodModel model) {
		WebElement element = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(model.getBy()));
			element = driver.findElement(model.getBy());
		} catch (NoSuchElementException ex) {
			Assert.fail("\n *** Error in action <" + model.getActionCase() + ">. Element <" + model.getActionMessage() + "> should be visible! \n *** Element located by <" + model.getBy() + "> \n");
		} catch (TimeoutException e) {
			Assert.fail("\n *** Error in action <" + model.getActionCase() + ">. Failed to find element <" + model.getActionMessage() + ">! \n *** Element located by <" + model.getBy() + "> \n");
		}
		return element;
	}
	
	// Clicks element specified by locator
	public static void clickBy(WebDriver driver, AutoMethodModel model) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(model.getBy()));
			driver.findElement(model.getBy()).click();
		} catch (NoSuchElementException ex1) {
			Assert.fail("\n *** Error in action located in <" + model.getActionCase() + ">. Element <" + model.getActionMessage() + "> should be clickable! \n *** Element located by <" + model.getBy() + "> \n");
		} catch (TimeoutException ex2) {
			Assert.fail("\n *** Error in action <" +  model.getActionCase() + ">. Failed to find element <" + model.getActionMessage() + ">! \n *** Element located by <" + model.getBy() + "> \n");
		} catch (ElementClickInterceptedException ex3) {
			ex3.printStackTrace();
			Assert.fail("\n *** Error in action located in <" + model.getActionCase() + ">. Other element would receive the click! Element <" + model.getActionMessage() + "> should be clickable! \n *** Element located by <" + model.getBy() + "> \n");
		}
	}
	
	// Enter text to field specified by locator
	public static void enterTextBy(WebDriver driver, String text, AutoMethodModel model) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(model.getBy()));
			AutoMethod.clickBy(driver, model);
			driver.findElement(model.getBy()).clear();
			driver.findElement(model.getBy()).sendKeys(text);
		} catch (NoSuchElementException ex) {
			Assert.fail("\n *** Error in action <" + model.getActionCase() + ">. Text field <" + model.getActionMessage() + "> should be displayed! \n *** Element located by <" + model.getBy() + "> \n");
		} catch (TimeoutException e) {
			Assert.fail("\n *** Error in action <" + model.getActionCase() + ">. Failed to find element <" + model.getActionMessage() + ">! \n *** Element located by <" + model.getBy() + "> \n");
		}
	}
	
	// Hovers element by specified locator
	public static void hoverOverBy(WebDriver driver, AutoMethodModel model) {
		try {
			Actions actions = new Actions(driver);
			WebElement menu = AutoMethod.findElementBy(driver, model);
			actions.moveToElement(menu).perform();
		} catch (NoSuchElementException ex) {
			Assert.fail("\n *** Error in action <" + model.getActionCase() + ">. Element <" + model.getActionMessage() + "> should be visible! \n *** Element located by <" + model.getBy() + "> \n");
		} catch (TimeoutException e) {
			Assert.fail("\n *** Error in action <" + model.getActionCase() + ">. Failed to find element <" + model.getActionMessage() + ">! \n *** Element located by <" + model.getBy() + "> \n");
		}
	}
	
	// Checks if element is displayed
	public static void checkElementIsDisplayedBy(WebDriver driver, AutoMethodModel model) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(model.getBy()));
			driver.findElement(model.getBy());
		} catch (NoSuchElementException ex) {
			Assert.fail("\n *** Error in action <" + model.getActionCase() + ">. Element <" + model.getActionMessage() + "> should be visible! \n *** Element located by <" + model.getBy() + "> \n");
		} catch (TimeoutException e) {
			Assert.fail("\n *** Error in action <" + model.getActionCase() + ">. Failed to find element <" + model.getActionMessage() + ">! \n *** Element located by <" + model.getBy() + "> \n");
		}
	}
}
