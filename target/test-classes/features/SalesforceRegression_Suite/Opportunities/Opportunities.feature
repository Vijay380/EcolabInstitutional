@Hooks
Feature: Opportunities

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
    And change opportunities stage "Build Rapport / Explore Customer Needs"
    When I click on Mark stage as complete
    Then I should see success message displayed
    
 @TC_OPT_003 @IT @Opportinities @Automation
  Scenario: Test scenarios TC_OPT_003 to change stage [Survey] of Opportunity "Profile: LEX G360 Primary FA + GTW"
    Given  Login into App "Opportunity" "TC_OPT_003"
    And click on opportunities tab
    And click on existing opportunities "Opportunity" "TC_OPT_003"
    And change opportunities stage "Survey"
    When I click on Mark stage as complete
    Then I should see success message displayed

  @TC_OPT_004 @IT @Opportinities @Automation
  Scenario: Test scenarios TC_OPT_004 to change stage [Construct a Solution / Proposal] of Opportunity "Profile: LEX G360 Primary FA + GTW"
    Given  Login into App "Opportunity" "TC_OPT_004"
    And click on opportunities tab
    And click on existing opportunities "Opportunity" "TC_OPT_004"
    And change opportunities stage "Construct a Solution / Proposal"
    When I click on Mark stage as complete
    Then I should see success message displayed   
   
 @TC_OPT_005 @IT @Opportinities @Automation
  Scenario: Test scenarios TC_OPT_005 to change stage [Inactive] of Opportunity "Profile: LEX G360 Primary FA + GTW"
    Given  Login into App "Opportunity" "TC_OPT_005"
    And click on opportunities tab
    And click on existing opportunities "Opportunity" "TC_OPT_005"
    And change opportunities stage "Inactive"
    When I click on Mark stage as complete
    Then I should see success message displayed
  
 @TC_OPT_006 @IT @Opportinities @Automation
  Scenario: Test scenarios TC_OPT_006 to change stage [Closed] of Opportunity "Profile: LEX G360 Primary FA + GTW"
    Given  Login into App "Opportunity" "TC_OPT_006"
    And click on opportunities tab
    And click on existing opportunities "Opportunity" "TC_OPT_006"
    And change opportunities stage "Closed"
    When I click on Mark stage as complete
    And switch To ChildWindow
    And click on done button to close stage
    And switch To Parent Window
    Then I should see success message displayed  
    
  @TC_OPT_007 @IT @Opportinities @Automation
  Scenario: Test scenarios TC_OPT_007 to g360 Initiative to Opportunity "Profile: LEX G360 Primary FA + GTW"
    Given  Login into App "Opportunity" "TC_OPT_007"
    And click on opportunities tab
    And click on existing opportunities "Opportunity" "TC_OPT_007"
    And add GThreeSixty Initiative 
    
  @TC_OPT_008 @IT @Opportinities @Automation
  Scenario: Test scenarios TC_OPT_008 to add Opportunity Team member Opportunity "Profile: LEX G360 Primary FA + GTW"
    Given  Login into App "Opportunity" "TC_OPT_008"
    And click on opportunities tab
    And click on existing opportunities "Opportunity" "TC_OPT_008"
    And click on related tab
	And click on Oppor Add Team Member
	And enter Opportunities team username "Opportunity" "TC_OPT_008"
 	And enter Team Role "Opportunity" "TC_OPT_008"
 	And click on save button
 	
 @TC_OPT_009 @Opportinities @Automation
  Scenario: Test scenarios TC_OPT_009 to create Opportunity "Profile: LEX G360 District Manager + GTW"
    Given  Login into App "Opportunity" "TC_OPT_009"
    And click on opportunities tab
    And click On New Button
    And select opportunity record type
    And click on next button
    And switch To ChildWindow
    And populate data to create opportunity "Opportunity" "TC_OPT_009"
    And select close date for opportunities
    And click on opportunities save button
    And switch To Parent Window
    
 @TC_OPT_0010 @IT @Opportinities @Automation
  Scenario: Test scenarios TC_OPT_0010 to change stage [Build Rapport / Explore Customer Needs] of Opportunity "Profile: LEX G360 District Manager + GTW"
    Given  Login into App "Opportunity" "TC_OPT_0010"
    And click on opportunities tab
    And click on existing opportunities "Opportunity" "TC_OPT_0010"
    And change opportunities stage "Build Rapport / Explore Customer Needs"
    When I click on Mark stage as complete
    Then I should see success message displayed
    
 @TC_OPT_0011 @IT @Opportinities @Automation
  Scenario: Test scenarios TC_OPT_0011 to change stage [Survey] of Opportunity "Profile: LEX G360 District Manager + GTW"
    Given  Login into App "Opportunity" "TC_OPT_0011"
    And click on opportunities tab
    And click on existing opportunities "Opportunity" "TC_OPT_0011"
    And change opportunities stage "Survey"
    When I click on Mark stage as complete
    Then I should see success message displayed

  @TC_OPT_0012 @IT @Opportinities @Automation
  Scenario: Test scenarios TC_OPT_0012 to change stage [Construct a Solution / Proposal] of Opportunity "Profile: LEX G360 District Manager + GTW"
    Given  Login into App "Opportunity" "TC_OPT_0012"
    And click on opportunities tab
    And click on existing opportunities "Opportunity" "TC_OPT_0012"
    And change opportunities stage "Construct a Solution / Proposal"
    When I click on Mark stage as complete
    Then I should see success message displayed   
   
 @TC_OPT_0013 @IT @Opportinities @Automation
  Scenario: Test scenarios TC_OPT_0013 to change stage [Inactive] of Opportunity "Profile: LEX G360 District Manager + GTW"
    Given  Login into App "Opportunity" "TC_OPT_0013"
    And click on opportunities tab
    And click on existing opportunities "Opportunity" "TC_OPT_0013"
    And change opportunities stage "Inactive"
    When I click on Mark stage as complete
    Then I should see success message displayed
  
 @TC_OPT_0014 @IT @Opportinities @Automation
  Scenario: Test scenarios TC_OPT_0014 to change stage [Closed] of Opportunity "Profile: LEX G360 District Manager + GTW"
    Given  Login into App "Opportunity" "TC_OPT_0014"
    And click on opportunities tab
    And click on existing opportunities "Opportunity" "TC_OPT_0014"
    And change opportunities stage "Closed"
    When I click on Mark stage as complete
    And switch To ChildWindow
    And click on done button to close stage
    And switch To Parent Window
    Then I should see success message displayed  
    
  @TC_OPT_0015 @IT @Opportinities @Automation
  Scenario: Test scenarios TC_OPT_0015 to g360 Initiative to Opportunity "Profile: LEX G360 District Manager + GTW"
    Given  Login into App "Opportunity" "TC_OPT_0015"
    And click on opportunities tab
    And click on existing opportunities "Opportunity" "TC_OPT_0015"
    And add GThreeSixty Initiative 
    
  @TC_OPT_0016 @IT @Opportinities @Automation
  Scenario: Test scenarios TC_OPT_0016 to add Opportunity Team member Opportunity "Profile: LEX G360 District Manager + GTW"
    Given  Login into App "Opportunity" "TC_OPT_0016"
    And click on opportunities tab
    And click on existing opportunities "Opportunity" "TC_OPT_0016"
    And click on related tab
	And click on Oppor Add Team Member
	And enter Opportunities team username "Opportunity" "TC_OPT_0016"
 	And enter Team Role "Opportunity" "TC_OPT_0016"
 	And click on save button
 	
  @TC_OPT_0017 @Opportinities @Automation
  Scenario: Test scenarios TC_OPT_0017 to create Opportunity "Profile: LEX MSS NA Area Manager GA"
    Given  Login into App "Opportunity" "TC_OPT_0017"
    And click on opportunities tab
    And click On New Button
    And select opportunity record type
    And click on next button
    And switch To ChildWindow
    And populate data to create opportunity "Opportunity" "TC_OPT_0017"
    And select close date for opportunities
    And click on save button
    And switch To Parent Window
    
 @TC_OPT_0018 @IT @Opportinities @Automation
  Scenario: Test scenarios TC_OPT_0018 to change stage [Build Rapport / Explore Customer Needs] of Opportunity "Profile: LEX MSS NA Area Manager GA"
    Given  Login into App "Opportunity" "TC_OPT_0018"
    And click on opportunities tab
    And click on existing opportunities "Opportunity" "TC_OPT_0018"
    And change opportunities stage "Build Rapport / Explore Customer Needs"
    When I click on Mark stage as complete
    Then I should see success message displayed
    
 @TC_OPT_0019 @IT @Opportinities @Automation
  Scenario: Test scenarios TC_OPT_0019 to change stage [Survey] of Opportunity "Profile: LEX MSS NA Area Manager GA"
    Given  Login into App "Opportunity" "TC_OPT_0019"
    And click on opportunities tab
    And click on existing opportunities "Opportunity" "TC_OPT_0019"
    And change opportunities stage "Survey"
    When I click on Mark stage as complete
    Then I should see success message displayed

  @TC_OPT_0020 @IT @Opportinities @Automation
  Scenario: Test scenarios TC_OPT_0020 to change stage [Construct a Solution / Proposal] of Opportunity "Profile: LEX MSS NA Area Manager GA"
    Given  Login into App "Opportunity" "TC_OPT_0020"
    And click on opportunities tab
    And click on existing opportunities "Opportunity" "TC_OPT_0020"
    And change opportunities stage "Construct a Solution / Proposal"
    When I click on Mark stage as complete
    Then I should see success message displayed   
   
 @TC_OPT_0021 @IT @Opportinities @Automation
  Scenario: Test scenarios TC_OPT_0021 to change stage [Inactive] of Opportunity "Profile: LEX MSS NA Area Manager GA"
    Given  Login into App "Opportunity" "TC_OPT_0021"
    And click on opportunities tab
    And click on existing opportunities "Opportunity" "TC_OPT_0021"
    And change opportunities stage "Inactive"
    When I click on Mark stage as complete
    Then I should see success message displayed
  
 @TC_OPT_0022 @IT @Opportinities @Automation
  Scenario: Test scenarios TC_OPT_0022 to change stage [Closed] of Opportunity "Profile: LEX MSS NA Area Manager GA"
    Given  Login into App "Opportunity" "TC_OPT_0022"
    And click on opportunities tab
    And click on existing opportunities "Opportunity" "TC_OPT_0022"
    And change opportunities stage "Closed"
    When I click on Mark stage as complete
    And switch To ChildWindow
    And click on done button to close stage
    And switch To Parent Window
    Then I should see success message displayed  
    
  @TC_OPT_0023 @IT @Opportinities @Automation
  Scenario: Test scenarios TC_OPT_0023 to g360 Initiative to Opportunity "Profile: LEX MSS NA Area Manager GA"
    Given  Login into App "Opportunity" "TC_OPT_0023"
    And click on opportunities tab
    And click on existing opportunities "Opportunity" "TC_OPT_0023"
    And add GThreeSixty Initiative 
    
  @TC_OPT_0024 @IT @Opportinities @Automation
  Scenario: Test scenarios TC_OPT_0024 to add Opportunity Team member Opportunity "Profile: LEX MSS NA Area Manager GA"
    Given  Login into App "Opportunity" "TC_OPT_0024"
    And click on opportunities tab
    And click on existing opportunities "Opportunity" "TC_OPT_0024"
    And click on related tab
	And click on Oppor Add Team Member
	And enter Opportunities team username "Opportunity" "TC_OPT_0024"
 	And enter Team Role "Opportunity" "TC_OPT_0024"
 	And click on save button
    