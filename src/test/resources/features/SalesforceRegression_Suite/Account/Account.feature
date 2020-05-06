@Hooks
Feature: Account
 
 @Tscenario_0001 @Account @Automation
  Scenario: Test scenario_0001 to create Prospect "Profile: LEX G360 Primary FA + GTW"
	Given  Login into App "Account" "TC001"
    And click On CustomerTab
    And click On New Button
    And switch To ChildWindow
    And populate Required Field To Create Prospect "Account" "TC001"
    When click On Save Button
    And switch To Parent Window
	Then validate Created Prospect
	
    
 @Tscenario_0002 @Account @Automation
  Scenario: Test scenario_0002 to create Task to customer "Profile: LEX G360 Primary FA + GTW"
	Given  Login into App "Account" "TC002"
	And click On CustomerTab
	And click on existing customer
    And click On New Task	
    And enter task subject "Account" "TC002"
    And click on save button 
    
  @Tscenario_0003 @Account @Automation
  Scenario: Test scenario_0003 to create Note to customer "Profile: LEX G360 Primary FA + GTW"
	Given  Login into App "Account" "TC003"
	And click On CustomerTab
	And click on existing customer
	And click on related tab
    And click On New Button under note section
    And enter subject of Note "Account" "TC003"
    And enter note description "Account" "TC003"
    And click on Add to record button
    And click on done button
    
  @Tscenario_0004 @Account @Automation
  Scenario: Test scenario_0004 to add account team member to customer "Profile: LEX G360 Primary FA + GTW"
	Given  Login into App "Account" "TC004"
	And click On CustomerTab
	And click on existing customer
	And click on related tab
	And scroll Down To Pixel 400
	And click on Add Team Member
 	And enter team username "Account" "TC004"
 	And enter Team Role "Account" "TC004"
 	And click on save button
  
  @Tscenario_0005 @Account @Automation
  Scenario: Test scenario_0005 to clone existing customer "Profile: LEX G360 Primary FA + GTW"
	Given Login into App "Account" "TC005"
	And click On CustomerTab
	And click on existing customer
	And click on clone button
	And switch To ChildWindow
	And update account name "Account" "TC005"
	And click on save button

  @Tscenario_0006 @Account @Automation
  Scenario: Test scenario_0006 to add contact to existing customer "Profile: LEX G360 Primary FA + GTW"
	Given Login into App "Account" "TC006"
	And click On CustomerTab
	And click on existing customer
	And click on related tab
	And click on New Contact button
	And enter last name of contact "Account" "TC006"
	And click on save button

 @Tscenario_0007 @Account @Automation
  Scenario: Test scenario_0007 to Reassign existing customer "Profile: LEX G360 Primary FA + GTW"
	Given Login into App "Account" "TC007"
	And click On CustomerTab
	And click on existing customer
	And click on Reassign Prospect button
	And enter new account owner name "Account" "TC007"  
	And click on save button for new Owner
 
 @Tscenario_0008 @Account @Automation
  Scenario: Test scenario_0008 to create Prospect "Profile: LEX G360 District Manager + GTW"
	Given Login into App "Account" "TC008"
    And click On CustomerTab
    And click On New Button
    And switch To ChildWindow
    And populate Required Field To Create Prospect "Account" "TC008"
    When click On Save Button
    And switch To Parent Window
	Then validate Created Prospect  
   
 @Tscenario_0009 @Account @Automation
  Scenario: Test scenario_0009 to create Task to customer "Profile: LEX G360 District Manager + GTW"
	Given Login into App "Account" "TC009"
	And click On CustomerTab
	And click on existing customer
    And click On New Task	
    And enter task subject "Account" "TC009"
    And click on save button  

 @Tscenario_00010 @Account @Automation
  Scenario: Test scenario_00010 to create Note to customer "Profile: LEX G360 District Manager + GTW"
	Given Login into App "Account" "TC0010"
	And click On CustomerTab
	And click on existing customer
	And click on related tab
    And click On New Button under note section
    And enter subject of Note "Account" "TC0010"
    And enter note description "Account" "TC0010"
    And click on Add to record button
    And click on done button
    
 @Tscenario_00011 @Account @Automation
  Scenario: Test scenario_00011 to add account team member to customer "Profile: LEX G360 District Manager + GTW"
	Given Login into App "Account" "TC0011"
	And click On CustomerTab
	And click on existing customer
	And click on related tab
	And click on Add Team Member
 	And enter team username "Account" "TC0011"
 	And enter Team Role "Account" "TC0011"
 	And click on save button
 	
 @Tscenario_00012 @Account @Automation
  Scenario: Test scenario_00012 to clone existing customer "Profile: LEX G360 District Manager + GTW"
	Given Login into App "Account" "TC0012"
	And click On CustomerTab
	And click on existing customer
	And click on clone button
	And switch To ChildWindow
	And update account name "Account" "TC0012"
	And click on save button
	
 @Tscenario_00013 @Account @Automation
  Scenario: Test scenario_00013 to add contact to existing customer "Profile: LEX G360 District Manager + GTW"
	Given Login into App "Account" "TC0013"
	And click On CustomerTab
	And click on existing customer
	And click on related tab
	And click on New Contact button
	And enter last name of contact "Account" "TC0013"
	And click on save button
	
 @Tscenario_00014 @Account @Automation
  Scenario: Test scenario_00014 to Reassign existing customer "Profile: LEX G360 District Manager + GTW"
	Given Login into App "Account" "TC0014"
	And click On CustomerTab
	And click on existing customer
	And click on Reassign Prospect button
	And enter new account owner name "Account" "TC0014"  
	And click on save button

