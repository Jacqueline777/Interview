Feature: Add to cart
  @login
  Scenario: Successful add to cart
    Given I have the right credentials
    And I search for "iphon 13 pro max"
    And I choose and Add it to cart
    Then I should be able to check out "jaczeboso@gmail.com" "J@m!!8.net"


    Scenario: Trial 2
      Given I access
      And I search "iphone 13 pro max"
      When I choose and Add it to cart
      Then I should successsfully check out