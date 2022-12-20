@Internet3
Feature: Go to Forgot Password page

  Scenario Outline: User should be able to retrieve passwords by using email address.

    Given User go to homepage1 <url>
    When User click on Forgot Password link
    Then User enter email address <email>
    Then User click on retrieve password button
    Then User see Internal Server Error message









    Examples:
      |url|email|
      |"qa_environment_url"|"john12@mail.com"|