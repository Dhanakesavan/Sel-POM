package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{

	public ViewLead() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleCompLname;
	@Then("Verify the lead id in the company name field as (.*)")
	public ViewLead verifyCompanyName(String data) {
		verifyPartialText(eleCompLname, data);//ExactText(eleCompLname.substring(charAt(indexOf('(')),indexOf(')')-1), data);//use substring to find the company name and lead id separately
		return this;		
	}

	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleVerifyFname;
	@Then("Verify the updated first name as (.*)")
	public ViewLead VerifyFirstName(String data) {
		verifyExactText(eleVerifyFname, data);
		return this;
	}
	
	
	@FindBy(how=How.ID,using="viewLead_lastName_sp")
	private WebElement eleVerifyLname;
	@Then("Verify the updated last name as (.*)")
	public ViewLead VerifyLastName(String data) {
		verifyExactText(eleVerifyLname, data);
		return this;		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement eleDuplicateLeadbtn;
	@And("Click Duplicate button")
	public DuplicateLeads ClickDuplicateLeadBtn() {
		clickWithNoSnap(eleDuplicateLeadbtn);
		return new DuplicateLeads();		
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Edit']")
	private WebElement eleEditbtn;
	@And("Click on the Edit button")
	public EditLead ClickEditBtn() {
		clickWithNoSnap(eleEditbtn);
		return new EditLead();		
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Delete']")
	private WebElement eleDelbtn;
	@And("Click on the Delete button")
	public MyLeads ClickDeleteBtn() {
		clickWithNoSnap(eleDelbtn);
		return new MyLeads();		
	}
}
