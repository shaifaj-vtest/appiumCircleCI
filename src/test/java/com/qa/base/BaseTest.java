package com.qa.base;

import com.qa.utils.JsonParser;
import com.qa.utils.StringParser;
import com.qa.utils.TestUtils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.json.JSONObject;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.HashMap;

public class BaseTest {
	public HashMap<String, String> strings = new HashMap<>();
	public JSONObject loginUsers;

	protected static ThreadLocal<String> platform = new ThreadLocal<>();
	protected static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();

	@SuppressWarnings("rawtypes")
	public static AppiumDriver getDriver() {
		return driver.get();
	}

	@Parameters({ "deviceID" })
	@BeforeTest
	public void beforeTest(String deviceID) throws Exception {
		DriverManager.initializeDriver(deviceID);
		strings = StringParser.parseStringXML("strings.xml");
		loginUsers = JsonParser.parse("loginUsers.json");
	}

	@AfterTest(alwaysRun = true)
	public void quit() {
		if (DriverManager.getDriver() != null) {
			DriverManager.getDriver().quit();
		}
	}

	public void waitForVisibility(MobileElement e) {
		WebDriverWait wait = new WebDriverWait(getDriver(), TestUtils.WAIT);
		wait.until(ExpectedConditions.visibilityOf(e));
	}

	public void sendKeys(MobileElement e, String txt, String msg) {
		waitForVisibility(e);
//		utils.log().info(msg);
//		ExtentReport.getTest().log(Status.INFO, msg);
		e.sendKeys(txt);
	}

	public void click(MobileElement e, String msg) {
		waitForVisibility(e);
//		utils.log().info(msg);
//		ExtentReport.getTest().log(Status.INFO, msg);
		e.click();
	}

	public String getPlatform() {
		return platform.get();
	}

	public String getAttribute(MobileElement e, String attribute) {
		waitForVisibility(e);
		return e.getAttribute(attribute).toString();

	}

	public String getText(MobileElement e, String msg) {
		try {
			String txt = null;
			switch (getPlatform()) {
			case "Android":
				txt = getAttribute(e, "text");
				break;
			case "iOS":
				txt = getAttribute(e, "label");
				break;
			}
//		utils.log().info(msg + txt);
//		ExtentReport.getTest().log(Status.INFO, msg + txt);
			return txt;
		} catch (Exception e1) {

		}
		return msg;
	}

}
