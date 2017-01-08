package com.homer.po;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.homer.dao.InstanceContainer;
import com.homer.dao.TableData;
import com.homer.enums.EnumClass.StepResult;



public class CommodityOnBoarding_CustomVendorGroup_Page extends PageBase<CommodityOnBoarding_CustomVendorGroup_Page> {
	
	static final By CustomVendorGroup_Tab =By.xpath("//*[@id='tabsCOB']/ul/li[2]/a");
	static final By CustomProgramName_Text=By.id("cobCustVendorNbrTxtBox");
	static final By Search=By.id("cobCustMvndrSearchBtn");
	static final By Error_PopUp=By.xpath("//*[@class='modal-dialog']/div[@class='modal-content']/div[@class='modal-body']/div[@class='bootstrap-dialog-body']");
	static final By Custom_Vendor_Number_Result_Grid=By.xpath("//*[@id='cobCustMvndrGrid']/div[4]/div[3]/div/div[1]/div[2]");
	static final By Error_PopUp_OK=By.xpath("//*[@class='modal-dialog']/div[@class='modal-content']/div[3]/div/div/button");
	static final By Error_PopUp_X=By.xpath("//*[@class='modal-dialog']/div[@class='modal-content']/div/div/div");
	static final By Add=By.id("cobCustVndrAddBtn");
	static final By Add_Button_Title=By.id("ui-id-2");
	static final By Delete=By.id("cobCustVndrDelBtn");
	static final By Clear=By.id("cobCustVndrClearBtn");	
	
	/*Add Vendor Pop up*/		
	static final By Program_Name_Title_In_Add=By.id("ProgramNameAdd");
	static final By MVNDR_Text_In_Add=By.id("addMvendorSelect");
	static final By Save_In_add=By.id("cobAddPopUpMvendorSave");
	static final By Cancel_In_Add=By.id("cobAddPopUpMvendorCancel");
	static final By First_Record_In_Grid=By.xpath("//*[@id='cobCustMvndrGrid']/div[4]/div[3]/div/div[1]/div[2]");
	static final By Vendor_Select_Icon=By.id("addMvendorSelectICON");
	static final By Vendor_Remove_Button_X= By.id("gridRemoveButton");
	
	/*Pop up after clicking the Vendor_Select_Icon in the Add vendor pop up*/	
	static final By Vendor_Search_In_Browse=By.id("txtSearch");
	static final By First_Vendor_In_Browse_Grid=By.xpath("//*[@id='displayNameGrid']/div[4]/div[3]/div/div[1]/div");
	static final By Vendor_Cancel_In_Browse=By.id("btnCancel");
	static final By Vendor_Select_In_Browse=By.id("btnSelect");
	
	/*Custom Program update*/
	static final By Program_Name_Update_Button=By.id("cobCustPrgmUpdateBtn");
	static final By Existing_Program_Name_Label=By.id("ProgramNameUpdate");
	static final By Program_Name_Update_Text_Box=By.id("cobUpdatePrgmPopupTxtBox");
	static final By Program_Name_Update_Save=By.id("cobUpdatePrgmPopUpSave");
	static final By Program_Name_Update_Cancel=By.id("cobUpdatePrgmPopUpCancel");
	
	/*Custom Program delete*/
	static final By Delete_Checkbox=By.id("0_label");
	static final By Delete_All_Checkbox=By.id("cust_mvndr_chk_all");
	static final By Delete_Button=By.id("cobCustVndrDelBtn");
	static final By Delete_Error_Pop_Up_Yes=By.xpath("//*[@class='modal-dialog']/div[@class='modal-content']/div[3]/div/div/button[2]");
	
	
	
	List<String> MVendor_Num_From_DB = new ArrayList <String>();
	List<String> MVendor_Num_From_UI = new ArrayList <String>();
	List<String> Dept_Num_From_DB = new ArrayList <String>();
	List<String> Dept_Num_From_UI = new ArrayList <String>();
	
	List<String> COR_PGM_ID=new ArrayList <String>();
	
	String popUp_Msg="";
	String vendor_Num_In_Result_Grid="";
	
	String Add_PopUp_Title_From_UI;
	String Add_PopUp_Title_Expected;
	
	String Custom_Program_Text;
	String First_Record_In_Grid_Text;
	
	List<String> Program_Name_In_DB_After_Save = new ArrayList <String>();
	
