package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods{

	public EditLead() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleCname;
	@And("Update company name as (.*)")
	public EditLead EnterCompanyName(String data) {
		type(eleCname, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="updateLeadForm_firstName")
	private WebElement eleFname;
	@And("Update first name as (.*)")
	public EditLead EnterFirstName(String data) {
		type(eleFname, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="updateLeadForm_lastName")
	private WebElement eleLname;
	@And("Update last name as (.*)")
	public EditLead EnterLastName(String data) {
		type(eleLname, data);
		return this;}
	

	@FindBy(how=How.XPATH,using="//input[@value='Update']")
	private WebElement eleUpdatebtn;
	@And("Click on Update button")
	public ViewLead ClickUpdateBtn() {
		clickWithNoSnap(eleUpdatebtn);
		return new ViewLead();		
	}
	

}
