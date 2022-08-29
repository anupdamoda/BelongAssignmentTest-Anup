Feature: Megamenu navigation and landing page verification

  Scenario: Validate user is able to navigate across the megamenu (Dresses -> Summer Dresses )
    Given Automation practice application is opened
    When I hover on Dresses Megamenu
    And I click on Summer Dresses menu
    Then I should be land on "Summer Dresses" Page
