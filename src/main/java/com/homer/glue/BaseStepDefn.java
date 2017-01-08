package com.homer.glue;

import org.openqa.selenium.WebDriver;

import com.homer.dao.CommonData;
import com.homer.dao.DataClass;
import com.homer.dao.InstanceContainer;
import com.homer.helper.DataTable;
import com.homer.po.CheckoutSignInPage;
import com.homer.po.CommodityOnBoardingMVNDRPage;
import com.homer.po.CommodityOnBoarding_CustomVendorGroup_Page;
import com.homer.po.CorMenuPage;
import com.homer.po.CorSignInPage;
import com.homer.po.HomePage;
import com.homer.po.PIPPage;
import com.homer.po.PLPPage;
import com.homer.po.PaymentPage;
import com.homer.po.ShippingPage;
import com.homer.po.ShoppingCartPage;
import com.homer.po.ThankYouPage;
import com.homer.reports.Report;
import com.homer.resuablecomponents.JDBC_Connection;
import com.homer.resuablecomponents.ReusableComponents;
import com.homer.resuablecomponents.WebDriverHelper;

public class BaseStepDefn {
	
	protected Report report;
	protected DataTable dataTable;
	protected JDBC_Connection jDBC_Connection;
	
	protected WebDriverHelper wh;
	protected DataClass data;
	
	protected WebDriver driver;
	protected ReusableComponents rc;
	protected InstanceContainer ic;
	
	protected HomePage homePage;
	protected PLPPage plpPage;
	protected PIPPage pipPage;
	protected ShoppingCartPage shoppingCartPage;
	protected CheckoutSignInPage checkoutSignInPage;
	protected ShippingPage shippingPage;
	protected PaymentPage paymentPage;
	protected ThankYouPage thankYouPage;
	protected CorSignInPage corSignInPage;
	protected CorMenuPage corMenuPage;
	protected CommodityOnBoardingMVNDRPage commodityOnBoardingMVNDRPage;
	protected CommodityOnBoarding_CustomVendorGroup_Page commodityOnBoarding_CustomVendorGroup_Page;
	
	CommonData commonData;	
	
	public BaseStepDefn(DataClass data) {
		
		this.data = data;
		this.driver = data.driver;
		this.report = data.report;
		this.dataTable = data.dataTable;		
		this.commonData = (CommonData)data.commonData;
				
		wh = new WebDriverHelper(driver, report, dataTable);
		rc = new ReusableComponents(driver, report, wh, dataTable);
		
		jDBC_Connection=new JDBC_Connection();
		ic = new InstanceContainer(driver, report,dataTable, wh, rc,commonData,jDBC_Connection);
		
		
		homePage = new HomePage(ic);
		plpPage = new PLPPage(ic);
		pipPage = new PIPPage(ic);
		shoppingCartPage = new ShoppingCartPage(ic);
		checkoutSignInPage = new CheckoutSignInPage(ic);
		shippingPage = new ShippingPage(ic);
		paymentPage = new PaymentPage(ic);
		thankYouPage = new ThankYouPage(ic);
		corSignInPage= new CorSignInPage(ic);
		corMenuPage= new CorMenuPage(ic);
		commodityOnBoardingMVNDRPage=new CommodityOnBoardingMVNDRPage(ic);
		commodityOnBoarding_CustomVendorGroup_Page=new CommodityOnBoarding_CustomVendorGroup_Page(ic);
	}
	
	// Please do not add any step definition implementation methods in this class
}
