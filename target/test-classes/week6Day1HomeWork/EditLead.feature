Feature: Edit and Delete Lead for LeafTaps

Background:
    Given Launch browser
    And Maximize it
    And Set Implicit wait 
    And Launch URL
    And Pass the UserName as DemoSalesManager
    And Pass the PassWord as crmsfa
    And Login button click
    And Click on CRMSFA
    
    
Scenario: TC01 Edit Lead positive flow
	And Click on Leads from the Menu
    And Select Find Leads from left 
    And Search with Email Address
    And Select Find Lead button
    And Select the first lead ID from the result 
	And Select Edit button
    And Clear And update the company name
    When Select Update button
    Then Confirm the Company Name
    
Scenario: TC02 Delete Lead positive flow
	And Click on Leads from the Menu
    And Select Find Leads from left 
    And Search with Email Address
    And Select Find Lead button
    And Get the Lead Id to delete
    And Select the first lead ID from the result 
	When Select Delete button
    Then Select Find Leads from left 
    And Search with the deleted Lead ID
    And Confirm that ID is deleted
    