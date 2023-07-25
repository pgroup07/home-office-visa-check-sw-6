
Feature: Visa Confirmation Colombia

  @sanity

  Scenario: A Columbian National Coming To The UK To Join A Partner For A Long Stay They Do Have An Article10Or20Card
    Given User on home page
    When User click on start button
    And  User Select a Nationality "Colombia"
    And User Click on Continue button
    And User Select reason "Join partner or family for a long stay"
    And User Click on Continue button
    And User Select state My partner of family member have uk immigration status "yes"
    And User Click on Continue button
    Then User verify result "You’ll need a visa to join your family or partner in the UK"