	boolean Delete_Button_Enable;
	

	
public CommodityOnBoarding_CustomVendorGroup_Page(InstanceContainer ic) {
		 super(ic);       	
	}
	
public void chooseCustomVendorGroupTab()throws Throwable{		
	
	Thread.sleep(1000);		
	wh.clickElement(CustomVendorGroup_Tab);	
	Thread.sleep(1000);
	}
	
public void type_Custom_Program_Name(String Custom_Program_Name)throws Throwable{		
		
			wh.clearElement(CustomProgramName_Text);
		    wh.sendKeys(CustomProgramName_Text, Custom_Program_Name);
			WebElement webElement = driver.findElement(CustomProgramName_Text);
			Thread.sleep(1000);
			webElement.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);			
			webElement.sendKeys(Keys.ENTER);
			wh.clickElement(Search);	
			/*Validating if the warning message is shown when user searches for a custom pgm*/
			wh.waitForPageLoaded();    /*See if this works*/
			if(wh.isElementPresent(Error_PopUp_OK))
			{
			report.addReportStep("The error message user received.",
					      "The error message user received.", 
					       StepResult.PASS);	
			popUp_Msg= driver.findElement(Error_PopUp).getText();			
			wh.clickElement(Error_PopUp_OK);	
			
			}
			else
			report.addReportStep("The user received the data for the search criteria",
					      "The user received the data for the search criteria", 
					       StepResult.PASS);	

	}
	
/* To verify the vendor numbers listed in the result grid when the user searches for a custom program name */
public void verify_Vendors_In_Custom_Program(String Custom_Program_Name)throws Throwable{
		

	COR_PGM_ID=jDBC_Connection.array_Database_Connection("Select COR_PGM_ID from QA1MM.COR_PGM where COR_PGM_DESC='"+Custom_Program_Name+"'");
		/*Removing brackets from the array*/
		String COR_PGM_ID_Text="";
		for (String s : COR_PGM_ID)
		{
			COR_PGM_ID_Text += s + "\t";
		}
		MVendor_Num_From_DB = jDBC_Connection.array_Database_Connection("select MVNDR_NBR from QA1MM.COR_PGM_MVNDR_DC where COR_PGM_ID='"+COR_PGM_ID_Text.trim()+"'");
		if(!MVendor_Num_From_DB.isEmpty())
		{
		for(int i=1;i<=MVendor_Num_From_DB.size();i++)
		{
			String Text=driver.findElement(By.xpath("//*[@id='cobCustMvndrGrid']/div[4]/div[3]/div/div["+i+"]/div[2]")).getText();
			MVendor_Num_From_UI.add(Text);
		}
			if(MVendor_Num_From_DB.equals(MVendor_Num_From_UI))
				report.addReportStep("The vendor numbers in the database and vendor numbers displayed in UI, as part of the custom program'"+Custom_Program_Name+" are same",
						"The vendor numbers in the database and vendor numbers displayed in UI, as part of the custom program'"+Custom_Program_Name+"are same", 
					     StepResult.PASS);	
			else
				report.addReportStep("The vendor numbers in the database and vendor numbers displayed in UI, as part of the custom program'"+Custom_Program_Name+" are different",
						"The vendor numbers in the database and vendor numbers displayed in UI, as part of the custom program'"+Custom_Program_Name+"are different", 
					      StepResult.FAIL);	
			
			/*To check if there are any more rows in the result grid than we expected*/
			
		 int i=MVendor_Num_From_DB.size()+1;		
			try{
			String Text=driver.findElement(By.xpath("//*[@id='cobCustMvndrGrid']/div[4]/div[3]/div/div["+i+"]/div[2]")).getText();
			MVendor_Num_From_UI.add(Text);
			report.addReportStep("There are more vendor numbers displayed in UI than expected, as part of the custom program'"+Custom_Program_Name+"'",
						"There are more vendor numbers displayed in UI than expected, as part of the custom program'"+Custom_Program_Name+"'", 
					     StepResult.FAIL);	
			}catch (Exception ex) {
				
			System.out.println("Expected alert. Checking if there are any more rows in the Custom program vendor list grid than we expected");	
			wh.handleAlert();
		  }	 
		}
		else
		{
		int i=0;
	    i=MVendor_Num_From_DB.size()+1;		
		try{
		String Text=driver.findElement(By.xpath("//*[@id='cobCustMvndrGrid']/div[4]/div[3]/div/div["+i+"]/div[2]")).getText();
		MVendor_Num_From_UI.add(Text);
		report.addReportStep("There are more vendor numbers displayed in UI than expected, as part of the custom program'"+Custom_Program_Name+"'",
					    "There are more vendor numbers displayed in UI than expected, as part of the custom program'"+Custom_Program_Name+"'", 
				         StepResult.FAIL);	
		}catch (Exception ex) {
			
		System.out.println("Expected alert. Checking if there are any more rows in the Custom program vendor list grid than we expected");	
		wh.handleAlert();
	  }	 	
		}
	
	}
	
