@OSPADS_add_new_partnership
Feature: OSPADS add New Partnership

  As a User I should be able to add New Partnership  in OSPADS app and
  when I search recently created Partnership it should be displayed on the Page Successfully

  Scenario: add New Partnership
  Given User Login OSPADS Application
  Then Verify user is on Search Partnership Page
  And Click New Partnership button
  Then Verify User is on Partnership details page
  And Enter Data for  all Mandatory fields
  When  Click on 'commit all changes" Button
  Then Verify User is on Participants/Signatories sub tab screen
  And Click "OK" button on information pop up
  And Click "Add New Participant" button
  And Click "yes" on Is this OSHA Office Popup
  And Select Office name
  And Click on "OK" button
  And  Click on Origination office "Check Box"
  When Click on 'commit all changes" Button
  And Click  "Ok" on Information popup
  And Click on 'Evaluation info'  sub tab
  Then Verify User is on "Evaluation information" Screen
  And Select "Evaluation Start Date" and "Evaluation end Date"
  When Click on 'Commit all changes' button
  And Click  "Ok" on Information popup
  When Click On "Form Entry " tab
  Then Verify user is on "search Partnership Page
  And Enter "partner Id" as search input
  When Click on "search" Button
  Then Verify recently created Partnership successfully displayed on the Page
    And Click on view/edit button
    Then Verify user navigates to partnership details screen




