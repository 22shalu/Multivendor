@UAT_Feedbacks
Feature: UAT Feedbacks as part of sprint_10

      
@P3 @10 @AddDuplicateVendorsToCustomProgramPopUp @10
  Scenario Outline: IPR_Releases_Sprint10_UAT_Feedbacks_TC001_Add_Vendor_Alert_Msg
    Given a user launches gridtstats url in <Browser> with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    Then user choose Custom Vendor Group tab
    When user enters a <Custom_Program_Name> in Custom Program Name field    
    Then user clicks on Add button and add the vendors and verify if they are listed in the results grid for the <Custom_Program_Name>
    When user again clicks on Add button and trys to add duplicate vendor verify that error message is thrown
    Then verify that the duplicate vendor is not listed in the results grid for <Custom_Program_Name>
    
     Examples: 
      | Browser | userName |Password|Custom_Program_Name   |
      | Chrome  | qat010   |qa02test| CP NO VENDORS 5 MAR7 |
      
      
@P2 @10 @DeleteButtonDisable @10
  Scenario Outline: IPR_Releases_Sprint10_UAT_Feedbacks_TC002_Disable_Delete_Button_And_CenterAlign_CheckBox
    Given a user launches gridtstats url in <Browser> with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    Then user choose Custom Vendor Group tab
    When user enters a <Custom_Program_Name> in Custom Program Name field and the results grid should populate with all the vendors associated with that program 
    When no vendors are selected verify that the delete button is disabled and when the user selects delete all verify that the delete button is enabled
            
     Examples: 
      | Browser | userName |Password|Custom_Program_Name             |
      | Chrome  | qat003   |qa02test|CP WITH VENDORS & DELETE TEST 3 |
      
      
      
@P2 @10 @AddCopyPaste @10
  Scenario Outline: IPR_Releases_Sprint10_TC002_MVNDR_Copy_Paste_Of_Spcl_Chara_In_Add_And_Update_Custom_Pgm_Name
    Given a user launches gridtstats url in <Browser> with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    Then user choose MVNDR tab
    When user clicks on Add button a pop up appears and user copies the <Custom_Program_Name> and pastes on the field and clicks on save button
    Then verify that the <Custom_Program_Name> entered by the user is not saved in database and error message is displayed    
    
    Examples: 
      | Browser | userName |Password|Custom_Program_Name  |
      | Chrome  | qat010   |qa02test| CP NEW 1 FEB24      |
      
      
      
  
    


      
