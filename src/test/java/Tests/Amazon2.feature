Feature: Shopping Website Functionality

  Scenario: Search functionality
    Given I visit the amazon website
    Given I am logged in
    When I search for a product using the term "Java book"
    And there should be at least 5 products in the search results
    When I click on the first product in the search results
    Then I should be taken to the details page for that product



