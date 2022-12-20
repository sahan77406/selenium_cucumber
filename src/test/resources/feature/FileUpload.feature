@Internet9
Feature: Go to File Upload page

  Scenario Outline: User should be able tto upload a file and verify the uploaded file.

    Given User go to homepage7 <url>
    When User click on File Upload link
    Then User chooses a file to upload
    Then User uploads the chosen file
    Then User verifies the uploaded file


    Examples:
      |url|
      |"qa_environment_url"|