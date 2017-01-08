@Demo1
Feature: Feature to show new BDD framework features

  @Scenario1
  Scenario: Search for keyword
    Given I am a customer on Home Depot
    When I search for "hammer"
    Then I see the initial search PLP
    When I click first prod in Search PLP
    Then I see PIP page displayed
    
  @Scenario2
  Scenario Outline: Search for keyword multi iteration
    Given I am a customer on Home Depot
    When I search for "hammer"
    Then I see the initial search PLP
    When I click first prod in Search PLP
    Then I see PIP page displayed
    When I search for "drill"
    Then I see the initial search PLP
    When I click first prod in Search PLP
    Then I see PIP page displayed
    When I search for "sinks"
    Then I see the initial search PLP
    When I click first prod in Search PLP
    Then I see PIP page displayed

    Examples: Keyword
      | keyword |
      | hammer  |
      | drill   |
      | sinks   |

  @CheckoutScenario
  Scenario: Place online STH order
    Given I am a customer on Home Depot
    When I search for sku "202304610"
    Then I see PIP page for SKU displayed
    When I click on AddToCart in PIP page
    Then I see Shopping Cart page
    And I click AddToCart in ShoppingCart page
    Then I see Guest Checkout page
    And I enter Guest email id and click continue
    Then I see Shipping Details page
    When I enter Shipping Details
    And I click continue button in Shipping page
    Then I see Payment page
    When I fill payment details
    And I click continue button in Payment page
    Then I see thank you page for order placed
 