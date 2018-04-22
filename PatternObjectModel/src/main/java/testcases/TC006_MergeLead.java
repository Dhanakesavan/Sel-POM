package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeads;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_MergeLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC006_MergeLead";
		testDescription="To merge a lead with another lead in leaftaps application";
		testNodes="Leads";
		category="Smoke";
		authors="Kesavan";
		browserName="chrome";
		dataSheetName="TC006";
	}
	@Test(dataProvider="fetchData")
	public void MergeLead(String uName,String pwd,String fleadId,String tleadId,String fname, String lname) {
		try {
			new LoginPage()
			.enterUserName(uName)
			.enterPassword(pwd)
			.clickLogIn()
			.clickCRMSFA()
			.clickLeads()
			.clickMergeLeadsLink()
			.clickFromLeadicon()
			.typeLeadId(fleadId)
			.clickFindLeadsbutton()
			.clickLeadIdResultLinkBackToMergeLead()
			.clickToLeadicon()
			.typeLeadId(tleadId)
			.clickFindLeadsbutton()
			.clickLeadIdResultLinkBackToMergeLead()
			.clickMergeBtn()
			.VerifyFirstName(fname)
			.VerifyLastName(lname);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}
