package com.homer.po;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.homer.dao.InstanceContainer;
import com.homer.dao.TableData;
import com.homer.enums.EnumClass.StepResult;


public class CommodityOnBoardingMVNDRPage extends PageBase<CommodityOnBoardingMVNDRPage> {
	
	static final By MVNDR_Tab =By.xpath("//*[@id='tabsCOB']/ul/li[1]/a");
	static final By VendorNumber_Text=By.id("cobVendorNbrTxtBox");
	static final By Department_Text=By.id("cobDeptNbrTxtBox");
	static final By VendorName_Text=By.id("cobVendorNameTxtBox");
	static final By CustomProgramName_Text=By.id("cobCoustomMvendorTxtBox");
	static final By Search_Button=By.id("cobMvndrSearchBtn");
	static final By Add_Button=By.id("cobVndrAddBtn");
	static final By Add_Button_Title=By.xpath("//*[@id='ui-id-7']");
	static final By Edit_Button=By.id("cobVndrEditBtn");
	static final By Clear_Button=By.id("cobVndrClearBtn");	
	static final By Delete_Button=By.id("cobVndrCustPgmDelBtn");
	static final By ProgramName_Text_PopUp=By.id("cobAddPopupTxtBox");
	static final By Save_Button_PopUp=By.id("cobAddPopUpSave");
	static final By Cancel_Button_PopUp=By.id("cobAddPopUpCancel");
	static final By Error_PopUp=By.xpath("//*[@class='modal-dialog']/div[@class='modal-content']/div[@class='modal-body']/div[@class='bootstrap-dialog-body']");
	static final By Error_PopUp_OK=By.xpath("//*[@class='modal-dialog']/div[@class='modal-content']/div[3]/div/div/button");
	static final By Error_PopUp_Yes=By.xpath("//*[@class='modal-dialog']/div[@class='modal-content']/div[3]/div/div/button[2]");
	static final By Error_PopUp_X=By.xpath("//*[@class='modal-dialog']/div[@class='modal-content']/div/div/div");
	static final By Edit_PopUp_Title=By.id("ui-id-70");
	static final By Dept_Mouse_Over=By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div/div[3]/div");
    static final By Pgm_ID_First_Row=By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[1]");
    
    /*Edit pop up*/
    static final By Edit_Expand_Arrow=By.xpath("//*[@id='cobEditTreePopup']/div[4]/div[3]/div/div/div/span[1]");
    static final By Edit_Expand_Parent_Arrow=By.xpath("//*[@id='cobCustPgmEditTreePopup']/div[4]/div[3]/div/div[1]/div/span[1]");
    static final By Edit_Expand_Sub_Parent_Arrow=By.xpath("//*[@id='cobCustPgmEditTreePopup']/div[4]/div[3]/div/div[2]/div/span[1]");
    static final By Edit_Clear_Button=By.id("cobEditPopUpClearBtn");
    static final By Edit_Save_Button=By.id("cobEditPopUpSave");
    static final By Edit_CP_Save_Button=By.id("cobCustPgmEditPopUpSave");
    static final By Edit_Cancel_Button=By.id("cobEditPopUpCancel");
    static final By Edit_Expand_Urban=By.xpath("//*[@id='cobEditTreePopup']/div[4]/div[3]/div/div[10]/div/span[1]");
    static final By Edit_Choose_Market1_Urban=By.id("24_340_child");
    static final By Edit_Choose_Market2_Urban=By.id("24_373_child");
    static final By Edit_Choose_Market3_Urban=By.id("24_374_child");
    static final By Edit_Choose_Market4_Urban=By.id("24_503_child");
    static final By Edit_Expand_Ebusiness=By.xpath("//*[@id='cobEditTreePopup']/div[4]/div[3]/div/div[11]/div/span[1]");
    static final By Edit_Choose_Market1_Ebusiness=By.id("156_label");
    static final By Edit_Choose_Market2_Ebusiness=By.id("157_label");
    static final By Edit_Choose_Common_BYO_1=By.id("24_custProgParent");
    static final By Edit_Choose_Common_Market_1=By.id("373_custProgSubParent");
    String Edit_Choose_Common_Market_1_Mkt_Num= "373_custProgSubParent";
    String[] Edit_Choose_Common_Market_1_Mkt_Num_Parts=new String[1];
    static final By Edit_Choose_Common_Market_2=By.id("374_custProgSubParent");
    String Edit_Choose_Common_Market_2_Mkt_Num= "374_custProgSubParent";
    String[] Edit_Choose_Common_Market_2_Mkt_Num_Parts=new String[1];
    
    /*Stores*/
    static final By Edit_Expand_Southeast=By.xpath("//*[@id='cobEditTreePopup']/div[4]/div[3]/div/div[2]/div/span[1]");
    static final By Edit_Expand_Market1_Southeast=By.xpath("//*[@id='cobEditTreePopup']/div[4]/div[3]/div/div[3]/div/span[1]");
    String Edit_Expand_Market1_Southeast_Mkt_Num= "1_custProgSubParent";
    String[] Edit_Expand_Market1_Southeast_Mkt_Num_Parts=new String[1];
    static final By Edit_Choose_Store1_Atlanta=By.id("0_label");
    static final By Edit_Choose_Store2_Atlanta=By.id("1_label");
    static final By Edit_Choose_Store3_Atlanta=By.id("2_label");
    static final By Edit_Choose_Store4_Atlanta=By.id("3_label");
    static final By Edit_Choose_Atlanta=By.id("1_custProgSubParent");
    static final By Edit_Choose_Common_Store_1=By.id("'0_custProglabel");
    static final By Edit_Choose_Common_Store_2=By.id("'1_custProglabel");
   

     
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
    
    
	String popUp_Msg="";
	boolean Before_Save;
	boolean After_Save;
	boolean presence;
	List<String> Program_Name_In_DB_Before_Save = new ArrayList <String>();	
	List<String> Program_Name_In_DB_After_Save = new ArrayList <String>();
	List<String> Program_Name_In_DB_After_Cancel = new ArrayList <String>();
	List<String> Custom_Program_Flag_In_DB_After_Save = new ArrayList <String>();
	
	List<String> Program_ID_From_DB = new ArrayList <String>();
	List<String> Vendors_In_A_Program_From_DB = new ArrayList <String>();
	List<String> Last_Update_User_ID_From_DB = new ArrayList <String>();
	List<String> Last_Update_TS_From_DB = new ArrayList <String>();
	List<String> Result_Grid_From_DB = new ArrayList <String>();
	List<String> Result_Grid_From_UI = new ArrayList <String>();
	
	
	String Program_ID_From_UI;
	String Vendor_Num_From_UI;
	String Vendor_Num_From_DB;
	String Dept_Num_From_UI;
	String Dept_Num_From_DB;
	String Vendor_Or_Program_Name_From_UI;
	String Last_Update_User_ID_From_UI;
	String Last_Update_TS_From_UI;
	String Commodity_Flag_From_UI;
	String Commodity_Flag_From_DB;
	String Custom_Program_Flag_From_UI;
	String Custom_Program_Flag_From_DB;
	String Search_Disable_Vendor_Number;
	String Search_Disable_Vendor_Name;
	String Search_Disable_Department;
	String Search_Disable_Custom_Program;
	
	List<String> Markets_In_A_Vendor_From_DB = new ArrayList <String>();
	List<String> Department_Of_A_Vendor_From_DB = new ArrayList <String>();	
	List<String> Vendor_Or_Program_Name_From_DB = new ArrayList <String>();
	List<String> Vendor_Details_From_DB = new ArrayList <String>();
	
	String Vendor_Name_From_UI_Text_Box;
	String Edit_PopUp_Title_From_UI;
	String Edit_PopUp_Title_Expected;
	
	String Invalid_Search_Error_Msg_Expected;
	String Invalid_Search_Error_Msg_From_UI;
	String Department_Of_A_Vendor_From_UI_MouseOver;
	
	String Add_PopUp_Title_From_UI;
	String Add_PopUp_Title_Expected;
	
	String Last_Update_TS_From_UI_Before_Save;
	String Last_Update_TS_From_UI_After_Save;
	
	List<String> Common_Markets_Expected_From_UI = new ArrayList <String>(); 
	List<String> Common_Markets_Actual_From_UI = new ArrayList <String>(); 
	List<String> Store_Grp_ID_Of_Mkts_Using_MktNum = new ArrayList <String>();
	List<String> Store_Grp_ID_Of_Mkts_From_StrGrpPgm = new ArrayList <String>();
	List<String> Store_Grp_ID_Of_Mkts_From_StrGrpStr = new ArrayList <String>();
	List<String> Store_Grp_ID_Of_Mkts_Saved_In_Custom_Pgm = new ArrayList <String>();
	List<String> Store_Grp_ID_Of_Mkts_Left_In_Master_Pgm_After_Onboarding = new ArrayList <String>();
	
	List<String> Common_Stores_Expected_From_UI = new ArrayList <String>();
	List<String> Common_Stores_Actual_From_UI = new ArrayList <String>(); 
	List<String> Store_Num_From_StrGrpStr = new ArrayList <String>(); 
	
	
	
	
	public CommodityOnBoardingMVNDRPage(InstanceContainer ic) {
		 super(ic);       	
	}
	
	
	public void chooseMVNDRTab()throws Throwable{
		
	  wh.clickElement(MVNDR_Tab);
	  Thread.sleep(2000);
	    
	}
	
	
    public void type_ProgramName_In_UI_And_Proceed_To_Add_Vendor_Screen(String Custom_Program_Name) throws Throwable{    	
    			
		Program_Name_In_DB_Before_Save = jDBC_Connection.array_Database_Connection("SELECT COR_PGM_ID,COR_PGM_DESC from QA1MM.COR_PGM where COR_PGM_DESC='"+Custom_Program_Name+"-CP'");
		if(!Program_Name_In_DB_Before_Save.isEmpty())
		{
		 Before_Save=false;
		 System.out.println("Program name exists in database before saving and it is "+Program_Name_In_DB_Before_Save);
		}
		else			
	    Before_Save=true;
		
    	wh.clickElement(Add_Button);
		wh.sendKeys(ProgramName_Text_PopUp, Custom_Program_Name);
		wh.clickElement(Save_Button_PopUp);	
		Thread.sleep(1000);
		report.addReportStep("User is able to type in the program name",
			      "User is able to type in the program name", 
			         StepResult.PASS);	
		if(wh.isElementPresent(Error_PopUp))	
		{
			report.addReportStep("An error message poped up",
				      "An error message poped up", 
				      StepResult.FAIL);	
		popUp_Msg= driver.findElement(Error_PopUp).getText();
		wh.clickElement(Error_PopUp_OK);
		}
		
		/* commented on dec 5
		else if(wh.isElementPresent(MVNDR_Text_In_Add))
	    AddVendorsThruMVNDR(table);	
		Verify_CommonMarkets(Custom_Program_Name);
		Save_CommonMarket_And_Verify_In_DB(Custom_Program_Name);   */
    	
    }
    
    
    public void type_ProgramName_In_UI_And_Verify_Error_Msg(String Custom_Program_Name) throws Throwable{    	
		
		Program_Name_In_DB_Before_Save = jDBC_Connection.array_Database_Connection("SELECT COR_PGM_ID,COR_PGM_DESC from QA1MM.COR_PGM where COR_PGM_DESC='"+Custom_Program_Name+"-CP'");
		if(!Program_Name_In_DB_Before_Save.isEmpty())
		{
		 Before_Save=false;
		 System.out.println("Program name exists in database before saving and it is "+Program_Name_In_DB_Before_Save);
		}
		else			
	    Before_Save=true;
		
    	wh.clickElement(Add_Button);
		wh.sendKeys(ProgramName_Text_PopUp, Custom_Program_Name);
		wh.clickElement(Save_Button_PopUp);	
		Thread.sleep(1000);
		report.addReportStep("User is able to type in the program name",
			      "User is able to type in the program name", 
			         StepResult.PASS);	
		if(wh.isElementPresent(Error_PopUp))	
		{
		popUp_Msg= driver.findElement(Error_PopUp).getText();
		wh.clickElement(Error_PopUp_OK);
		}
		
		/* commented on dec 5
		else if(wh.isElementPresent(MVNDR_Text_In_Add))
	    AddVendorsThruMVNDR(table);	
		Verify_CommonMarkets(Custom_Program_Name);
		Save_CommonMarket_And_Verify_In_DB(Custom_Program_Name);   */
    	
    }
public void AddVendorsThruMVNDR(TableData table) throws Throwable{
		
		
        wh.waitForElementPresent(MVNDR_Text_In_Add);
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
//		wh.sendKeys(MVNDR_Text_In_Add, dataTable.getData(DataColumn.Vendor_Name));
//		
//			WebElement webElement = driver.findElement(MVNDR_Text_In_Add);
//			Thread.sleep(1000);
//			webElement.sendKeys(Keys.ARROW_DOWN);
//			Thread.sleep(1000);			
//			webElement.sendKeys(Keys.ENTER);
//			Thread.sleep(1000);	
//			System.out.println("Vendor name is "+dataTable.getData(DataColumn.Vendor_Name));
//			

			report.addReportStep("User clicked on the Add button and selected the vendors to be added to the Custom Program",
					  "User clicked on the Add button and selected the vendors to be added to the Custom Program", 
					   StepResult.PASS);	
						
			wh.clickElement(Save_In_add);
			Thread.sleep(1000);
			if(wh.isElementPresent(Error_PopUp))	
			{
			popUp_Msg= driver.findElement(Error_PopUp).getText();
			report.addReportStep("An unexpected error message poped up and it says "+popUp_Msg,
					  "An unexpected error message poped up and it says "+popUp_Msg, 
					   StepResult.FAIL);
			wh.clickElement(Error_PopUp_OK);
			}
				
	}
		
public void AddDuplicateVendorsThruMVNDR(TableData table) throws Throwable{
		

        wh.waitForElementPresent(MVNDR_Text_In_Add);
        List<Map<String,String>> lstMap = table.asMaps(String.class, String.class);  
      	wh.sendKeys(MVNDR_Text_In_Add, lstMap.get(0).get("VendorName"));
	
		
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
			
		
			wh.sendKeys(MVNDR_Text_In_Add, lstMap.get(2).get("VendorName"));
			webElement = driver.findElement(MVNDR_Text_In_Add);
			Thread.sleep(1000);
			webElement.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);			
			webElement.sendKeys(Keys.ENTER);
			
			wh.clickElement(Save_In_add);
			wh.clickElement(Error_PopUp_OK);			
				
	}
    
    
public void Save_EmptyProgramName_In_UI() throws Throwable{    	
	report.addReportStep("going to click",
		      "going to click", 
		         StepResult.PASS);		
	wh.waitForElementPresent(Add_Button);
		Thread.sleep(2000);
		wh.clickElement(Add_Button);
		Thread.sleep(3000);
		report.addReportStep("Add custom pgm pop up opened",
			      "Add custom pgm pop up opened", 
			         StepResult.PASS);	
		Thread.sleep(1000);
		wh.clickElement(Save_Button_PopUp);	
		Thread.sleep(1000);
		wh.waitForElementPresent(Error_PopUp);
		popUp_Msg= driver.findElement(Error_PopUp).getText();
		if(popUp_Msg.equalsIgnoreCase("Please enter the custom program name."))
			report.addReportStep("User received the expected error message that 'Please enter the custom program name.'",
				      "User received the expected error message that 'Please enter the custom program name.'", 
				         StepResult.PASS);	
		else
			report.addReportStep("User did not receive the expected error message that 'Please enter the custom program name.'",
				      "User did not receive the expected error message that 'Please enter the custom program name.'", 
				         StepResult.FAIL);	
    }
    
    
public void EnterProgramName_Click_Cancel_In_UI(String Custom_Program_Name) throws Throwable{    	
		
		wh.clickElement(Add_Button);
		wh.sendKeys(ProgramName_Text_PopUp, Custom_Program_Name);
		report.addReportStep("User is able to type in the program name",
			      "User is able to type in the program name", 
			         StepResult.PASS);	
		wh.clickElement(Cancel_Button_PopUp);			
	    if(!(wh.isElementPresent(Cancel_Button_PopUp)))
			report.addReportStep("User enterd program name and clicked cancel. The pop is closed",
				      "User enterd program name and clicked cancel. The pop is closed", 
				         StepResult.PASS);		
	    else
	    	report.addReportStep("User enterd program name and clicked cancel. The pop is not closed",
				      "User enterd program name and clicked cancel. The pop is not closed", 
				         StepResult.FAIL);	
	    	
	    Program_Name_In_DB_After_Cancel=jDBC_Connection.array_Database_Connection("SELECT COR_PGM_ID,COR_PGM_DESC from QA1MM.COR_PGM where COR_PGM_DESC='"+Custom_Program_Name+"-CP'");
    	if(Program_Name_In_DB_After_Cancel.isEmpty())
    		report.addReportStepNoScreenshots("User enterd program name and clicked cancel. The pop is closed and the entered program name is not saved into the database",
				      "User enterd program name and clicked cancel.The pop is closed and the entered program name is not saved into the database", 
				         StepResult.PASS);	
    	else
    		report.addReportStepNoScreenshots("User enterd program name and clicked cancel. The pop is closed but the entered program name is saved into the database",
				      "User enterd program name and clicked cancel.The pop is closed but the entered program name is  saved into the database", 
				         StepResult.FAIL);		
    		
    }
    
    
