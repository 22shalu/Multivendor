@MVNDRSearch
Feature: Verifying if different types of search criteria and buttons are working fine in MVNDR tab.

@P2 @5 @MVNDRCustomProgramNewFieldsInResultGrid @284
  Scenario Outline: IPR_Releases_Sprint5_284_Onboading_TC001_MVNDR_Screen_Validation
    Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    Then user choose MVNDR tab
    When user enters the <Custom_Program_Name> then verify that in the results grid new columns like program id and custom program flag are displayed
        
    Examples: 
      | userName |Password|Custom_Program_Name |
      | qat010   |qa02test|CP WITHVENDORS 1    |
      
@P2 @5 @MVNDRCustomProgramSearch @284
  Scenario Outline: IPR_Releases_Sprint5_284_Onboading_TC002_MVNDR_Search_For_Custom_Master_Program
    Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    Then user choose MVNDR tab
    When user enters the <Custom_Program_Name> then the details associated with the particular custom program name from database should be listed and all other search fields should be disabled
    When user enters the <Vendor_Name> then the details associated with the particular vendor name from database should be listed and all other search fields should be disabled
        
    Examples: 
      | userName |Password|Custom_Program_Name  |Vendor_Name           |
      | qat010   |qa02test|CP WITHVENDORS 1     |FENWAY PRODUCTS, INC. | 
      
      
@P2 @5 @MVNDRVendorNumberSearch @284
  Scenario Outline: IPR_Releases_Sprint5_284_Onboading_TC003_MVNDR_Search_for_Custom_Program
    Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    Then user choose MVNDR tab
    When user enters the <Custom_Program_Name> and should be able to hover the mouse over department and vendor number and see if all details are shown properly
    
    Examples: 
      | userName |Password|Custom_Program_Name |
      | qat010   |qa02test| CP WITHVENDORS 1   |
      
      
@P3 @7 @MVNDRVendorNumberSearch @321
  Scenario Outline: IPR_Releases_Sprint7_321_Onboading_TC005_MVNDR_CustomPrograms_Department_VendorNum_Hover
     Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    Then user choose MVNDR tab
    When user enters the <Custom_Program_Name> and should be able to hover the mouse over department and vendor number and see if all details are shown properly
    
    Examples: 
      | userName |Password|Custom_Program_Name |
      | qat010   |qa02test| CP WITHVENDORS 1   |
      
      
      
      
   
