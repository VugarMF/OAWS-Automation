@Dte_create_course @regression  @DTE
Feature:DTE create course

  As a user I should be able to create a course in DTE app and when I search recently created course it should be
  displayed on the page successfully.


  Scenario:  DTE create course
    Given User login DTE application
    Then Verify user is on home page
    And  Click Courses Tab
    Then verify user is on course page
    When  Click on 'Create'  on Search OTI Education centers screen
    And   Enter data for all mandatory fields
    And   Click on 'Save' button
    And   Click on 'Cancel' button to go to Search Screen
    And   Input the recently created 'Course' as the search parameter
    And   Click on 'Search' button
    Then  Verify recently created course successfully displayed on the page



