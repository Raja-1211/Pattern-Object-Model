package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods
{
	
	public CreateLead() 
	{		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	WebElement CompanyName;
	
	public CreateLead typeCompanyName(String data) 
	{
		type(CompanyName,data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	WebElement FirstName;
	
	public CreateLead typeFirstName(String data) 
	{
		type(FirstName,data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	WebElement LastName;
	
	public CreateLead typeLastName(String data) 
	{
		type(LastName,data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Find Leads']")
	WebElement FindLeads;
	
	public FindLeads FindingLead() 
	{
		click(FindLeads);
		return new FindLeads();
	}
	
}
