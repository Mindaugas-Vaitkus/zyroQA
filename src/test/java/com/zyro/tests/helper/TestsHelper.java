package com.zyro.tests.helper;

import java.lang.reflect.Method;
import java.time.Duration;
import java.time.Instant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.zyro.data.TestData;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestsHelper {
	
	WebDriver driver;
	
	Instant testStartTime;
	Instant testFinishTime;

	private void testInformationProvider(ITestContext ctx, Method m) {
		System.out.println(">>> TEST SUCCESSFULLY STARTED:");
		System.out.println(">>> Name: " + m.getName());
		System.out.println(">>> Starting time: " + TestData.getFormattedData(TestData.SIMPLE_DATE_FORMAT));
		testStartTime = Instant.now();
    }

	@BeforeMethod(alwaysRun = true)
	public void setupBeforeMethod(ITestContext ctx, Method m) {
		this.testInformationProvider(ctx, m);
		
		WebDriverManager.chromedriver().version("80.0.3987.106").setup();
		driver = new ChromeDriver();
	}
	
	@AfterMethod(alwaysRun = true)
	public void setupAfterMethod(ITestResult result, Method m) {
		
		if (result.getStatus() == ITestResult.SUCCESS) {
			System.out.println(">>> TEST PASSED:");
			System.out.println(">>> Name: " + m.getName());
			System.out.println(">>> Finishing time: " + TestData.getFormattedData(TestData.SIMPLE_DATE_FORMAT));
		} else if (result.getStatus() == ITestResult.FAILURE) {
			System.out.println(">>> TEST FAILED:");
			System.out.println(">>> Name: " + m.getName());
			System.out.println(">>> Finishing time: " + TestData.getFormattedData(TestData.SIMPLE_DATE_FORMAT));
		} else if (result.getStatus() == ITestResult.SKIP) {
			System.out.println(">>> TEST SKIPPED:");
			System.out.println(">>> Name: " + m.getName());
			System.out.println(">>> Finishing time: " + TestData.getFormattedData(TestData.SIMPLE_DATE_FORMAT));
		} else {
			System.out.println(">>> TEST STATUS UNKNOWN:");
			System.out.println(">>> Name: " + m.getName());
			System.out.println(">>> Finishing time: " + TestData.getFormattedData(TestData.SIMPLE_DATE_FORMAT));
			System.out.println(">>> SOMETHING WENT WRONG?");
		}
		
		testFinishTime = Instant.now();
		long testExecutionTime = Duration.between(testStartTime, testFinishTime).toMillis();
		System.out.println(">>> '" + m.getName() + "' test ran for '" + testExecutionTime + "' ms");
	}
}
