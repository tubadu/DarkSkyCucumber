@web
  Feature:HomePage feature
    Background:
      Given I am on DarkSky HomePage
      @Timezone
      Scenario: Verify timeline is displayed in correct format
        When I entered Willow Bend Dr, Murphy, TX in search box
        Then I verify timeline is displayed with two hours incremented

