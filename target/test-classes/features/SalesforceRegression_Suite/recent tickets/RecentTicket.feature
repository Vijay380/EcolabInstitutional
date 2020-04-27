@Hooks
Feature: Recent Ticket

  @TC024 @IT @RecentTicket @Automation
  Scenario: Verifying only FIVE recent tickets are getting displayed when recent tickets option is chosen
    Given I login to EVA Appication as "User Type 1"
    And I choose 'IT' option displayed in menu section
    When I choose 'Recent Ticket' option displayed in menu section
    Then Application should display recent '5' tickets with all the details
    
  @TC025 @IT @RecentTicket @Automation
  Scenario: Verifying only FIVE recent tickets are getting displayed when recent tickets option is chosen
    Given I login to EVA Appication as "User Type 1"
    And I choose 'IT' option displayed in menu section
    When I choose 'Recent Ticket' option displayed in menu section
    Then Application should display recent '5' tickets with all the details