//	/* To verify the department numbers listed in the result grid when the user searches for a custom program name */
//	public void verify_Department_Of_Vendors_In_Custom_Program(String Custom_Program_Name)throws Throwable{
//		
//		COR_PGM_ID=jDBC_Connection.array_Database_Connection("Select COR_PGM_ID from QA1MM.COR_PGM where COR_PGM_DESC='"+Custom_Program_Name+"'");
//		/*Removing brackets from the array*/
//		String COR_PGM_ID_Text="";
//		for (String s : COR_PGM_ID)
//		{
//			COR_PGM_ID_Text += s + "\t";
//		}
//		Dept_Num_From_DB = jDBC_Connection.array_Database_Connection("select distinct(MER_DEPT_NBR) from QA1MM.COR_PGM_MVNDR_DC where COR_PGM_ID='"+COR_PGM_ID_Text.trim()+"'");
//		
//			report.addReportStep("The department numbers corresponding to in the database and vendor numbers displayed in UI, as part of the custom program'"+Custom_Program_Name+" are same",
//						"The vendor numbers in the database and vendor numbers displayed in UI, as part of the custom program'"+Custom_Program_Name+"are same", 
//					         StepResult.PASS);	
//	
//	}
//	
public void validate_Invalid_Custom_Program_Name_With_Search_Button(String Custom_Program_Name)throws Throwable{
		
		try{			
		/*Vendor num in result grid will throw error as there will be no data. Hence giving in try catch block*/
		popUp_Msg= driver.findElement(Error_PopUp).getText();
		vendor_Num_In_Result_Grid=driver.findElement(Custom_Vendor_Number_Result_Grid).getText();
		
		report.addReportStep("User did not receive the expected error message 'Please select a valid Custom Program ' and also the result grid is empty",
			          "User did not receive the expected error message that 'Please select a valid Custom Program' and also the result grid is empty", 
			           StepResult.FAIL);	
	
		}catch(Throwable t){
			
		if(popUp_Msg.equalsIgnoreCase("Please select a valid Custom Program.") && vendor_Num_In_Result_Grid.isEmpty())
			report.addReportStep("User received the expected error message that 'Please Select a Valid Custom Program' and also the result grid is empty",
					  "User received the expected error message that 'Please Select a Valid Custom Program' and also the result grid is empty", 
					   StepResult.PASS);	
		}

			
	}
	
public void validate_Custom_Program_With_No_Vendors(String Custom_Program_Name) throws Throwable{
		
		try{			
		
			
			/*Verifying that the custom program has no vendors attached to it*/
			COR_PGM_ID=jDBC_Connection.array_Database_Connection("Select COR_PGM_ID from QA1MM.COR_PGM where COR_PGM_DESC='"+Custom_Program_Name+"'");
			/*Removing brackets from the array*/
			String COR_PGM_ID_Text="";
			for (String s : COR_PGM_ID)
			{
				COR_PGM_ID_Text += s + "\t";
			}
			MVendor_Num_From_DB = jDBC_Connection.array_Database_Connection("select MVNDR_NBR from QA1MM.COR_PGM_MVNDR_DC where COR_PGM_ID='"+COR_PGM_ID_Text.trim()+"'");
			
			/*Vendor num is searched to make sure that results grid is blank. Vendor num in result grid will throw error as there will be no data. Hence giving in try catch block*/
			vendor_Num_In_Result_Grid=driver.findElement(Custom_Vendor_Number_Result_Grid).getText();
			
			report.addReportStep("User received the expected error message that 'No records available for the given search criteria' and also the result grid is empty",
					  "User received the expected error message that 'No records available for the given search criteria' and also the result grid is empty", 
					   StepResult.FAIL);	
		
			}catch(Throwable t){
				
			if(popUp_Msg.equalsIgnoreCase("No records available for the given search criteria.") && vendor_Num_In_Result_Grid.isEmpty() && MVendor_Num_From_DB.isEmpty())
				report.addReportStep("User received the expected error message that 'No records available for the given search criteria' and also the result grid is empty",
					  "User received the expected error message that 'No records available for the given search criteria' and also the result grid is empty", 
					   StepResult.PASS);	
		
			}
		
	}
	
public void AddVendors(TableData table) throws Throwable{
		
		wh.clickElement(Add);
		List<Map<String,String>> lstMap = table.asMaps(String.class, String.class);
		int Vendor_size=lstMap.size();
		   for(int i=1;i<=Vendor_size;i++)
	       {
				    	
				String VendorName = lstMap.get(i-1).get("VendorName");
				wh.sendKeys(MVNDR_Text_In_Add, VendorName);
				WebElement webElement = driver.findElement(MVNDR_Text_In_Add);
				Thread.sleep(1000);
				webElement.sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(1000);			
				webElement.sendKeys(Keys.ENTER);
				Thread.sleep(1000);	
				
	       }		
		   		
	

			report.addReportStep("User clicked on the Add button and selected the vendors to be added to the Custom Program",
					  "User clicked on the Add button and selected the vendors to be added to the Custom Program", 
					   StepResult.PASS);	
						
			wh.clickElement(Save_In_add);
			Thread.sleep(1000);
			wh.clickElement(Error_PopUp_OK);
				
	}
		
