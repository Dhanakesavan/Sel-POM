package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_LoginAndLogout extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC001_LoginAndLogout";
		testDescription="login to LeafTaps And Logout1";
		testNodes="Leads";
		category="Smoke";
		authors="Kesavan";
		browserName="chrome";
		dataSheetName="TC001";
	}
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String vName) {
		try {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.verifyLoggedName(vName);
//		.clickLogOut();	
/*		.clickCRMSFA()
		.clickLeads()
		.clickCreateLeadLink()
		.typeCompanyName(cName)
		.typeFirstName(fname)
		.typeLastName(lname)
		.clickCreateLeadBtn()
		.VerifyFirstName(fname);*/
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
