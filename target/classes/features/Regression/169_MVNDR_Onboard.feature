@MVNDRSearch
Feature: Onboarding the vendors and adding them as part of Custom Program for verifying common markets

@P1 @4 @MVNDRCustomProgramOnboarding @169
  Scenario Outline: IPR_Releases_Sprint5_169_Onboading_TC001_MVNDR_EditButton_VerifyCommonMarketList_ForCustomProgram_SelectMarketUnderSameBYO
    Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    Then user choose MVNDR tab
    When user enters the Vendor Number then the details associated with the particular vendor number from database should be listed and user focus on it and clicks edit button to add markets to each vendor
    |VendorName               |VendorNum|
    |applicators and more ltd |         |
    |westek associates inc    |         | 
    |SPRAWAY                  |         |    
    When user clicks on Add button a pop up appears and user enters the <Custom_Program_Name> and add vendors to it
    |VendorName               |VendorNum|
    |applicators and more ltd |         |
    |westek associates inc    |         | 
    |SPRAWAY                  |         |
    And user searches for the <Custom_Program_Name> and click on edit button and verify if common markets are listed
    Then the user goes to each Master Program and verifies that the markets onboarded to the Custom Program is not visible in the Master Programs
     |VendorName              |VendorNum|
    |applicators and more ltd |         |
    |westek associates inc    |         | 
    |SPRAWAY                  |         |
    When the verification is over the user deletes the <Custom_Program_Name>
    
            
    Examples: 
      | userName |Password|Custom_Program_Name|
      | SKP8998  |qa02test|CP ONBORADING 2    |
      
      
 @P1 @4 @MVNDRCustomProgramOnboarding @169
  Scenario Outline: IPR_Releases_Sprint5_169_Onboading_TC002_MVNDR_EditButton_VerifyCommonMarketList_ForCustomProgram_SelectMarketUnderSameBYO
    Given a user launches gridtstats url with <userName> and <Password>
    Then a user launches COR url
    Then user clicks on Program Set up and clicks on Commodity On Boarding
    Then user choose MVNDR tab
    When user enters the Vendor Number then the details associated with the particular vendor number from database should be listed and user focus on it and clicks edit button to add stores to each vendor
    |VendorName               |VendorNum|
    |applicators and more ltd |         |
    |westek associates inc    |         | 
    |SPRAWAY                  |         |   
    When user clicks on Add button a pop up appears and user enters the <Custom_Program_Name> and add vendors to it
    |VendorName               |VendorNum|
    |applicators and more ltd |         |
    |westek associates inc    |         | 
    |SPRAWAY                  |         |  
  # Then user choose Custom Vendor Group tab
  # When user enters a <Custom_Program_Name> in Custom Program Name field and the results grid should populate with all the vendors associated with that program
   #Then user clicks on Add button and add the vendors and verify if they are listed in the results grid for the <Custom_Program_Name>
   #Then user choose MVNDR tab
    And user searches for the <Custom_Program_Name> and click on edit button and verify if common stores are listed
            
    Examples: 
      | userName |Password|Custom_Program_Name|
      | SKP8998   |qa02test|CP ONBORADING 3   |
      
      
  