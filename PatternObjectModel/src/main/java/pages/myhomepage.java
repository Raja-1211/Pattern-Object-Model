package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class myhomepage extends ProjectMethods
{
	
	public myhomepage() 
	{		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.LINK_TEXT,using="Leads")
	WebElement leads;
	
	public myleads clickmyleads() 
	{
		click(leads);
		return new myleads();
	}

}