public void AddDuplicateVendors(TableData table) throws Throwable{
		
		wh.clickElement(Add);
        wh.waitForElementPresent(MVNDR_Text_In_Add);
        List<Map<String,String>> lstMap = table.asMaps(String.class, String.class);  
		wh.sendKeys(MVNDR_Text_In_Add, lstMap.get(0).get("VendorName"));
	//	wh.sendKeys(MVNDR_Text_In_Add, dataTable.getData(DataColumn.Vendor_Name));
		
			WebElement webElement = driver.findElement(MVNDR_Text_In_Add);
			Thread.sleep(1000);
			webElement.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);			
			webElement.sendKeys(Keys.ENTER);
			System.out.println("Trying to add duplicate vendor.Vendor name is "+lstMap.get(0).get("VendorName"));			
			
			Thread.sleep(2000);				
			popUp_Msg= driver.findElement(Error_PopUp).getText();
			if(popUp_Msg.equalsIgnoreCase("Selected vendor is already present in the program. Please choose a different vendor."))
				report.addReportStep("User received the expected error message that 'Selected vendor is already present in the program. Please choose a different vendor.'",
					      "User received the expected error message that 'Selected vendor is already present in the program. Please choose a different vendor.'", 
					       StepResult.PASS);	
			else
				report.addReportStep("User did not receive the expected error message that 'Selected vendor is already present in the program. Please choose a different vendor.'",
					      "User did not receive the expected error message that 'Selected vendor is already present in the program. Please choose a different vendor.'", 
					       StepResult.FAIL);	
			wh.clickElement(Error_PopUp_OK);
			
			/*I think the below code should be deleted*/
			
	//		wh.sendKeys(MVNDR_Text_In_Add, dataTable.getData(3,DataColumn.Vendor_Name));	
			wh.sendKeys(MVNDR_Text_In_Add, lstMap.get(2).get("VendorName"));
			webElement = driver.findElement(MVNDR_Text_In_Add);
			Thread.sleep(1000);
			webElement.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);			
			webElement.sendKeys(Keys.ENTER);
			
			wh.clickElement(Save_In_add);
			wh.clickElement(Error_PopUp_OK);
				
	}

public void verify_Add_Vendor_PopUp_Title_In_UI() throws Throwable{
	    	
	    	wh.clickElement(Add);	
	        wh.waitForElementPresent(Add_Button_Title);
			
			/*checking if add pop up opened and the title of the pop up is as expected*/
		
			Add_PopUp_Title_From_UI=driver.findElement(Add_Button_Title).getText();
			Add_PopUp_Title_Expected="Add New MVNDR to Custom Program";
			System.out.println("The add pop up title from UI is "+Add_PopUp_Title_From_UI);
			System.out.println("The add pop up title expected is "+Add_PopUp_Title_Expected);
			
			if(Add_PopUp_Title_From_UI.equals(Add_PopUp_Title_Expected))
				
			report.addReportStep("The user clicked on add button for adding vendors and a pop up opened. The title of the pop up is as expected",
						"The user clicked on add button for adding vendors and a pop up opened. The title of the pop up is as expected", 
						 StepResult.PASS);
			else
			report.addReportStep("The user clicked on add button for adding vendors and a pop up opened. The title of the pop up is not as expected",
						"The user clicked on add button for adding vendors and a pop up opened. The title of the pop up is not as expected", 
						 StepResult.FAIL); 	
	
	    }

public void clear_Data_In_Custom_Vendor_Group_UI() throws Throwable{
    	
    	wh.clickElement(Clear);
    	Custom_Program_Text=driver.findElement(Add_Button_Title).getText();
    //	First_Record_In_Grid_Text=driver.findElement(First_Record_In_Grid).getText();
    	boolean Anything_Present_In_Grid=wh.isElementPresent(First_Record_In_Grid);
    	if(!Anything_Present_In_Grid && Custom_Program_Text.isEmpty())
    		
    		report.addReportStep("The user clicked on clear button in Custom Vendor Group tab and all the data is cleared",
					"The user clicked on clear button in Custom Vendor Group tab and all the data is cleared", 
					StepResult.PASS);
		else
			report.addReportStep("The user clicked on clear button in Custom Vendor Group tab and all the data is not cleared",
					"The user clicked on clear button in Custom Vendor Group tab and all the data is not cleared", 
					StepResult.FAIL);   	
    	
    }
    
