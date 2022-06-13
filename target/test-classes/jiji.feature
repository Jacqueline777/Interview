Feature: Checkout goods on jiji
 @jiji
  Scenario: Successful checkout goods on jiji
    Given I have access to site
    When I search for item "towel"
    And I access the item
    And I add it to cart
    Then I should be able to successfully seaarch