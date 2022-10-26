@DTE_search_education_center @regression @DTE
Feature: DTE search education center

  As a User I should be able to Search  OTI Education Center on Courses module in DTE app

  Scenario: Search education center

  Given User Login DTE Application
  Then Verify user is on home Page
  And Click Courses Tab
  Then Verify User is on Course Page
  When Click on "Education Center' tab
  Then Verify User is on 'Search OTI Education Center ' Screen
  And Input the 'Education Center'as the search parameter
  And Click on 'Search center' button
  Then Verify  Education Center successfully displayed on the Page