public void select_And_Then_Remove_Vendor_In_Add_Vendor_Pop_Up(TableData table) throws Throwable{
    	
    	wh.clickElement(Add);
        wh.waitForElementPresent(MVNDR_Text_In_Add);
        List<Map<String,String>> lstMap = table.asMaps(String.class, String.class);
    	wh.sendKeys(MVNDR_Text_In_Add, lstMap.get(2).get("VendorName"));
        
        

//		wh.sendKeys(MVNDR_Text_In_Add, dataTable.getData(3,DataColumn.Vendor_Name));
//		
//			WebElement webElement = driver.findElement(MVNDR_Text_In_Add);
//			Thread.sleep(1000);
//			webElement.sendKeys(Keys.ARROW_DOWN);
//			Thread.sleep(1000);			
//			webElement.sendKeys(Keys.ENTER);
			System.out.println("Vendor name is "+lstMap.get(2).get("VendorName"));
			report.addReportStep("User clicked on the Add button and selected a vendor to be added to the Custom Program",
					  "User clicked on the Add button and selected a vendor to be added to the Custom Program", 
					   StepResult.PASS);	
		wh.waitForElementPresent(Vendor_Remove_Button_X);	
    	wh.clickElement(Vendor_Remove_Button_X);
    	wh.clickElement(Save_In_add);	
    	
//    	wh.waitForElementPresent(Error_PopUp);
//    	popUp_Msg= driver.findElement(Error_PopUp).getText();
//    	wh.clickElement(Error_PopUp_OK);
    	
//		if(popUp_Msg.equalsIgnoreCase("Please add a vendor to save!!"))
    	if(!driver.findElement(Save_In_add).isEnabled())
			report.addReportStep("When no vendors are selected, the save button is disabled",
				      "When no vendors are selected, the save button is disabled", 
				         StepResult.PASS);	
		else
			report.addReportStep("When no vendors are selected, the save button is not disabled",
				      "When no vendors are selected, the save button is not disabled", 
				         StepResult.FAIL);
		wh.clickElement(Cancel_In_Add);
    	
    }
 
public void select_Vendor_From_Add_Vendor_Pop_Up_List() throws Throwable{
  	
	  wh.clickElement(Add);
      wh.waitForElementPresent(MVNDR_Text_In_Add);
      wh.clickElement(Vendor_Select_Icon);
      wh.waitForElementPresent(Vendor_Search_In_Browse);
      wh.clickElement(First_Vendor_In_Browse_Grid);
      wh.clickElement(Vendor_Select_In_Browse);
      wh.waitForElementPresent(Save_In_add);
      wh.clickElement(Save_In_add);
      popUp_Msg= driver.findElement(Error_PopUp).getText();
      wh.clickElement(Error_PopUp_OK);
      if(popUp_Msg.equalsIgnoreCase("Vendors saved succesfully."))
			report.addReportStep("User received the expected error message 'Vendors saved succesfully.'",
				      "User received the expected error message 'Vendors saved succesfully.'", 
				       StepResult.PASS);	
	  else
			report.addReportStep("User did not receive the expected error message 'Vendors saved succesfully.'",
				      "User did not receive the expected error message 'Vendors saved succesfully.'", 
				       StepResult.FAIL); 	
      
}
  
public void select_Vendor_From_Add_Vendor_Pop_Up_List_Using_Search(TableData table) throws Throwable{
  	
	  wh.clickElement(Add);
      wh.waitForElementPresent(MVNDR_Text_In_Add);
      wh.clickElement(Vendor_Select_Icon);
      wh.waitForElementPresent(Vendor_Search_In_Browse);
      List<Map<String,String>> lstMap = table.asMaps(String.class, String.class);
      wh.sendKeys(Vendor_Search_In_Browse, lstMap.get(0).get("VendorName"));
      
   //   wh.sendKeys(Vendor_Search_In_Browse, dataTable.getData(1,DataColumn.Vendor_Name));
      Thread.sleep(3000);
      wh.clickElement(First_Vendor_In_Browse_Grid);
      wh.clickElement(Vendor_Select_In_Browse);
      wh.waitForElementPresent(Save_In_add);
      wh.clickElement(Save_In_add);
      popUp_Msg= driver.findElement(Error_PopUp).getText();
      wh.clickElement(Error_PopUp_OK);
      if(popUp_Msg.equalsIgnoreCase("Vendors saved succesfully."))
			report.addReportStep("User received the expected error message 'Vendors saved succesfully.'",
				      "User received the expected error message 'Vendors saved succesfully.'", 
				       StepResult.PASS);	
	  else
			report.addReportStep("User did not receive the expected error message 'Vendors saved succesfully.'",
				      "User did not receive the expected error message 'Vendors saved succesfully.'", 
				       StepResult.FAIL);  	
      
}
  
public void Cancel_Vendor_From_Add_Vendor_Pop_Up_List(TableData table) throws Throwable{
	  	
	  wh.clickElement(Add);
      wh.waitForElementPresent(MVNDR_Text_In_Add);
      wh.clickElement(Vendor_Select_Icon);
      wh.waitForElementPresent(Vendor_Search_In_Browse);
      List<Map<String,String>> lstMap = table.asMaps(String.class, String.class);
      wh.sendKeys(Vendor_Search_In_Browse, lstMap.get(0).get("VendorName"));
      
   //   wh.sendKeys(Vendor_Search_In_Browse, dataTable.getData(1,DataColumn.Vendor_Name));
      Thread.sleep(3000);
      wh.clickElement(First_Vendor_In_Browse_Grid);
      wh.clickElement(Vendor_Cancel_In_Browse); 
      
  	 	
//  	wh.waitForElementPresent(Error_PopUp);
//  	popUp_Msg= driver.findElement(Error_PopUp).getText();
//  	wh.clickElement(Error_PopUp_OK);
  	
//		if(popUp_Msg.equalsIgnoreCase("Please add a vendor to save!!"))
  	if(!driver.findElement(Save_In_add).isEnabled())
			report.addReportStep("When no vendors are selected, the save button is disabled",
				      "When no vendors are selected, the save button is disabled", 
				       StepResult.PASS);	
	else
			report.addReportStep("When no vendors are selected, the save button is not disabled",
				      "When no vendors are selected, the save button is not disabled", 
				       StepResult.FAIL);
      wh.clickElement(Cancel_In_Add);
  	
      
}

