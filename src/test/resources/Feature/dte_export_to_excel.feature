@Dte_export_to_excel @DTE
Feature: DTE export to excel

  As a User I should be able to Export courses to Excel  successfully in DTE app

  Scenario:  DTE export to excel
    Given User Login DTE Application
  Then Verify user is on home Page
  And Click Courses Tab
  Then Verify User is on Course Page
  And Enter input Criteria for Search on Search OTI Education Center Course  Screen
  When Click on 'Search' button
  Then Verify Grid table displayed a search results
  And Click on'Menu'
  When Click on 'Export to Excel' Button
  Then Verify Export to excel downloaded Successfully





