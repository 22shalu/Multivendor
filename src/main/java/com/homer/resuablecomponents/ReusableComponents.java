package com.homer.resuablecomponents;

import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.homer.dao.CommonDataColumn;
import com.homer.dao.DataColumn;
import com.homer.enums.EnumClass.StepResult;
import com.homer.helper.DataTable;
import com.homer.helper.HelperClass;
import com.homer.reports.Report;
import com.homer.uistore.CommonElements;
import com.homer.uistore.HomePageUI;
import com.homer.uistore.PLPUI;

public class ReusableComponents {

	Report report;
	WebDriver driver;
	WebDriverHelper wh;
	DataTable dataHelper;
	public boolean terminateTestOnElementNotPresent = true;
	public HashMap<String, Object> dataStore = new HashMap<String, Object>();

	public ReusableComponents(WebDriver driver, Report report,
			WebDriverHelper wh, DataTable dataHelper) {

		this.report = report;
		this.driver = driver;
		this.dataHelper = dataHelper;
		this.wh = wh;
	}

	/**
	 * Method to open HomePage
	 * @return
	 * @throws Exception
	 */
	public void openHomeDepotAppln() throws Exception {
		
		String envUrl = dataHelper
				.getCommonData(CommonDataColumn.EnvironmentUrl);

		try {

			driver.manage().deleteAllCookies();
			driver.get(envUrl);
			driver.manage().window().maximize();

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			wh.handleAlert();
		}
		
		if (isConsumerHomePage()) {
			report.addReportStep("Open browser and enter HomeDepot URL",
					"Home page displayed successfully", StepResult.PASS);
		} else {
			report.addReportStep("Open browser and enter HomeDepot URL",
					"Home page was not displayed successfully", StepResult.FAIL);
		}
	}
	
	/**
	 * Method to verify Consumer Home Page
	 * 
	 * @return
	 * @throws Exception
	 */
	private boolean isConsumerHomePage() throws Exception {

		if (wh.isElementPresent(HomePageUI.verifyHomepage, 3) || 
				wh.isElementPresent(HomePageUI.verifyHomepage1, 3)) {

			return true;
		} else {

			return false;
		}
	}

	/**
	 * Method to search keyword
	 * @throws Exception
	 */
	public void searchKeyword() throws Exception {
		
		String keyword = dataHelper.getData(DataColumn.Keyword);

		wh.sendKeys(CommonElements.searchTxtBox, keyword);
		wh.clickElement(CommonElements.searchBtn);

		if (wh.isElementPresent(PLPUI.VerifyPLPPage, 4)
				&& wh.getText(CommonElements.breadCumb).contains(
						keyword)) {

			report.addReportStep("Type '" + keyword
					+ "' in search text box and click on search button",
					"User navigated to search plp page.", StepResult.PASS);
		} else {

			report.addReportStep("Type '" + keyword
					+ "' in search text box and click on search button",
					"User is not navigated to search plp page.",
					StepResult.FAIL);

			terminateTestCase("search plp page");
		}
		
	}
	
		/**
	 * Method to throw custom exception to terminate test case
	 * 
	 * @throws Exception
	 */
	public void throwCustomException() throws Exception {

		throw new Exception("Custom Error");
	}

	/**
	 * Method to terminate test case.
	 * 
	 * @param pageName
	 * @throws Exception
	 */
	public void terminateTestCase(String pageName) throws Exception {

		if (terminateTestOnElementNotPresent) {

			report.addCustomErrorStep("Terminating test case",
					"Terminating test case as " + pageName
							+ " is not displayed");

			throwCustomException();
		}
	}
	
	/**
	 * Method to get analytic value
	 * @param analyticsProperty
	 * @return
	 */
	public String getAnalyticsValue(String analyticsProperty) {          
		   	
	     String analyticsObject= "_hddata";
	     Object propertyValue;
	     String jsProperty = analyticsObject + "."
	              + analyticsProperty + ";";
	
	     JavascriptExecutor js = (JavascriptExecutor) driver;
	     propertyValue = js.executeScript("return " + jsProperty);
	
	    // System.out.println("Property returned is : " + propertyValue);
	     if (propertyValue != null)
	        return propertyValue.toString().trim();
	     else
	        return "null";
	}
	
	/**
	 * Method to check if environment is Prod
	 * 
	 * @return true if Prod Environment else false
	 */
	public boolean isProdEnvironment() {

		if (driver.getCurrentUrl().contains("www.homedepot.com")
				|| dataHelper.getCommonData(CommonDataColumn.EnvironmentUrl)
						.contains("www.homedepot.com")
				|| HelperClass.baseModel.runEnvironment.equals("Prod")) {

			return true;

		} else {

			return false;
		}
	}
}




