Feature: Edit Lead for Leaftaps

Background:
    Given Enter the username as DemoSalesManager
    And Enter the password as crmsfa
    And click on login button
	And Click CRMSFA link
	And Click Leads Tab

@smoke @regression
Scenario Outline: Delete Lead in LeafTaps application

	And Click Find Lead link on the left navigation pane
	When Enter Lead id as <leadid>
	And Click Findlead button
	And Get the leadid displayed
	And Click on the leadid link
	And Click on the Delete button
	And Click Find Lead link on the left navigation pane
	When Enter the captured lead id
	And Click Findlead button
	Then Verify the error message as <errmsg>

		Examples:
		|leadid|errmsg|
		|10|No records to display|
