package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead";
		testDescription="To edit a lead in leaftaps application and verify the availability of the updated lead";
		testNodes="Leads";
		category="Regression";
		authors="DKesavan";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	public void EditLead(String uName,String pwd,String leadId,String cName, String fname, String lname) {
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
		.ClickEditBtn()
		.EnterCompanyName(cName)
		.EnterFirstName(fname)
		.EnterLastName(lname)
		.ClickUpdateBtn()
		.VerifyFirstName(fname)
		.VerifyLastName(lname);
//		.closeBrowser();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
