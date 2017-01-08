package com.homer.keywords;

import org.openqa.selenium.WebDriver;

import com.homer.dao.CommonData;
import com.homer.dao.DataClass;
import com.homer.dao.InstanceContainer;
import com.homer.helper.DataTable;
import com.homer.po.HomePage;
import com.homer.po.PIPPage;
import com.homer.po.PLPPage;
import com.homer.reports.Report;
import com.homer.resuablecomponents.JDBC_Connection;
import com.homer.resuablecomponents.ReusableComponents;
import com.homer.resuablecomponents.WebDriverHelper;

public class BaseKeywords {

	protected Report report;
	protected DataTable dataTable;
	protected JDBC_Connection jDBC_Connection;
	
	protected WebDriverHelper wh;
	protected DataClass ih;
	
	protected WebDriver driver;
	protected ReusableComponents rc;
	protected InstanceContainer ic;
	
	CommonData commonData;	
	
	protected HomePage homePage;
	protected PLPPage plpPage;
	protected PIPPage pipPage;
	
	public BaseKeywords(DataClass data) {		
	
		this.ih = data;
		this.driver = data.driver;
		this.report = data.report;
		this.dataTable = data.dataTable;		
		this.commonData = (CommonData)data.commonData;
		this.jDBC_Connection=ic.jDBC_Connection;
		
		wh = new WebDriverHelper(driver, report, dataTable);
		rc = new ReusableComponents(driver, report, wh, dataTable);
		
		ic = new InstanceContainer(driver, report,dataTable, wh, rc,commonData, jDBC_Connection);
		
		homePage = new HomePage(ic);
		plpPage = new PLPPage(ic);
		pipPage = new PIPPage(ic);
	}
}
