@Internet2
Feature: Go to Form Authentication page

  Scenario Outline: User should be able to login in the Secure Area by using correct credentials.

    Given User go to homepage <url>
    When User click on Form Authentication link
    Then User enter username and password <username> <password>
    Then User click on login button
    Then User is on the secure area page
    Then User click on log out button to exit the page








    Examples:
      |url|username|password|
      |"qa_environment_url"|"tomsmith"|"SuperSecretPassword!"|