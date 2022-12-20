@Internet14
Feature: Go to Basic Auth page

  Scenario Outline: User should be able to click on Basic Auth link and interact with it.

    Given User go to homepage12 <url>
    When User click on Basic Auth link
    When User enter username and password on the popup
    Then User click on signin button
    Then User verifies the text on the page
    Then User goes back to home page




    Examples:
      |url|
      |"qa_environment_url"|