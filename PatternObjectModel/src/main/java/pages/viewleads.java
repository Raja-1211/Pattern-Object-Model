package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class viewleads extends ProjectMethods
{
	
	public viewleads() 
	{		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.LINK_TEXT,using="View Lead")
	WebElement viewlead;
	
	public viewleads ViewLead(String data) 
	{
		verifyPartialText(viewlead, data);
		return this;	
	}

	@FindBy(how=How.XPATH,using="//a[text()='Duplicate Lead']")
	WebElement Duplicatelead;
	
	public DuplicateLead DuplicateLead()
	{
		click(Duplicatelead);
		return new DuplicateLead();
	}

}
