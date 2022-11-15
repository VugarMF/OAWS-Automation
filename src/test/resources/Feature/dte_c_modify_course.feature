@Dte_modify_course   @regression @smoke @DTE
Feature: DTE modify the course

  As a User I should be able to Modify  OTI Education Center Courses in DTE app and modified data should be saved successfully.


  Scenario: Modify the course

  Given User Login DTE  Application
  Then Verify user is  on home Page
  And Click  Courses  Tab
  Then Verify User  is on Course Page
  And Enter input Criteria for  Search on Search OTI Education Center Course  Screen
  When Click on 'Search ' button
  Then Verify Grid table displayed  a search results
  When Click on 'Course  Title' hyper link of the record to see the details
  Then Verify  Navigate to 'Education center Course' screen
  And  Modify the data in selected course
  When Click on Save button
  Then Verify Modified data successfully Saved