public void Update_Pop_Up_Open(String Custom_Program_Name) throws Throwable{
	
	  wh.waitForElementPresent(CustomProgramName_Text);
	  wh.clearElement(CustomProgramName_Text);
	  wh.sendKeys(CustomProgramName_Text, Custom_Program_Name);
	  WebElement webElement = driver.findElement(CustomProgramName_Text);
	  Thread.sleep(1000);
	  webElement.sendKeys(Keys.ARROW_DOWN);
	  Thread.sleep(1000);			
	  webElement.sendKeys(Keys.ENTER);
	  Thread.sleep(1000);
	  wh.clickElement(Program_Name_Update_Button);  
	  if(wh.isElementPresent(Program_Name_Update_Text_Box))
		  report.addReportStep("The update program name pop up is opened'",
			      "The update program name pop up is opened", 
			       StepResult.PASS);	
	  else
		  report.addReportStep("The update program name pop up is not opened",
			      "The update program name pop up is not opened", 
			       StepResult.FAIL);  
	  
}

public void Save_Updated_Custom_Program_Name(String New_Custom_Program_Name) throws Throwable{
	wh.sendKeys(Program_Name_Update_Text_Box, New_Custom_Program_Name);
	wh.clickElement(Program_Name_Update_Save);
	popUp_Msg= driver.findElement(Error_PopUp).getText();
    
    if(popUp_Msg.equalsIgnoreCase("Custom program name updated succesfully."))
			report.addReportStep("User received the expected error message 'Updated Custom Program name saved succesfully.'",
				      "User received the expected error message 'Updated Custom Program name saved succesfully.'", 
				       StepResult.PASS);	
	else
			report.addReportStep("User did not receive the expected error message 'Updated Custom Program name saved succesfully.'",
				      "User did not receive the expected error message 'Updated Custom Program name saved succesfully.'", 
				       StepResult.FAIL);
    wh.clickElement(Error_PopUp_OK);
 
    /*Checking if the result grid is empty after saving the new program name*/
      try{
		String Text=driver.findElement(By.xpath("//*[@id='cobCustMvndrGrid']/div[4]/div[3]/div/div[1]/div[2]")).getText();
		MVendor_Num_From_UI.add(Text);
		report.addReportStep("The result grid is not cleared after saving the updated program name",
					"The result grid is not cleared after saving the updated program name", 
				     StepResult.FAIL);	
		}catch (Exception ex) {
			
		System.out.println("Expected alert. Checking if the result grid is cleared after saving the updated program name");	
		wh.handleAlert();
	  }	   
	
}

public void Validate_Updated_Custom_Program_In_Dropdown(String New_Custom_Program_Name) throws Throwable{
	
	  wh.sendKeys(CustomProgramName_Text, New_Custom_Program_Name);
	  WebElement webElement = driver.findElement(CustomProgramName_Text);
	  Thread.sleep(1000);
	  webElement.sendKeys(Keys.ARROW_DOWN);
	  Thread.sleep(1000);			
	  webElement.sendKeys(Keys.ENTER);
	  Thread.sleep(1000);
	  wh.clickElement(Search);
	  if(wh.isElementPresent(Error_PopUp))
		  report.addReportStep("The updated custom program name is not available in the drop down",
			      "The updated custom program name is not available in the drop down", 
			       StepResult.FAIL);	
      else
		report.addReportStep("The updated custom program name is available in the drop down",
			      "The updated custom program name is available in the drop down", 
			       StepResult.PASS);
	//  wh.clickElement(Error_PopUp_OK);
	
}

public void Click_On_Update_Without_Entering_Custom_Program_Name() throws Throwable{
	
	 wh.clickElement(Program_Name_Update_Button); 
	 Thread.sleep(1000);
	 popUp_Msg= driver.findElement(Error_PopUp).getText();
	 Thread.sleep(1000);
	    wh.clickElement(Error_PopUp_OK);
	    if(popUp_Msg.equalsIgnoreCase("Please select a valid program to update."))
				report.addReportStep("User received the expected error message 'Please select a valid program to update.'",
					      "User received the expected error message 'Please select a valid program name to update.'", 
					       StepResult.PASS);	
		else
				report.addReportStep("User did not receive the expected error message 'Please select a valid program to update.'",
					      "User did not receive the expected error message 'Please select a valid program name to update.'", 
					       StepResult.FAIL);
}

