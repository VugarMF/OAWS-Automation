@Dte_courses_batch_upload @regression
Feature: DTE upload course batch

  As a User I Should be able to Upload Course batch Template On Courses Module in DTE app
  and when I search recently uploaded Courses it should be processed to Application and  displayed on Courses  Successfully

  Scenario: DTE upload course batch

  Given User Login DTE Application
  Then Verify user is on home Page
  And Click Courses Tab
  Then Verify User is on Course Page
  When Click on "Courses batch Upload' tab
  And Click on 'Choose File' Button
  And Select the 'Courses Template' from Local drive
  When Click on 'Upload' button
  Then Verify Uploaded  Data shown in the Temporary holding database table, it reflects the received data from the excel file
  And Data will be processed overnight' from the table
    And  Click on 'Courses" tab
  And Input the recently Uploaded 'Course'as the search parameter
  And Click on 'Search'  button
  Then Verify  course successfully displayed on the Page