public void saveProgramName_In_DB(String Custom_Program_Name){
		
		try{		
					
			if(popUp_Msg.equalsIgnoreCase("Onboarding failed due to already existing programe name."))
			{
				Program_Name_In_DB_After_Save=jDBC_Connection.array_Database_Connection("SELECT COR_PGM_ID,COR_PGM_DESC from QA1MM.COR_PGM where COR_PGM_DESC='"+Custom_Program_Name+"-CP'");
				
				if(Program_Name_In_DB_After_Save.equals(Program_Name_In_DB_Before_Save))
				After_Save=false;
				else
				After_Save=true;
				if(!Before_Save)
				{
					if(!After_Save)				
					{	
			            	report.addReportStep("The Program name is not saved to database because the program name already exists",
							      "The program name is not saved to database because the program name already exists", 
							         StepResult.PASS);	
					        System.out.println("The program name is not saved to database because the program name already exists");
					}
				     else
				     {
				          	report.addReportStep("The Program name is not saved to database because the program name already exists",
							      "The program name is saved to database although it is duplicate", 
							        StepResult.FAIL);	
					        System.out.println("The program name is saved to database although it is duplicate");
				     }
				}
			}
				else if(popUp_Msg.equalsIgnoreCase("Custom Program name saved succesfully."))
				{
					Program_Name_In_DB_After_Save=jDBC_Connection.array_Database_Connection("SELECT COR_PGM_ID,COR_PGM_DESC,MULTI_VNDR_PGM_FLG from QA1MM.COR_PGM where COR_PGM_DESC='"+Custom_Program_Name+"-CP'");
					if(!Program_Name_In_DB_After_Save.isEmpty() && Program_Name_In_DB_After_Save.get(2).equals("Y"))
						After_Save=false;
					else
						After_Save=true;
					if(Before_Save)
					{
						if(!After_Save)
					      	{
							    report.addReportStep("The Program name is  saved to database",
								  "The program name is saved to database", 
								    StepResult.PASS);
						        System.out.println("The program name is saved to database");
					      	}
					     else
					       {
						         report.addReportStep("The Program name is not saved to database",
								  "The program name is not saved to database", 
								    StepResult.FAIL);	
						         System.out.println("The program name is not saved to database");
					       }
					}
				}
				else if(popUp_Msg.equalsIgnoreCase("Onboarding failed as system reached maximum program limit."))
				{
					Program_Name_In_DB_After_Save=jDBC_Connection.array_Database_Connection("SELECT COR_PGM_ID,COR_PGM_DESC from QA1MM.COR_PGM where COR_PGM_DESC='"+Custom_Program_Name+"-CP'");
					setBackThresholdLimitForAutoGeneratedID();
					if(Program_Name_In_DB_After_Save.equals(Program_Name_In_DB_Before_Save))
						After_Save=false;
					else
						After_Save=true;
					if(Before_Save)
					{
						if(!After_Save)
						{
							 report.addReportStep("The Program name is not saved to database as maximum limit reached",
							  "The program name is not saved to database as maximum limit reached", 
								StepResult.PASS);	
						     System.out.println("The program name is not saved to database as maximum limit reached");
						}
					       else
					     {
						       report.addReportStep("The Program name is saved to database although maximum limit reached",
							   "The program name is saved to database although maximum limit is reached", 
								 StepResult.FAIL);	
						       System.out.println("The program name is  saved to database although maximum limit reached");
					     }
			           	
					}
				}			
			
		}catch (Exception ex) {
			report.addReportStep("User is not able to click on Add button and the program name is not saved into the database",
					"User is not able to click on Add button and the program name is not saved into the database", 
					StepResult.FAIL);
		    System.out.println(ex.getMessage());
		    wh.handleAlert();
	}
}

	
public void check_Custom_Program_Flag_In_DB(String Custom_Program_Name)throws Throwable{
		
		Custom_Program_Flag_In_DB_After_Save=jDBC_Connection.array_Database_Connection("SELECT MULTI_VNDR_PGM_FLG from QA1MM.COR_PGM where COR_PGM_DESC='"+Custom_Program_Name+"-CP'");
		if(Custom_Program_Flag_In_DB_After_Save.get(0).equals("Y"))
			report.addReportStep("The Program name is saved into the database and the Custom Program Flag is Y as expected",
				      "The Program name is saved into the database and the Custom Program Flag is Y as expected", 
				         StepResult.PASS);	
		else 
	        report.addReportStep("The Program name is saved into the database but the Custom Program Flag is not Y as expected",
				      "The Program name is saved into the database but the Custom Program Flag is not Y as expected", 
				        StepResult.FAIL);  	   
		
	}
	
	
public void setThresholdLimitForAutoGeneratedID(){
			
			try{		
				String Max_Limit=jDBC_Connection.str_Database_Connection("SELECT Max(COR_PGM_ID)+1 from QA1MM.COR_PGM");
				int Max_Limit_To_Be_Set=Integer.parseInt(Max_Limit);
				jDBC_Connection.str_Update_Database_Connection("Update QA1AA.SUB_SYS_CTRL_PARM set SUB_SYS_PARM_VAL="+Max_Limit_To_Be_Set+" where sub_sys_parm_nm='COR_MAX_PGM'");				
				
			     }catch (Exception ex) {
			    	 report.addReportStep("Setting threshold limit of the COR_PGM_ID in COR_PGM table is not working",
								"Setting threshold limit of the COR_PGM_ID in COR_PGM table is not working", 
								StepResult.FAIL);
				     System.out.println(ex.getMessage());
				     wh.handleAlert();
			}	
	}
		
	
public void setBackThresholdLimitForAutoGeneratedID(){
			
			try{		
				jDBC_Connection.str_Update_Database_Connection("Update QA1AA.SUB_SYS_CTRL_PARM set SUB_SYS_PARM_VAL=4000 where sub_sys_parm_nm='COR_MAX_PGM'");				
				
			     }catch (Exception ex) {
				     System.out.println(ex.getMessage());
				     wh.handleAlert();
			}
		
	}
    
