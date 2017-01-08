package com.homer.glue;

import com.homer.dao.DataClass;
import com.homer.dao.TableData;
import com.homer.dao.Then;
import com.homer.dao.When;


public class CommodityOnBoarding_CustomVendorGroup_AddVendors_190_StepDefn extends BaseStepDefn{
	

public CommodityOnBoarding_CustomVendorGroup_AddVendors_190_StepDefn(DataClass ih) {
		super(ih);
		
	}
	
	
@When("^user enters a ([^\"]*) in Custom Program Name field who does not have any vendors attached to it and an error message should pop up$")
public void user_enters_a_Custom_Program_Name_in_Custom_Program_Name_field_who_does_not_have_any_vendors_attached_to_it_and_an_error_message_should_pop_up(String Custom_Program_Name) throws Throwable { 
	
	commodityOnBoarding_CustomVendorGroup_Page.type_Custom_Program_Name(Custom_Program_Name);
	commodityOnBoarding_CustomVendorGroup_Page.validate_Custom_Program_With_No_Vendors(Custom_Program_Name);
	  
	}


@Then("^user clicks on Add button and add the vendors and verify if they are listed in the results grid for the ([^\"]*)$")
public void user_clicks_on_Add_button_and_add_the_vendors_and_verify_if_they_are_listed_in_the_results_grid_for_the(String Custom_Program_Name,TableData table) throws Throwable { 

	commodityOnBoarding_CustomVendorGroup_Page.AddVendors(table);
	commodityOnBoarding_CustomVendorGroup_Page.verify_Vendors_In_Custom_Program(Custom_Program_Name);
  
}


@When("^user enters a ([^\"]*) in Custom Program Name field who has vendors attached to it$")
public void user_enters_a_Custom_Program_Name_in_Custom_Program_Name_field_who_has_vendors_attached_to_it(String Custom_Program_Name) throws Throwable { 
	
	commodityOnBoarding_CustomVendorGroup_Page.type_Custom_Program_Name(Custom_Program_Name);
  
}


}
