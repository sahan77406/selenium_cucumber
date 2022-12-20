@Internet8
Feature: Go to Horizontal Slider page

  Scenario Outline: User should be able to move slider until it gets to the number 3.

    Given User go to homepage6 <url>
    When User click on Horizontal Slider link
    Then User moves slider until it gets to the number3
    Then User verifies that the slider is on the number3


    Examples:
      |url|
      |"qa_environment_url"|