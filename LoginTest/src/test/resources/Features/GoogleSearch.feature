@smoketest
Feature: Navigating & Validating Google Search Page

  @SmokeTest
  Scenario: Open Google Search page
    Given browser is open
    And User is on google search page
    When User enters text in Google Search page
    And clicks enter
    Then User is navigated to the search box results
