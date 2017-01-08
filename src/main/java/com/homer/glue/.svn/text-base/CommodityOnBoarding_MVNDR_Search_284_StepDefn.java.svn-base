package com.homer.glue;

import com.homer.dao.DataClass;
import com.homer.dao.Then;
import com.homer.dao.When;

public class CommodityOnBoarding_MVNDR_Search_284_StepDefn extends BaseStepDefn {
	
	public CommodityOnBoarding_MVNDR_Search_284_StepDefn(DataClass data) {
		super(data);
		
	}

	@When("^user enters the ([^\"]*) then verify that in the results grid new columns like program id and custom program flag are displayed$")
	public void user_enters_the_Custom_Program_Name_then_verify_that_in_the_results_grid_new_columns_like_program_id_and_custom_program_flag_are_displayed(String Custom_Program_Name) throws Throwable { 
		
		commodityOnBoardingMVNDRPage.custom_ProgramName_Search_In_MVNDR(Custom_Program_Name);
	  
	}

	@Then("^user enters the ([^\"]*) and should be able to hover the mouse over department and vendor number and see if all details are shown properly$")
	public void user_enters_the_and_should_be_able_to_hover_the_mouse_over_department_and_vendor_number_and_see_if_all_details_are_shown_properly(String Custom_Program_Name) throws Throwable { 
		
		commodityOnBoardingMVNDRPage.DeptMouseHover(Custom_Program_Name);
	 
	}


}
