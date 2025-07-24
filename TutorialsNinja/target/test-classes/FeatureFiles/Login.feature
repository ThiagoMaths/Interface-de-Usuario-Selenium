Feature: Login functionality scenarios

  @Login @One
  Scenario: Verify whether the User is able to login with valid credentials
    Given I launch the application
    And I navigate to Account Login page
    When I enter Username "ravi.kiran1@gmail.com" and Password "rkiran"
    And I click on Login button
    Then I should be able login successfully

  @Login @Two
  Scenario: Verify whether the User is not able to login with invalid credentials
    Given I launch the application
    And I navigate to Account Login page
    When I enter Username "ravi.kiran1@gmail.com" and Password "rkiran9"
    And I click on Login button
    Then I should see an error message that the credentials are invalid