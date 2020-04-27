@Hooks
Feature: Account
 
 @Tscenario_0001 @Account @Automation
  Scenario: Test scenario_0001 to create Prospect "Profile: LEX G360 Primary FA + GTW"
	Given  Login into Application "TC001"
    And click On CustomerTab
    And click On New Button
    And switch To ChildWindow
    And populate Required Field To Create Prospect "TC001"
    When click On Save Button
    And switch To Parent Window
	Then validate Created Prospect
	
    
 @Tscenario_0002 @Account @Automation
  Scenario: Test scenario_0002 to create Task to customer "Profile: LEX G360 Primary FA + GTW"
	Given  Login into Application "TC002"
	And click On CustomerTab
	And click on existing customer
    And click On New Task	
    And enter task subject "TC002"
    And click on save button 
    
  @Tscenario_0003 @Account @Automation
  Scenario: Test scenario_0003 to create Note to customer "Profile: LEX G360 Primary FA + GTW"
	Given  Login into Application "TC003"
	And click On CustomerTab
	And click on existing customer
	And click on related tab
    And click On New Button under note section
    And enter subject of Note "TC003"
    And enter note description "TC003"
    And click on Add to record button
    And click on done button
    
  @Tscenario_0004 @Account @Automation
  Scenario: Test scenario_0004 to add account team member to customer "Profile: LEX G360 Primary FA + GTW"
	Given  Login into Application "TC004"
	And click On CustomerTab
	And click on existing customer
	And click on related tab
	And click on Add Team Member
 	And enter team username "TC004"
 	And enter Team Role "TC004"
 	And click on save button
  
  @Tscenario_0005 @Account @Automation
  Scenario: Test scenario_0005 to clone existing customer "Profile: LEX G360 Primary FA + GTW"
	Given  Login into Application "TC005"
	And click On CustomerTab
	And click on existing customer
	And click on clone button
	And switch To ChildWindow
	And update account name "TC005"
	And click on save button

  @Tscenario_0006 @Account @Automation
  Scenario: Test scenario_0006 to add contact to existing customer "Profile: LEX G360 Primary FA + GTW"
	Given  Login into Application "TC006"
	And click On CustomerTab
	And click on existing customer
	And click on related tab
	And click on New Contact button
	And enter last name of contact "TC006"
	And click on save button

 @Tscenario_0007 @Account @Automation
  Scenario: Test scenario_0007 to Reassign existing customer "Profile: LEX G360 Primary FA + GTW"
	Given  Login into Application "TC007"
	And click On CustomerTab
	And click on existing customer
	And click on Reassign Prospect button
	And enter new account owner name "TC007"  
	And click on save button for new Owner
 
 @Tscenario_0008 @Account @Automation
  Scenario: Test scenario_0008 to create Prospect "Profile: LEX G360 District Manager + GTW"
	Given  Login into Application "TC008"
    And click On CustomerTab
    And click On New Button
    And switch To ChildWindow
    And populate Required Field To Create Prospect "TC008"
    When click On Save Button
    And switch To Parent Window
	Then validate Created Prospect  
   
 @Tscenario_0009 @Account @Automation
  Scenario: Test scenario_0009 to create Task to customer "Profile: LEX G360 District Manager + GTW"
	Given  Login into Application "TC009"
	And click On CustomerTab
	And click on existing customer
    And click On New Task	
    And enter task subject "TC009"
    And click on save button  

 @Tscenario_00010 @Account @Automation
  Scenario: Test scenario_00010 to create Note to customer "Profile: LEX G360 District Manager + GTW"
	Given  Login into Application "TC0010"
	And click On CustomerTab
	And click on existing customer
	And click on related tab
    And click On New Button under note section
    And enter subject of Note "TC0010"
    And enter note description "TC0010"
    And click on Add to record button
    And click on done button
    
 @Tscenario_00011 @Account @Automation
  Scenario: Test scenario_00011 to add account team member to customer "Profile: LEX G360 District Manager + GTW"
	Given  Login into Application "TC0011"
	And click On CustomerTab
	And click on existing customer
	And click on related tab
	And click on Add Team Member
 	And enter team username "TC0011"
 	And enter Team Role "TC0011"
 	And click on save button
 	
 @Tscenario_00012 @Account @Automation
  Scenario: Test scenario_00012 to clone existing customer "Profile: LEX G360 District Manager + GTW"
	Given  Login into Application "TC0012"
	And click On CustomerTab
	And click on existing customer
	And click on clone button
	And switch To ChildWindow
	And update account name "TC0012"
	And click on save button
	
 @Tscenario_00013 @Account @Automation
  Scenario: Test scenario_00013 to add contact to existing customer "Profile: LEX G360 District Manager + GTW"
	Given  Login into Application "TC0013"
	And click On CustomerTab
	And click on existing customer
	And click on related tab
	And click on New Contact button
	And enter last name of contact "TC0013"
	And click on save button
	
 @Tscenario_00014 @Account @Automation
  Scenario: Test scenario_00014 to Reassign existing customer "Profile: LEX G360 District Manager + GTW"
	Given  Login into Application "TC0014"
	And click On CustomerTab
	And click on existing customer
	And click on Reassign Prospect button
	And enter new account owner name "TC0014"  
	And click on save button

