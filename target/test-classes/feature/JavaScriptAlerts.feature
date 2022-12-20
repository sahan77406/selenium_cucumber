@Internet7
Feature: Go to Forgot Password page

  Scenario Outline: User should be able to enter his name and delete his name.

    Given User go to homepage5 <url>
    When User click on JavaScript Alerts link
    Then User clicks on Click for JS Alert
    Then User accepts the alert
    Then User verifies that the alert is accepted
    Then User clicks on Click for JS Confirm
    Then User dismiss the alert
    Then User verifies that the alert is dismissed
    Then User clicks on Click for JS Prompt
    Then User enters text to alert
    Then User verifies that a text entered to the alert


    Examples:
      |url|
      |"qa_environment_url"|