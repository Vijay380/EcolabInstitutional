@Hooks
Feature: Create Ticket

  @TC_OPT_001 @Opportinities @Automation
  Scenario: Test scenarios TC_OPT_001 to create Opportunity "Profile: LEX G360 Primary FA + GTW"
    Given  Login into App "Opportunity" "TC_OPT_001"
    And click on opportunities tab
    And click On New Button
    And select opportunity record type
    And click on next button
    And switch To ChildWindow
    And populate data to create opportunity "Opportunity" "TC_OPT_001"
    And select close date for opportunities
    And click on save button
    And switch To Parent Window
    
 @TC_OPT_002 @IT @Opportinities @Automation
  Scenario: Test scenarios TC_OPT_002 to change stage [Build Rapport / Explore Customer Needs] of Opportunity "Profile: LEX G360 Primary FA + GTW"
    Given  Login into App "Opportunity" "TC_OPT_002"
    And click on opportunities tab
    And click on existing opportunities "Opportunity" "TC_OPT_002"
    And provide top competitor
    And click on build Rapport stage
#    And click on Mark stage as complete
#   
    
#    And provide top competitor "Opportunity" "TC_OPT_002"
#    
#    
#     
#    
#     And click on Edit button
#     And switch To ChildWindow
#     
#     And change opportunities stage "Opportunity" "TC_OPT_002"
#     And click on save button
#     And switch To Parent Window
    
    