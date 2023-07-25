Feature: Visa Confirmation Australian

  @regression
  Scenario: verify Australian Coming To UK For Tourism
    Given User on home page
    When User click on start button
    And  User Select a Nationality "Australia"
    And User Click on Continue button
    And User Select reason "Tourism"
    And User Click on Continue button
    Then User verify result "You will not need a visa to come to the UK"


