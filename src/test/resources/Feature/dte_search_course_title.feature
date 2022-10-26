@Dte_search_course_title @regression
Feature: DTE search course title

  As a User I should be able to Search OTI Course Title in DTE app

  Scenario: Search course title
  Given User  Login DTE Application
  Then Verify user  is on home Page
  And Click Courses  Hyper  link
  Then Verify User is on  Course Page
  When Click on "Course Titles' tab
  Then Verify User is on 'Search Course Title ' Screen
  And Input the 'Course title' as the search parameter
  And  Click on 'Search'   button
  Then Verify course title successfully displayed on the Page


