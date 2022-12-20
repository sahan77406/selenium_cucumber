@Internet11
Feature: Go to Context Menu page

  Scenario Outline: User should be able to click on Context Menu link and interact with it.

    Given User go to homepage9 <url>
    When User click on Context Menu link
    Then User right-click on context menu box
    Then User verifies the text on context menu.
    Then User click on okay button on pup up.



    Examples:
      |url|
      |"qa_environment_url"|