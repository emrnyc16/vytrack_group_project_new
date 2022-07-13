Feature: Verify user can click the refresh button

  @clicking
  Scenario: Clicking on the refresh button
   Given User is on the Vytrack main vehicles page
   When User click the refresh button
   Then the entire vehicles page should refresh

