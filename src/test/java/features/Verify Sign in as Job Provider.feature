@RegressionTest
Feature: This is the Job Provider sign in scenario
  I want to sign in as Job Provider of Ihp application

  Background:
    Given User is enter the Ihp website URL

  @RegressionTest
  Scenario Outline: Verify that sign in as Job Provider functionality of the application
    When The user should able to click on the Login as Job provider button in the HomePage
    Then User should navigated to the sign in page
    And The user enter their Email Id as "<email>" and Password as "<password>"
    When User clicks on the sign in button
    And User should navigated to the KYC Verification
    And User clicks the email verification radio button and then user clicks the submit button
    Then User navigates to the dashboard page of the Ihp project successfully

    Examples:
      | email                 | password |
      | lgstester50@gmail.com | Test@123 |
      | lgstester50@gmail.com | Test123  |
#  @VerifyKeepMeSignInToThisDevice
#  Scenario Outline: Verify that sign in as Job Provider with keep me as sign to this device functionality
#    When The user should able to click on the Login as Job provider button in the HomePage
#    Then User should navigated to the sign in page
#    And The user enter their Email Id as "<email>" and Password as "<password>"
#    And User validate the keep me sign in to this device checkbox and Click the checkbox
#    When User clicks on the sign in button
#    And User should navigated to the KYC Verification
#    And User clicks the email verification radio button and then user clicks the submit button
#    Then User navigates to the dashboard page of the Ihp project successfully
#    And User clicks the profile icon on job provider dashboard page
#    When the user clicks logout button on job provider and user should navigated to the homepage of the Ihp application
#    When The user should able to click on the Login as Job provider button in the HomePage
#    Then User should navigated to the sign in page
#    And The user enter their Email Id as "<email>" and Password as "<password>"
#    And User validate the keep me sign in to this device checkbox
#    When User clicks on the sign in button
#    Then User navigates to the dashboard page of the Ihp project successfully
#
#    Examples:
#      | email                 | password |
#      | lgstester50@gmail.com | Test@123 |
#      | lgstester50@gmail.com | Test@123 |
#
#  @VerifySignInToGoogleIcon
#  Scenario: Verify that sign in as job provider with google icon
#    When The user should able to click on the Login as Job provider button in the HomePage
#    Then User should navigated to the sign in page
#    And User clicks the google icon on job provider sign in page
#    And User clicks the registered google account job provider
#    Then User navigates to the dashboard page of the Ihp project successfully
