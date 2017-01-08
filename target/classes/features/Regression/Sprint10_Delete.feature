@MVNDRSearch
Feature: Verifying if different types of search criteria and buttons are working fine in MVNDR tab.

 @P2 @10 @DeleteButtonDisable
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
      
      
