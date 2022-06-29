@automationexercise

Feature: Verify Test Cases

  Background: search_product_by_name
    Given user launches the browser
    When user navigates to URL
    Then user verifies that home page is visible successfully
  @TC07
  Scenario: TC_07_Test_Cases

    And user clicks on Test Cases button
    Then user is navigated to test cases page successfully
    Then user closes the browser
  @TC09
  Scenario: TC_09_Test_Cases
    And user clicks on product button
    Then user is navigated to ALL PRODUCTS page successfully
    And user enters product name in search input and click search button
    And user verifies SEARCHED PRODUCTS is visible
    And user verifies all the products related to search are visible
    Then user closes the browser

  @TC10
  Scenario: TC_10_Test_Cases

    And user scrolls down to footer
    Then user verifies subscription text is visible
    And user enters email address in input and click arrow button
    Then user verifies success message 'You have been successfully subscribed!' is visible
    Then user closes the browser












