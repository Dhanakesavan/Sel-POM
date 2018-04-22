package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC005_DeleteLead";
		testDescription="To delete a lead in leaftaps application";
		testNodes="Leads";
		category="Regression";
		authors="Dhanakesavan";
		browserName="chrome";
		dataSheetName="TC005";
	}
	@Test(dataProvider="fetchData")
	public void DeleteLead(String uName,String pwd,String leadId,String Errmsg) {
		try {
			new LoginPage()
			.enterUserName(uName)
			.enterPassword(pwd)
			.clickLogIn()
			.clickCRMSFA()
			.clickLeads()
			.clickFindLeadsLink()
			.typeLeadId(leadId)
			.clickFindLeadsbutton()
			.clickLeadIdResultLink()
			.ClickDeleteBtn()
			.clickFindLeadsLink()
			.typeLeadId(leadId)
			.clickFindLeadsbutton()
			.verifyNoRecordsMsg(Errmsg);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
