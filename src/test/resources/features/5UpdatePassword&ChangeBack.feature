Feature: Update Password and Change it back to original

Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'testemail4@email.com' and password 'TestPassword@04'
    And User click on login button
    And User should be logged in into Account
	
  @test4
  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword     | confirmPassword |
      | TestPassword@04  | TestPassword@05 | TestPassword@05 |
    And User click on Change Password button
    Then a message should be displayed ‘Password Updated Successfully’
    And User enter below information again
      | previousPassword | newPassword     | confirmPassword |
      | TestPassword@05  | TestPassword@04 | TestPassword@04 |
    And User click on Change Password button again
    Then a message should be displayed again Password Updated Successfully
	# THIS FEATURE IS NEW
	
	