public void Update_With_Existing_Custom_Program_Name(String Existing_Custom_Program_Name) throws Throwable{
	
	wh.sendKeys(Program_Name_Update_Text_Box, Existing_Custom_Program_Name);
	wh.clickElement(Program_Name_Update_Save);
	Thread.sleep(1000);
	popUp_Msg= driver.findElement(Error_PopUp).getText();    
    if(popUp_Msg.equalsIgnoreCase("Update failed due to already existing program name."))
			report.addReportStep("User received the expected error message 'Update failed due to already existing program name.'",
				      "User received the expected error message 'Update failed due to already existing program name.'", 
				       StepResult.PASS);	
	else
			report.addReportStep("User did not receive the expected error message 'Update failed due to already existing program name'",
				      "User did not receive the expected error message 'Update failed due to already existing program name'", 
				       StepResult.FAIL);
    wh.clickElement(Error_PopUp_OK);
	
}

public void Save_Updated_Custom_Program_Name_With_Length_50(String New_Custom_Program_Name_With_Length_50) throws Throwable{
	
	wh.sendKeys(Program_Name_Update_Text_Box, New_Custom_Program_Name_With_Length_50);
	wh.clickElement(Program_Name_Update_Save);
	Thread.sleep(1000);
	popUp_Msg= driver.findElement(Error_PopUp).getText();    
    if(popUp_Msg.equalsIgnoreCase("Updated Custom Program name saved succesfully."))
			report.addReportStep("User received the expected error message 'Updated Custom Program name saved succesfully' and the custom program name with length 50 is saved",
				      "User received the expected error message 'Updated Custom Program name saved succesfully.' and the custom program name with length 50 is saved", 
				       StepResult.PASS);	
	else
			report.addReportStep("User did not receive the expected error message 'Updated Custom Program name saved succesfully.' and the custom program name with length 50 is not saved",
				      "User did not receive the expected error message 'Updated Custom Program name saved succesfully.' and the custom program name with length 50 is not saved", 
				       StepResult.FAIL);
    wh.clickElement(Error_PopUp_OK);
 
    /*Checking if the result grid is empty after saving the new program name*/
      try{
		String Text=driver.findElement(By.xpath("//*[@id='cobCustMvndrGrid']/div[4]/div[3]/div/div[1]/div[2]")).getText();
		MVendor_Num_From_UI.add(Text);
		report.addReportStep("The result grid is not cleared after saving the updated program name",
					"The result grid is not cleared after saving the updated program name", 
				     StepResult.FAIL);	
		}catch (Exception ex) {
			
		System.out.println("Expected alert. Checking if the result grid is cleared after saving the updated program name");	
		wh.handleAlert();
	  }	   
      
      Program_Name_In_DB_After_Save=jDBC_Connection.array_Database_Connection("SELECT COR_PGM_DESC from QA1MM.COR_PGM where COR_PGM_DESC='"+New_Custom_Program_Name_With_Length_50+"'");
      /*Removing brackets from the array*/
		String Program_ID_From_DB_Text="";
		for (String s : Program_Name_In_DB_After_Save)
		{
			Program_ID_From_DB_Text += s + "\t";
		} 
      
      if(Program_ID_From_DB_Text.equals(New_Custom_Program_Name_With_Length_50))
    	  report.addReportStep("Verified that the custom program name with length 50 is saved",
			      "Verified that the custom program name with length 50 is saved", 
			       StepResult.PASS);	
      else
		  report.addReportStep("Verified that the custom program name with length 50 is not saved",
			      "Verified that the custom program name with length 50 is not saved", 
			       StepResult.FAIL);      
}

public void validate_Invalid_Custom_Program_Name_With_Update_Button(String Invalid_Custom_Program_Name)throws Throwable{
	
	wh.clearElement(CustomProgramName_Text);
    wh.sendKeys(CustomProgramName_Text, Invalid_Custom_Program_Name);
	WebElement webElement = driver.findElement(CustomProgramName_Text);
	Thread.sleep(1000);
	webElement.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(1000);			
	webElement.sendKeys(Keys.ENTER);
	wh.clickElement(Program_Name_Update_Button);	
	/*Validating if the warning message is shown when user searches for a custom pgm*/
	wh.waitForPageLoaded();    /*See if this works*/
	if(wh.isElementPresent(Error_PopUp_OK))
	{
	popUp_Msg= driver.findElement(Error_PopUp).getText();			
	wh.clickElement(Error_PopUp_OK);	
	}
	
	try{			
	
	vendor_Num_In_Result_Grid=driver.findElement(Custom_Vendor_Number_Result_Grid).getText();
	          report.addReportStep("The result grid is not empty",
				      "The result grid is not empty", 
				       StepResult.FAIL);		

	}catch(Throwable t){
		
	if(popUp_Msg.equalsIgnoreCase("Please select a valid program name to update.") && vendor_Num_In_Result_Grid.isEmpty())
		     report.addReportStep("User received the expected error message that 'Please select a valid program name to update' and also the result grid is empty.",
				        "User received the expected error message that 'Please select a valid program name to update.' and also the result grid is empty", 
				         StepResult.PASS);	
	}

		
}

