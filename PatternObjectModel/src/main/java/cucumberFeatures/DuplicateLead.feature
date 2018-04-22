Feature: Duplicate Lead for Leaftaps

Background:
    Given Enter the username as DemoSalesManager
    And Enter the password as crmsfa
    And click on login button
	And Click CRMSFA link
	And Click Leads Tab

@smoke @regression
Scenario Outline: Duplicate Lead in LeafTaps application

	And Click Find Lead link on the left navigation pane
	When Enter Lead id as <leadid>
	And Click Findlead button
	And Click on the leadid link
	And Click Duplicate button
	And Update companyname as <cName>
	And Update firstname as <fname>
	And Update lastname as <lname>
	And Click on Createlead button
	Then Verify the updated first name as <fname>
	Then Verify the updated last name as <lname>
#	And Capture the lead id details
#	Then Click Find Lead link on the left navigation pane
#	Then Enter Lead id as <leadid>
		Examples:
		|leadid|cName|fname|lname|
		|10|TestLeaf|Jack|Sparrow|
#		|20|TestLeaf|Learnado|Davinci|
#		|30|TestLeaf|Kari|Kalan|