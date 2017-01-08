@MVNDRSearch
Feature: Verifying if different types of search criteria and buttons are working fine in MVNDR tab.

@P1 @4 @MVNDRCustomProgramSearch @168
  Scenario Outline: IPR_Releases_Sprint4_168_Onboading_TC001_MVNDR_CustomVendorSearch
    Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    Then user choose MVNDR tab
    When user enters the <Custom_Program_Name> then the details associated with the particular custom program name from database should be listed and all other search fields should be disabled
        
    Examples: 
     | userName |Password|Custom_Program_Name |
     | skp8998  |qa02test|CP WITHVENDORS 1    |
      
      
@P3 @4 @MVNDRVendorNumberSearch @168
# TEST DATA - 87130,11590
  Scenario Outline: IPR_Releases_Sprint4_168_Onboading_TC002_MVNDR_VendorNumberSearch
    Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    Then user choose MVNDR tab
    When user enters the <Vendor_Number> then the details associated with the particular vendor number from database should be listed and all other search fields should be disabled
        
    Examples: 
    | userName |Password|Vendor_Number|
    | qat010   |qa02test| 87130       |
      
   
@P3 @4 @MVNDRVendorNameSearch @168
# TEST DATA - FENWAY PRODUCTS, INC. , MCS
  Scenario Outline: IPR_Releases_Sprint4_168_Onboading_TC003_MVNDR_VendorNameSearch
    Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    Then user choose MVNDR tab
    When user enters the <Vendor_Name> then the details associated with the particular vendor name from database should be listed and all other search fields should be disabled
    
    Examples: 
      | userName |Password|Vendor_Name           |
      | qat010   |qa02test| FENWAY PRODUCTS, INC.|   
      
@P3 @4 @MVNDRDepartmentSearch @168
  Scenario Outline: IPR_Releases_Sprint4_168_Onboading_TC004_MVNDR_DepartmentSearch
    Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    Then user choose MVNDR tab
    When user enters the <Department> then the details associated with the particular department from database should be listed and all other search fields should be disabled
    
    Examples: 
     | userName |Password|Department |
     | qat010   |qa02test| ABCDE     |
      
@P3 @4 @MVNDRClearButton @168
  Scenario Outline: IPR_Releases_Sprint4_168_Onboading_TC005_MVNDR_ClearButton
    Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    Then user choose MVNDR tab
    When user enters the <Vendor_Name> then the details are populated in the grid and when user clicks on Clear button all data in the UI are cleared
    
   Examples: 
      | userName |Password|Vendor_Name            |
      | qat010   |qa02test| FENWAY PRODUCTS, INC. |  
      
@P2 @4 @MVNDREditButton @168
  Scenario Outline: IPR_Releases_Sprint4_168_Onboading_TC006_MVNDR_EditButton
    Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    Then user choose MVNDR tab
    When user enters the <Vendor_Name> then the details are populated in the grid and then user clicks on edit button which opens a pop up and the user verifies the title of the pop up
    
   Examples: 
      | userName |Password|Vendor_Name            |
      | qat010   |qa02test| FENWAY PRODUCTS, INC. |      
      
@P2 @4 @MVNDRInvalidSearch @168
  Scenario Outline: IPR_Releases_Sprint4_168_Onboading_TC007_MVNDR_InvalidSearch
    Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    Then user choose MVNDR tab
    When user enters the invalid <Vendor_Name> and verify the error message pop up
    
   Examples: 
      | userName |Password|Vendor_Name |
      | skp8998   |qa02test| ABCD       |   