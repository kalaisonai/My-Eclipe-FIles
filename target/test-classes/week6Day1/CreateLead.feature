Feature: Create Lead for LeafTaps

Background:
    Given Launch browser
    And Maximize it
    And Set Implicit wait 
    And Launch URL
    And Pass the UserName as DemoSalesManager
    And Pass the PassWord as crmsfa
    And Login button click
    And Click on CRMSFA
    And Click on Create Lead link

Scenario Outline:  TC01 Create Lead Positive flow
	And Enter Company Name as <companyName>
	And Enter First Name as   <firstName>
	And Enter Last Name as <lastName>
    When Click Submit button
    Then Check the Created Lead 
		Examples:
		| companyName | firstName | lastName |
		| Company1 | FName1 | LName1 |
		| Company2 | FName2 | LName2 |
		
   

  