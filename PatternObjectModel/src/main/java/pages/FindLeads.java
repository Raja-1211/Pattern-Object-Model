package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import wdMethods.ProjectMethods;

public class FindLeads extends ProjectMethods{
	
	public FindLeads() 
	{		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	WebElement Leadid;
	
	public FindLeads typeempid(String data) 
	{
		type(Leadid,data);
		return this;
	}
		
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	WebElement LeadsButton;
	
	public FindLeads Leadsearch(String data) 
	{
		type(LeadsButton,data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='10382']")
	WebElement Searchid;
	
	public viewleads SearchId(String data) 
	{
		click(Searchid);
		return new viewleads();
	}
		
}