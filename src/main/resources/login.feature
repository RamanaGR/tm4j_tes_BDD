Feature: Google
  @TestCase("key=BR-T3")
  Scenario: Google test

    Given User has already entered the URL
    Then title of the page should be Google
    When User clicks on Gmail
    Then title should be Google