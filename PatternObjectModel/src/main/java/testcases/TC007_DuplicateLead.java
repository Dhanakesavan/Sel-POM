package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC007_DuplicateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC007_DuplicateLead";
		testDescription="To duplicate a lead record in leaftaps application";
		testNodes="Leads";
		category="Smoke";
		authors="Kesavan";
		browserName="chrome";
		dataSheetName="TC007";
	}
	@Test(dataProvider="fetchData")
	public void DuplicateLead(String uName,String pwd,String leadId,String cname,String fname,String lname) {
		try {
			new LoginPage()
			.enterUserName(uName)
			.enterPassword(pwd)
			.clickLogIn()
			.clickCRMSFA()
			.clickLeads()
			.clickFindLeadsLink()
			.typeLeadId("10275")
			.clickFindLeadsbutton()
			.clickLeadIdResultLink()
			.ClickDuplicateLeadBtn()
			.typeCompanyName(cname)
			.typeFirstName(fname)
			.typeLastName(lname)
			.clickCreateLeadBtn()
			.VerifyFirstName(fname)
			.VerifyLastName(lname);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
