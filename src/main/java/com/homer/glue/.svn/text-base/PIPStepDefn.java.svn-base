package com.homer.glue;

import com.homer.dao.DataClass;
import com.homer.dao.Then;
import com.homer.dao.When;

public class PIPStepDefn extends BaseStepDefn {
	
	public PIPStepDefn(DataClass data) {
		super(data);
	}
	
	@Then("^I see PIP page displayed$")
	public void i_see_PIP_page_displayed() throws Throwable { 
		
		pipPage.verifyPIPPage();
	}
	

	@Then("^I see PIP page for SKU displayed$")
	public void i_see_PIP_page_for_SKU_displayed() throws Throwable { 
		
		pipPage.verifyPIPForSKU();
	}
	
	@When("^I click on AddToCart in PIP page$")
	public void i_click_on_AddToCart_in_PIP_page() throws Throwable { 
		
	  shoppingCartPage = pipPage.clickAddToCart();
	}
}
