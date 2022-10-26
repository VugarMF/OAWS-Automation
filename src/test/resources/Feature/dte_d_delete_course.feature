@Dte_delete_course  @DTE
Feature: DTE delete course

  As a User I should be able to Delete  OTI Education Center Courses in DTE app and Course should be deleted successfully.

  Scenario: Delete course
  Given User Login DTE Application
  Then Verify user is on home Page
  And Click  Courses Tab
  Then Verify User is on Course Page
  And Enter input Criteria for Search on Search OTI Education Center Course  Screen
  And Click on Search button
  Then Verify  Grid table displayed a search results
  When Click on 'Course Title' hyper link of the record to see the details
  Then  Verify Navigates to 'Education center Course' screen
  When Click on 'Delete' button
  And Click  'Yes' button on Warning pop up
  And Enter  deleted record input Criteria for Search on Search OTI Education Center Course  Screen
  When Click on the Search button
  Then Verify record deleted successfully



