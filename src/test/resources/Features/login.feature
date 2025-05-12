Feature: Login feature in automation exercise project

#  Scenario: Successful Login with Valid Credentials
#    Given User is on home page login
#    When user click signUpOrLogIn button login
#    And enter correct email
#    And enter correct password
#    Then click on login button
#


    Scenario: failed Login with Valid Credentials
      Given User is on home page logout
      When user click signUpOrLogIn button logout
      And enter correct email
      And enter correct password
      And click on login button logout
      And verify success login
      Then click on logout button