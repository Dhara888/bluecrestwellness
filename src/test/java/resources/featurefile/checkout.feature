Feature: Contact

  Scenario: search contact on home page
    Given I am on homepage
    When I click on accept cookies
    And I  mousehover on Health Checks
    And I click on Base Home Test Kit
    And I click on Book now
    And I click continue
    Then verify I am on "Personal details" checkout Page


