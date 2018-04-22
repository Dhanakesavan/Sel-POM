package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="To create a lead in leaftaps application";
		testNodes="Leads";
		category="Smoke";
		authors="Kesavan";
		browserName="chrome";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public void CreateLead(String uName,String pwd,String vName,String cName, String fname, String lname) {
		try {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.verifyLoggedName(vName)
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLeadLink()
		.typeCompanyName(cName)
		.typeFirstName(fname)
		.typeLastName(lname)
		.clickCreateLeadBtn()
		.VerifyFirstName(fname);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