@Tscenario_00015 @Account @Automation
  Scenario: Test scenario_00015 to create Prospect "Profile: LEX MSS NA Area Manager GA"
	Given  Login into Application "TC0015"
    And click On CustomerTab
    And click On New Button
    And switch To ChildWindow
    And populate Required Field To Create Prospect "TC0015"
    When click On Save Button
    And switch To Parent Window
	Then validate Created Prospect  
   
 @Tscenario_00016 @Account @Automation
  Scenario: Test scenario_00016 to create Task to customer "Profile: LEX MSS NA Area Manager GA"
	Given  Login into Application "TC0016"
	And click On CustomerTab
	And click on existing customer
    And click On New Task	
    And enter task subject "TC0016"
    And click on save button  

 @Tscenario_00017 @Account @Automation
  Scenario: Test scenario_00017 to create Note to customer "Profile: LEX MSS NA Area Manager GA"
	Given  Login into Application "TC0017"
	And click On CustomerTab
	And click on existing customer
	And click on related tab
    And click On New Button under note section
    And enter subject of Note "TC0017"
    And enter note description "TC0017"
    And click on Add to record button
    And click on done button
    
 @Tscenario_00018 @Account @Automation
  Scenario: Test scenario_00018 to add account team member to customer "Profile: LEX MSS NA Area Manager GA"
	Given  Login into Application "TC0018"
	And click On CustomerTab
	And click on existing customer
	And click on related tab
	And click on Add Team Member
 	And enter team username "TC0018"
 	And enter Team Role "TC0018"
 	And click on save button
 	
 @Tscenario_00019 @Account @Automation
  Scenario: Test scenario_00019 to clone existing customer "Profile: LEX MSS NA Area Manager GA"
	Given  Login into Application "TC0019"
	And click On CustomerTab
	And click on existing customer
	And click on clone button
	And switch To ChildWindow
	And update account name "TC0019"
	And click on save button
	
 @Tscenario_00020 @Account @Automation
  Scenario: Test scenario_00020 to add contact to existing customer "Profile: LEX MSS NA Area Manager GA"
	Given  Login into Application "TC0020"
	And click On CustomerTab
	And click on existing customer
	And click on related tab
	And click on New Contact button
	And enter last name of contact "TC0020"
	And click on save button
	
 @Tscenario_00021 @Account @Automation
  Scenario: Test scenario_00021 to Reassign existing customer "Profile: LEX MSS NA Area Manager GA"
	Given  Login into Application "TC0021"
	And click On CustomerTab
	And click on existing customer
	And click on Reassign Prospect button
	And enter new account owner name "TC0021"  
	And click on save button
	
 
 @Tscenario_00022 @Account @Automation
  Scenario: Test scenario_00022 to create Prospect "Profile: LEX G360 Primary FA + GTW Alpha"
	Given  Login into Application "TC0022"
    And click On CustomerTab
    And click On New Button
    And switch To ChildWindow
    And populate Required Field To Create Prospect "TC0022"
    When click On Save Button
    And switch To Parent Window
	Then validate Created Prospect  
   
 @Tscenario_00023 @Account @Automation
  Scenario: Test scenario_00023 to create Task to customer "Profile: LEX G360 Primary FA + GTW Alpha"
	Given  Login into Application "TC0023"
	And click On CustomerTab
	And click on existing customer
    And click On New Task	
    And enter task subject "TC0023"
    And click on save button  

 @Tscenario_00024 @Account @Automation
  Scenario: Test scenario_00024 to create Note to customer "Profile: LEX G360 Primary FA + GTW Alpha"
	Given  Login into Application "TC0024"
	And click On CustomerTab
	And click on existing customer
	And click on related tab
    And click On New Button under note section
    And enter subject of Note "TC0024"
    And enter note description "TC0024"
    And click on Add to record button
    And click on done button
    
 @Tscenario_00025 @Account @Automation
  Scenario: Test scenario_00025 to add account team member to customer "Profile: LEX G360 Primary FA + GTW Alpha"
	Given  Login into Application "TC0025"
	And click On CustomerTab
	And click on existing customer
	And click on related tab
	And click on Add Team Member
 	And enter team username "TC0025"
 	And enter Team Role "TC0025"
 	And click on save button
 	
 @Tscenario_00026 @Account @Automation
  Scenario: Test scenario_00026 to clone existing customer "Profile: LEX G360 Primary FA + GTW Alpha"
	Given  Login into Application "TC0026"
	And click On CustomerTab
	And click on existing customer
	And click on clone button
	And switch To ChildWindow
	And update account name "TC0026"
	And click on save button
	
 @Tscenario_00027 @Account @Automation
  Scenario: Test scenario_00027 to add contact to existing customer "Profile: LEX G360 Primary FA + GTW Alpha"
	Given  Login into Application "TC0027"
	And click On CustomerTab
	And click on existing customer
	And click on related tab
	And click on New Contact button
	And enter last name of contact "TC0027"
	And click on save button
	
 @Tscenario_00028 @Account @Automation
  Scenario: Test scenario_00028 to Reassign existing customer "Profile: LEX G360 Primary FA + GTW Alpha"
	Given  Login into Application "TC0028"
	And click On CustomerTab
	And click on existing customer
	And click on Reassign Prospect button
	And enter new account owner name "TC0028"  
	And click on save button