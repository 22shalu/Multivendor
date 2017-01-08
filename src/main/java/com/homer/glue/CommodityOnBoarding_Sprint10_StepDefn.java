package com.homer.glue;

import com.homer.dao.DataClass;
import com.homer.dao.When;

public class CommodityOnBoarding_Sprint10_StepDefn extends BaseStepDefn{
	
	
	
	public CommodityOnBoarding_Sprint10_StepDefn(DataClass data) {
		super(data);
		
	}

	@When("^no vendors are selected verify that the delete button is disabled and when the user selects delete all verify that the delete button is enabled$")
	public void no_vendors_are_selected_verify_that_the_delete_button_is_disabled_and_when_the_user_selects_delete_all_verify_that_the_delete_button_is_enabled() throws Throwable { 
	
		commodityOnBoarding_CustomVendorGroup_Page.Validate_Delete_All_Vendor_From_CustomProgram();
	}


}
