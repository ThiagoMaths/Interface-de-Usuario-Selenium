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

    @Login @Three
    Scenario: Verify whether the User is not able login without providing credentials
      Given I launch the application
      And I navigate to Account Login page
      When I enter Username "" and Password ""
      And I click on Login button
      Then I should see an error message that the credentials are invalid

      @Login @Four
      Scenario: Verify whether the User is able to reset the forgotten password
        Given I launch the application
        And I navigate to Account Login page
        When I reset  the forgotten password for email "ravi.kiran1@gmail.com"
        Then I should see a message informing the User that information related to resting password have been sent to email address

  @Login @Five
  Scenario: Verify whether the User is not able to reset the forgotten password
    Given I launch the application
    And I navigate to Account Login page
    When I reset  the forgotten password for email "ravi.kira@gmail.com"
    Then I should see an error message that the credentials are invalid
