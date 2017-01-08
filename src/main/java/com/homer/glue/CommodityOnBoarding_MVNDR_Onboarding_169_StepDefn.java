package com.homer.glue;

import com.homer.dao.And;
import com.homer.dao.DataClass;
import com.homer.dao.TableData;
import com.homer.dao.Then;
import com.homer.dao.When;

public class CommodityOnBoarding_MVNDR_Onboarding_169_StepDefn extends BaseStepDefn {
	
	public CommodityOnBoarding_MVNDR_Onboarding_169_StepDefn(DataClass ih) {
		super(ih);	
		
	}	
	
	
	@When("^user enters the Vendor Number then the details associated with the particular vendor number from database should be listed and user focus on it and clicks edit button to add markets to each vendor$")
	public void user_enters_the_Vendor_Number_then_the_details_associated_with_the_particular_vendor_number_from_database_should_be_listed_and_user_focus_on_it_and_clicks_edit_button_to_add_markets_to_each_vendor(TableData table) throws Throwable { 

		commodityOnBoardingMVNDRPage.Onboard_Markets_Vendors(table);
	}
	
	@When("^user clicks on Add button a pop up appears and user enters the ([^\"]*) and add vendors to it$")
	public void user_clicks_on_Add_button_a_pop_up_appears_and_user_enters_the_Program_Name_and_add_vendors_to_it(String Custom_Program_Name,TableData data) throws Throwable { 
		
		commodityOnBoardingMVNDRPage.type_ProgramName_In_UI_And_Proceed_To_Add_Vendor_Screen(Custom_Program_Name);
		commodityOnBoardingMVNDRPage.AddVendorsThruMVNDR(data);
		System.out.println("User typed in the program name");
	 }
	
	@And("^user searches for the ([^\"]*) and click on edit button and verify if common markets are listed$")
	public void user_searches_for_the_Custom_Program_Name_and_click_on_edit_button_and_verify_if_common_markets_are_listed(String Custom_Program_Name) throws Throwable { 
		commodityOnBoardingMVNDRPage.Verify_CommonMarkets(Custom_Program_Name);
		commodityOnBoardingMVNDRPage.Save_CommonMarket_And_Verify_In_DB(Custom_Program_Name);
	  
	}
	

    @When("^user enters the Vendor Number then the details associated with the particular vendor number from database should be listed and user focus on it and clicks edit button to add stores to each vendor$")
    public void user_enters_the_Vendor_Number_then_the_details_associated_with_the_particular_vendor_number_from_database_should_be_listed_and_user_focus_on_it_and_clicks_edit_button_to_add_stores_to_each_vendor(TableData table) throws Throwable { 
    	commodityOnBoardingMVNDRPage.Onboard_Stores_Vendors(table);
    	System.out.println("vendors onboarded");
  
   }

   @And("^user searches for the ([^\"]*) and click on edit button and verify if common stores are listed$")
   public void user_searches_for_the_Custom_Program_Name_and_click_on_edit_button_and_verify_if_common_stores_are_listed(String Custom_Program_Name) throws Throwable { 

	     commodityOnBoardingMVNDRPage.Verify_CommonStores(Custom_Program_Name);
		commodityOnBoardingMVNDRPage.Save_CommonStore_And_Verify_In_DB(Custom_Program_Name);
   }

   @Then("^the user goes to each Master Program and verifies that the markets onboarded to the Custom Program is not visible in the Master Programs$")
   public void the_user_goes_to_each_Master_Program_and_verifies_that_the_markets_onboarded_to_the_Custom_Program_is_not_visible_in_the_Master_Programs(TableData table) throws Throwable { 
		commodityOnBoardingMVNDRPage.Verify_CP_Onboard_Markets_Not_Visible_In_MP(table); 
   }

   @When("^the verification is over the user deletes the ([^\"]*)$")
   public void the_verification_is_over_the_user_deletes_the_Custom_Program_Name(String Custom_Program_Name) throws Throwable { 
		commodityOnBoardingMVNDRPage.Delete_CP(Custom_Program_Name);
     
   }
	
}
