package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.*;
import wdMethods.ProjectMethods;

public class CreateLeads extends ProjectMethods{

	public CreateLeads() {		
		PageFactory.initElements(driver,this);
	}	
	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	
	@When("Enter Details as (.*),(.*),(.*)")
	private CreateLeads enterDetails(String cName,String fName,String lName) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(eleCompanyName,cName);
		type(eleFirstName,fName);
		type(eleLastName,lName);
		return this;		
	}
	
//	@FindBy(how=How.ID,using="createLeadForm_firstName")
//	private WebElement eleFirstName;
   	public CreateLeads typeFirstName(String data) {
   			type(eleFirstName,data);
			return this;		
	}
	
//	@FindBy(how=How.ID,using="createLeadForm_lastName")
//	private WebElement eleLastName;
	public CreateLeads typeLastName(String data) {
		type(eleLastName,data);
		return this;
		
		
	}
	

	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleCreateLeadBtn;
	@And("Click create lead button")
	public ViewLead clickCreateLeadBtn() {
		click(eleCreateLeadBtn);
		return new ViewLead();		
	}



}
