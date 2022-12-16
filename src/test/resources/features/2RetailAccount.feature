Feature: Retail Account Page

  #Note: For this feature you have to have an account and be logged in into account.
  #Repeated steps are under Background Keyword
  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'testemail4@email.com' and password 'TestPassword@04'
    And User click on login button
    And User should be logged in into Account

  @test3
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'FaisalReshad' and Phone '7037787578'
    And User click on Update button
    Then user profile information should be updated

  #CHECK NEW FEATURE FILE FOR THIS SCENARIO (UPDATEDPASSWORD F.FILE)
  # @test4
  #  Scenario: Verify User can Update password
  #   When User click on Account option
  #   And User enter below information
  #     | previousPassword | newPassword     | confirmPassword |
  #     | TestPassword@10  | TestPassword@11 | TestPassword@11 |
  #   And User click on Change Password button
  #   Then a message should be displayed ‘Password Updated Successfully’
  @test5
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 2526611879207949 | Test Java  | value           | value          |          589 |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully’

  @test6
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard    | expirationMonth | expirationYear | securityCode |
      | 7846702722978719 | TekSchoolCard | value           | value          |          589 |
    And user click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully’

  @test7
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on remove option of card section
    Then payment details should be removed

  @test8
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country | fullName | phoneNumber | streetAddress    | apt | city       | state | zipCode |
      | value   | FaisalRassdd |  1247728878 | 1289 main street | 217 | Alexandria | value |   22179 |
    And User click Add Your Address button
    Then a message should be displayed ‘Address Added Successfully’

  @test9
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user fill updated address form with below information
      | country | fullName     | phoneNumber | streetAddress | apt | city      | state | zipCode |
      | value   | FaizalCappSt |  9877573279 | 689 Second St | 312 | Arlington | value |   22193 |
    And User click update Your Address button
    Then a message should be displayed ‘Address Updated Successfully’

  @test10
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
