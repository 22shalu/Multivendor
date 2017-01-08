package com.homer.glue;

import com.homer.dao.And;
import com.homer.dao.DataClass;
import com.homer.dao.Then;

public class CommodityOnBoarding_DeleteFromCustomPgmName_322_StepDefn extends BaseStepDefn {
	
	public CommodityOnBoarding_DeleteFromCustomPgmName_322_StepDefn(DataClass data) {
		super(data);
		
	}
	
	@Then("^user verify the current time stamp for the ([^\"]*)$")
	public void user_verify_the_current_time_stamp_for_the(String Custom_Program_Name) throws Throwable{
		
		commodityOnBoardingMVNDRPage.Timestamp_From_MVNDR_Screen_Before_Delete(Custom_Program_Name);
		System.out.println("Verified time stamp");
	}
	
	@Then("^the user selects one vendor and click on delete button$")
	public void the_user_selects_one_vendor_and_click_on_delete_button() throws Throwable { 
	 
		commodityOnBoarding_CustomVendorGroup_Page.Validate_Delete_Vendor_From_CustomProgram();
		
	}

	@And("^verify that the vendor record user selected is deleted from the results grid for ([^\"]*)$")
	public void verify_that_the_vendor_record_user_selected_is_deleted_from_the_results_grid_for(String Custom_Program_Name) throws Throwable { 
	
		commodityOnBoarding_CustomVendorGroup_Page.verify_Vendors_In_Custom_Program(Custom_Program_Name);
	}

	@Then("^verify that the time stamp in MVNDR tab is updated for ([^\"]*)$")
	public void verify_that_the_time_stamp_in_MVNDR_tab_is_updated_for(String Custom_Program_Name) throws Throwable {
		
		commodityOnBoardingMVNDRPage.Timestamp_From_MVNDR_Screen_After_Delete(Custom_Program_Name);	  
	}

	@Then("^the user selects delete all and click on delete button$")
	public void the_user_selects_delete_all_and_click_on_delete_button() throws Throwable { 
		commodityOnBoarding_CustomVendorGroup_Page.Validate_Delete_All_Vendor_From_CustomProgram();
	  
	}

	@And("^verify that all the vendor records are deleted from the results grid for ([^\"]*)$")
	public void verify_that_all_the_vendor_records_are_deleted_from_the_results_grid(String Custom_Program_Name) throws Throwable { 
		
		commodityOnBoarding_CustomVendorGroup_Page.verify_Vendors_In_Custom_Program(Custom_Program_Name);
	}
	
	
}
