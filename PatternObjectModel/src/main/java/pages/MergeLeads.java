package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MergeLeads extends ProjectMethods{

	public MergeLeads() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[1]")
	private WebElement eleFromLeadIcon;
	@And("Click icon next to from lead field")
	public FindLeads clickFromLeadicon() {
		click(eleFromLeadIcon);
		switchToWindow(1);
		return new FindLeads();		
	}
	
	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[2]")
	private WebElement eleToLeadIcon;
	@And("Click icon next to to lead field")
	public FindLeads clickToLeadicon() {
		click(eleToLeadIcon);
		switchToWindow(1);
		return new FindLeads();		
	}
	
	@FindBy(how=How.XPATH,using="//a[@class='buttonDangerous'")
	private WebElement eleMergeBtn;
	@And("Click on the Merge button")
	public ViewLead clickMergeBtn() {
		clickWithNoSnap(eleMergeBtn);
		acceptAlert();
		return new ViewLead();		
	}
	
	@FindBy(how=How.CLASS_NAME,using="errorMessage")
	private WebElement eleErrMsg;

	public MergeLeads getErrMsg() {
		getText(eleErrMsg);
		return this;		
	}

	
	
	/*@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLead;

	public CreateLeads clickFindLeadsLink() {
		click(eleFindLead);
		return new CreateLeads();		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement eleMergeLead;

	public CreateLeads clickMergeLeadsLink() {
		click(eleMergeLead);
		return new CreateLeads();		
	}*/
	
}
