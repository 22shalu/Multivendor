@CustomVendorGroup
Feature: Verifying if all custom vendors matching to the partial name are listed in the Custom Program Name field when user types in partial name

@P1 @4 @CustomProgramDropDown @170---------------
  Scenario Outline: IPR_Releases_Sprint4_170_Onboading_TC001_CustomVendorGrp_SearchTextBox
    Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    Then user choose Custom Vendor Group tab
    When user enters a partial <Custom_Program_Name> all matching custom program names from database should be listed
        
    Examples: 
      | userName |Password|Custom_Program_Name |
      | qat010   |qa02test|CP WITHVENDORS 1    |
      
      
@P1 @4 @CustomProgramResultGrid @170
  Scenario Outline: IPR_Releases_Sprint4_170_Onboading_TC002_CustomVendorGrp_SearchResultInGrid
    Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    Then user choose Custom Vendor Group tab
    When user enters a <Custom_Program_Name> in Custom Program Name field and the results grid should populate with all the vendors associated with that program 
    
    Examples: 
      | userName |Password|Custom_Program_Name|
      | qat010   |qa02test| TESTDEC6          |
      
   
@P1 @4 @InvalidCustomProgram @170
  Scenario Outline: IPR_Releases_Sprint4_170_Onboading_TC003_CustomVendorGrp_InvalidSearch
    Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    Then user choose Custom Vendor Group tab
    When user enters an invalid <Custom_Program_Name> in Custom Program Name field then error message should be thrown and results grid should be blank
    
    Examples: 
      | userName |Password|Custom_Program_Name|
      | qat010   |qa02test| ABCDE             |   
      
  
@P2 @5 @ValidCustomProgram @243
  Scenario Outline: IPR_Releases_Sprint5_243_Onboading_TC001_CustomVendorGrp_SearchTextBox_ValidProgramName
    Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    Then user choose Custom Vendor Group tab
    When user enters a <Custom_Program_Name> in Custom Program Name field and the results grid should populate with all the vendors associated with that program
    
    Examples: 
      | userName |Password|Custom_Program_Name |
      | qat010   |qa02test| CP WITHVENDORS 1    |  
  
  
  
@P2 @5 @InValidCustomProgram @243
  Scenario Outline: IPR_Releases_Sprint5_243_Onboading_TC002_CustomVendorGrp_SearchTextBox_InvalidProgramName
    Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    Then user choose Custom Vendor Group tab
    When user enters an invalid <Custom_Program_Name> in Custom Program Name field then error message should be thrown and results grid should be blank
    
    Examples: 
      | userName |Password|Custom_Program_Name|
      | qat010   |qa02test| ABCDE             |    
      
      
 @P2 @5 @ValidCustomProgram @243
  Scenario Outline: IPR_Releases_Sprint5_243_Onboading_TC003_CustomVendorGrp_SearchTextBox_Results grid
    Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    Then user choose Custom Vendor Group tab
    When user enters a <Valid_Custom_Program_Name> in Custom Program Name field and the results grid should populate with all the vendors associated with that program
    When user enters an invalid <Invalid_Custom_Program_Name> in Custom Program Name field then error message should be thrown and results grid should be blank
    
    Examples: 
      | userName |Password|Valid_Custom_Program_Name|Invalid_Custom_Program_Name |
      | qat010   |qa02test| CP WITHVENDORS 1        |     ABCDE                  |
      