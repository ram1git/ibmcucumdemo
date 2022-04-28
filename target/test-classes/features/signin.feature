Feature: opening browser
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given i have browser opened
    When i enter url
    Then login page is displayed

  Scenario Outline: 
    Then enter <UserName> and <Password>

    Examples: 
      | UserName | Password |
      | first    | second   |
