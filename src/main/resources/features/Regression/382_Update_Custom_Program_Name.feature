@UpdateCustomProgramName
Feature: Verifying if the user is able to update the custom program name

@P2 @7 @UpdateCustomProgramName @382
  Scenario Outline: IPR_Releases_Sprint7_382_Onboading_TC001_CustomVendorGroup_Update_And_Verify_In_MVNDR_tab
    Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    And user choose Custom Vendor Group tab
    Then user enters the <Custom_Program_Name> and click on update button and verify that the custom program name update pop up is open
    Then user enters the <New_Custom_Program_Name> and click on save and verify that custom program name field and result grid are cleared and the new name is saved into database
    Then verify that the <New_Custom_Program_Name> is available in the custom program drop down
    Then user choose MVNDR tab
    And the user is able to search for the <New_Custom_Program_Name> in the MVNDR tab
    Then user goes back and update the <New_Custom_Program_Name> as <Custom_Program_Name>
         
    Examples: 
      | userName |Password|Custom_Program_Name    |New_Custom_Program_Name  |
      | qat010   |qa02test|CP NAME UPDATE 1       |   CP NAME IS UPDATED    |
      
      
@P2 @7 @UpdateCustomProgramName @382
  Scenario Outline: IPR_Releases_Sprint7_382_Onboading_TC002_CustomVendorGroup_Update_Without_SelectingAnyProgram
    Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    And user choose Custom Vendor Group tab
    When the user clicks on update button verify that error message is thrown and user is not able to update the program name
        
    Examples: 
      | userName |Password|Vendor_Number|
      | qat010   |qa02test| 11590       |
      
   
@P2 @7 @UpdateCustomProgramName @382
  Scenario Outline: IPR_Releases_Sprint7_382_Onboading_TC003_CustomVendorGroup_Update_With_ExistingProgramName
    Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    And user choose Custom Vendor Group tab
    Then user enters the <Custom_Program_Name> and click on update button and verify that the custom program name update pop up is open
    When the user enters and <Existing_Custom_Program_Name> and click on update error message should be thrown
    
    Examples: 
     | userName |Password|Custom_Program_Name|Existing_Custom_Program_Name|
     | qat010   |qa02test| CP NAME UPDATE    |      TESTDEC6              |
      
@P2 @7 @UpdateCustomProgramName @382
  Scenario Outline: IPR_Releases_Sprint7_382_Onboading_TC004_CustomVendorGroup_Update_With_ProgramName_Length50
    Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    And user choose Custom Vendor Group tab
    Then user enters the <Custom_Program_Name> and click on update button and verify that the custom program name update pop up is open
    Then user enters the <New_Custom_Program_Name> and click on save and verify that custom program name field and result grid are cleared and the new name is saved into database
    Then user goes back and update the <New_Custom_Program_Name> as <Custom_Program_Name>
    
    Examples: 
      | userName |Password|Custom_Program_Name   |New_Custom_Program_Name                             |
      | qat010   |qa02test| CP NAME UPDATE 2     |ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX  |
      
@P2 @7 @UpdateCustomProgramName @382
  Scenario Outline: IPR_Releases_Sprint7_382_Onboading_TC005_CustomVendorGroup_Update_With_InvalidProgramName
    Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    And user choose Custom Vendor Group tab
    Then user enters the <Invalid_Custom_Program_Name> and click on update button and verify that the user gets an error message
    
    Examples: 
      | userName |Password|Invalid_Custom_Program_Name |
      | qat010   |qa02test| CP 123                     |
      
@P2 @7 @UpdateCustomProgramName @382
  Scenario Outline: IPR_Releases_Sprint7_382_Onboading_TC006_CustomVendorGroup_Update_Verify_Special_Chara_Not_Allowed
    Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    And user choose Custom Vendor Group tab
    Then user enters the <Custom_Program_Name> and click on update button and verify that the custom program name update pop up is open
    Then user enters the <New_Custom_Program_Name_with_Special_Chara> and click on save and verify that user receives error message
    
    
    Examples: 
      | userName |Password|Custom_Program_Name                                |New_Custom_Program_Name_with_Special_Chara|
      | qat010   |qa02test| ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX| !@#$%^*()_+                             |  
      
     
