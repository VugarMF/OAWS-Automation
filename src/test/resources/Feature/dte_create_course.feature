@Dte_create_course
Feature: DTE create a course

  As a user when I enter DTE application
  I should be able to create a course and save it

  Scenario: Create course verification
    Given User login DTE application and click courses hyperlink
    When  Click on 'Create'  on Search OTI Education centers screen
    And   Enter data for all mandatory fields
    And   Click on 'Save' button
    And   Click on 'Cancel' button to go to Search Screen
    And   Input the recently created 'Course' as the search parameter
    Then  Click on 'Search' button



