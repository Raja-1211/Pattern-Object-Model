package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DuplicateLead extends ProjectMethods
{
	
	public DuplicateLead() 
	{		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.LINK_TEXT,using="View Lead")
	WebElement viewlead;
	
	public DuplicateLead ViewLead(String data) 
	{
		verifyPartialText(viewlead, data);
		return this;	
	}

	@FindBy(how=How.ID,using="createLeadForm_departmentName")
	WebElement DepartmentName;
	
	public DuplicateLead EnterDepartment()
	{
		click(DepartmentName);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='submitButton']")
	WebElement DuplicateCreate;
	
	public DuplicateLead CreateDuplicate()
	{
		click(DuplicateCreate);
		return this;
	}

}
