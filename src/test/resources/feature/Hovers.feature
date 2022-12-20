@Internet5
Feature: Go to Hovers page

  Scenario Outline: User should be able to retrieve passwords by using email address.

    Given User go to homepage3 <url>
    When User click on Hovers link
    Then User hovers over User1 and clicks on view profile
    Then User view User1 profile
    Then User hovers over User2 and clicks on view profile
    Then User view User2 profile
    Then User hovers over User3 and clicks on view profile
    Then User view User3 profile






    Examples:
      |url|
      |"qa_environment_url"|