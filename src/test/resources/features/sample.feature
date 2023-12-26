
Feature: To Verify

  Background: background scenario
    Given Load the browser

  Scenario: Verify Successful login
    Given Load URL
    When I enter username and passward
    And  I click on login button
    And  I verify dashboard
    Then I click on logout button




