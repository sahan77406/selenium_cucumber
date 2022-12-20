@Internet10
Feature: Go to Entry Ad page

  Scenario Outline: User should be able to click on Entry Ad link and interact with it.

    Given User go to homepage8 <url>
    When User click on Entry Ad link
    Then User verifies that modal window pop ups.
    Then User closes modal windows
    Then User reopens modal window
    Then User verifies that modal window pop ups2.


    Examples:
      |url|
      |"qa_environment_url"|