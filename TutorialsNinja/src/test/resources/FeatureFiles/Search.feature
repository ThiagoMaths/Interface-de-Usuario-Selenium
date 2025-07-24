Feature: Search functionality scenarios

  @Search @One
  Scenario: Verify whether the User is able to search for the products
    Given I launch the application
    When I search for a product "Samsung SyncMaster 941BW"
    Then I should see the product in the search results
