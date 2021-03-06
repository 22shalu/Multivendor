package com.homer.glue;

import com.homer.dao.DataClass;
import com.homer.dao.Given;
import com.homer.dao.TableData;
import com.homer.dao.Then;
import com.homer.dao.When;

public class CommodityOnBoarding_MVNDR_Addbutton_176_StepDefn extends BaseStepDefn {
	
	public CommodityOnBoarding_MVNDR_Addbutton_176_StepDefn(DataClass ih) {
		super(ih);	}		
	
	@Given("^a user launches gridtstats url with ([^\"]*) and ([^\"]*)$")
	public void a_user_launches_gridstats_url(String userName,String Password) throws Throwable { 
		
		corSignInPage.gridstatsLogin(userName,Password);
		Thread.sleep(2000);
		System.out.println("User logged in successfully");
	  
	}
	
	@Given("^a user launches COR url")
	public void a_user_launches_core_url()throws Throwable { 
		corSignInPage.appLogin();
		System.out.print("URL launched");
		Thread.sleep(1000);
		System.out.println("COR URL is launched");
		wh.waitForPageLoaded();
	  
	}

	@Then("^user clicks on Program Set up and clicks on Commodity On Boarding$")
	public void user_clicks_on_Program_Set_up_and_clicks_on_Commodity_On_Boarding() throws Throwable { 
	 
		corMenuPage.chooseProgramSetUp();
		Thread.sleep(1000);
		corMenuPage.chooseCommodityOnBoarding();
		wh.waitForPageLoaded();
		System.out.println("User goes to commodity onboarding screen");
	  
	}
	
	@Then("^user choose MVNDR tab$")
	public void user_choose_MVNDR_tab() throws Throwable{
		
		commodityOnBoardingMVNDRPage.chooseMVNDRTab();
		System.out.println("User clicked on MVNDR tab");		
	}
	/******/
	@When("^user clicks on Add button a pop up appears and user enters the ([^\"]*) and clicks on save button$")
	public void user_clicks_on_Add_button_a_pop_up_appears_and_user_enters_the_Program_Name_and_clicks_on_save_button(String Custom_Program_Name) throws Throwable { 
		
		commodityOnBoardingMVNDRPage.type_ProgramName_In_UI_And_Verify_Error_Msg(Custom_Program_Name);
		System.out.println("User typed in the program name");
	 }
	
    @Then("^for testing purpose the database limit is set by an analyst$")
    public void for_testing_purpose_the_database_limit_is_set_by_an_analyst() throws Throwable{ 
    	
    	commodityOnBoardingMVNDRPage.setThresholdLimitForAutoGeneratedID();
    	System.out.println("New Threshold limit is set");
    	
    }
	
    @Then("^verify that the ([^\"]*) is saved in database and successful message is displayed$")
	public void verify_that_the_program_name_is_saved_in_database_and_successful_message_is_displayed(String Custom_Program_Name) throws Throwable{
    	
    	commodityOnBoardingMVNDRPage.saveProgramName_In_DB(Custom_Program_Name);    	
    		    	
	    }
    /*********/
   @Then("^verify that the ([^\"]*) entered by the user is not saved in database and error message is displayed$")
   public void verify_that_the_program_name_entered_by_the_user_is_not_saved_in_database_and_error_message_is_displayed(String Custom_Program_Name) throws Throwable{
	              
	   commodityOnBoardingMVNDRPage.saveProgramName_In_DB(Custom_Program_Name);
	 	 
   }
   

    @When("^user clicks on Add button a pop up appears and without entering any program name user clicks on save button and an error message is thrown$")
    public void user_clicks_on_Add_button_a_pop_up_appears_and_without_entering_any_program_name_user_clicks_on_save_button_and_an_error_message_is_thrown() throws Throwable { 
 
       commodityOnBoardingMVNDRPage.Save_EmptyProgramName_In_UI();
   }

        
    @When("^user clicks on Add button a pop up appears and user enters the ([^\"]*) and the click on cancel button closes pop up and the program name is not saved into the database$")
    public void user_clicks_on_Add_button_a_pop_up_appears_and_user_enters_the_Program_Name_and_the_click_on_cancel_button_closes_popup_and_the_program_name_is_not_saved_into_the_database(String Custom_Program_Name) throws Throwable { 
   
      commodityOnBoardingMVNDRPage.EnterProgramName_Click_Cancel_In_UI(Custom_Program_Name);
    }

 
    @Then("^verify that the Custom Program Flag column in database is set to true for the ([^\"]*)$")
    public void verify_that_the_Custom_Program_Flag_column_in_database_is_set_to_true_for_the_Program_Name(String Custom_Program_Name) throws Throwable { 
    	     
    	commodityOnBoardingMVNDRPage.check_Custom_Program_Flag_In_DB(Custom_Program_Name);
    }


}
