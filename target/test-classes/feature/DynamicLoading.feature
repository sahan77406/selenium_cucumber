@Internet13
Feature: Go to Dynamic Loading page

  Scenario Outline: User should be able to click on Dynamic Loading link and interact with it.

    Given User go to homepage11 <url>
    When User click on Dynamic Loading link
    When User click on Example1 link
    Then User click on start button and wait for loading
    Then User verifies the text in the page
    Then User goes back to Dynamic Loading page
    When User click on Example2 link
    Then User click on start button and wait for loading2
    Then User verifies the text in the page1



    Examples:
      |url|
      |"qa_environment_url"|