public void Timestamp_From_MVNDR_Screen_Before_Delete(String Custom_Program_Name) throws Throwable{
    	
    	wh.clearElement(CustomProgramName_Text);
		wh.sendKeys(CustomProgramName_Text, Custom_Program_Name);
		Thread.sleep(1000);
		wh.clickElement(Search_Button);		
	    wh.waitForElementPresent(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[6]"));
    	/*Last update TS from UI*/	
		Last_Update_TS_From_UI_Before_Save=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[6]")).getText();
		 report.addReportStep("The time stamp in MVNDR tab for the -"+Custom_Program_Name+" is before deleting the vendors",
					"The time stamp in MVNDR tab for the -"+Custom_Program_Name+" before deleting the vendors", 
					StepResult.PASS);
	    	
    }
    
public void Timestamp_From_MVNDR_Screen_After_Delete(String Custom_Program_Name) throws Throwable{
    	
    	wh.clearElement(CustomProgramName_Text);
		wh.sendKeys(CustomProgramName_Text, Custom_Program_Name);
		Thread.sleep(1000);
		wh.clickElement(Search_Button);
		wh.waitForElementPresent((By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[6]")));
		Thread.sleep(2000);
	   	/*Last update TS from UI*/	
		Last_Update_TS_From_UI_After_Save=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[6]")).getText();
		Thread.sleep(1000);
		if(!(Last_Update_TS_From_UI_Before_Save.equalsIgnoreCase(Last_Update_TS_From_UI_After_Save)))
			 report.addReportStep("The time stamp in MVNDR tab for the -"+Custom_Program_Name+" is updated",
						"The time stamp in MVNDR tab for the -"+Custom_Program_Name+" is updated", 
						StepResult.PASS);
		else
			 report.addReportStep("The time stamp in MVNDR tab for the -"+Custom_Program_Name+" is not updated",
						"The time stamp in MVNDR tab for the -"+Custom_Program_Name+" is not updated", 
						StepResult.FAIL);    	
    }


public void custom_ProgramName_Search_In_MVNDR(String Custom_Program_Name)throws Throwable{
		
		wh.clearElement(CustomProgramName_Text);
		wh.sendKeys(CustomProgramName_Text, Custom_Program_Name);
		Thread.sleep(1000);
		wh.clickElement(Search_Button);
		
		/*Program id from DB*/
		Program_ID_From_DB=jDBC_Connection.array_Database_Connection("Select COR_PGM_ID from QA1MM.COR_PGM where COR_PGM_DESC='"+Custom_Program_Name+"-CP'");
		/*Removing brackets from the array*/
		String Program_ID_From_DB_Text="";
		for (String s : Program_ID_From_DB)
		{
			Program_ID_From_DB_Text += s + "\t";
		}
		Program_ID_From_DB_Text=Program_ID_From_DB_Text.trim();
		Result_Grid_From_DB.add(Program_ID_From_DB_Text);
		
		/*Vendor Number and department from DB*/
		Vendors_In_A_Program_From_DB=jDBC_Connection.array_Database_Connection("select MVNDR_NBR from QA1MM.COR_PGM_MVNDR_DC where COR_PGM_ID="+Program_ID_From_DB_Text);
		if(Vendors_In_A_Program_From_DB.size()>0)
		{
		Vendor_Num_From_DB="Multiple";
		Result_Grid_From_DB.add(Vendor_Num_From_DB);
		Dept_Num_From_DB="Multiple";
		Result_Grid_From_DB.add(Dept_Num_From_DB);
		}
		else
		{
		Vendor_Num_From_DB="";
		Result_Grid_From_DB.add(Vendor_Num_From_DB);
		Dept_Num_From_DB="";
		Result_Grid_From_DB.add(Dept_Num_From_DB);
		}	
		
		/*Vendor name from DB*/		
		Result_Grid_From_DB.add(Custom_Program_Name.trim());		
		
		/*Last update user id from DB*/		
		Last_Update_User_ID_From_DB=jDBC_Connection.array_Database_Connection("Select LAST_UPD_SYSUSR_ID from QA1MM.COR_PGM where COR_PGM_ID="+Program_ID_From_DB_Text);
		String Last_Update_User_ID_From_DB_Text="";
		for (String s : Last_Update_User_ID_From_DB)
		{
			Last_Update_User_ID_From_DB_Text += s + "\t";
		}
		Result_Grid_From_DB.add(Last_Update_User_ID_From_DB_Text.trim());		
		
		/*Last update TS from DB*/		
		Last_Update_TS_From_DB=jDBC_Connection.array_Database_Connection("Select LAST_UPD_TS from QA1MM.COR_PGM where COR_PGM_ID="+Program_ID_From_DB_Text);
		String Last_Update_TS_From_DB_Text="";
		for (String s : Last_Update_TS_From_DB)
		{
			Last_Update_TS_From_DB_Text += s + "\t";
		}
		String temp[]=Last_Update_TS_From_DB_Text.split("\\.");
		Result_Grid_From_DB.add(temp[0].trim());	
		
		/*Commodity Flag from DB*/
		if(Vendors_In_A_Program_From_DB.size()>0)
		{
		Commodity_Flag_From_DB="true";
		Result_Grid_From_DB.add(Commodity_Flag_From_DB.trim());
		}
		else
		{
		Commodity_Flag_From_DB=null;
		Result_Grid_From_DB.add(Commodity_Flag_From_DB);
		}	
		
		/*Custom program flag from DB*/
		Custom_Program_Flag_From_DB="True";
		Result_Grid_From_DB.add(Custom_Program_Flag_From_DB.trim());
		
		/*Program id from UI*/
		Program_ID_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[1]")).getText();
		Result_Grid_From_UI.add(Program_ID_From_UI);
		
		/*Vendor Number and department from UI*/
		Vendor_Num_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[2]")).getText();
		Result_Grid_From_UI.add(Vendor_Num_From_UI);
		
		/*Department from UI*/
		Dept_Num_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[3]")).getText();
		Result_Grid_From_UI.add(Dept_Num_From_UI);
		
		/*Program name from UI*/
		Vendor_Or_Program_Name_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[4]")).getText();
		Result_Grid_From_UI.add(Vendor_Or_Program_Name_From_UI);
		
		/*Last update user id and last update TS from UI*/	
		Last_Update_User_ID_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[5]")).getText();
		Result_Grid_From_UI.add(Last_Update_User_ID_From_UI);
		Last_Update_TS_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[6]")).getText();
		Result_Grid_From_UI.add(Last_Update_TS_From_UI);
		
		/*Commodity Flag from UI*/
		Commodity_Flag_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[7]/div/input")).getAttribute("checked");
		Result_Grid_From_UI.add(Commodity_Flag_From_UI);
		
		/*Custom program flag from UI*/
		Custom_Program_Flag_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[8]")).getText();
		Result_Grid_From_UI.add(Custom_Program_Flag_From_UI);
		
		System.out.println("Results grid from UI is "+Result_Grid_From_UI);
		System.out.println("Results grid from DB is "+Result_Grid_From_DB);
		
		if(Result_Grid_From_DB.equals(Result_Grid_From_UI))
			 report.addReportStep("The user searched for the custom programe name -"+Custom_Program_Name+" in search field and all details in the result grid like Program ID, Vendor number, Department, Program name, Last updated user id, Last update TS, Commodity flag, Custom program flag are populated correctly",
						"The user searched for the custom programe name -"+Custom_Program_Name+" in search field and all details in the result grid like Program ID, Vendor number, Department, Program name, Last updated user id, Last update TS, Commodity flag, Custom program flag are populated correctly", 
						StepResult.PASS);
		else
			 report.addReportStep("The user searched for the custom programe name -"+Custom_Program_Name+" in search field and all details in the result grid like Program ID, Vendor number, Department, Program name, Last updated user id, Last update TS, Commodity flag, Custom program flag are not populated correctly. The details from UI is "+Result_Grid_From_UI+" and the details from DB is "+Result_Grid_From_DB,
					"The user searched for the custom programe name -"+Custom_Program_Name+" in search field and all details in the result grid like Program ID, Vendor number, Department, Program name, Last updated user id, Last update TS, Commodity flag, Custom program flag are not populated correctly. The details from UI is "+Result_Grid_From_UI+" and the details from DB is "+Result_Grid_From_DB, 
					StepResult.FAIL);
		
		/*To check if vendor number, dept and vendor name search fields are disabled*/
		Search_Disable_Vendor_Number=driver.findElement(VendorNumber_Text).getAttribute("disabled");
		if(Search_Disable_Vendor_Number.equals("true"))
			report.addReportStepNoScreenshots("The Vendor number search field is disbaled",
					"The Vendor number search field is disbaled", 
					StepResult.PASS);
		else
			report.addReportStepNoScreenshots("The Vendor number search field is not disbaled",
					"The Vendor number search field is not disbaled", 
					StepResult.FAIL);
					
		Search_Disable_Vendor_Name=driver.findElement(VendorName_Text).getAttribute("disabled");
		if(Search_Disable_Vendor_Name.equals("true"))
			report.addReportStepNoScreenshots("The Vendor name search field is disbaled",
					"The Vendor name search field is disbaled", 
					StepResult.PASS);
		else
		    report.addReportStepNoScreenshots("The Vendor name search field is not disbaled",
					 "The Vendor name search field is not disbaled", 
					StepResult.FAIL);		
		
		Search_Disable_Department=driver.findElement(Department_Text).getAttribute("disabled");
		if(Search_Disable_Department.equals("true"))
			report.addReportStepNoScreenshots("The department search field is disbaled",
					"The department search field is disbaled", 
					StepResult.PASS);
		else
		    report.addReportStepNoScreenshots("The department search field is not disbaled",
					 "The department search field is not disbaled", 
					StepResult.FAIL);	
			
	}
	

public void vendor_Number_Search_In_MVNDR(String Vendor_Number)throws Throwable{
		
		wh.clearElement(VendorNumber_Text);
		wh.sendKeys(VendorNumber_Text, Vendor_Number);
		wh.clickElement(Search_Button);
		
		String Program_ID_From_DB_Text="";
		
		/*Vendor name from DB - If the vendor is onboarded then pgm id should be displayed else it should not be. To check if a vendor is onboarded see if there are any markets associated with it*/		
		Markets_In_A_Vendor_From_DB=jDBC_Connection.array_Database_Connection("select * from QA1MM.COR_MVNDR_PARM where MVNDR_NBR="+Vendor_Number);
		if(!Markets_In_A_Vendor_From_DB.isEmpty())
		{
		Vendor_Or_Program_Name_From_DB=jDBC_Connection.array_Database_Connection("Select COR_PGM_DESC from QA1MM.COR_PGM A inner join QA1MM.COR_PGM_MVNDR_DC B on A.COR_PGM_ID=B.COR_PGM_ID where MVNDR_NBR="+Vendor_Number+" and MULTI_VNDR_PGM_FLG='N'");
		String Vendor_Or_Program_Name_From_DB_Text="";
		for (String s : Vendor_Or_Program_Name_From_DB)
		{
			Vendor_Or_Program_Name_From_DB_Text += s + "\t";
		}
		
		List<String> Vendor_Or_Program_Name_From_DB_Text_Split = Arrays.asList(Vendor_Or_Program_Name_From_DB_Text.split(","));
		System.out.println(Vendor_Or_Program_Name_From_DB_Text_Split.get(0));
	
		/*Pgm ID from DB*/		
		Program_ID_From_DB=jDBC_Connection.array_Database_Connection("select COR_PGM_ID from QA1MM.COR_PGM where COR_PGM_DESC='"+Vendor_Or_Program_Name_From_DB_Text.trim()+"'");	
		/*Removing brackets from the array*/		
		for (String s : Program_ID_From_DB)
		{
			Program_ID_From_DB_Text += s + "\t";
		}
		Program_ID_From_DB_Text=Program_ID_From_DB_Text.trim();
		Result_Grid_From_DB.add(Program_ID_From_DB_Text);
		Result_Grid_From_DB.add(Vendor_Number);		
		}
		
		else
		{
		Result_Grid_From_DB.add("");	
		Result_Grid_From_DB.add(Vendor_Number);	
		}
		
		/*department from DB*/		
		Department_Of_A_Vendor_From_DB=jDBC_Connection.array_Database_Connection("select distinct(MER_DEPT_NBR) from QA1MM.MVNDR where MVNDR_NBR="+Vendor_Number);	
		/*Removing brackets from the array*/
		String Department_Of_A_Vendor_From_DB_Text="";
		for (String s : Department_Of_A_Vendor_From_DB)
		{
			Department_Of_A_Vendor_From_DB_Text += s + "\t";
		}
		Department_Of_A_Vendor_From_DB_Text=Department_Of_A_Vendor_From_DB_Text.trim();
		Result_Grid_From_DB.add(Department_Of_A_Vendor_From_DB_Text);	
		
		/*Vendor name from DB*/		
	//	Vendor_Or_Program_Name_From_DB=jDBC_Connection.array_Database_Connection("Select COR_PGM_DESC from QA1MM.COR_PGM A inner join QA1MM.COR_PGM_MVNDR_DC B on A.COR_PGM_ID=B.COR_PGM_ID where MVNDR_NBR="+Vendor_Number+" and MULTI_VNDR_PGM_FLG='N'");
		Vendor_Or_Program_Name_From_DB=jDBC_Connection.array_Database_Connection("Select MVNDR_NM from QA1MM.MVNDR where MVNDR_NBR="+Vendor_Number);
		String Vendor_Or_Program_Name_From_DB_Text="";
		for (String s : Vendor_Or_Program_Name_From_DB)
		{
			Vendor_Or_Program_Name_From_DB_Text += s + "\t";
		}
		Vendor_Or_Program_Name_From_DB_Text=Vendor_Or_Program_Name_From_DB_Text.trim();
		List<String> Vendor_Or_Program_Name_From_DB_Text_Split = Arrays.asList(Vendor_Or_Program_Name_From_DB_Text.split(","));
		Result_Grid_From_DB.add(Vendor_Or_Program_Name_From_DB_Text_Split.get(0).trim());
		
		/*Last update user id from DB*/
		if(!Markets_In_A_Vendor_From_DB.isEmpty())
		Last_Update_User_ID_From_DB=jDBC_Connection.array_Database_Connection("Select LAST_UPD_SYSUSR_ID from QA1MM.COR_PGM where COR_PGM_ID="+Program_ID_From_DB_Text);
		else
		Last_Update_User_ID_From_DB=jDBC_Connection.array_Database_Connection("Select LAST_UPD_USER_ID from QA1MM.MVNDR where MVNDR_NBR="+Vendor_Number);	
		String Last_Update_User_ID_From_DB_Text="";
		for (String s : Last_Update_User_ID_From_DB)
		{
			Last_Update_User_ID_From_DB_Text += s + "\t";
		}
		Result_Grid_From_DB.add(Last_Update_User_ID_From_DB_Text.trim());
		
		
		/*Last update TS from DB*/		
		if(!Markets_In_A_Vendor_From_DB.isEmpty())
		Last_Update_TS_From_DB=jDBC_Connection.array_Database_Connection("Select LAST_UPD_TS from QA1MM.COR_PGM where COR_PGM_ID="+Program_ID_From_DB_Text);
		else				
		Last_Update_TS_From_DB=jDBC_Connection.array_Database_Connection("Select LAST_UPD_TS from QA1MM.MVNDR where MVNDR_NBR="+Vendor_Number);
		String Last_Update_TS_From_DB_Text="";
		for (String s : Last_Update_TS_From_DB)
		{
			Last_Update_TS_From_DB_Text += s + "\t";
		}
		String temp[]=Last_Update_TS_From_DB_Text.split("\\.");
		Result_Grid_From_DB.add(temp[0].trim());	
		
		
		/*Commodity Flag from DB*/
		if(Markets_In_A_Vendor_From_DB.size()>0)
		Commodity_Flag_From_DB="true";
		else
		Commodity_Flag_From_DB="false";	
		Result_Grid_From_DB.add(Commodity_Flag_From_DB);
		
		/*Custom program flag from DB*/
		Custom_Program_Flag_From_DB="False";
		Result_Grid_From_DB.add(Custom_Program_Flag_From_DB.trim());
		
		/*Program id from UI*/
		Program_ID_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[1]")).getText();
		Result_Grid_From_UI.add(Program_ID_From_UI);
		
		/*Vendor Number from UI*/
		Vendor_Num_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[2]")).getText();
		Result_Grid_From_UI.add(Vendor_Num_From_UI);
		
		/*Department from UI*/
		Dept_Num_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[3]")).getText();
		Result_Grid_From_UI.add(Dept_Num_From_UI);
		
		/*Program name from UI*/
		Vendor_Or_Program_Name_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[4]")).getText();
		Result_Grid_From_UI.add(Vendor_Or_Program_Name_From_UI);
		
		/*Last update user id and last update TS from UI*/	
		Last_Update_User_ID_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[5]")).getText();
		Result_Grid_From_UI.add(Last_Update_User_ID_From_UI);
		Last_Update_TS_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[6]")).getText();
		Result_Grid_From_UI.add(Last_Update_TS_From_UI);
		
		/*Commodity Flag from UI*/
		Commodity_Flag_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[7]/div/input")).getAttribute("checked");
		if(Commodity_Flag_From_UI!=null)
		Commodity_Flag_From_UI="true";
		else
		Commodity_Flag_From_UI="false";
		Result_Grid_From_UI.add(Commodity_Flag_From_UI);
		
		/*Custom program flag from UI*/
		Custom_Program_Flag_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[8]")).getText();
		Result_Grid_From_UI.add(Custom_Program_Flag_From_UI);
		
		System.out.println("Results grid from UI is "+Result_Grid_From_UI);
		System.out.println("Results grid from DB is "+Result_Grid_From_DB);
		
		if(Result_Grid_From_DB.equals(Result_Grid_From_UI))
			 report.addReportStep("The user searched for the vendor number -"+Vendor_Number+" in search field and all details in the result grid like Program ID, Vendor number, Department, Program name, Last updated user id, Last update TS, Commodity flag, Custom program flag are populated correctly",
						"The user searched for the vendor number -"+Vendor_Number+" in search field and all details in the result grid like Program ID, Vendor number, Department, Program name, Last updated user id, Last update TS, Commodity flag, Custom program flag are populated correctly", 
						 StepResult.PASS);
		else
			report.addReportStep("The user searched for the vendor number -"+Vendor_Number+" in search field and all details in the result grid like Program ID, Vendor number, Department, Program name, Last updated user id, Last update TS, Commodity flag, Custom program flag are not populated correctly.The details from UI is "+Result_Grid_From_UI+" and the details from DB is "+Result_Grid_From_DB,
					    "The user searched for the vendor number -"+Vendor_Number+" in search field and all details in the result grid like Program ID, Vendor number, Department, Program name, Last updated user id, Last update TS, Commodity flag, Custom program flag are not populated correctly.The details from UI is "+Result_Grid_From_UI+" and the details from DB is "+Result_Grid_From_DB, 
					     StepResult.FAIL);
		
		/*To check if custom program search field is disabled*/
		Search_Disable_Custom_Program=driver.findElement(CustomProgramName_Text).getAttribute("disabled");
		if(Search_Disable_Custom_Program.equals("true"))
			report.addReportStepNoScreenshots("The custom program name search field is disbaled",
					     "The custom program name search field is disbaled", 
					      StepResult.PASS);
		else
			report.addReportStepNoScreenshots("The custom program name search field is disbaled",
					     "The custom program name search field is disbaled", 
					     StepResult.FAIL);
	}

    
public void vendor_Name_Search_In_MVNDR(String Vendor_Name)throws Throwable{
	
	wh.clearElement(CustomProgramName_Text);
	Thread.sleep(1000);
    wh.clickElement(VendorName_Text);
    Thread.sleep(500);
	wh.sendKeys(VendorName_Text, Vendor_Name);
	wh.clickElement(Search_Button);
	wh.waitForElementPresent(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[2]"));	
	Result_Grid_From_UI.clear();
	Result_Grid_From_DB.clear();
	
	/*Vendor num from DB*/
	String Vendor_Details_From_DB_Text="";
	Vendor_Details_From_DB=jDBC_Connection.array_Database_Connection("Select MVNDR_NBR from QA1MM.MVNDR where MVNDR_NM='"+Vendor_Name+"'");
	for (String s : Vendor_Details_From_DB)
	{
		Vendor_Details_From_DB_Text += s + "\t";
	}
		Vendor_Details_From_DB_Text=Vendor_Details_From_DB_Text.trim();	
		
		
	String Program_ID_From_DB_Text="";
	/*Pgm ID from DB*/		
	Program_ID_From_DB=jDBC_Connection.array_Database_Connection("select COR_PGM_ID from QA1MM.COR_PGM where COR_PGM_DESC like '"+Vendor_Name+"%'");
	if(!Program_ID_From_DB.isEmpty())		
	{
	/*Removing brackets from the array*/		
	for (String s : Program_ID_From_DB)
	{
	Program_ID_From_DB_Text += s + "\t";
	}
	Program_ID_From_DB_Text=Program_ID_From_DB_Text.trim();	
	}			
		
	if(!Program_ID_From_DB.isEmpty())
	{
	Markets_In_A_Vendor_From_DB=jDBC_Connection.array_Database_Connection("select * from QA1MM.COR_MVNDR_PARM where MVNDR_NBR="+Vendor_Details_From_DB_Text);
	if(!Markets_In_A_Vendor_From_DB.isEmpty())
	Result_Grid_From_DB.add(Program_ID_From_DB_Text);
	}
	else
	Result_Grid_From_DB.add("");	
	
	/*Adding vendor num to result grid*/
	Result_Grid_From_DB.add(Vendor_Details_From_DB_Text);		
	
	/*Department number from DB*/
	Dept_Num_From_DB=jDBC_Connection.str_Database_Connection("Select MER_DEPT_NBR from QA1MM.MVNDR where MVNDR_NBR="+Vendor_Details_From_DB_Text);
	Result_Grid_From_DB.add(Dept_Num_From_DB.trim());
	
	/*Vendor name*/
	Result_Grid_From_DB.add(Vendor_Name.trim());
	
	
	/*Last update user id from DB*/
	if(!Markets_In_A_Vendor_From_DB.isEmpty())
	Last_Update_User_ID_From_DB=jDBC_Connection.array_Database_Connection("Select LAST_UPD_SYSUSR_ID from QA1MM.COR_PGM where COR_PGM_ID="+Program_ID_From_DB_Text);
	else
	Last_Update_User_ID_From_DB=jDBC_Connection.array_Database_Connection("Select LAST_UPD_USER_ID from QA1MM.MVNDR where MVNDR_NBR="+Vendor_Details_From_DB_Text);	
	String Last_Update_User_ID_From_DB_Text="";
	for (String s : Last_Update_User_ID_From_DB)
	{
		Last_Update_User_ID_From_DB_Text += s + "\t";
	}
	Result_Grid_From_DB.add(Last_Update_User_ID_From_DB_Text.trim());
	
	
	/*Last update TS from DB*/		
	if(!Markets_In_A_Vendor_From_DB.isEmpty())
	Last_Update_TS_From_DB=jDBC_Connection.array_Database_Connection("Select LAST_UPD_TS from QA1MM.COR_PGM where COR_PGM_ID="+Program_ID_From_DB_Text);
	else				
	Last_Update_TS_From_DB=jDBC_Connection.array_Database_Connection("Select LAST_UPD_TS from QA1MM.MVNDR where MVNDR_NBR="+Vendor_Details_From_DB_Text);
	String Last_Update_TS_From_DB_Text="";
	for (String s : Last_Update_TS_From_DB)
	{
		Last_Update_TS_From_DB_Text += s + "\t";
	}
	String temp[]=Last_Update_TS_From_DB_Text.split("\\.");
	Result_Grid_From_DB.add(temp[0].trim());		
	
	
	/*/*Commodity Flag from DB To check if a vendor is onboarded see if there are any markets associated with it. If yes, then commodity flag is checked*/		
	Markets_In_A_Vendor_From_DB=jDBC_Connection.array_Database_Connection("select * from QA1MM.COR_MVNDR_PARM where MVNDR_NBR="+Vendor_Details_From_DB_Text);
	if(Markets_In_A_Vendor_From_DB.size()>0)
	Commodity_Flag_From_DB="true";
	else
	Commodity_Flag_From_DB="false";	
	Result_Grid_From_DB.add(Commodity_Flag_From_DB);
			
	/*Custom program flag from DB*/
	Custom_Program_Flag_From_DB="False";
	Result_Grid_From_DB.add(Custom_Program_Flag_From_DB.trim());	
	
	
	/*Program id from UI*/
	Program_ID_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[1]")).getText();
	Result_Grid_From_UI.add(Program_ID_From_UI);
	
	/*Vendor Number from UI*/
	Vendor_Num_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[2]")).getText();
	Result_Grid_From_UI.add(Vendor_Num_From_UI);
	
	/*Department from UI*/
	Dept_Num_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[3]")).getText();
	Result_Grid_From_UI.add(Dept_Num_From_UI);
	
	/*Program name from UI*/
	Vendor_Or_Program_Name_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[4]")).getText();
	Result_Grid_From_UI.add(Vendor_Or_Program_Name_From_UI);
	
	/*Last update user id and last update TS from UI*/	
	Last_Update_User_ID_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[5]")).getText();
	Result_Grid_From_UI.add(Last_Update_User_ID_From_UI);
	Last_Update_TS_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[6]")).getText();
	Result_Grid_From_UI.add(Last_Update_TS_From_UI);
	
	/*Commodity Flag from UI*/
	Commodity_Flag_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[7]/div/input")).getAttribute("checked");
	if(Commodity_Flag_From_UI!=null)
	Commodity_Flag_From_UI="true";
	else
	Commodity_Flag_From_UI="false";
	Result_Grid_From_UI.add(Commodity_Flag_From_UI);
	
	/*Custom program flag from UI*/
	Custom_Program_Flag_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[8]")).getText();
	Result_Grid_From_UI.add(Custom_Program_Flag_From_UI);
	
	System.out.println("Results grid from UI is "+Result_Grid_From_UI);
	System.out.println("Results grid from DB is "+Result_Grid_From_DB);
	
	if(Result_Grid_From_UI.equals(Result_Grid_From_DB))
		 report.addReportStep("The user searched for the vendor name -"+Vendor_Name+" in search field and all details in the result grid like Program ID, Vendor number, Department, Program name, Last updated user id, Last update TS, Commodity flag, Custom program flag are populated correctly",
					"The user searched for the vendor name -"+Vendor_Name+" in search field and all details in the result grid like Program ID, Vendor number, Department, Program name, Last updated user id, Last update TS, Commodity flag, Custom program flag are populated correctly", 
					StepResult.PASS);
	else
		report.addReportStep("The user searched for the vendor name -"+Vendor_Name+" in search field and all details in the result grid like Program ID, Vendor number, Department, Program name, Last updated user id, Last update TS, Commodity flag, Custom program flag are not populated correctly. The details from UI is "+Result_Grid_From_UI+" and the details from DB is "+Result_Grid_From_DB,
				    "The user searched for the vendor name -"+Vendor_Name+" in search field and all details in the result grid like Program ID, Vendor number, Department, Program name, Last updated user id, Last update TS, Commodity flag, Custom program flag are not populated correctly.The details from UI is "+Result_Grid_From_UI+" and the details from DB is "+Result_Grid_From_DB, 
				    StepResult.FAIL);
	
	/*To check if custom program search field is disabled*/
	Search_Disable_Custom_Program=driver.findElement(CustomProgramName_Text).getAttribute("disabled");
	if(Search_Disable_Custom_Program.equals("true"))
		report.addReportStepNoScreenshots("The custom program name search field is disbaled",
				   "The custom program name search field is disbaled", 
				   StepResult.PASS);
	else
		report.addReportStepNoScreenshots("The custom program name search field is disbaled",
				   "The custom program name search field is disbaled", 
				   StepResult.FAIL);
}

    
public void department_Search_In_MVNDR(String Department)throws Throwable{
    	
//    	wh.clearElement(VendorName_Text);
//    	wh.sendKeys(VendorName_Text, Department);
//    	wh.clickElement(Search_Button);
//    	
//    	Result_Grid_From_UI.clear();
//    	Result_Grid_From_DB.clear();
//    	
//    	String Program_ID_From_DB_Text="";
//    	/*Pgm ID from DB*/		
//    	Program_ID_From_DB=jDBC_Connection.array_Database_Connection("select COR_PGM_ID from QA1MM.COR_PGM where COR_PGM_DESC Like '"+Vendor_Name+"%'");
//    	if(!Program_ID_From_DB.isEmpty())		
//    	{
//    	/*Removing brackets from the array*/		
//    	for (String s : Program_ID_From_DB)
//    	{
//    		Program_ID_From_DB_Text += s + "\t";
//    	}
//    	Program_ID_From_DB_Text=Program_ID_From_DB_Text.trim();
//    	Result_Grid_From_DB.add(Program_ID_From_DB_Text);
//    	}
//    	/*Vendor number from DB*/
//    	Vendor_Num_From_DB=jDBC_Connection.str_Database_Connection("Select MVNDR_NBR from QA1MM.MVNDR where MVNDR_NM LIKE 'FENWAY PRODUCTS,%'");
//    	Result_Grid_From_DB.add(Vendor_Num_From_DB.trim());
//    	
//    	/*Department number from DB*/
//    	Dept_Num_From_DB=jDBC_Connection.str_Database_Connection("Select MER_DEPT_NBR from QA1MM.MVNDR where MVNDR_NBR="+Vendor_Num_From_DB);
//    	Result_Grid_From_DB.add(Dept_Num_From_DB.trim());
//    	
//    	/*Vendor name*/
//    	Result_Grid_From_DB.add(Vendor_Name.trim());
//    	
//    	/*Last update user id from DB*/		
//    	Last_Update_User_ID_From_DB=jDBC_Connection.array_Database_Connection("Select LAST_UPD_USER_ID from QA1MM.MVNDR where MVNDR_NBR="+Vendor_Num_From_DB);
//    	String Last_Update_User_ID_From_DB_Text="";
//    	for (String s : Last_Update_User_ID_From_DB)
//    	{
//    		Last_Update_User_ID_From_DB_Text += s + "\t";
//    	}
//    	Result_Grid_From_DB.add(Last_Update_User_ID_From_DB_Text.trim());
//    	
//    	/*Last update TS from DB*/		
//    	Last_Update_TS_From_DB=jDBC_Connection.array_Database_Connection("Select LAST_UPD_TS from QA1MM.MVNDR where MVNDR_NBR="+Vendor_Num_From_DB);
//    	String Last_Update_TS_From_DB_Text="";
//    	for (String s : Last_Update_TS_From_DB)
//    	{
//    		Last_Update_TS_From_DB_Text += s + "\t";
//    	}
//    	String temp[]=Last_Update_TS_From_DB_Text.split("\\.");
//		Result_Grid_From_DB.add(temp[0].trim());	
//    	
//    	
//    	
//    	/*/*Commodity Flag from DB To check if a vendor is onboarded see if there are any markets associated with it. If yes, then commodity flag is checked*/		
//    	Markets_In_A_Vendor_From_DB=jDBC_Connection.array_Database_Connection("select * from QA1MM.COR_MVNDR_PARM where MVNDR_NBR="+Vendor_Num_From_DB);
//    	   if(Markets_In_A_Vendor_From_DB.size()>0)
//    		Commodity_Flag_From_DB="true";
//    		else
//    		Commodity_Flag_From_DB="false";	
//    		Result_Grid_From_DB.add(Commodity_Flag_From_DB.trim());
//    			
//    	/*Custom program flag from DB*/
//    	Custom_Program_Flag_From_DB="False";
//    	Result_Grid_From_DB.add(Custom_Program_Flag_From_DB.trim());	
//    	
//    	
//    	
//    	/*Program id from UI*/
//    	Program_ID_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[1]")).getText();
//    	if(!Program_ID_From_UI.isEmpty())
//    	Result_Grid_From_UI.add(Program_ID_From_UI);
//    	
//    	/*Vendor Number from UI*/
//    	Vendor_Num_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[2]")).getText();
//    	Result_Grid_From_UI.add(Vendor_Num_From_UI);
//    	
//    	/*Department from UI*/
//    	Dept_Num_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[3]")).getText();
//    	Result_Grid_From_UI.add(Dept_Num_From_UI);
//    	
//    	/*Program name from UI*/
//    	Vendor_Or_Program_Name_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[4]")).getText();
//    	Result_Grid_From_UI.add(Vendor_Or_Program_Name_From_UI);
//    	
//    	/*Last update user id and last update TS from UI*/	
//    	Last_Update_User_ID_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[5]")).getText();
//    	Result_Grid_From_UI.add(Last_Update_User_ID_From_UI);
//    	Last_Update_TS_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[6]")).getText();
//    	Result_Grid_From_UI.add(Last_Update_TS_From_UI);
//    	
//    	/*Commodity Flag from UI*/
//    	Commodity_Flag_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[7]/div/input")).getAttribute("checked");
//    	if(Commodity_Flag_From_UI!=null)
//    	Commodity_Flag_From_UI="true";
//    	else
//    	Commodity_Flag_From_UI="false";
//    	Result_Grid_From_UI.add(Commodity_Flag_From_UI);
//    	
//    	/*Custom program flag from UI*/
//    	Custom_Program_Flag_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[8]")).getText();
//    	Result_Grid_From_UI.add(Custom_Program_Flag_From_UI);
//    	
//    	System.out.println("Results grid from UI is "+Result_Grid_From_UI);
//    	System.out.println("Results grid from DB is "+Result_Grid_From_DB);
//    	
//    	if(Result_Grid_From_UI.equals(Result_Grid_From_DB))
//    		 report.addReportStep("The user searched for the vendor name -"+Vendor_Name+" in search field and all details in the result grid like Program ID, Vendor number, Department, Program name, Last updated user id, Last update TS, Commodity flag, Custom program flag are populated correctly",
//    					"The user searched for the vendor name -"+Vendor_Name+" in search field and all details in the result grid like Program ID, Vendor number, Department, Program name, Last updated user id, Last update TS, Commodity flag, Custom program flag are populated correctly", 
//    					StepResult.PASS);
//    	else
//    		report.addReportStep("The user searched for the vendor name -"+Vendor_Name+" in search field and all details in the result grid like Program ID, Vendor number, Department, Program name, Last updated user id, Last update TS, Commodity flag, Custom program flag are not populated correctly",
//    				"The user searched for the vendor name -"+Vendor_Name+" in search field and all details in the result grid like Program ID, Vendor number, Department, Program name, Last updated user id, Last update TS, Commodity flag, Custom program flag are not populated correctly", 
//    				StepResult.FAIL);
//    	
//    	/*To check if custom program search field is disabled*/
//    	Search_Disable_Custom_Program=driver.findElement(CustomProgramName_Text).getAttribute("disabled");
//    	if(Search_Disable_Custom_Program.equals("true"))
//    		report.addReportStepNoScreenshots("The custom program name search field is disbaled",
//    				"The custom program name search field is disbaled", 
//    				StepResult.PASS);
//    	else
//    		report.addReportStepNoScreenshots("The custom program name search field is disbaled",
//    				"The custom program name search field is disbaled", 
//    				StepResult.FAIL);
    }


public void clear_Button(String Vendor_Name) throws Throwable{
		
		wh.clearElement(VendorName_Text);
		wh.sendKeys(VendorName_Text, Vendor_Name);
		wh.clickElement(Search_Button);
		
		/*Vendor Number from UI - To check if some results are populated in the grid*/
		Vendor_Num_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[2]")).getText();
		if(!Vendor_Num_From_UI.isEmpty())		
		 report.addReportStep("The user searched for the vendor name -"+Vendor_Name+" in search field and all details are populated in result grid",
					"The user searched for the vendor name -"+Vendor_Name+" in search field and all details are populated in result grid", 
					StepResult.PASS);
		 else
		 
		 report.addReportStep("The user searched for the vendor name -"+Vendor_Name+" in search field but no resulta are populated in result grid. So not able to validate the functionality of clear button. Try another vendor name",
						"The user searched for the vendor name -"+Vendor_Name+" in search field but no resulta are populated in result grid. So not able to validate the functionality of clear button. Try another vendor name", 
						StepResult.FAIL);
		
		wh.clickElement(Clear_Button);
		
		try{
		/*Vendor Number from UI - To check if vendor number field and results grid are cleared. Since data is cleared grid will not be there, so code will throw error. If error is thrown that means data is cleared*/
		Vendor_Name_From_UI_Text_Box=wh.getText(VendorName_Text);
		Vendor_Num_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[2]")).getText();
		report.addReportStep("The user clicked on clear button but values in the UI are not cleared",
					"The user clicked on clear button but values in the UI are not cleared", 
					StepResult.FAIL);
		}catch(Throwable t){
			if(Vendor_Name_From_UI_Text_Box.isEmpty())	
				 report.addReportStep("The user clicked on clear button and all values in the UI are cleared",
							"The user clicked on clear button and all values in the UI are cleared", 
							StepResult.PASS);
		}
			 
			
	}
	
	
    public void edit_Button(String Vendor_Name) throws Throwable{
		
		wh.clearElement(VendorName_Text);
		wh.sendKeys(VendorName_Text, Vendor_Name);
		wh.clickElement(Search_Button);
		
		/*Vendor Number from UI - To check if some results are populated in the grid*/
		Vendor_Num_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[2]")).getText();
		if(!Vendor_Num_From_UI.isEmpty())		
		 report.addReportStep("The user searched for the vendor name -"+Vendor_Name+" in search field and all details are populated in result grid",
					"The user searched for the vendor name -"+Vendor_Name+" in search field and all details are populated in result grid", 
					StepResult.PASS);
		 else
		 
		 report.addReportStep("The user searched for the vendor name -"+Vendor_Name+" in search field but no resulta are populated in result grid. So not able to validate the functionality of clear button. Try another vendor name",
						"The user searched for the vendor name -"+Vendor_Name+" in search field but no resulta are populated in result grid. So not able to validate the functionality of clear button. Try another vendor name", 
						StepResult.FAIL);
		
		/*Clicking on Vendor name field of first record in the result grid so that the first record is selected and then user can click on edit*/
		driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[2]")).click();
		
		/*Program name from UI to check if it matches with the edit pop up title*/
		Vendor_Or_Program_Name_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[4]")).getText();
				
		/*Vendor num from UI to check if it matches with the edit pop up title*/
		Vendor_Num_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[2]")).getText();
		
		wh.clickElement(Edit_Button);	
		wh.waitForElementPresent(Edit_PopUp_Title);
		
		/*checking if edit pop up opened and the title of the pop up is as expected*/
	//	Edit_PopUp_Title_From_UI=wh.getText(Edit_PopUp_Title);
		Edit_PopUp_Title_From_UI=driver.findElement(Edit_PopUp_Title).getText();
		Edit_PopUp_Title_Expected="Onboarding/Offboarding Vendor "+Vendor_Num_From_UI+" - "+Vendor_Or_Program_Name_From_UI;
		System.out.println("The edit pop up title from UI is "+Edit_PopUp_Title_From_UI);
		System.out.println("The edit pop up title expected is "+Edit_PopUp_Title_Expected);
		
		if(Edit_PopUp_Title_From_UI.equals(Edit_PopUp_Title_Expected))
			
		report.addReportStep("The user clicked on edit button and a pop up opened. The title of the pop up is as expected",
					"The user clicked on edit button and a pop up opened. The title of the pop up is as expected", 
					StepResult.PASS);
		else
		report.addReportStep("The user clicked on edit button and a pop up opened. The title of the pop up is as expected",
					"The user clicked on edit button and a pop up opened. The title of the pop up is as expected", 
					StepResult.FAIL);
	
	}
	
	
    public void invalid_Search(String Vendor_Name) throws Throwable{
		
		wh.clearElement(VendorName_Text);
		wh.sendKeys(VendorName_Text, Vendor_Name);
		wh.clickElement(Search_Button);
		
		Invalid_Search_Error_Msg_From_UI=wh.getText(Error_PopUp);		
		Invalid_Search_Error_Msg_Expected="No records available for the given search criteria.";
		
		System.out.println("The error message from UI is "+Invalid_Search_Error_Msg_From_UI);
		System.out.println("The error message expected is "+Invalid_Search_Error_Msg_Expected);
		
		if(Invalid_Search_Error_Msg_From_UI.equals(Invalid_Search_Error_Msg_Expected))
			
		report.addReportStep("The user searched for an invalid vendor and error message popped up as expected",
					"The user searched for an invalid vendor and error message popped up as expected", 
					StepResult.PASS);
		else
		report.addReportStep("The user searched for an invalid vendor and error message did not pop up as expected",
					"The user searched for an invalid vendor and error message did not pop up as expected", 
					StepResult.FAIL);			 
			
	}
    
    
    public void DeptMouseHover(String Custom_Program_Name) throws Throwable{

    	
    	wh.clearElement(CustomProgramName_Text);
		wh.sendKeys(CustomProgramName_Text, Custom_Program_Name);
		wh.clickElement(Search_Button);
		
    	Program_ID_From_DB=jDBC_Connection.array_Database_Connection("Select COR_PGM_ID from QA1MM.COR_PGM where COR_PGM_DESC='"+Custom_Program_Name+"-CP'");
		/*Removing brackets from the array*/
		String Program_ID_From_DB_Text="";
		for (String s : Program_ID_From_DB)
		{
			Program_ID_From_DB_Text += s + "\t";
		}
		Department_Of_A_Vendor_From_DB = jDBC_Connection.array_Database_Connection("select distinct(MER_DEPT_NBR) from QA1MM.COR_PGM_MVNDR_DC where COR_PGM_ID='"+Program_ID_From_DB_Text.trim()+"'");
		String Department_Of_A_Vendor_From_DB_Text="";
		for (String s : Department_Of_A_Vendor_From_DB)
		{
			Department_Of_A_Vendor_From_DB_Text += s + ",";
		}
		Department_Of_A_Vendor_From_DB_Text = Department_Of_A_Vendor_From_DB_Text.substring(0,Department_Of_A_Vendor_From_DB_Text.length()-1);
			report.addReportStep("The department numbers corresponding to the vendors in the custom program "+Custom_Program_Name+ " are "+Department_Of_A_Vendor_From_DB,
						"The department numbers corresponding to the vendors in the custom program "+Custom_Program_Name+ " are "+Department_Of_A_Vendor_From_DB, 
					         StepResult.PASS);	
		//driver.findElement(Dept_Mouse_Over).sendKeys("");			
		Department_Of_A_Vendor_From_UI_MouseOver=driver.findElement(Dept_Mouse_Over).getAttribute("title");
		System.out.println("Dept mouse over "+Department_Of_A_Vendor_From_UI_MouseOver);
		if(Department_Of_A_Vendor_From_DB_Text.equals(Department_Of_A_Vendor_From_UI_MouseOver))
			
			report.addReportStep("The department numbers corresponding to the vendors in the custom program "+Custom_Program_Name+ " are "+Department_Of_A_Vendor_From_DB+ " and the department numbers from UI is "+Department_Of_A_Vendor_From_UI_MouseOver+" and both are same",
					"The department numbers corresponding to the vendors in the custom program "+Custom_Program_Name+ " are "+Department_Of_A_Vendor_From_DB+ " and the department numbers from UI is "+Department_Of_A_Vendor_From_UI_MouseOver+" and both are same", 
				         StepResult.PASS);
		else
			report.addReportStep("The department numbers corresponding to the vendors in the custom program "+Custom_Program_Name+ " are "+Department_Of_A_Vendor_From_DB+ " and the department numbers from UI is "+Department_Of_A_Vendor_From_UI_MouseOver+" and both are different",
					"The department numbers corresponding to the vendors in the custom program "+Custom_Program_Name+ " are "+Department_Of_A_Vendor_From_DB+ " and the department numbers from UI is "+Department_Of_A_Vendor_From_UI_MouseOver+" and both are different",
				         StepResult.FAIL);
		
		
    	
    }

    
    public void verify_ProgramName_PopUp_Title_In_UI() throws Throwable{
    	
    	wh.clickElement(Add_Button);	
        wh.waitForElementPresent(Add_Button_Title);
		
		/*checking if add pop up opened and the title of the pop up is as expected*/
	
		Add_PopUp_Title_From_UI=driver.findElement(Add_Button_Title).getText();
		Add_PopUp_Title_Expected="Create Custom Program";
		System.out.println("The add pop up title from UI is "+Add_PopUp_Title_From_UI);
		System.out.println("The add pop up title expected is "+Add_PopUp_Title_Expected);
		
		if(Add_PopUp_Title_From_UI.equals(Add_PopUp_Title_Expected))
			
		report.addReportStep("The user clicked on add button in MVNDR tab and a pop up opened. The title of the pop up is as expected",
					"The user clicked on add button in the MVNDR tab and a pop up opened. The title of the pop up is as expected", 
					StepResult.PASS);
		else
		report.addReportStep("The user clicked on add button in MVNDR tab and a pop up opened. The title of the pop up is not as expected",
					"The user clicked on add button in the MVNDR tab and a pop up opened. The title of the pop up is not as expected", 
					StepResult.FAIL);
  
    }
    
    
    public void Search_Updated_Custom_Program_Name(String New_Custom_Program_Name) throws Throwable{
	
	wh.clearElement(CustomProgramName_Text);
	wh.sendKeys(CustomProgramName_Text, New_Custom_Program_Name);
	Thread.sleep(1000);
	wh.clickElement(Search_Button);

	/*Program name from UI*/
	Vendor_Or_Program_Name_From_UI=driver.findElement(By.xpath("//*[@id='cobMvndrGrid']/div[4]/div[3]/div/div[1]/div[4]")).getText();
	
	if(Vendor_Or_Program_Name_From_UI.equals(New_Custom_Program_Name))
		 report.addReportStep("The updated custom program name is available for search in MVNDR tab",
			      "The updated custom program name is available for search in MVNDR tab", 
			         StepResult.PASS);	
    else
		report.addReportStep("The updated custom program name is not available for search in MVNDR tab",
			      "The updated custom program name is not available for search in MVNDR tab", 
			         StepResult.FAIL);	
	
}

    public void Onboard_Markets_Vendors(TableData table) throws Throwable{
    	/*Vendor 1 - Urban 2,3*/
    	wh.clearElement(VendorName_Text);
    	List<Map<String,String>> lstMap = table.asMaps(String.class, String.class);
       	wh.sendKeys(VendorName_Text,lstMap.get(0).get("VendorName"));
		wh.clickElement(Search_Button);
		System.out.println("1");
		wh.waitForPageLoaded();
		Thread.sleep(1000);
		wh.waitForElementPresent(Pgm_ID_First_Row);
		wh.clickElement(Pgm_ID_First_Row);
		System.out.println("2");
		Thread.sleep(500);
		wh.clickElement(Edit_Button);
		System.out.println("3");
		wh.waitForElementPresent(Edit_Expand_Arrow);
		Thread.sleep(1000);
		wh.clickElement(Edit_Clear_Button);	
		System.out.println("4");
		wh.clickElement(Edit_Expand_Arrow);
		System.out.println("5");
		wh.waitForElementPresent(Edit_Expand_Urban);
		wh.clickElement(Edit_Expand_Urban);
		System.out.println("6");
		Thread.sleep(1000);
		wh.waitForElementPresent(Edit_Choose_Market2_Urban);
		wh.clickElement(Edit_Choose_Market2_Urban);
		Thread.sleep(1000);
		wh.waitForElementPresent(Edit_Choose_Market3_Urban);
		wh.clickElement(Edit_Choose_Market3_Urban);	
		Thread.sleep(1000);
		wh.clickElement(Edit_Save_Button);
		Thread.sleep(1000);
		wh.waitForElementPresent(Error_PopUp_OK);
		popUp_Msg= driver.findElement(Error_PopUp).getText();
		if(popUp_Msg.equalsIgnoreCase("Vendor onboard/offboard process completed successfully."))
			report.addReportStep("User received the expected message for Vendor 1- 'Vendor Onboard/Offboard process completed successfully.'",
				      "User received the expected message for Vendor 1- 'Vendor onboard/offboard process completed Successfully.'", 
				         StepResult.PASS);	
		else
			report.addReportStep("User did not receive the expected message for Vendor 1- 'Vendor onboard/offboard process completed successfully.'",
				      "User did not receive the expected message for Vendor 1- 'Vendor onboard/offboard process completed successfully.'", 
				         StepResult.FAIL);	
		Thread.sleep(500);
		wh.clickElement(Error_PopUp_OK);
		Thread.sleep(500);
		
		
		/*Vendor 2 - Urban 1,2,3*/
    	wh.clearElement(VendorName_Text);
       	wh.sendKeys(VendorName_Text,lstMap.get(1).get("VendorName"));
		wh.clickElement(Search_Button);
		System.out.println("1");
		wh.waitForPageLoaded();
		Thread.sleep(1000);
		wh.waitForElementPresent(Pgm_ID_First_Row);
		wh.clickElement(Pgm_ID_First_Row);
		System.out.println("2");
		Thread.sleep(500);
		wh.clickElement(Edit_Button);
		System.out.println("3");
		wh.waitForElementPresent(Edit_Expand_Arrow);
		wh.waitForPageLoaded();
		Thread.sleep(1000);
		wh.clickElement(Edit_Clear_Button);	
		Thread.sleep(1000);
		wh.clickElement(Edit_Expand_Arrow);
		wh.waitForElementPresent(Edit_Expand_Urban);
		wh.clickElement(Edit_Expand_Urban);
		Thread.sleep(1000);
		wh.waitForElementPresent(Edit_Choose_Market1_Urban);
		wh.clickElement(Edit_Choose_Market1_Urban);
		Thread.sleep(1000);
		wh.waitForElementPresent(Edit_Choose_Market2_Urban);
		wh.clickElement(Edit_Choose_Market2_Urban);
		Thread.sleep(1000);
		wh.waitForElementPresent(Edit_Choose_Market3_Urban);
		wh.clickElement(Edit_Choose_Market3_Urban);	
		Thread.sleep(1000);
		wh.clickElement(Edit_Save_Button);
		Thread.sleep(1000);
		wh.waitForElementPresent(Error_PopUp_OK);
		popUp_Msg= driver.findElement(Error_PopUp).getText();
		if(popUp_Msg.equalsIgnoreCase("Vendor onboard/offboard process completed successfully."))
			report.addReportStep("User received the expected message for Vendor 2- 'Vendor Onboard/Offboard process completed successfully.'",
				      "User received the expected message for Vendor 2- 'Vendor onboard/offboard process completed Successfully.'", 
				         StepResult.PASS);	
		else
			report.addReportStep("User did not receive the expected message for Vendor 2- 'Vendor onboard/offboard process completed successfully.'",
				      "User did not receive the expected message for Vendor 2- 'Vendor onboard/offboard process completed successfully.'", 
				         StepResult.FAIL);		
		Thread.sleep(500);
		wh.clickElement(Error_PopUp_OK);
		Thread.sleep(500);
		
		
		/*Vendor 3 - Urban 1,2,3,4*/
    	wh.clearElement(VendorName_Text);
       	wh.sendKeys(VendorName_Text,lstMap.get(2).get("VendorName"));
		wh.clickElement(Search_Button);
		System.out.println("1");
		wh.waitForPageLoaded();
		Thread.sleep(1000);
		wh.waitForElementPresent(Pgm_ID_First_Row);
		wh.clickElement(Pgm_ID_First_Row);
		System.out.println("2");
		Thread.sleep(500);
		wh.clickElement(Edit_Button);
		System.out.println("3");
		wh.waitForElementPresent(Edit_Expand_Arrow);
		wh.waitForPageLoaded();
        Thread.sleep(1000);
		wh.clickElement(Edit_Clear_Button);	
		Thread.sleep(1000);
		System.out.println("4");
		wh.clickElement(Edit_Expand_Arrow);
		System.out.println("5");
		wh.waitForElementPresent(Edit_Expand_Urban);
		wh.clickElement(Edit_Expand_Urban);
		Thread.sleep(1000);
		wh.waitForElementPresent(Edit_Choose_Market1_Urban);
		wh.clickElement(Edit_Choose_Market1_Urban);
		Thread.sleep(1000);
		wh.waitForElementPresent(Edit_Choose_Market2_Urban);
		wh.clickElement(Edit_Choose_Market2_Urban);
		Thread.sleep(1000);
		wh.waitForElementPresent(Edit_Choose_Market3_Urban);
		wh.clickElement(Edit_Choose_Market3_Urban);
		Thread.sleep(1000);
		wh.waitForElementPresent(Edit_Choose_Market4_Urban);
		wh.clickElement(Edit_Choose_Market4_Urban);	
		Thread.sleep(1000);
		wh.clickElement(Edit_Save_Button);
		Thread.sleep(1000);
		wh.waitForElementPresent(Error_PopUp_OK);
		popUp_Msg= driver.findElement(Error_PopUp).getText();
		if(popUp_Msg.equalsIgnoreCase("Vendor onboard/offboard process completed successfully."))
			report.addReportStep("User received the expected message for Vendor 3- 'Vendor Onboard/Offboard process completed successfully.'",
				      "User received the expected message for Vendor 3- 'Vendor onboard/offboard process completed Successfully.'", 
				         StepResult.PASS);	
		else
			report.addReportStep("User did not receive the expected message for Vendor 3- 'Vendor onboard/offboard process completed successfully.'",
				      "User did not receive the expected message for Vendor 3- 'Vendor onboard/offboard process completed successfully.'", 
				         StepResult.FAIL);	
		Thread.sleep(500);
		wh.clickElement(Error_PopUp_OK);
		System.out.println("Arrow clicked");	
		
    	
    }
    public void Verify_CP_Onboard_Markets_Not_Visible_In_MP(TableData table) throws Throwable{
    	/*Vendor 1 - Urban 2,3*/
    	wh.clickElement(Clear_Button);
    	Thread.sleep(1000);
    	wh.clearElement(VendorName_Text);
    	List<Map<String,String>> lstMap = table.asMaps(String.class, String.class);
       	wh.sendKeys(VendorName_Text,lstMap.get(0).get("VendorName"));
		wh.clickElement(Search_Button);
		System.out.println("1");
		wh.waitForPageLoaded();
		Thread.sleep(1000);
		wh.waitForElementPresent(Pgm_ID_First_Row);
		wh.clickElement(Pgm_ID_First_Row);
		System.out.println("2");
		Thread.sleep(500);
		wh.clickElement(Edit_Button);
		System.out.println("3");
		wh.waitForElementPresent(Edit_Expand_Arrow);
		Thread.sleep(1000);
		wh.clickElement(Edit_Expand_Arrow);
		System.out.println("5");
		wh.waitForElementPresent(Edit_Expand_Urban);
		wh.clickElement(Edit_Expand_Urban);
		Thread.sleep(1000);
		presence=wh.isElementPresent(Edit_Choose_Market2_Urban);
		Thread.sleep(1000);
		if(!presence){
		presence=wh.isElementPresent(Edit_Choose_Market3_Urban);
		Thread.sleep(1000);
		wh.clickElement(Edit_Cancel_Button);
		Thread.sleep(1000);
		}
		
		if(!presence)
			report.addReportStep("The markets that were onboarded into the Custom Pgm is not visible in the Master Program for Vendor 1- "+VendorName_Text,
				      "The markets that were onboarded into the Custom Pgm is not visible in the Master Program for Vendor 1- "+VendorName_Text, 
				         StepResult.PASS);	
		else
			report.addReportStep("The markets that were onboarded into the Custom Pgm is still visible in the Master Program for Vendor 1- "+VendorName_Text,
				      "The markets that were onboarded into the Custom Pgm is still visible in the Master Program for Vendor 1- "+VendorName_Text, 
				         StepResult.FAIL);	
		Thread.sleep(500);
		
			
		
		/*Vendor 2 - Urban 1,2,3*/
    	wh.clearElement(VendorName_Text);
       	wh.sendKeys(VendorName_Text,lstMap.get(1).get("VendorName"));
		wh.clickElement(Search_Button);
		System.out.println("1");
		wh.waitForPageLoaded();
		Thread.sleep(1000);
		wh.waitForElementPresent(Pgm_ID_First_Row);
		wh.clickElement(Pgm_ID_First_Row);
		System.out.println("2");
		Thread.sleep(500);
		wh.clickElement(Edit_Button);
		System.out.println("3");
		wh.waitForElementPresent(Edit_Expand_Arrow);
		wh.waitForPageLoaded();
		Thread.sleep(1000);
		wh.clickElement(Edit_Expand_Arrow);
		wh.waitForElementPresent(Edit_Expand_Urban);
		wh.clickElement(Edit_Expand_Urban);
		Thread.sleep(1000);
		presence=wh.isElementPresent(Edit_Choose_Market2_Urban);
		Thread.sleep(1000);
		if(!presence){
		presence=wh.isElementPresent(Edit_Choose_Market3_Urban);
		Thread.sleep(1000);
		wh.clickElement(Edit_Cancel_Button);
		Thread.sleep(1000);
		}
		
		if(!presence)
			report.addReportStep("The markets that were onboarded into the Custom Pgm is not visible in the Master Program for Vendor 2- "+VendorName_Text,
				      "The markets that were onboarded into the Custom Pgm is not visible in the Master Program for Vendor 2- "+VendorName_Text, 
				         StepResult.PASS);	
		else
			report.addReportStep("The markets that were onboarded into the Custom Pgm is still visible in the Master Program for Vendor 2- "+VendorName_Text,
				      "The markets that were onboarded into the Custom Pgm is still visible in the Master Program for Vendor 2- "+VendorName_Text, 
				         StepResult.FAIL);	
		Thread.sleep(500);
		
		
		
		/*Vendor 3 - Urban 1,2,3,4*/
    	wh.clearElement(VendorName_Text);
       	wh.sendKeys(VendorName_Text,lstMap.get(2).get("VendorName"));
		wh.clickElement(Search_Button);
		System.out.println("1");
		wh.waitForPageLoaded();
		Thread.sleep(1000);
		wh.waitForElementPresent(Pgm_ID_First_Row);
		wh.clickElement(Pgm_ID_First_Row);
		System.out.println("2");
		Thread.sleep(500);
		wh.clickElement(Edit_Button);
		System.out.println("3");
		wh.waitForElementPresent(Edit_Expand_Arrow);
		wh.waitForPageLoaded();
        Thread.sleep(1000);
		System.out.println("4");
		wh.clickElement(Edit_Expand_Arrow);
		System.out.println("5");
		wh.waitForElementPresent(Edit_Expand_Urban);
		wh.clickElement(Edit_Expand_Urban);
		Thread.sleep(1000);
		presence=wh.isElementPresent(Edit_Choose_Market2_Urban);
		Thread.sleep(1000);
		if(!presence){
		presence=wh.isElementPresent(Edit_Choose_Market3_Urban);
		Thread.sleep(1000);
		wh.clickElement(Edit_Cancel_Button);
		Thread.sleep(1000);
		}
		
		if(!presence)
			report.addReportStep("The markets that were onboarded into the Custom Pgm is not visible in the Master Program for Vendor 3- "+VendorName_Text,
				      "The markets that were onboarded into the Custom Pgm is not visible in the Master Program for Vendor 3- "+VendorName_Text, 
				         StepResult.PASS);	
		else
			report.addReportStep("The markets that were onboarded into the Custom Pgm is still visible in the Master Program for Vendor 3- "+VendorName_Text,
				      "The markets that were onboarded into the Custom Pgm is still visible in the Master Program for Vendor 3- "+VendorName_Text, 
				         StepResult.FAIL);	
		Thread.sleep(500);
			
		
    	
    }
    public void Verify_CommonMarkets(String Custom_Program_Name) throws Throwable{
    	
		Thread.sleep(1000);
		wh.clickElement(Edit_Expand_Parent_Arrow);
		for(int i=2;i<=3;i++)  /*if expecting more common markets, change i value*/
		{
		Common_Markets_Actual_From_UI.add(driver.findElement(By.xpath("//*[@id='cobCustPgmEditTreePopup']/div[4]/div[3]/div/div["+i+"]/div")).getText());
		}
		
		Common_Markets_Expected_From_UI.add("373 - W 23RD STREET"); /*if expecting more common markets, add them here*/
		Common_Markets_Expected_From_UI.add("374 - 59TH STREET");
    	
    	if(Common_Markets_Actual_From_UI.equals(Common_Markets_Expected_From_UI))    		
    			report.addReportStep("The edit screen of the custom program displayed the right common markets",
    				      "The edit screen of the custom program displayed the right common markets", 
    				         StepResult.PASS);	
    		else
    			report.addReportStep("The edit screen of the custom program did not display the right common markets",
    				      "The edit screen of the custom program did not display the right common markets", 
    				         StepResult.FAIL);    		
    }
    
    public void Save_CommonMarket_And_Verify_In_DB(String Custom_Program_Name) throws Throwable{
    	
    	wh.clickElement(Edit_Choose_Common_Market_1);
    	Edit_Choose_Common_Market_1_Mkt_Num_Parts=Edit_Choose_Common_Market_1_Mkt_Num.split("_");
    	wh.clickElement(Edit_Choose_Common_Market_2);
    	Edit_Choose_Common_Market_2_Mkt_Num_Parts=Edit_Choose_Common_Market_2_Mkt_Num.split("_");
    	wh.clickElement(Edit_CP_Save_Button);
    	wh.waitForElementPresent(Error_PopUp_OK);
    	Thread.sleep(1000);
		popUp_Msg= driver.findElement(Error_PopUp).getText();
		if(popUp_Msg.equalsIgnoreCase("Vendor onboard/offboard process completed succesfully."))
			report.addReportStep("User received the expected message for Custom Program- 'Vendor onboard/offboard process completed successfully.'",
				      "User received the expected message for Custom Program- 'Vendor onboard/offboard process completed successfully.'", 
				       StepResult.PASS);	
		else
			report.addReportStep("User did not receive the expected message for Custom Program- 'Vendor onboard/offboard process completed successfully.'",
				      "User did not receive the expected message for Custom Program- 'Vendor onboard/offboard process completed successfully.'", 
				       StepResult.FAIL);
		Thread.sleep(500);
		wh.clickElement(Error_PopUp_OK);	
		
		/*Program id from DB*/
		Program_ID_From_DB=jDBC_Connection.array_Database_Connection("Select COR_PGM_ID from QA1MM.COR_PGM where COR_PGM_DESC='"+Custom_Program_Name+"-CP'");
		/*Removing brackets from the array*/
		String Program_ID_From_DB_Text="";
		for (String s : Program_ID_From_DB)
		{
			Program_ID_From_DB_Text += s + "\t";
		}
		
		/*CUSTOM PROGRAM*/
		/*Checking if the store group id of the common market saved for the custom program reflects in the COR_STR_GRP_PGM table*/
		
		/*Finding the store group id using market number*/
		Store_Grp_ID_Of_Mkts_Using_MktNum=jDBC_Connection.array_Database_Connection("Select COR_STR_GRP_ID from QA1MM.cor_str_grp where MKT_NBR in ("+Edit_Choose_Common_Market_1_Mkt_Num_Parts[0]+","+Edit_Choose_Common_Market_2_Mkt_Num_Parts[0]+") with ur"); /*If adding more common markets add the market numbers in query*/
	
		/*Checking if the above Store_Grp_ID_Of_Mkts are present in cor_str_grp_pgm and cor_str_grp_str of the Custom program*/
		Store_Grp_ID_Of_Mkts_From_StrGrpPgm=jDBC_Connection.array_Database_Connection("Select distinct(COR_STR_GRP_ID) from QA1MM.COR_str_grp_pgm where COR_PGM_ID in ("+Program_ID_From_DB_Text+") with ur");
		
    	if(Store_Grp_ID_Of_Mkts_Using_MktNum.equals(Store_Grp_ID_Of_Mkts_From_StrGrpPgm))
    		report.addReportStep("The store group id's of the common market saved for the custom program is available in COR_STR_GRP_PGM table",
				      "The store group id's of the common market saved for the custom program is available in COR_STR_GRP_PGM table", 
				         StepResult.PASS);	
		else
			report.addReportStep("The store group id's of the common market saved for the custom program is not available in COR_STR_GRP_PGM table",
				      "The store group id's of the common market saved for the custom program is not available in COR_STR_GRP_PGM table", 
				         StepResult.FAIL);	
    	
    	/*Checking if the store group id of the common market saved for the custom program reflects in the COR_STR_GRP_STR table*/
	 
		Store_Grp_ID_Of_Mkts_From_StrGrpStr=jDBC_Connection.array_Database_Connection("Select distinct(COR_STR_GRP_ID) from QA1MM.COR_str_grp_str where COR_PGM_ID in ("+Program_ID_From_DB_Text+") with ur");
		Store_Grp_ID_Of_Mkts_Saved_In_Custom_Pgm=new ArrayList<String>(Store_Grp_ID_Of_Mkts_From_StrGrpStr);
				
    	if(Store_Grp_ID_Of_Mkts_Using_MktNum.equals(Store_Grp_ID_Of_Mkts_From_StrGrpStr))
    		report.addReportStep("The store group id's of the common market saved for the custom program is available in COR_STR_GRP_STR table",
				      "The store group id's of the common market saved for the custom program is available in COR_STR_GRP_STR table", 
				         StepResult.PASS);	
		else
			report.addReportStep("The store group id's of the common market saved for the custom program is not available in COR_STR_GRP_STR table",
				      "The store group id's of the common market saved for the custom program is not available in COR_STR_GRP_STR table", 
				         StepResult.FAIL);	
    	
    	
    	/*MASTER PROGRAM*/
    	
        /*Checking if the store group id of the common market saved for the custom program is removed from the COR_STR_GRP_PGM table for the master program*/
		
		/*Finding the store group id using market number*/
		Store_Grp_ID_Of_Mkts_Using_MktNum=jDBC_Connection.array_Database_Connection("Select COR_STR_GRP_ID from QA1MM.cor_str_grp where MKT_NBR in ("+Edit_Choose_Common_Market_1_Mkt_Num_Parts[0]+","+Edit_Choose_Common_Market_2_Mkt_Num_Parts[0]+") with ur"); /*If adding more common markets add the market numbers in query*/
	
		String Master_Program_ID_From_DB_Text="2304,2314,2313"; /*If adding more master programs change here*/

		/*Checking if the above Store_Grp_ID_Of_Mkts are removed from cor_str_grp_pgm and cor_str_grp_str for the master program*/
		Store_Grp_ID_Of_Mkts_From_StrGrpPgm=jDBC_Connection.array_Database_Connection("Select distinct(COR_STR_GRP_ID) from QA1MM.COR_str_grp_pgm where COR_PGM_ID in ("+Master_Program_ID_From_DB_Text+") with ur");
		
    //	if(Store_Grp_ID_Of_Mkts_From_StrGrpPgm.isEmpty())
		if(Collections.disjoint(Store_Grp_ID_Of_Mkts_From_StrGrpPgm, Store_Grp_ID_Of_Mkts_Saved_In_Custom_Pgm))
    		report.addReportStep("The store group id's of the common market saved for the custom program is removed from the COR_STR_GRP_PGM table for the master program",
				      "The store group id's of the common market saved for the custom program is removed from the COR_STR_GRP_PGM table for the master program", 
				         StepResult.PASS);	
		else
			report.addReportStep("The store group id's of the common market saved for the custom program is not removed from the COR_STR_GRP_PGM table for the master program",
				      "The store group id's of the common market saved for the custom program is not removed from the COR_STR_GRP_PGM table for the master program", 
				         StepResult.FAIL);	
    	
    	/*Checking if the store group id of the common market saved for the custom program is removed from the COR_STR_GRP_STR table for the master program*/
	 
		Store_Grp_ID_Of_Mkts_From_StrGrpStr=jDBC_Connection.array_Database_Connection("Select distinct(COR_STR_GRP_ID) from QA1MM.COR_str_grp_str where COR_PGM_ID in ("+Master_Program_ID_From_DB_Text+") with ur");
		
		if(Collections.disjoint(Store_Grp_ID_Of_Mkts_From_StrGrpStr, Store_Grp_ID_Of_Mkts_Saved_In_Custom_Pgm))
    		report.addReportStep("The store group id's of the common market saved for the custom program is removed from the COR_STR_GRP_STR table for the master program",
				      "The store group id's of the common market saved for the custom program is removed from the COR_STR_GRP_STR table for the master program", 
				         StepResult.PASS);	
		else
			report.addReportStep("The store group id's of the common market saved for the custom program is not removed from the COR_STR_GRP_STR table for the master program",
				      "The store group id's of the common market saved for the custom program is not removed from the COR_STR_GRP_STR table for the master program", 
				         StepResult.FAIL);    	
    }
    
    /*To be edited once stores are in*/
    public void Onboard_Stores_Vendors(TableData table) throws Throwable{
    	/*Vendor 1 - Atlanta-stores 2,3*/
    	wh.clearElement(VendorName_Text);
    	List<Map<String,String>> lstMap = table.asMaps(String.class, String.class);
       	wh.sendKeys(VendorName_Text,lstMap.get(0).get("VendorName"));
		wh.clickElement(Search_Button);
		System.out.println("1");
		wh.waitForPageLoaded();
		Thread.sleep(1000);
		wh.waitForElementPresent(Pgm_ID_First_Row);
		wh.clickElement(Pgm_ID_First_Row);
		System.out.println("2");
		Thread.sleep(500);
		wh.clickElement(Edit_Button);
		System.out.println("3");
		wh.waitForElementPresent(Edit_Expand_Arrow);
		Thread.sleep(1000);
		wh.clickElement(Edit_Clear_Button);	
		System.out.println("4");
		wh.clickElement(Edit_Expand_Arrow);    
		System.out.println("5");
		wh.waitForElementPresent(Edit_Expand_Southeast);   // To be changed
		wh.clickElement(Edit_Expand_Southeast);   // To be changed
		System.out.println("6");
		Thread.sleep(1000);
		wh.waitForElementPresent(Edit_Expand_Market1_Southeast);
		wh.clickElement(Edit_Expand_Market1_Southeast);
		Thread.sleep(1000);
		wh.waitForElementPresent(Edit_Choose_Store2_Atlanta);  // To be changed
		wh.clickElement(Edit_Choose_Store2_Atlanta);  // To be changed
		Thread.sleep(1000);
		wh.waitForElementPresent(Edit_Choose_Store3_Atlanta);
		wh.clickElement(Edit_Choose_Store3_Atlanta);	  // To be changed
		Thread.sleep(1000);
		wh.clickElement(Edit_Save_Button);
		Thread.sleep(1000);
		wh.waitForElementPresent(Error_PopUp_OK);
		popUp_Msg= driver.findElement(Error_PopUp).getText();
		if(popUp_Msg.equalsIgnoreCase("Vendor onboard/offboard process completed successfully."))
			report.addReportStep("User received the expected message for Vendor 1- 'Vendor Onboard/Offboard process completed successfully.'",
				      "User received the expected message for Vendor 1- 'Vendor onboard/offboard process completed Successfully.'", 
				         StepResult.PASS);	
		else
			report.addReportStep("User did not receive the expected message for Vendor 1- 'Vendor onboard/offboard process completed successfully.'",
				      "User did not receive the expected message for Vendor 1- 'Vendor onboard/offboard process completed successfully.'", 
				         StepResult.FAIL);	
		Thread.sleep(500);
		wh.clickElement(Error_PopUp_OK);
		Thread.sleep(500);
		
		
		/*Vendor 2 - Atlanta-stores 1,2,3*/
    	wh.clearElement(VendorName_Text);
    	wh.sendKeys(VendorName_Text,lstMap.get(1).get("VendorName"));
		wh.clickElement(Search_Button);
		System.out.println("1");
		wh.waitForPageLoaded();
		Thread.sleep(1000);
		wh.waitForElementPresent(Pgm_ID_First_Row);
		wh.clickElement(Pgm_ID_First_Row);
		System.out.println("2");
		Thread.sleep(500);
		wh.clickElement(Edit_Button);
		System.out.println("3");
		wh.waitForElementPresent(Edit_Expand_Arrow);
		wh.waitForPageLoaded();
		Thread.sleep(1000);
		wh.clickElement(Edit_Clear_Button);	
		wh.clickElement(Edit_Expand_Arrow);
		wh.waitForElementPresent(Edit_Expand_Southeast); // To be changed
		wh.clickElement(Edit_Expand_Southeast); // To be changed
		wh.waitForElementPresent(Edit_Expand_Market1_Southeast);
		wh.clickElement(Edit_Expand_Market1_Southeast);
		Thread.sleep(1000);
		wh.waitForElementPresent(Edit_Choose_Store1_Atlanta); // To be changed
		wh.clickElement(Edit_Choose_Store1_Atlanta); // To be changed
		Thread.sleep(1000);
		wh.waitForElementPresent(Edit_Choose_Store2_Atlanta);
		wh.clickElement(Edit_Choose_Store2_Atlanta);	// To be changed
		Thread.sleep(1000);
		wh.waitForElementPresent(Edit_Choose_Store3_Atlanta);
		wh.clickElement(Edit_Choose_Store3_Atlanta);
		Thread.sleep(1000);
		wh.clickElement(Edit_Save_Button);
		Thread.sleep(1000);
		wh.waitForElementPresent(Error_PopUp_OK);
		popUp_Msg= driver.findElement(Error_PopUp).getText();
		if(popUp_Msg.equalsIgnoreCase("Vendor onboard/offboard process completed successfully."))
			report.addReportStep("User received the expected message for Vendor 2- 'Vendor Onboard/Offboard process completed successfully.'",
				      "User received the expected message for Vendor 2- 'Vendor onboard/offboard process completed Successfully.'", 
				         StepResult.PASS);	
		else
			report.addReportStep("User did not receive the expected message for Vendor 2- 'Vendor onboard/offboard process completed successfully.'",
				      "User did not receive the expected message for Vendor 2- 'Vendor onboard/offboard process completed successfully.'", 
				         StepResult.FAIL);		
		Thread.sleep(500);
		wh.clickElement(Error_PopUp_OK);
		Thread.sleep(500);
		
		
		/*Vendor 3 - Atlanta-stores 1,2,3,4*/
    	wh.clearElement(VendorName_Text);
    	wh.sendKeys(VendorName_Text,lstMap.get(2).get("VendorName"));
		wh.clickElement(Search_Button);
		System.out.println("1");
		wh.waitForPageLoaded();
		Thread.sleep(1000);
		wh.waitForElementPresent(Pgm_ID_First_Row);
		wh.clickElement(Pgm_ID_First_Row);
		System.out.println("2");
		Thread.sleep(500);
		wh.clickElement(Edit_Button);
		System.out.println("3");
		wh.waitForElementPresent(Edit_Expand_Arrow);
		wh.waitForPageLoaded();
		Thread.sleep(1000);
		wh.clickElement(Edit_Clear_Button);	
		System.out.println("4");
		wh.clickElement(Edit_Expand_Arrow);
		System.out.println("5");
		wh.waitForElementPresent(Edit_Expand_Southeast);  // To be changed
		wh.clickElement(Edit_Expand_Southeast); // To be changed
		wh.waitForElementPresent(Edit_Expand_Market1_Southeast);
		wh.clickElement(Edit_Expand_Market1_Southeast);
		Thread.sleep(1000);
		wh.waitForElementPresent(Edit_Choose_Store1_Atlanta); // To be changed
		wh.clickElement(Edit_Choose_Store1_Atlanta); // To be changed
		Thread.sleep(1000);
		wh.waitForElementPresent(Edit_Choose_Store2_Atlanta);
		wh.clickElement(Edit_Choose_Store2_Atlanta);	// To be changed
		Thread.sleep(1000);
		wh.waitForElementPresent(Edit_Choose_Store3_Atlanta);
		wh.clickElement(Edit_Choose_Store3_Atlanta);
		Thread.sleep(1000);
		wh.waitForElementPresent(Edit_Choose_Store4_Atlanta);
		wh.clickElement(Edit_Choose_Store4_Atlanta);
		Thread.sleep(1000);
		wh.clickElement(Edit_Save_Button);
		Thread.sleep(1000);
		wh.waitForElementPresent(Error_PopUp_OK);
		popUp_Msg= driver.findElement(Error_PopUp).getText();
		if(popUp_Msg.equalsIgnoreCase("Vendor onboard/offboard process completed successfully."))
			report.addReportStep("User received the expected message for Vendor 3- 'Vendor Onboard/Offboard process completed successfully.'",
				      "User received the expected message for Vendor 3- 'Vendor onboard/offboard process completed Successfully.'", 
				         StepResult.PASS);	
		else
			report.addReportStep("User did not receive the expected message for Vendor 3- 'Vendor onboard/offboard process completed successfully.'",
				      "User did not receive the expected message for Vendor 3- 'Vendor onboard/offboard process completed successfully.'", 
				         StepResult.FAIL);	
		Thread.sleep(500);
		wh.clickElement(Error_PopUp_OK);
		System.out.println("Arrow clicked");	
		
    	
    }
    
   public void Verify_CommonStores(String Custom_Program_Name) throws Throwable{
    	
		Thread.sleep(1000);
		wh.clickElement(Edit_Expand_Parent_Arrow);
		wh.clickElement(Edit_Expand_Sub_Parent_Arrow);
		for(int i=3;i<=4;i++)  /*if expecting more common stores, change i value*/
		{
		Common_Stores_Actual_From_UI.add(driver.findElement(By.xpath("//*[@id='cobCustPgmEditTreePopup']/div[4]/div[3]/div/div["+i+"]/div")).getText());
		}
		
		Common_Stores_Expected_From_UI.add("106 - KENNESAW"); //to be changed /*if expecting more common stores, add them here*/
		Common_Stores_Expected_From_UI.add("110 - LILBURN");
    	
    	if(Common_Stores_Actual_From_UI.equals(Common_Stores_Expected_From_UI))    		
    			report.addReportStep("The edit screen of the custom program displayed the right common stores",
    				      "The edit screen of the custom program displayed the right common stores", 
    				         StepResult.PASS);	
    		else
    			report.addReportStep("The edit screen of the custom program did not display the right common stores",
    				      "The edit screen of the custom program did not display the right common stores", 
    				         StepResult.FAIL);    		
    }
    
    public void Save_CommonStore_And_Verify_In_DB(String Custom_Program_Name) throws Throwable{
    	
    	Edit_Expand_Market1_Southeast_Mkt_Num_Parts=Edit_Expand_Market1_Southeast_Mkt_Num.split("_");
    //	wh.clickElement(Edit_Choose_Common_Store_1); // To be changed
    //	wh.clickElement(Edit_Choose_Common_Store_2); // To be changed    
    	wh.clickElement(Edit_Choose_Atlanta);
    	Thread.sleep(1000);
    	wh.clickElement(Edit_CP_Save_Button);
    	wh.waitForElementPresent(Error_PopUp_OK);
		popUp_Msg= driver.findElement(Error_PopUp).getText();
		if(popUp_Msg.equalsIgnoreCase("Vendor onboard/offboard process completed succesfully."))
			report.addReportStep("User received the expected message for Custom Program- 'Vendor onboard/offboard process completed successfully.'",
				      "User received the expected message for Custom Program- 'Vendor onboard/offboard process completed successfully.'", 
				       StepResult.PASS);	
		else
			report.addReportStep("User did not receive the expected message for Custom Program- 'Vendor onboard/offboard process completed successfully.'",
				      "User did not receive the expected message for Custom Program- 'Vendor onboard/offboard process completed successfully.'", 
				       StepResult.FAIL);
		Thread.sleep(500);
		wh.clickElement(Error_PopUp_OK);	
		
		/*Program id from DB*/
		Program_ID_From_DB=jDBC_Connection.array_Database_Connection("Select COR_PGM_ID from QA1MM.COR_PGM where COR_PGM_DESC='"+Custom_Program_Name+"-CP'");
		/*Removing brackets from the array*/
		String Program_ID_From_DB_Text="";
		for (String s : Program_ID_From_DB)
		{
			Program_ID_From_DB_Text += s + "\t";
		}
		
		/*CUSTOM PROGRAM*/
		/*Checking if the store group id of the common store saved for the custom program reflects in the COR_STR_GRP_PGM table*/
		
		/*Finding the store group id using market number*/
		Store_Grp_ID_Of_Mkts_Using_MktNum=jDBC_Connection.array_Database_Connection("Select COR_STR_GRP_ID from QA1MM.cor_str_grp where MKT_NBR in ("+Edit_Expand_Market1_Southeast_Mkt_Num_Parts[0]+") with ur"); /*If adding more common markets add the market numbers in query*/
	
		/*Checking if the above Store_Grp_ID_Of_Mkts are present in cor_str_grp_pgm and cor_str_grp_str of the Custom program*/
		Store_Grp_ID_Of_Mkts_From_StrGrpPgm=jDBC_Connection.array_Database_Connection("Select distinct(COR_STR_GRP_ID) from QA1MM.COR_str_grp_pgm where COR_PGM_ID in ("+Program_ID_From_DB_Text+") with ur");
		
    	if(Store_Grp_ID_Of_Mkts_Using_MktNum.equals(Store_Grp_ID_Of_Mkts_From_StrGrpPgm))
    		report.addReportStep("The store group id's of the common stores saved for the custom program is available in COR_STR_GRP_PGM table",
				      "The store group id's of the common stores saved for the custom program is available in COR_STR_GRP_PGM table", 
				         StepResult.PASS);	
		else
			report.addReportStep("The store group id's of the common stores saved for the custom program is not available in COR_STR_GRP_PGM table",
				      "The store group id's of the common stores saved for the custom program is not available in COR_STR_GRP_PGM table", 
				         StepResult.FAIL);	
    	
    	/*Checking if the store group id of the common store saved for the custom program reflects in the COR_STR_GRP_STR table*/
	 
		Store_Grp_ID_Of_Mkts_From_StrGrpStr=jDBC_Connection.array_Database_Connection("Select distinct(COR_STR_GRP_ID) from QA1MM.COR_str_grp_str where COR_PGM_ID in ("+Program_ID_From_DB_Text+") with ur");
		
    	if(Store_Grp_ID_Of_Mkts_Using_MktNum.equals(Store_Grp_ID_Of_Mkts_From_StrGrpStr))
    		report.addReportStep("The store group id's of the common stores saved for the custom program is available in COR_STR_GRP_STR table",
				      "The store group id's of the common market saved for the custom program is available in COR_STR_GRP_STR table", 
				         StepResult.PASS);	
		else
			report.addReportStep("The store group id's of the common stores saved for the custom program is not available in COR_STR_GRP_STR table",
				      "The store group id's of the common market saved for the custom program is not available in COR_STR_GRP_STR table", 
				         StepResult.FAIL);	
    	
    	/*Checking if the store number of the common store saved for the custom program is present in the COR_STR_GRP_STR table*/
   	 
		Store_Num_From_StrGrpStr=jDBC_Connection.array_Database_Connection("Select STR_NBR from QA1MM.COR_str_grp_str where COR_PGM_ID in ("+Program_ID_From_DB_Text+") with ur");
		String Expected_Store_Numbers="106,110,";  /*Added newly*/ 
		/*Removing brackets from the array*/
		String Store_Num_From_StrGrpStr_Text="";
		for (String s : Store_Num_From_StrGrpStr)
		{
			Store_Num_From_StrGrpStr_Text += s + ",";
		}
    	if(Store_Num_From_StrGrpStr_Text.equals(Expected_Store_Numbers))
    		report.addReportStep("The store number of the common store saved for the custom program is available in the COR_STR_GRP_STR table for the custom program",
				      "The store number of the common store saved for the custom program is available in the COR_STR_GRP_STR table for the custom program", 
				         StepResult.PASS);	
		else
			report.addReportStep("The store number of the common store saved for the custom program is not available in the COR_STR_GRP_STR table for the custom program",
				      "The store number of the common store saved for the custom program is not available in the COR_STR_GRP_STR table for the custom program", 
				         StepResult.FAIL);    
    	
    	
    	/*MASTER PROGRAM*/
    	
        /*Checking if the store group id of the common market saved for the custom program is removed from the COR_STR_GRP_PGM table for the master program*/
		
		/*Finding the store group id using market number*/
		Store_Grp_ID_Of_Mkts_Using_MktNum=jDBC_Connection.array_Database_Connection("Select COR_STR_GRP_ID from QA1MM.cor_str_grp where MKT_NBR in ("+Edit_Expand_Market1_Southeast_Mkt_Num_Parts[0]+") with ur"); /*If adding more common markets add the market numbers in query*/
	
		String Master_Program_ID_From_DB_Text="2315,2314,2313"; /*If adding more master programs change here*/

		/*Checking if the above Store_Grp_ID_Of_Mkts are removed from cor_str_grp_pgm and cor_str_grp_str for the master program*/
		Store_Grp_ID_Of_Mkts_From_StrGrpPgm=jDBC_Connection.array_Database_Connection("Select distinct(COR_STR_GRP_ID) from QA1MM.COR_str_grp_pgm where COR_PGM_ID in ("+Master_Program_ID_From_DB_Text+") with ur");
		
    	if(Store_Grp_ID_Of_Mkts_From_StrGrpPgm.isEmpty())
    		report.addReportStep("The store group id's of the common market saved for the custom program is removed from the COR_STR_GRP_PGM table for the master program",
				      "The store group id's of the common market saved for the custom program is removed from the COR_STR_GRP_PGM table for the master program", 
				         StepResult.PASS);	
		else
			report.addReportStep("The store group id's of the common market saved for the custom program is not removed from the COR_STR_GRP_PGM table for the master program",
				      "The store group id's of the common market saved for the custom program is not removed from the COR_STR_GRP_PGM table for the master program", 
				         StepResult.FAIL);	
    	
    	/*Checking if the store number of the common store saved for the custom program is present in the COR_STR_GRP_STR table*/
      	 
		Store_Num_From_StrGrpStr=jDBC_Connection.array_Database_Connection("Select STR_NBR from QA1MM.COR_str_grp_str where COR_PGM_ID in ("+Master_Program_ID_From_DB_Text+") with ur");
		Expected_Store_Numbers="106,110,";  /*Added newly*/ 
		/*Removing brackets from the array*/
		Store_Num_From_StrGrpStr_Text="";
		for (String s : Store_Num_From_StrGrpStr)
		{
			Store_Num_From_StrGrpStr_Text += s + ",";
		}
    	if(Store_Num_From_StrGrpStr_Text.contains(Expected_Store_Numbers))
    		report.addReportStep("The store number of the common store saved for the custom program is available in the COR_STR_GRP_STR table for the master program",
				      "The store number of the common store saved for the custom program is available in the COR_STR_GRP_STR table for the master program", 
				         StepResult.FAIL);	
		else
			report.addReportStep("The store number of the common store saved for the custom program is not available in the COR_STR_GRP_STR table for the master program",
				      "The store number of the common store saved for the custom program is not available in the COR_STR_GRP_STR table for the master program", 
				         StepResult.PASS);    
    	   	
    }


	public void Delete_CP(String custom_Program_Name) throws Throwable{
		wh.clickElement(Clear_Button);    
		Thread.sleep(1000);
       	wh.sendKeys(CustomProgramName_Text,custom_Program_Name);
		wh.clickElement(Search_Button);
		wh.waitForPageLoaded();
		Thread.sleep(1000);
		wh.waitForElementPresent(Pgm_ID_First_Row);
		wh.clickElement(Pgm_ID_First_Row);
		Thread.sleep(1000);
	//	wh.clearElement(Delete_Button);
		wh.clickElement(Delete_Button);
		wh.waitForElementPresent(Error_PopUp_Yes);
    	Thread.sleep(1000);
		popUp_Msg= driver.findElement(Error_PopUp).getText();
		if(popUp_Msg.equalsIgnoreCase("Are you sure you want to delete the custom program?"))
			report.addReportStep("User received the expected message for Custom Program- 'Are you sure you want to delete the custom program?",
				      "User received the expected message for Custom Program- 'Are you sure you want to delete the custom program?", 
				       StepResult.PASS);	
		else
			report.addReportStep("User did not receive the expected message for Custom Program- 'Are you sure you want to delete the custom program?",
				      "User did not receive the expected message for Custom Program- 'Are you sure you want to delete the custom program?", 
				       StepResult.FAIL);
		wh.clickElement(Error_PopUp_Yes);
		wh.waitForPageLoaded();
		wh.waitForElementPresent(Error_PopUp);
		Thread.sleep(2000);
		popUp_Msg= driver.findElement(Error_PopUp).getText();
		if(popUp_Msg.equalsIgnoreCase("Custom program deleted successfully."))
			report.addReportStep("User received the expected message for Custom Program- Custom program deleted successfully.",
				      "User received the expected message for Custom Program- Custom program deleted successfully.", 
				       StepResult.PASS);	
		else
			report.addReportStep("User did not receive the expected message for Custom Program- Custom program deleted successfully.",
				      "User did not receive the expected message for Custom Program- Custom program deleted successfully.", 
				       StepResult.FAIL);
		
		
	}
	
	
	//------------------------------------------------------------//
//	 public void Verify_In_DB_After_Saving_For_Stores_To_Be_Saved(String Custom_Program_Name) throws Throwable{  
//		  
//	    	if(OnboardFlag.equals("4") || OnboardFlag.equals("5")) 
//	    	{
//	           /*If onboarded at store level and all common stores are onboarded*/
//			/*Checking if the above Store_Grp_ID_Of_Mkts are removed from cor_str_grp_pgm and cor_str_grp_str for the master program*/
//			Store_Grp_ID_Of_Mkts_From_StrGrpPgm=jDBC_Connection.array_Database_Connection("Select distinct(COR_STR_GRP_ID) from NY1.PRTHD.COR_str_grp_pgm where COR_PGM_ID in ("+Master_Program_ID_From_DB_Text+") and COR_STR_GRP_ID in("+Store_Grp_ID_Of_Mkts_Using_Common_MktNum_To_Be_Saved_Text+") with ur");
//			System.out.println("Store_Grp_ID_Of_Mkts_From_StrGrpPgm is "+Store_Grp_ID_Of_Mkts_From_StrGrpPgm);
//			
//	    	if(Store_Grp_ID_Of_Mkts_From_StrGrpPgm.isEmpty())
//	    		report.addReportStepNoScreenshots("The store group id's of the common market saved for the custom program is removed from the COR_STR_GRP_PGM table for the master program",
//					      "The store group id's of the common market saved for the custom program is removed from the COR_STR_GRP_PGM table for the master program", 
//					         StepResult.PASS);	    	 
//	    	   
//			else
//				report.addReportStepNoScreenshots("The store group id's of the common market saved for the custom program is not removed from the COR_STR_GRP_PGM table for the master program",
//					      "The store group id's of the common market saved for the custom program is not removed from the COR_STR_GRP_PGM table for the master program", 
//					         StepResult.FAIL);	
//	    	
//	    	/*Checking if the store group id of the common market saved for the custom program is removed from the COR_STR_GRP_STR table for the master program*/	 
//			Store_Grp_ID_Of_Mkts_From_StrGrpStr=jDBC_Connection.array_Database_Connection("Select distinct(COR_STR_GRP_ID) from NY1.PRTHD.COR_str_grp_str where COR_PGM_ID in ("+Master_Program_ID_From_DB_Text+") and COR_STR_GRP_ID in ("+Store_Grp_ID_Of_Mkts_Using_Common_MktNum_To_Be_Saved_Text+") and STR_NBR in ("+Store_Numbers_Clicked_On_Custom_Program_Text+") with ur");
//			System.out.println("Store_Grp_ID_Of_Mkts_From_StrGrpStr is "+Store_Grp_ID_Of_Mkts_From_StrGrpStr);
//			
//	    	if(Store_Grp_ID_Of_Mkts_From_StrGrpStr.isEmpty())
//	    		report.addReportStepNoScreenshots("The store group id's of the common market saved for the custom program is removed from the COR_STR_GRP_STR table for the master program",
//					      "The store group id's of the common market saved for the custom program is removed from the COR_STR_GRP_STR table for the master program", 
//					         StepResult.PASS);	
//			else
//				report.addReportStepNoScreenshots("The store group id's of the common market saved for the custom program is not removed from the COR_STR_GRP_STR table for the master program",
//					      "The store group id's of the common market saved for the custom program is not removed from the COR_STR_GRP_STR table for the master program", 
//					         StepResult.FAIL); 
//	    	
//	    	/*MASTER PGM HISTORY TABLES*/
//	    	/*Checking if the data got inserted into the history tables */
//	    	 History_Cor_Str_Grp_Pgm_Snap_From_Masters_After_Onboarding=jDBC_Connection.array_Database_Connection("Select COR_PGM_ID,COR_STR_GRP_ID,STR_GRP_SEQ_NBR,CRT_SYSUSR_ID,CRT_TS,LAST_UPD_SYSUSR_ID,LAST_UPD_TS,LOAD_MIN_WT,LOAD_MAX_WT,LOAD_MIN_VOL,LOAD_MAX_VOL,LOAD_INCR_CNT,LOAD_THRH_PCT,PO_AUTO_OPEN_FLG,CNTCT_EML_ADDR_TXT,BGN_FSCL_YR_WK_VAL,END_FSCL_YR_WK_VAL,SND_EMAIL_FLG,NEW_PRCSS_FLG,MID_DAY_RUN_FLG,EXCPT_STR_GRP_FLG,WKS_OF_SPLY_CNT,LOST_SLS_THRH_AMT,LOST_SLS_THRH_QTY from NY1.PRTHD.COR_STR_GRP_PGM_H where COR_PGM_ID in ("+Master_Program_ID_From_DB_Text+") and COR_STR_GRP_ID in ("+Store_Grp_ID_Of_Mkts_Using_Common_MktNum_To_Be_Saved_Text+") with ur");
//	 	     History_Cor_Str_Grp_Str_Snap_From_Masters_After_Onboarding=jDBC_Connection.array_Database_Connection("Select COR_PGM_ID,COR_STR_GRP_ID,STR_GRP_SEQ_NBR,STR_NBR,CRT_SYSUSR_ID,CRT_TS,LAST_UPD_SYSUSR_ID,LAST_UPD_TS,MID_DAY_EXCPT_FLG from NY1.PRTHD.COR_STR_GRP_STR_H where COR_PGM_ID in ("+Master_Program_ID_From_DB_Text+") and COR_STR_GRP_ID in ("+Store_Grp_ID_Of_Mkts_Using_Common_MktNum_To_Be_Saved_Text+") and STR_NBR in ("+Store_Numbers_Clicked_On_Custom_Program_Text+") with ur");
//	 	     System.out.println("History_Cor_Str_Grp_Pgm_Snap_From_Masters_After_Onboarding is "+History_Cor_Str_Grp_Pgm_Snap_From_Masters_After_Onboarding);
//	 	     System.out.println("History_Cor_Str_Grp_Str_Snap_From_Masters_After_Onboarding is "+History_Cor_Str_Grp_Str_Snap_From_Masters_After_Onboarding);
//	 	    
//	 	     if(History_Cor_Str_Grp_Pgm_Snap_From_Masters_After_Onboarding.equals(Cor_Str_Grp_Pgm_Snap_From_Masters_Before_Onboarding))
//	    		
//	    		report.addReportStepNoScreenshots("The COR_STR_GRP_PGM History table is inserted with the data from the master table against the STR GRP ID of the common stores we saved for the custom program",
//					      "The COR_STR_GRP_PGM History table is inserted with the data from the master table against the STR GRP ID of the common stores we saved for the custom program", 
//					         StepResult.PASS);	
//			 else
//				report.addReportStepNoScreenshots("The COR_STR_GRP_PGM History table is not inserted with the data from the master table against the STR GRP ID of the common stores we saved for the custom program",
//					      "The COR_STR_GRP_PGM History table is not inserted with the data from the master table against the STR GRP ID of the common stores we saved for the custom program", 
//					         StepResult.FAIL); 
//	  	
//	    	 
//	    	 if(History_Cor_Str_Grp_Str_Snap_From_Masters_After_Onboarding.equals(Cor_Str_Grp_Str_Snap_From_Masters_Before_Onboarding))
//	     		
//	     		report.addReportStepNoScreenshots("The COR_STR_GRP_STR History table is inserted with the data from the master table against the STR GRP ID of the common market we saved for the custom program",
//	 				      "The COR_STR_GRP_STR History table is inserted with the data from the master table against the STR GRP ID of the common market we saved for the custom program", 
//	 				         StepResult.PASS);	
//	 		 else
//	 			report.addReportStepNoScreenshots("The COR_STR_GRP_STR History table is not inserted with the data from the master table against the STR GRP ID of the common market we saved for the custom program",
//	 				      "The COR_STR_GRP_STR History table is not inserted with the data from the master table against the STR GRP ID of the common market we saved for the custom program", 
//	 				         StepResult.FAIL);
//	    	 } 	
//	    	
//	    	
//	    
//	    }
//	    
//	    public void Verify_In_DB_After_Saving_For_Stores_NOT_To_Be_Saved(String Custom_Program_Name) throws Throwable{
//	   	 
//	        /*temp*/
//	    //   Master_Program_ID_From_DB_Text="1519,1520";   
//	   	
//	   	if(Store_Numbers_Not_Clicked_On_Custom_Program_Text!=null && (!OnboardFlag.equals("4") || !OnboardFlag.equals("5")))
//	             {    
//	       
//	   	Store_Grp_ID_Of_Mkts_Using_Common_MktNum_Not_To_Be_Saved_Text="";
//	       /*Finding the store group id using market number NOT to be saved*/
//	   	Store_Grp_ID_Of_Mkts_Using_Common_MktNum_Not_To_Be_Saved=jDBC_Connection.array_Database_Connection("Select COR_STR_GRP_ID from NY1.PRTHD.cor_str_grp where MKT_NBR in ("+Market_Numbers_Not_Clicked_On_Custom_Program_Text+") with ur"); /*If adding more common markets add the market numbers in query*/
//	    		
//	   	for (String s : Store_Grp_ID_Of_Mkts_Using_Common_MktNum_Not_To_Be_Saved)
//	   	{
//	   		Store_Grp_ID_Of_Mkts_Using_Common_MktNum_Not_To_Be_Saved_Text += s + ",";
//	   	}
//	   	if(Store_Grp_ID_Of_Mkts_Using_Common_MktNum_Not_To_Be_Saved_Text.contains(","))
//	   		Store_Grp_ID_Of_Mkts_Using_Common_MktNum_Not_To_Be_Saved_Text = Store_Grp_ID_Of_Mkts_Using_Common_MktNum_Not_To_Be_Saved_Text.substring(0,Store_Grp_ID_Of_Mkts_Using_Common_MktNum_Not_To_Be_Saved_Text.length()-1);		
//	   	System.out.println("List of store group id's of the common market numbers NOT checked in custom program are"+Store_Grp_ID_Of_Mkts_Using_Common_MktNum_Not_To_Be_Saved_Text);	
//	   	
//	   	/*SNAP OF THE MARKET FROM COR_STR_GRP_PGM OF THE MASTER PGM'S BEFORE ONBOARDING THE MARKET TO CUSTOM PROGRAM- For the Markets NOT to be saved*/
//	       Cor_Str_Grp_Pgm_Snap_From_Masters_After_Onboarding_For_Common_Markets_Not_Saved=jDBC_Connection.array_Database_Connection("Select * from NY1.PRTHD.COR_STR_GRP_PGM where COR_PGM_ID in ("+Master_Program_ID_From_DB_Text+") and COR_STR_GRP_ID in ("+Store_Grp_ID_Of_Mkts_Using_Common_MktNum_Not_To_Be_Saved_Text+") with ur");
//	       Cor_Str_Grp_Str_Snap_From_Masters_After_Onboarding_For_Common_Markets_Not_Saved=jDBC_Connection.array_Database_Connection("Select * from NY1.PRTHD.COR_STR_GRP_STR where COR_PGM_ID in ("+Master_Program_ID_From_DB_Text+") and COR_STR_GRP_ID in ("+Store_Grp_ID_Of_Mkts_Using_Common_MktNum_Not_To_Be_Saved_Text+") and STR_NBR in ("+Store_Numbers_Not_Clicked_On_Custom_Program_Text+") with ur");
//	       System.out.println("Cor_Str_Grp_Pgm_Snap_From_Masters_After_Onboarding_For_Common_Markets_Not_Saved is "+Cor_Str_Grp_Pgm_Snap_From_Masters_After_Onboarding_For_Common_Markets_Not_Saved); 
//	       System.out.println("Cor_Str_Grp_Str_Snap_From_Masters_After_Onboarding_For_Common_Markets_Not_Saved is "+Cor_Str_Grp_Str_Snap_From_Masters_After_Onboarding_For_Common_Markets_Not_Saved);
//	       
//	       if(Cor_Str_Grp_Pgm_Snap_From_Masters_Before_Onboarding_For_Common_Markets_Not_Saved.equals(Cor_Str_Grp_Pgm_Snap_From_Masters_After_Onboarding_For_Common_Markets_Not_Saved))
//	       	report.addReportStepNoScreenshots("The store group id's of the common market not saved for the custom program is remains the same for the COR_STR_GRP_PGM table for the master program",
//	   			      "The store group id's of the common market not saved for the custom program is remains the same for the COR_STR_GRP_PGM table for the master program", 
//	   			         StepResult.PASS);
//	       
//	       if(Cor_Str_Grp_Str_Snap_From_Masters_Before_Onboarding_For_Common_Markets_Not_Saved.equals(Cor_Str_Grp_Str_Snap_From_Masters_After_Onboarding_For_Common_Markets_Not_Saved))
//	       	report.addReportStepNoScreenshots("The store group id's of the common market not saved for the custom program is remains the same for the COR_STR_GRP_STR table for the master program",
//	   			      "The store group id's of the common market not saved for the custom program is remains the same for the COR_STR_GRP_STR table for the master program", 
//	   			         StepResult.PASS);
//	              }  
//	       
//	   }
//	    
//	    public void Verify_In_DB_Before_Saving_For_Stores_To_Be_Saved(String Custom_Program_Name) throws Throwable{
//	   	 
//		     /*temp*/
//		   //  Master_Program_ID_From_DB_Text="1527,1528";
//		    
//		    /*Finding the store group id using market number to be saved*/
//			Store_Grp_ID_Of_Mkts_Using_Common_MktNum_To_Be_Saved=jDBC_Connection.array_Database_Connection("Select COR_STR_GRP_ID from NY1.PRTHD.cor_str_grp where MKT_NBR in ("+Market_Numbers_Clicked_On_Custom_Program_Text+") with ur"); /*If adding more common markets add the market numbers in query*/
//		 		
//			for (String s : Store_Grp_ID_Of_Mkts_Using_Common_MktNum_To_Be_Saved)
//			{
//				Store_Grp_ID_Of_Mkts_Using_Common_MktNum_To_Be_Saved_Text += s + ",";
//			}
//			if(Store_Grp_ID_Of_Mkts_Using_Common_MktNum_To_Be_Saved_Text.contains(","))
//				Store_Grp_ID_Of_Mkts_Using_Common_MktNum_To_Be_Saved_Text = Store_Grp_ID_Of_Mkts_Using_Common_MktNum_To_Be_Saved_Text.substring(0,Store_Grp_ID_Of_Mkts_Using_Common_MktNum_To_Be_Saved_Text.length()-1);		
//			System.out.println("List of store group id's of the common market numbers checked in custom program are"+Store_Grp_ID_Of_Mkts_Using_Common_MktNum_To_Be_Saved_Text);	
//			
//			/*SNAP OF THE MARKET FROM COR_STR_GRP_PGM OF THE MASTER PGM'S BEFORE ONBOARDING THE MARKET TO CUSTOM PROGRAM - For the Markets to be saved*/
//		    Cor_Str_Grp_Pgm_Snap_From_Masters_Before_Onboarding=jDBC_Connection.array_Database_Connection("Select * from NY1.PRTHD.COR_STR_GRP_PGM where COR_PGM_ID in ("+Master_Program_ID_From_DB_Text+") and COR_STR_GRP_ID in ("+Store_Grp_ID_Of_Mkts_Using_Common_MktNum_To_Be_Saved_Text+") with ur");
//		    Cor_Str_Grp_Str_Snap_From_Masters_Before_Onboarding=jDBC_Connection.array_Database_Connection("Select * from NY1.PRTHD.COR_STR_GRP_STR where COR_PGM_ID in ("+Master_Program_ID_From_DB_Text+") and COR_STR_GRP_ID in ("+Store_Grp_ID_Of_Mkts_Using_Common_MktNum_To_Be_Saved_Text+") and STR_NBR in ("+Store_Numbers_Clicked_On_Custom_Program_Text+") with ur");	
//		    System.out.println("Cor_Str_Grp_Pgm_Snap_From_Masters_Before_Onboarding is "+Cor_Str_Grp_Pgm_Snap_From_Masters_Before_Onboarding); 
//		    System.out.println("Cor_Str_Grp_Str_Snap_From_Masters_Before_Onboarding is "+Cor_Str_Grp_Str_Snap_From_Masters_Before_Onboarding);
//		   
//	 }
//	   public void Verify_In_DB_Before_Saving_For_Stores_NOT_To_Be_Saved(String Custom_Program_Name) throws Throwable{
//		 
//	     /*temp*/
//	     //   Master_Program_ID_From_DB_Text="1519,1520";   
//		   if(Store_Numbers_Not_Clicked_On_Custom_Program_Text!=null && (!OnboardFlag.equals("4") || !OnboardFlag.equals("5")))
//	       {    
//		   
////	     /*Finding the store group id using store group id of market number's to be saved. This */
////		 Store_Grp_ID_Of_Mkts_Using_Common_MktNum_Not_To_Be_Saved=jDBC_Connection.array_Database_Connection("Select COR_STR_GRP_ID from NY1.PRTHD.cor_str_grp where MKT_NBR in ("+Store_Grp_ID_Of_Mkts_Using_Common_MktNum_To_Be_Saved_Text+") with ur"); /*If adding more common markets add the market numbers in query*/
//			
//		 for (String s : Store_Grp_ID_Of_Mkts_Using_Common_MktNum_Not_To_Be_Saved)
//		 {
//			Store_Grp_ID_Of_Mkts_Using_Common_MktNum_Not_To_Be_Saved_Text += s + ",";
//		 }
//		 if(Store_Grp_ID_Of_Mkts_Using_Common_MktNum_Not_To_Be_Saved_Text.contains(","))
//			Store_Grp_ID_Of_Mkts_Using_Common_MktNum_Not_To_Be_Saved_Text = Store_Grp_ID_Of_Mkts_Using_Common_MktNum_Not_To_Be_Saved_Text.substring(0,Store_Grp_ID_Of_Mkts_Using_Common_MktNum_Not_To_Be_Saved_Text.length()-1);		
//		 System.out.println("List of store group id's of the common market numbers NOT checked in custom program are"+Store_Grp_ID_Of_Mkts_Using_Common_MktNum_Not_To_Be_Saved_Text);	
//		
//		/*SNAP OF THE MARKET FROM COR_STR_GRP_PGM OF THE MASTER PGM'S BEFORE ONBOARDING THE MARKET TO CUSTOM PROGRAM- For the Markets NOT to be saved*/
//		 /*Explain*/
//		 if(Market_Numbers_Not_Clicked_On_Custom_Program_Text!=null)	 
//	     Cor_Str_Grp_Pgm_Snap_From_Masters_Before_Onboarding_For_Common_Markets_Not_Saved=jDBC_Connection.array_Database_Connection("Select * from NY1.PRTHD.COR_STR_GRP_PGM where COR_PGM_ID in ("+Master_Program_ID_From_DB_Text+") and COR_STR_GRP_ID in ("+Store_Grp_ID_Of_Mkts_Using_Common_MktNum_To_Be_Saved_Text+") with ur");
//		 else
//		 Cor_Str_Grp_Pgm_Snap_From_Masters_Before_Onboarding_For_Common_Markets_Not_Saved=null;
//		 /*Explain*/
//		 Cor_Str_Grp_Str_Snap_From_Masters_Before_Onboarding_For_Common_Markets_Not_Saved=jDBC_Connection.array_Database_Connection("Select * from NY1.PRTHD.COR_STR_GRP_STR where COR_PGM_ID in ("+Master_Program_ID_From_DB_Text+") and COR_STR_GRP_ID in ("+Store_Grp_ID_Of_Mkts_Using_Common_MktNum_To_Be_Saved_Text+") and STR_NBR in ("+Store_Numbers_Not_Clicked_On_Custom_Program_Text+") with ur");
//	     System.out.println("Cor_Str_Grp_Pgm_Snap_From_Masters_Before_Onboarding_For_Common_Markets_Not_Saved is "+Cor_Str_Grp_Pgm_Snap_From_Masters_Before_Onboarding_For_Common_Markets_Not_Saved); 
//	     System.out.println("Cor_Str_Grp_Str_Snap_From_Masters_Before_Onboarding_For_Common_Markets_Not_Saved is "+Cor_Str_Grp_Str_Snap_From_Masters_Before_Onboarding_For_Common_Markets_Not_Saved);
//	 
//	         }
//		 
//	}

}





