package com.qa.tests;

import com.qa.base.BaseTest;
import com.qa.pages.LoginPage;

import org.json.JSONException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

	@Test(priority = 1, enabled = true)
	public void TC01_VerifyTheLoginWithValidCredentials() throws JSONException, InterruptedException {

		LoginPage loginPage = new LoginPage();

		// Get the email from JSON file and set email
		loginPage.setEmail(loginUsers.getJSONObject("ValidCredentials").getString("Email"));

		// Get the password from JSON file and set password
		loginPage.setPassword(loginUsers.getJSONObject("ValidCredentials").getString("Password"));

		// Click on Login
		loginPage.clickOnLogin();

//		// Compare the title of the page with mentioned title.
//		String actualTitleTxt = loginPage.getTitleTxt();
//		String expectedTitleTxt = strings.get("PageTitle");
//
//		Assert.assertEquals(actualTitleTxt, expectedTitleTxt);

	}

//	@Test
//	public void invalidUserName() {
//		LoginPage loginPage = new LoginPage();
//		loginPage.enterUserName(loginUsers.getJSONObject("invalidUser").getString("username"));
//		loginPage.enterPassword(loginUsers.getJSONObject("invalidUser").getString("password"));
//
//		Assert.assertEquals(loginPage.getErrTxt(), strings.get("err_invalid_username_or_password"));
//	}
//
//	@Test
//	public void invalidPassword() {
//		LoginPage loginPage = new LoginPage();
//		loginPage.enterUserName(loginUsers.getJSONObject("invalidPassword").getString("username"));
//		loginPage.enterPassword(loginUsers.getJSONObject("invalidPassword").getString("password"));
//
//		Assert.assertEquals(loginPage.getErrTxt(), strings.get("err_invalid_username_or_password"));
//	}
//
//	@Test
//	public void successfulLogin() {
//		LoginPage loginPage = new LoginPage();
//		loginPage.enterUserName(loginUsers.getJSONObject("validUser").getString("username"));
//		loginPage.enterPassword(loginUsers.getJSONObject("validUser").getString("password"));
//
//	}
}
