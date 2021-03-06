@DeleteVendorsFromCustomProgram
Feature: Verifying if the user is able to delete the vendors from a custom program

@P2 @8 @DeleteVendorsFromCustomProgram @459
  Scenario Outline: IPR_Releases_Sprint6_322_(459-Itr8)_Onboading_TC001_Delete the vendors form Custom Program
    Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    Then user choose MVNDR tab
    Then user verify the current time stamp for the <Custom_Program_Name>
    Then user choose Custom Vendor Group tab
    When user enters a <Custom_Program_Name> in Custom Program Name field and the results grid should populate with all the vendors associated with that program 
    Then the user selects one vendor and click on delete button
    And  verify that the vendor record user selected is deleted from the results grid for <Custom_Program_Name>
    Then user choose MVNDR tab
    Then verify that the time stamp in MVNDR tab is updated for <Custom_Program_Name>
         
   Examples: 
      | userName |Password|Custom_Program_Name             |
      | qat010   |qa02test|CP WITH VENDORS & DELETE TEST 1 |
      
@P2 @8 @DeleteVendorsFromCustomProgram @459
  Scenario Outline: IPR_Releases_Sprint6_322__(459-Itr8)_Onboading_TC002_Delete the vendors form Custom Program
     Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    Then user choose MVNDR tab
    Then user verify the current time stamp for the <Custom_Program_Name>
    Then user choose Custom Vendor Group tab
    When user enters a <Custom_Program_Name> in Custom Program Name field and the results grid should populate with all the vendors associated with that program 
    Then the user selects one vendor and click on delete button
    Then the user selects one vendor and click on delete button
    Then user choose MVNDR tab
    Then verify that the time stamp in MVNDR tab is updated for <Custom_Program_Name>
            
   Examples: 
      | userName |Password|Custom_Program_Name             |
      | qat010   |qa02test|CP WITH VENDORS & DELETE TEST 1 |
      
 @P2 @8 @DeleteVendorsFromCustomProgram @459
  Scenario Outline: IPR_Releases_Sprint6_322__(459-Itr8)_Onboading_TC003_Delete the vendors form Custom Program
     Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    Then user choose MVNDR tab
    Then user verify the current time stamp for the <Custom_Program_Name>
    Then user choose Custom Vendor Group tab
    When user enters a <Custom_Program_Name> in Custom Program Name field and the results grid should populate with all the vendors associated with that program 
    Then the user selects delete all and click on delete button
    And verify that all the vendor records are deleted from the results grid for <Custom_Program_Name>
    Then user choose MVNDR tab
    Then verify that the time stamp in MVNDR tab is updated for <Custom_Program_Name>
            
         
   Examples: 
      | userName |Password|Custom_Program_Name             |
      | qat010   |qa02test|CP WITH VENDORS & DELETE TEST 1 |
 
 #Add some vendors to this custom program     
 @P2 @8 @DeleteVendorsFromCustomProgram @459
  Scenario Outline: IPR_Releases_Sprint6_322__(459-Itr8)_Onboading_TC004_Delete the vendors form Custom Program_And_Verify_Timestamp
     Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    Then user choose MVNDR tab
    Then user verify the current time stamp for the <Custom_Program_Name>
    Then user choose Custom Vendor Group tab
    When user enters a <Custom_Program_Name> in Custom Program Name field and the results grid should populate with all the vendors associated with that program 
    Then the user selects delete all and click on delete button
    And verify that all the vendor records are deleted from the results grid for <Custom_Program_Name>
    Then user choose MVNDR tab
    Then verify that the time stamp in MVNDR tab is updated for <Custom_Program_Name>
            
         
   Examples: 
      | userName |Password|Custom_Program_Name             |
      | qat010   |qa02test|CP WITH VENDORS & DELETE TEST 2 |
      
      
