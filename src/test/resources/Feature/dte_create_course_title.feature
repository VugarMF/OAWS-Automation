@Dte_create_course_title
Feature: DTE create course

  As a User I should be able to Create a course title in DTE app and
  when I search recently created Course title it should be displayed on the Page Successfully

  Scenario:  DTE create course title
  Given User Login DTE Application
  Then Verify user is on home Page
  And Click Courses Tab
  Then Verify User is on Course Page
  When Click on 'Course Titles' tab
  Then Verify User  is on 'Search Course Title ' Screen
  When Click on ' Create' On Search OTI Course Title screen
  And Enter  Data for all Mandatory fields
  And Click  on Save Button
    And  Click  'ok' in information pop up
  And Click on  'Cancel' button to go to search screen
  And Input the recently created  'Course title'as the search parameter
  And Click on  'Search' button
  Then Verify recently  created course title successfully displayed on the Page


