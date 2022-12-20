@Internet4
Feature: Go to Dropdown page

  Scenario Outline: User should be able to retrieve passwords by using email address.

    Given User go to homepage2 <url>
    When User click on Dropdown link
    Then User chose Option1
    Then User chose Option2






    Examples:
      |url|
      |"qa_environment_url"|