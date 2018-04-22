Feature: Merge Lead for Leaftaps

Background:
    Given Enter the username as DemoSalesManager
    And Enter the password as crmsfa
    And click on login button
	And Click CRMSFA link
	And Click Leads Tab

@smoke @regression
Scenario Outline: Merge Lead in LeafTaps application

	And Click Merge Lead link on the left navigation pane
	And Click icon next to from lead field
	And Enter Lead id as <fromleadid>
	And Click Findlead button
	And Click on the leadidlink to select the lead id
	And Click icon next to to lead field
	And Enter Lead id as <toleadid>
	And Click Findlead button
	And Click on the leadidlink to select the lead id
	And Click on the Merge button
	Then Verify the lead id in the company name field as <toleadid>
#	Then Verify the updated first name as <fname>
#	Then Verify the updated last name as <lname>
	And Click Find Lead link on the left navigation pane
	When Enter Lead id as <fromleadid>
	And Click Findlead button
	Then Verify the error message as <errmsg>
	
	
		Examples:
		|fromleadid|toleadid|errmsg|
		|20|10571|No records to display|
