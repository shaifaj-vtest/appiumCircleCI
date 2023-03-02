package com.qa.pages;

import com.qa.base.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BaseTest {

	// This method is used for finding MobileElement of email tab
	@AndroidFindBy(xpath = "(//*[@text='Email'])[2]")
	private MobileElement emailButton;

	// This method is used for finding MobileElement of password tab
	@AndroidFindBy(xpath = "(//*[@text='Password'])[2]")
	private MobileElement passwordButton;

	// This method is used for finding MobileElement of login button
	@AndroidFindBy(xpath = "//*[@text='Log in']")
	private MobileElement logInButton;

	// This method is used for finding MobileElement of pageTitle
	@AndroidFindBy(xpath = "//*[@text='My operations']")
	private MobileElement pagetitle;

	// This method is used for finding MobileElement of popUp message
	@AndroidFindBy(xpath = "//*[@text='Wrong password!']")
	private MobileElement popup;

	// This method is used for finding MobileElement of error text
	@AndroidFindBy(xpath = "//*[@text='Invalid email']")
	private MobileElement errortext;

	/**
	 * This method is used for performing sendKeys operation on Email button
	 * 
	 * @param email
	 * @throws InterruptedException
	 */
	public void setEmail(String email) throws InterruptedException {
		try {
			Thread.sleep(4000);

			sendKeys(emailButton, email, "Email is:" + email);

		} catch (Exception e) {

		}
	}

	/**
	 * This method is used for performing sendKeys operation on password button
	 * 
	 * @param password
	 * @throws InterruptedException
	 */

	public void setPassword(String password) throws InterruptedException {
		try {
			Thread.sleep(4000);
			sendKeys(passwordButton, password, "Password is:" + password);

		} catch (Exception e) {

		}
	}

	/**
	 * This method is used for performing click operation on Login tab
	 * 
	 * @throws InterruptedException
	 */
	public void clickOnLogin() throws InterruptedException {

		try {
			Thread.sleep(4000);
			click(logInButton, "Clicked On Log in button");
		} catch (Exception e) {

		}
	}

//	@AndroidFindBy(accessibility = "test-Username")
//	@iOSXCUITFindBy(id = "test-Username")
//	private MobileElement usernameTxtFld;
//
//	@AndroidFindBy(accessibility = "test-Password")
//	@iOSXCUITFindBy(id = "test-Password")
//	private MobileElement passwordTxtFld;
//
//	@AndroidFindBy(accessibility = "test-LOGIN")
//	@iOSXCUITFindBy(id = "test-LOGIN")
//	private MobileElement loginBtn;
//
//	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"test-Error message\"]/child::XCUIElementTypeStaticText")
//	private MobileElement errTxt;

//	public LoginPage enterUserName(String username) {
//		WebElement e = wait.until(ExpectedConditions.visibilityOf(usernameTxtFld));
//		e.clear();
//		e.sendKeys(username);
//		return this;
//	}
//
//	public LoginPage enterPassword(String password) {
//		WebElement e = wait.until(ExpectedConditions.visibilityOf(passwordTxtFld));
//		e.clear();
//		e.sendKeys(password);
//		return this;
//	}
//
//	public com.qa.pages.ProductsPage pressLoginBtn() {
//		wait.until(ExpectedConditions.visibilityOf(loginBtn)).click();
//		return new com.qa.pages.ProductsPage();
//	}
//
//	public com.qa.pages.ProductsPage login(String username, String password) {
//		enterUserName(username);
//		enterPassword(password);
//		return pressLoginBtn();
//	}
//
//	public String getErrTxt() {
//		return wait.until(ExpectedConditions.visibilityOf(errTxt)).getText();
//	}
}
