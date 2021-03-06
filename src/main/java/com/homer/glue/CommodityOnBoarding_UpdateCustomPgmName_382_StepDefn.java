package com.homer.glue;

import com.homer.dao.And;
import com.homer.dao.DataClass;
import com.homer.dao.Then;
import com.homer.dao.When;

public class CommodityOnBoarding_UpdateCustomPgmName_382_StepDefn extends BaseStepDefn {
	
	public CommodityOnBoarding_UpdateCustomPgmName_382_StepDefn(DataClass data) {
		super(data);
		
	}
	
	@Then("^user enters the ([^\"]*) and click on update button and verify that the custom program name update pop up is open$")
	public void user_enters_the_Custom_Program_Name_and_click_on_update_button_and_verify_that_the_custom_program_name_update_pop_up_is_open(String Custom_Program_Name) throws Throwable { 
			commodityOnBoarding_CustomVendorGroup_Page.Update_Pop_Up_Open(Custom_Program_Name);	
			System.out.println("Test 1");
	  
	}

	@Then("^user enters the ([^\"]*) and click on save and verify that custom program name field and result grid are cleared and the new name is saved into database$")
	public void user_enters_the_New_Custom_Program_Name_and_click_on_save_and_verify_that_custom_program_name_field_and_result_grid_are_cleared_and_the_new_name_is_saved_into_database(String New_Custom_Program_Name) throws Throwable { 
		     
		System.out.println("Test 2");
		commodityOnBoarding_CustomVendorGroup_Page.Save_Updated_Custom_Program_Name(New_Custom_Program_Name);
		
		
	}

	@Then("^verify that the ([^\"]*) is available in the custom program drop down$")
	public void verify_that_the_New_Custom_Program_Name_is_available_in_the_custom_program_drop_down(String New_Custom_Program_Name) throws Throwable { 
	
		commodityOnBoarding_CustomVendorGroup_Page.Validate_Updated_Custom_Program_In_Dropdown(New_Custom_Program_Name);
	}

	@And("^the user is able to search for the ([^\"]*) in the MVNDR tab$")
	public void the_user_is_able_to_search_for_the_New_Custom_Program_Name_in_the_MVNDR_tab(String New_Custom_Program_Name) throws Throwable { 
		
		commodityOnBoardingMVNDRPage.Search_Updated_Custom_Program_Name(New_Custom_Program_Name);
	  
	}

	@When("^the user clicks on update button verify that error message is thrown and user is not able to update the program name$")
	public void the_user_clicks_on_update_button_verify_that_error_message_is_thrown_and_user_is_not_able_to_update_the_program_name() throws Throwable { 
		
		commodityOnBoarding_CustomVendorGroup_Page.Click_On_Update_Without_Entering_Custom_Program_Name();
	  
	}

	@When("^the user enters and ([^\"]*) and click on update error message should be thrown$")
	public void the_user_enters_and_Existing_Custom_Program_Name_and_click_on_update_error_message_should_be_thrown(String Existing_Custom_Program_Name) throws Throwable { 
		
		commodityOnBoarding_CustomVendorGroup_Page.Update_With_Existing_Custom_Program_Name(Existing_Custom_Program_Name);
	  
	}

	@Then("^user enters the ([^\"]*) and click on save and verify that custom program name field and result grid are cleared  and the new name is saved into database$")
	public void user_enters_the_New_Custom_Program_Name_With_Length_50_and_click_on_save_and_verify_that_custom_program_name_field_and_result_grid_are_cleared_and_the_new_name_is_saved_into_database(String New_Custom_Program_Name_With_Length_50) throws Throwable { 
	
		commodityOnBoarding_CustomVendorGroup_Page.Save_Updated_Custom_Program_Name_With_Length_50(New_Custom_Program_Name_With_Length_50);
	}


	@Then("^user enters the ([^\"]*) and click on update button and verify that the user gets an error message$")
	public void user_enters_the_Invalid_Custom_Program_Name_and_click_on_update_button_and_verify_that_the_user_gets_an_error_message(String Invalid_Custom_Program_Name) throws Throwable { 
		commodityOnBoarding_CustomVendorGroup_Page.validate_Invalid_Custom_Program_Name_With_Update_Button(Invalid_Custom_Program_Name);
	  
	}

	@Then("^user enters the ([^\"]*) and click on save and verify that user receives error message$")
	public void user_enters_the_New_Custom_Program_Name_with_Special_Chara_and_click_on_save_and_verify_that_user_receives_error_message(String New_Custom_Program_Name_with_Special_Chara) throws Throwable { 
		commodityOnBoarding_CustomVendorGroup_Page.Validate_Spcl_chara_Not_Allowed_In_Update(New_Custom_Program_Name_with_Special_Chara);
	  
	}
	
	
	@Then("^user goes back and update the ([^\"]*) as ([^\"]*)$")
	public void user_goes_back_and_update_the_New_Custom_Program_Name_as_Custom_Program_Name(String New_Custom_Program_Name, String Custom_Program_Name) throws Throwable { 
		 commodityOnBoarding_CustomVendorGroup_Page.chooseCustomVendorGroupTab();
		 commodityOnBoarding_CustomVendorGroup_Page.Update_Pop_Up_Open(New_Custom_Program_Name);
		 commodityOnBoarding_CustomVendorGroup_Page.Save_Updated_Custom_Program_Name(Custom_Program_Name);
	}

	
	
}
