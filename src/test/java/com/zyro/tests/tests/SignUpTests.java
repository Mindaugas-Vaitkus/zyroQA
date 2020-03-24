package com.zyro.tests.tests;

import org.testng.annotations.Test;

import com.zyro.actions.Cookies;
import com.zyro.actions.Header;
import com.zyro.actions.SignUp;
import com.zyro.actions.Sites;
import com.zyro.actions.Websites;
import com.zyro.actions.Welcome;
import com.zyro.data.TestData;
import com.zyro.tests.helper.TestsHelper;

public class SignUpTests extends TestsHelper {

	@Test(groups = { "smoke" })
	private void userCanSignUp() {
		Cookies.clickGotItButton(driver);
		Header.clickJoinZyroButton(driver);
		SignUp.enterEmailAddress(driver, TestData.GENERATED_EMAIL);
		SignUp.clickContinueButton(driver);
		SignUp.enterPassword(driver, TestData.TEST_SIGNUP_PASSWORD);
		SignUp.enterName(driver, TestData.TEST_SIGNUP_NAME);
		SignUp.clickContinueButton(driver);
		Welcome.checkIfWelcomeMessageIsDisplayed(driver);
		Welcome.clickGetStartedButton(driver);
		Websites.checkIfChooseTemplateMessageIsDisplayed(driver);
		Websites.checkIfTemplatesAreDisplayed(driver);
		Websites.closeOverlay(driver);
		Sites.checkYouDontHaveAnyWebsiteMessage(driver);
		Header.hoverUserProfileBubble(driver);
		Header.checkUsersName(driver, TestData.TEST_SIGNUP_NAME);
		Header.checkUsersEmail(driver, TestData.GENERATED_EMAIL);
	}
}