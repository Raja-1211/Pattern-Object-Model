package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import wdMethods.ProjectMethods;

public class MergeLeads extends ProjectMethods{
	
	public MergeLeads() 
	{		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	WebElement CompanyName;
	
	public MergeLeads typeCompanyName(String data) 
	{
		type(CompanyName,data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	WebElement FirstName;
	
	public MergeLeads typeFirstName(String data) 
	{
		type(FirstName,data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	WebElement LastName;
	
	public MergeLeads typeLastName(String data) 
	{
		type(LastName,data);
		return this;
	}
		
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	WebElement submit;
	
	public viewleads clickSubmit()
	{
		click(submit);
		return new viewleads();
	}
	
}
