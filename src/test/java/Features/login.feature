Feature: login tests

  Background: User launched a webbrowser with main page
    Given This is the setup Step

  Scenario: User Login with valid credentials
    Given User is on Login page
    When User enters "username" and "password"
    And User click on login button
    Then User is able to login
    And User is on Home Page of AEP

  Scenario: User Login with invalid credentials
    Given User is on Login page
    When User enters following username and password
      | Username | Password |
      | akukreja | TempPass |
    And User click on login button
    Then User is able to not able to login
    And User is displayed an error message