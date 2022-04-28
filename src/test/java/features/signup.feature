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
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  Background: 
    Given my login page "http://uitestingplayground.com/" is opened

  @tag12
  Scenario: Title of your scenario
    Given I want to click dynamic id button on the page
    And verify the same
    Then assert the same with some value

  @tag12
  Scenario Outline: 
    When I provide "<username>" and "<password>"
    Then open
    When close

    Examples: 
      | username | password |
      | first    | second   |
      | four     | five     |
