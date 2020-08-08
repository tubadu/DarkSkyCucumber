@web
  Feature: HomePage feature
    Background:
      Given I am on Darksky HomePage

      @home
      Scenario: Verify min max temperature
        When  I click today area on homepage
        And I get temperatures on homepage
        And I get min temperature on homepage
        And I get max temperature on homepage
        Then I verify min temperature on homepage
        Then I verify max temperature on homepage



