Feature: Auto and General Insurance

  Scenario Outline: As a user, i want to login to the A&G Website
    Given Iam on the A&G Website
    When I enter the id passport number <id>
    And I click on the Login button
    Then I am redirected to the options page
    When I select the PhoneNumber option
    Then I am redirected to the OTP Page
    When I enter the OTP <otp>
    And I click on the OTPLogin button
    Then I am redirected to the A&G Dashboard
    Examples:
      | id            | otp   |
      | 9010039201082 | 000000 |



