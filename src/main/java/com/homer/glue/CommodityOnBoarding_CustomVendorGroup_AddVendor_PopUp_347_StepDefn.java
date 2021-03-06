package com.homer.glue;

import com.homer.dao.DataClass;
import com.homer.dao.TableData;
import com.homer.dao.Then;
import com.homer.dao.When;

public class CommodityOnBoarding_CustomVendorGroup_AddVendor_PopUp_347_StepDefn extends BaseStepDefn{

	public CommodityOnBoarding_CustomVendorGroup_AddVendor_PopUp_347_StepDefn(DataClass ih) {
		super(ih);	}		

	@When("^user again clicks on Add button and trys to add duplicate vendor verify that error message is thrown$")
	public void user_again_clicks_on_Add_button_and_trys_to_add_duplicate_vendor_verify_that_error_message_is_thrown(TableData table) throws Throwable { 
	
		commodityOnBoarding_CustomVendorGroup_Page.AddDuplicateVendors(table);			
	  
	}

	@Then("^verify that the duplicate vendor is not listed in the results grid for ([^\"]*)$")
	public void verify_that_the_duplicate_vendor_is_not_listed_in_the_results_grid_for(String Custom_Program_Name) throws Throwable { 
	
		commodityOnBoarding_CustomVendorGroup_Page.verify_Vendors_In_Custom_Program(Custom_Program_Name);
		
	}
	

@Then("^user again clicks on Add button for the ([^\"]*) and using X symbol removes the vendor and click on save where the error message should be displayed as atleast one vendor should be there to save$")
public void user_again_clicks_on_Add_button_for_the_Custom_Program_Name_and_using_X_symbol_removes_the_vendor_and_click_on_save_where_the_error_message_should_be_displayed_as_atleast_one_vendor_should_be_there_to_save(String Custom_Program_Name,TableData table) throws Throwable { 
	   
	   commodityOnBoarding_CustomVendorGroup_Page.select_And_Then_Remove_Vendor_In_Add_Vendor_Pop_Up(table);
	   commodityOnBoarding_CustomVendorGroup_Page.verify_Vendors_In_Custom_Program(Custom_Program_Name);
  
}

@When("^user enters a ([^\"]*) in Custom Program Name field$")
public void user_enters_a_Custom_Program_Name_in_Custom_Program_Name_field(String Custom_Program_Name) throws Throwable { 
	commodityOnBoarding_CustomVendorGroup_Page.type_Custom_Program_Name(Custom_Program_Name);
  
}

@Then("^user clicks on Add button for ([^\"]*) and click on settings button next to MVNDR and choose the first vendor name from the list$")
public void user_clicks_on_Add_button_for_Custom_Program_Name_and_click_on_settings_button_next_to_MVNDR_and_choose_the_first_vendor_name_from_the_list(String Custom_Program_Name) throws Throwable { 
	commodityOnBoarding_CustomVendorGroup_Page.select_Vendor_From_Add_Vendor_Pop_Up_List();
	commodityOnBoarding_CustomVendorGroup_Page.verify_Vendors_In_Custom_Program(Custom_Program_Name);

  
}

@Then("^user clicks on Add button for ([^\"]*) and click on settings button next to MVNDR and in the search field types in the vendor name and choose it from the result$")
public void user_clicks_on_Add_button_for_and_click_on_settings_button_next_to_MVNDR_and_in_the_search_field_types_in_the_vendor_name_and_choose_it_from_the_result(String Custom_Program_Name,TableData table) throws Throwable { 

	commodityOnBoarding_CustomVendorGroup_Page.select_Vendor_From_Add_Vendor_Pop_Up_List_Using_Search(table);
	commodityOnBoarding_CustomVendorGroup_Page.verify_Vendors_In_Custom_Program(Custom_Program_Name);

}

@Then("^user clicks on Add button and add the vendors and then click on cancel for the ([^\"]*)$")
public void user_clicks_on_Add_button_and_add_the_vendors_and_then_click_on_cancel_for_the_Custom_Program_Name(String Custom_Program_Name,TableData table) throws Throwable { 
	commodityOnBoarding_CustomVendorGroup_Page.Cancel_Vendor_From_Add_Vendor_Pop_Up_List(table);
	commodityOnBoarding_CustomVendorGroup_Page.verify_Vendors_In_Custom_Program(Custom_Program_Name);
	
  
}


@Then("^verify that the ([^\"]*) still does not have any vendors attached to it$")
public void verify_that_the_Custom_Program_Name_still_does_not_have_any_vendors_attached_to_it(String Custom_Program_Name) throws Throwable { 

	commodityOnBoarding_CustomVendorGroup_Page.validate_Custom_Program_With_No_Vendors(Custom_Program_Name);
  
}



	
}