@Tscenario_00015 @Account @Automation
  Scenario: Test scenario_00015 to create Prospect "Profile: LEX MSS NA Area Manager GA"
	Given Login into App "Account" "TC0015"
    And click On CustomerTab
    And click On New Button
    And switch To ChildWindow
    And populate Required Field To Create Prospect "Account" "TC0015"
    When click On Save Button
    And switch To Parent Window
	Then validate Created Prospect  
   
 @Tscenario_00016 @Account @Automation
  Scenario: Test scenario_00016 to create Task to customer "Profile: LEX MSS NA Area Manager GA"
	Given Login into App "Account" "TC0016"
	And click On CustomerTab
	And click on existing customer
    And click On New Task	
    And enter task subject "Account" "TC0016"
    And click on save button  

 @Tscenario_00017 @Account @Automation
  Scenario: Test scenario_00017 to create Note to customer "Profile: LEX MSS NA Area Manager GA"
	Given Login into App "Account" "TC0017"
	And click On CustomerTab
	And click on existing customer
	And click on related tab
    And click On New Button under note section
    And enter subject of Note "Account" "TC0017"
    And enter note description "Account" "TC0017"
    And click on Add to record button
    And click on done button
    
 @Tscenario_00018 @Account @Automation
  Scenario: Test scenario_00018 to add account team member to customer "Profile: LEX MSS NA Area Manager GA"
	Given Login into App "Account" "TC0018"
	And click On CustomerTab
	And click on existing customer
	And click on related tab
	And click on Add Team Member
 	And enter team username "Account" "TC0018"
 	And enter Team Role "Account" "TC0018"
 	And click on save button
 	
 @Tscenario_00019 @Account @Automation
  Scenario: Test scenario_00019 to clone existing customer "Profile: LEX MSS NA Area Manager GA"
	Given Login into App "Account" "TC0019"
	And click On CustomerTab
	And click on existing customer
	And click on clone button
	And switch To ChildWindow
	And update account name "Account" "TC0019"
	And click on save button
	
 @Tscenario_00020 @Account @Automation
  Scenario: Test scenario_00020 to add contact to existing customer "Profile: LEX MSS NA Area Manager GA"
	Given Login into App "Account" "TC0020"
	And click On CustomerTab
	And click on existing customer
	And click on related tab
	And click on New Contact button
	And enter last name of contact "Account" "TC0020"
	And click on save button
	
 @Tscenario_00021 @Account @Automation
  Scenario: Test scenario_00021 to Reassign existing customer "Profile: LEX MSS NA Area Manager GA"
	Given Login into App "Account" "TC0021"
	And click On CustomerTab
	And click on existing customer
	And click on Reassign Prospect button
	And enter new account owner name "Account" "TC0021"  
	And click on save button
	
 
 @Tscenario_00022 @Account @Automation
  Scenario: Test scenario_00022 to create Prospect "Profile: LEX G360 Primary FA + GTW Alpha"
	Given Login into App "Account" "TC0022"
    And click On CustomerTab
    And click On New Button
    And switch To ChildWindow
    And populate Required Field To Create Prospect "Account" "TC0022"
    When click On Save Button
    And switch To Parent Window
	Then validate Created Prospect  
   
 @Tscenario_00023 @Account @Automation
  Scenario: Test scenario_00023 to create Task to customer "Profile: LEX G360 Primary FA + GTW Alpha"
	Given Login into App "Account" "TC0023"
	And click On CustomerTab
	And click on existing customer
    And click On New Task	
    And enter task subject "Account" "TC0023"
    And click on save button  

 @Tscenario_00024 @Account @Automation
  Scenario: Test scenario_00024 to create Note to customer "Profile: LEX G360 Primary FA + GTW Alpha"
	Given Login into App "Account" "TC0024"
	And click On CustomerTab
	And click on existing customer
	And click on related tab
    And click On New Button under note section
    And enter subject of Note "Account" "TC0024"
    And enter note description "Account" "TC0024"
    And click on Add to record button
    And click on done button
    
 @Tscenario_00025 @Account @Automation
  Scenario: Test scenario_00025 to add account team member to customer "Profile: LEX G360 Primary FA + GTW Alpha"
	Given Login into App "Account" "TC0025"
	And click On CustomerTab
	And click on existing customer
	And click on related tab
	And click on Add Team Member
 	And enter team username "Account" "TC0025"
 	And enter Team Role "Account" "TC0025"
 	And click on save button
 	
 @Tscenario_00026 @Account @Automation
  Scenario: Test scenario_00026 to clone existing customer "Profile: LEX G360 Primary FA + GTW Alpha"
	Given Login into App "Account" "TC0026"
	And click On CustomerTab
	And click on existing customer
	And click on clone button
	And switch To ChildWindow
	And update account name "Account" "TC0026"
	And click on save button
	
 @Tscenario_00027 @Account @Automation
  Scenario: Test scenario_00027 to add contact to existing customer "Profile: LEX G360 Primary FA + GTW Alpha"
	Given Login into App "Account" "TC0027"
	And click On CustomerTab
	And click on existing customer
	And click on related tab
	And click on New Contact button
	And enter last name of contact "Account" "TC0027"
	And click on save button
	
 @Tscenario_00028 @Account @Automation
  Scenario: Test scenario_00028 to Reassign existing customer "Profile: LEX G360 Primary FA + GTW Alpha"
	Given Login into App "Account" "TC0028"
	And click On CustomerTab
	And click on existing customer
	And click on Reassign Prospect button
	And enter new account owner name "Account" "TC0028"  
	And click on save button