@Dte_create_education_center  @regression @DTE
Feature: DTE create education center

  As a User I should be able to Create a Education Center on Courses module in DTE app and
  when I search recently created Education Center it should be displayed on the Page Successfully

  Scenario: Create education center

  Given User Login DTE Application
  Then Verify user is on home Page
  And Click Courses Tab
  Then Verify User is on Course Page
  When Click on "Education Center' tab
  Then Verify User is on 'Search OTI Education Center ' Screen
  When Click on' Create' On Search OTI Education Center screen
  And Enter Data for all Mandatory fields
  And Click on Save Button
    And Click 'ok' in information pop up
  And Click on 'Cancel' button to go to search screen
  And Input the recently created 'Education Center'as the search parameter
  And Click on 'Search center' button
  Then Verify recently created Education Center successfully displayed on the Page.

