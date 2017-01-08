@MVNDRSearch
Feature: Verifying if different types of search criteria and buttons are working fine in MVNDR tab.

@P3 @6 @UATFEEDBACKPOPUPTITLES @324
  Scenario Outline: IPR_Releases_Sprint6_324_Onboading_TC001_UATFEEDBACK_Add_Custom_Program_Popup_Title
    Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    Then user choose MVNDR tab
    When user clicks on Add button verify the title of the pop up is Create Custom Program
        
    Examples: 
      | userName |Password|Custom_Program_Name|
      | qat010   |qa02test|Any CP             |
      
      
@P3 @6 @UATFEEDBACKPOPUPTITLES @324
  Scenario Outline: IPR_Releases_Sprint6_324_Onboading_TC002_UATFEEDBACK_Add_Vendor_To_Custom_Program_Popup_Title
    Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    Then user choose Custom Vendor Group tab
    When user enters a <Custom_Program_Name> in Custom Program Name field who does not have any vendors attached to it and an error message should pop up 
    Then user clicks on Add button and verify that the title of the pop up is Add New MVNDR to Custom Program
    
    
    Examples: 
      | userName |Password|Custom_Program_Name|
      | qat010   |qa02test|CP 4 NOVENDORS 1   |
      
   
@P3 @6 @UATFEEDBACKPOPUPTITLES @324
  Scenario Outline: IPR_Releases_Sprint6_324_Onboading_TC003_UATFEEDBACK_Edit_Custom_Program_Popup_Title
    Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    Then user choose MVNDR tab
    When user enters the <Vendor_Name> then the details are populated in the grid and then user clicks on edit button which opens a pop up and the user verifies the title of the pop up
    
    Examples: 
      | userName |Password|Vendor_Name            |
      | qat010   |qa02test| FENWAY PRODUCTS, INC. |   
      
@P3 @6 @UATFEEDBACKPOPUPTITLES @324
  Scenario Outline: IPR_Releases_Sprint6_324_Onboading_TC004_UATFEEDBACK_Clear_Button_In_Custom_Vendor_Group_Title
    Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    Then user choose Custom Vendor Group tab
    When user enters a <Custom_Program_Name> in Custom Program Name field and the results grid should populate with all the vendors associated with that program
    Then user clicks on Clear button all data in the UI are cleared
    
    Examples: 
      | userName |Password|Custom_Program_Name |
      | qat010   |qa02test|CP WITHVENDORS 1    |
      
      