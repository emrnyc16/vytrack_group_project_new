Feature: Vehicle page export grid dropdown

  User Story : As a user when I am on Vytrack => Fleet => Vehicles,
  I should be able to see Export Grid dropdown, Refresh, Reset and Grid Settings Buttons



  @store_manager
  Scenario: User can click Export Grid dropdown
  Given i am on the login page
  When i click on fleet module and vehicle
  Then i can click export grid dropdown