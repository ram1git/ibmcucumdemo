#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Registration of elearning website and coupon creation and deletion
  I want to use this template for my feature file

  @tagregnew
  Scenario Outline: 
    When user logins with his credentials "admin" and "Admin@123"
    And lands on the dashboard page
    Then user clicks coupons link on the page
    When user adds the coupons with "<couponname>" and "<code>" and then saves
    Then coupons names are successfully created
    When user edits the selected coupon and then saves the same
    Then the edited coupons are successfully saved
    When user selcts the created coupn and deletes the same
    Then coupon is successfully deleted

    Examples: 
      | couponname | code |
      | john1       | doe1  |
