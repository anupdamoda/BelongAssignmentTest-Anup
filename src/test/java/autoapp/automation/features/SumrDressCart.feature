Feature: Validation of Summary Cart Page

  Scenario: Validation of Cart Summary Page once user selects blue summer dress and other details
    Given Automation practice application is opened
    When I hover on Dresses Megamenu
    And I click on Summer Dresses menu
    And I click on Quick view of the Summer dress, select blue color, select quantity "23" & size "M"
    And I add item to the Cart
    And I proceed to checkout
    Then I should be able to validate the product name, blue color, quantity, size in Cart Summary Page
    | Quantity | Size      |
    | 23       | Size : M  |