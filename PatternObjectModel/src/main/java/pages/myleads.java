package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class myleads extends ProjectMethods
{
	
	public myleads() 
	{		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	WebElement createlead;
	
	public CreateLead Createleadclick() 
	{
		click(createlead);
		return new CreateLead();
	}
		
}
