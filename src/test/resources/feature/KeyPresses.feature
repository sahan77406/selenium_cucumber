@Internet6
Feature: Go to Forgot Password page

  Scenario Outline: User should be able to enter his name and delete his name.

    Given User go to homepage4 <url>
    When User click on Key Presses link
    Then User enters his name
    Then User verifies his name
    Then User delete his name
    Then User enter question mark

    Examples:
      |url|
      |"qa_environment_url"|