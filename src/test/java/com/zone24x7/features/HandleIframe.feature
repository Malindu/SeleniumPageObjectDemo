@Regression
Feature: Handle iframe on The Internet Herokuapp Web App

  @scenarioOne
  Scenario: Successfully Navigate to iFrame Page and Handle the iframe
    Given I navigate to The Internet Herokuapp's Home Page
    When I go to the "Frames" page

  @scenarioTwo @smokeTest
  Scenario: Successfully Navigate to iFrame Page and Handle the iframe
    Given I navigate to The Internet Herokuapp's Home Page
    When I go to the "Frames" page
