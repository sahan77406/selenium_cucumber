@Internet12
Feature: Go to Frames page

  Scenario Outline: User should be able to click on Frames link and interact with it.

    Given User go to homepage10 <url>
    When User click on Frames link
    When User click on IFrame link
    Then User clear the text in editor
    Then User type a new text in editor
    Then User click on align center button
    Then User verifies the text in the editor
    Then User goes back to Frames page1
    Then User click on NestedFrames link
    Then User verifies the text in the left frame
    Then User verifies the text in the right frame
    Then User verifies the text in the bottom frame
    Then User goes back to Frames page2



    Examples:
      |url|
      |"qa_environment_url"|