@Onboarding_Add
Feature: Custom program name field and Add button validation in Custom program tab

@P1 @5 @CustomProgramResultGrid @190
  Scenario Outline: IPR_Releases_Sprint5_190_Onboading_TC001_Search_For_Custom_Program_Name
    Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    Then user choose Custom Vendor Group tab
    When user enters a <Custom_Program_Name> in Custom Program Name field and the results grid should populate with all the vendors associated with that program 
    
    Examples: 
      | userName |Password|Custom_Program_Name|
      | qat010   |qa02test| CP WITHVENDORS 1  |
      
      
 @P1 @5 @CustomProgramWithNoVendors @190
  Scenario Outline: IPR_Releases_Sprint5_190_Onboading_TC002_Search_For_Custom_Program_No_Vendors_attached
    Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    Then user choose Custom Vendor Group tab
    When user enters a <Custom_Program_Name> in Custom Program Name field who does not have any vendors attached to it and an error message should pop up 
    
    Examples: 
      | userName |Password|Custom_Program_Name|
      | qat010   |qa02test| CP 2 NOVENDORS 1  |
          

 @P1 @5 @CustomProgramAddVendors @190
  Scenario Outline: IPR_Releases_Sprint5_190_Onboading_TC003_Add_Vendors_to_Custom_Program
    Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    Then user choose Custom Vendor Group tab
    When user enters a <Custom_Program_Name> in Custom Program Name field who does not have any vendors attached to it and an error message should pop up 
    Then user clicks on Add button and add the vendors and verify if they are listed in the results grid for the <Custom_Program_Name>
    |VendorName         |VendorNum|
    |Trex Company, INC. |         |
    |ARAUCO             |         | 
    |Goodfellow         |         |       
    
    Examples: 
      | userName |Password|Custom_Program_Name |
      | skp8998  |qa02test| CP ONBOARDING 1    |    
      
  
 @P2 @5 @CustomProgramAddVendors @190
  Scenario Outline: IPR_Releases_Sprint5_190_Onboading_TC004_Add_Vendors_to_Custom_Program and search
    Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    Then user choose Custom Vendor Group tab
    When user enters a <Custom_Program_Name> in Custom Program Name field who has vendors attached to it
    Then user clicks on Add button and add the vendors and verify if they are listed in the results grid for the <Custom_Program_Name>
    |VendorName |VendorNum|
    |Goodfellow |         |
    |Roseburg   |         | 
    |DALTILE    |         |      
    
    Examples: 
      | userName |Password|Custom_Program_Name |
      | qat010   |qa02test| CP WITHVENDORS 1   |
 