package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class DuplicateLeads extends ProjectMethods{

	public DuplicateLeads() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCmpname;
	@And("Update companyname as (.*)")
	public DuplicateLeads typeCompanyName(String data) {
		type(eleCmpname, data);
		return this;		
	}
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstname;
	@And("Update firstname as (.*)")
	public DuplicateLeads typeFirstName(String data) {
		type(eleFirstname, data);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastname;
	@And("Update lastname as (.*)")
	public DuplicateLeads typeLastName(String data) {
		type(eleLastname, data);
		return this;		
	}
		
	@FindBy(how=How.XPATH,using="//input[@value='Create Lead']")
	private WebElement eleCrtLead;
	@And("Click on Createlead button")
	public ViewLead clickCreateLeadBtn() {
		click(eleCrtLead);
		return new ViewLead();		
	}
	
}
