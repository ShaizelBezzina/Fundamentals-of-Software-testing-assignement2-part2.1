Feature: Shopping Website Functionality

  Scenario: Reachability of product categories
    Given I visit the amazon website
    Given I am logged in
    When I click on the "Electronics" category
    Then I should be taken to the "Electronics" category page
    Then the category should show at least 5 products
    When I click on the first product in the results
    Then I should be taken to the details page for that product
