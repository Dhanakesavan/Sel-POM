package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{

	public MyLeads() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleCreateLead;
	@And("Click Create Lead link on the left navigation pane")
	public CreateLeads clickCreateLeadLink() {
		click(eleCreateLead);
		return new CreateLeads();		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLead;
	@And ("Click Find Lead link on the left navigation pane")
	public FindLeads clickFindLeadsLink() {
		click(eleFindLead);
		return new FindLeads();		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement eleMergeLead;
	@And("Click Merge Lead link on the left navigation pane")
	public MergeLeads clickMergeLeadsLink() {
		click(eleMergeLead);
		return new MergeLeads();		
	}
	
}
