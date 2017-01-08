package com.homer.glue;

import com.homer.dao.DataClass;
import com.homer.dao.Then;
import com.homer.dao.When;

public class CommodityOnBoarding_CustomVendorGroup_170_StepDefn extends BaseStepDefn{

	public CommodityOnBoarding_CustomVendorGroup_170_StepDefn(DataClass ih) {
		super(ih);	}		


 @Then("^user choose Custom Vendor Group tab$")
 public void user_choose_Custom_Vendor_Group_tab() throws Throwable{
	
	 commodityOnBoarding_CustomVendorGroup_Page.chooseCustomVendorGroupTab();
	 System.out.println("Clicked on custom vendor group tab");
 }
 
 
 @When("^user enters a partial ([^\"]*) all matching custom program names from database should be listed$")
 public void user_enters_a_partial_Custom_Program_Name_all_matching_custom_program_names_from_database_should_be_listed(String Custom_Program_Name) throws Throwable { 
 
	 commodityOnBoarding_CustomVendorGroup_Page.type_Custom_Program_Name(Custom_Program_Name);
	 
 }

 @When("^user enters a ([^\"]*) in Custom Program Name field and the results grid should populate with all the vendors associated with that program$")
 public void user_enters_a_Custom_Program_Name_in_Custom_Program_Name_field_and_the_results_grid_should_populate_with_all_the_vendors_associated_with_that_program(String Custom_Program_Name) throws Throwable { 
	 
	 commodityOnBoarding_CustomVendorGroup_Page.type_Custom_Program_Name(Custom_Program_Name);
	 commodityOnBoarding_CustomVendorGroup_Page.verify_Vendors_In_Custom_Program(Custom_Program_Name);
 }

 @When("^user enters an invalid ([^\"]*) in Custom Program Name field then error message should be thrown and results grid should be blank$")
 public void user_enters_an_invalid_Custom_Program_Name_in_Custom_Program_Name_field_then_error_message_should_be_thrown_and_results_grid_should_be_blank(String Custom_Program_Name) throws Throwable { 
	
	 commodityOnBoarding_CustomVendorGroup_Page.type_Custom_Program_Name(Custom_Program_Name);
	 commodityOnBoarding_CustomVendorGroup_Page.validate_Invalid_Custom_Program_Name_With_Search_Button(Custom_Program_Name);
   
 }

}
