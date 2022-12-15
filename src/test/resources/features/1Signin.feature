Feature: Sign In Feature

  @test1
  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'testemail4@email.com' and password 'TestPassword@04'
    And User click on login button
    Then User should be logged in into Account

  @test2
  Scenario: Verify user can create an account into Retail Website
    Given User is on retail website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name     | email                          | password  | confirmPassword |
      | FaisalReshad | j7581726348@tekschool.us | Tek@12347 | Tek@12347       |
    And User click on SignUp button
    Then User should be logged into account page
    
    