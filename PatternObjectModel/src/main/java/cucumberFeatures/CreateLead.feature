Feature: Create Lead for Leaftaps

Background:
    Given Enter the username as DemoSalesManager
    And Enter the password as crmsfa
    And click on login button
	And Click CRMSFA link
	And Click Leads Tab

@smoke @sanity
Scenario Outline: Create a lead for leaftaps application
#	Given Login
	And Click Create Lead link on the left navigation pane
	#When Enter Company Name as TestLeaf
	#And Enter first name as D
	#And Enter last name as K
	When Enter Details as <cName>,<fName>,<lName>
	And Click create lead button
	#Then Verify the lead creation
		
		Examples:
		|cName|fName|lName|
		|TestLeaf|Jack|Sparrow|
#		|TestLeaf|Learnado|Davinci|
#		|TestLeaf|Kari|Kalan|