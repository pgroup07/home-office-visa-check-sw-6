
Feature: Visa Confirmation Chilean

  @sanity

  Scenario: A Chilean Coming To TheUK For Work And Plans On Staying For Longer Than Six Months
    Given User on home page
    When User click on start button
    And  User Select a Nationality "Chile"
    And User Click on Continue button
    And User Select reason "Work, academic visit or business"
    And User Click on Continue button
    And Select intendent to stay for "longer than 6 months"
    And User Click on Continue button
    And User Select have planning to work for "Health and care professional"
    And User Click on Continue button
    Then User verify result "You need a visa to work in health and care"
