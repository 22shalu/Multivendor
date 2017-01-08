package com.homer.po;

import org.openqa.selenium.By;

import com.homer.dao.CommonDataColumn;
import com.homer.dao.InstanceContainer;
import com.homer.enums.EnumClass.StepResult;
import java.awt.Robot;
import java.awt.event.KeyEvent;


public class CorSignInPage extends PageBase<CorSignInPage> {
		
	static final By Login =By.id("login");
	static final By Authenticated_Pop_Up=By.id("nav_user");
	static final By Authenticated_OK=By.id("okButton");
	static final By username = By.id("usernameId");
	static final By password = By.id("passwordId");
	static final By submit=By.id("loginButton");
	static final By Version=By.xpath("//*[@id='contentDiv']/button[1]");
	static final By OK=By.cssSelector("button..firepath-matching-node");

	public CorSignInPage(InstanceContainer ic) {
		 super(ic);       	
	}
	
	public void gridstatsLogin(String userName,String Password)throws Throwable{

	       driver.manage().deleteAllCookies();
		   driver.get(dataTable.getCommonData("EnvironmentUrl"));
		   driver.manage().window().maximize();
		    wh.clickElement(Login);
			if(wh.isElementPresent(Authenticated_OK, 3))
			wh.clickElement(Authenticated_OK);
			else
		{
		   wh.sendKeys(username,userName);
		   wh.sendKeys(password,Password);
		   wh.clickElement(submit);
		   report.addReportStepNoScreenshots("The user '"+userName+"' logged into the application",
					"The user '"+userName+"' logged into the application", 
				         StepResult.PASS);	
			}  
	}
	
	public void appLogin() throws Throwable{
		 driver.get("https://webapps-qa.homedepot.com/cor/");	
//		 driver.get("https://webapps-qp.homedepot.com/cor/CookieSetter.html");		
//		 wh.clickElement(Version);
//		 Popup_Enter();
//		 System.out.println("Clicked");
//		 driver.get("https://webapps-qp.homedepot.com/cor/Menu.html");
//		 System.out.println("launched");
		 
	}
	
//	public static void Popup_Enter() throws Exception {
//
//		Thread.sleep(1000);
//		  
//		  Robot robot = new Robot();             
//		  robot.keyPress(KeyEvent.VK_ENTER);
//		   robot.delay(5000);
//		  }

}
