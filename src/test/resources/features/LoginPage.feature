@web
  Feature: LoginPage feature
    Background:
      Given I am on HomePage
      @login
      Scenario: Verify email and password
        When I click buttons
        And I enter tuba@sample.com into username text fields on home screen
        And I enter test12345 into password text fields on home screen
        And I click on login button on login screen
        Then I verify invalid login message on sign in page