public void Validate_Spcl_chara_Not_Allowed_In_Update(String New_Custom_Program_Name_with_Special_Chara) throws Throwable{
	
	wh.sendKeys(Program_Name_Update_Text_Box, New_Custom_Program_Name_with_Special_Chara);
	wh.clickElement(Program_Name_Update_Save);
	Thread.sleep(1000);
	popUp_Msg= driver.findElement(Error_PopUp).getText();    
    if(popUp_Msg.equalsIgnoreCase("Please provide the new program name to update."))
			report.addReportStep("User received the expected error message 'Please provide the new program name to update.' which means that the update field did not accept special characters",
				      "User received the expected error message 'Please provide the new program name to update' which means that the update field did not accept special characters", 
				       StepResult.PASS);	
	else
			report.addReportStep("User did not receive the expected error message 'Please provide the new program name to update.' which means that the update field did not accept special characters",
				      "User did not receive the expected error message 'Please provide the new program name to update' which means that the update field did not accept special characters", 
				       StepResult.FAIL);
    wh.clickElement(Error_PopUp_OK);
}

public void Validate_Delete_Vendor_From_CustomProgram() throws Throwable{	
	
	Delete_Button_Enable=driver.findElement(Delete_Button).isEnabled();
	if(!Delete_Button_Enable)
	         report.addReportStep("The delete button is disabled when no vendors are selected",
			           "The delete button is disabled when no vendors are selected", 
			            StepResult.PASS);
    else
             report.addReportStep("The delete button is enabled even when no vendors are selected",
    			        "The delete button is enabled even when no vendors are selected", 
    			         StepResult.FAIL);
	
	wh.clickElement(Delete_Checkbox);
	Delete_Button_Enable=driver.findElement(Delete_Button).isEnabled();
	if(Delete_Button_Enable)
	         report.addReportStep("The delete button is enabled when vendors are selected",
				        "The delete button is enabled when vendors are selected", 
				         StepResult.PASS);
	else
	         report.addReportStep("The delete button is disabled even after vendors are selected",
	    		         "The delete button is disabled even after vendors are selected", 
	    		          StepResult.FAIL);
	
	wh.clickElement(Delete_Button);
	wh.waitForElementPresent(Delete_Error_Pop_Up_Yes);
	Thread.sleep(1000);
	popUp_Msg= driver.findElement(Error_PopUp).getText();  
	if(popUp_Msg.equals("Are you sure you want to delete the selected vendor(s) from the custom program?"))
	          report.addReportStep("User received the expected error message 'Are you sure you want to delete the selected vendor(s) from the custom program?'",
			            "User received the expected error message 'Are you sure you want to delete the selected vendor(s) from the custom program?'", 
			             StepResult.PASS);	
    else
	          report.addReportStep("User did not receive the expected error message 'Are you sure you want to delete the selected vendor(s) from the custom program?'",
			            "User did not receive the expected error message 'Are you sure you want to delete the selected vendor(s) from the custom program?'", 
			             StepResult.FAIL);
	
	Thread.sleep(1000);
	wh.clickElement(Delete_Error_Pop_Up_Yes);
	Thread.sleep(1000);
	wh.clickElement(Error_PopUp_OK);
	report.addReportStep("Selected vendor is deleted from the custom program",
		                 "Selected vendor is deleted from the custom program", 
		                  StepResult.PASS);	
}


public void Validate_Delete_All_Vendor_From_CustomProgram() throws Throwable{
	
	wh.clickElement(Delete_All_Checkbox);
	wh.clickElement(Delete_Button);
	wh.waitForElementPresent(Delete_Error_Pop_Up_Yes);
	Thread.sleep(1000);
	popUp_Msg= driver.findElement(Error_PopUp).getText();  
	if(popUp_Msg.equals("Are you sure you want to delete the selected vendor(s) from the custom program?"))
	             report.addReportStep("User received the expected error message 'Are you sure you want to delete the selected vendor(s) from the custom program?'",
			              "User received the expected error message 'Are you sure you want to delete the selected vendor(s) from the custom program?'", 
			               StepResult.PASS);	
    else
	             report.addReportStep("User did not receive the expected error message 'Are you sure you want to delete the selected vendor(s) from the custom program?'",
			               "User did not receive the expected error message 'Are you sure you want to delete the selected vendor(s) from the custom program?'", 
			                StepResult.FAIL);
	
	Thread.sleep(1000);
	wh.clickElement(Delete_Error_Pop_Up_Yes);
	Thread.sleep(1000);
	wh.clickElement(Error_PopUp_OK);
	             report.addReportStep("Selected vendor is deleted from the custom program",
                            "Selected vendor is deleted from the custom program", 
                             StepResult.PASS);
}


}