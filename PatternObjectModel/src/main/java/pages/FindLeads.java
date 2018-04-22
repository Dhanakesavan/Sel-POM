package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class FindLeads extends ProjectMethods{

	public FindLeads() {		
		PageFactory.initElements(driver,this);
		String firstLeadId;
	}	
	
	@FindBy(how=How.NAME,using="id")
	private WebElement eleLeadId;
	@When("Enter Lead id as (.*)")
	public FindLeads typeLeadId(String data) {
		type(eleLeadId, data);
		return this;		
	}
	@When("Enter the captured lead id")
	public FindLeads typeCapturedLeadId() {
		FindLeads obj = new FindLeads();
//		String id = obj.getFirstDisplayedLeadId();
		type(eleLeadId, obj.getFirstDisplayedLeadId());
		return this;		
	}
	
	
	@FindBy(how=How.NAME,using="firstName")
	private WebElement eleFirstName;

	public FindLeads typeFirstName(String data) {
		type(eleFirstName, data);
		return this;		
	}
	
	@FindBy(how=How.NAME,using="lastName")
	private WebElement eleLastName;

	public FindLeads typeLastName(String data) {
		type(eleLastName, data);
		return this;		
	}
	
	@FindBy(how=How.NAME,using="companyName")
	private WebElement eleCompName;

	public FindLeads typeCompanyName(String data) {
		type(eleCompName, data);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeadsbtn;
	@And("Click Findlead button")
	public FindLeads clickFindLeadsbutton() {
		click(eleFindLeadsbtn);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	private WebElement eleLeadRes;
	@And("Click on the leadid link")
	public ViewLead clickLeadIdResultLink() {
		clickWithNoSnap(eleLeadRes);
		return new ViewLead();
	}
	@And("Get the leadid displayed")
	public String getFirstDisplayedLeadId() {
//		firstLeadId = getText(eleLeadRes);
		return getText(eleLeadRes);
	}
	
	@And("Click on the leadidlink to select the lead id")
	public MergeLeads clickLeadIdResultLinkBackToMergeLead() {
		clickWithNoSnap(eleLeadRes);
		switchToWindow(0);
		return new MergeLeads();//how to navigate to merge leads page
	}

	
	@FindBy(how=How.XPATH,using="//div[@class='x-paging-info']")
	private WebElement eleNoRecMsg;
	@Then("Verify the error message as (.*)")
	public FindLeads verifyNoRecordsMsg(String data) {
		verifyExactText(eleNoRecMsg, data);
		return this;	
	}
	
	
	
}
