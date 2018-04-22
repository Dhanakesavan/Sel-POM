Feature: Edit Lead for Leaftaps

Background:
    Given Enter the username as DemoSalesManager
    And Enter the password as crmsfa
    And click on login button
	And Click CRMSFA link
	And Click Leads Tab

@smoke @regression
Scenario Outline: Edit Lead in LeafTaps application

	And Click Find Lead link on the left navigation pane
	When Enter Lead id as <leadid>
	And Click Findlead button
	And Click on the leadid link
	And Click on the Edit button
	And Update company name as <cName>
	And Update first name as <fname>
	And Update last name as <lname>
	And Click on Update button
	Then Verify the updated first name as <fname>
	Then Verify the updated last name as <lname>

		Examples:
		|leadid|cName|fname|lname|
		|10|TestLeaf|Jack|Sparrow|
#		|20|TestLeaf|Learnado|Davinci|
#		|30|TestLeaf|Kari|Kalan|