package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CreateLead;
import pages.HomePage;
import pages.LoginPage;
import pages.myhomepage;
import pages.myleads;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods 
{
	@BeforeTest
	public void setData() 
	{
		testCaseName="TC003";
		testDescription="login to LeafTaps And Logout1";
		testNodes="Leads";
		category="Smoke";
		authors="Gopi";
		browserName="chrome";
		dataSheetName="TC003";
	}
	
	@Test(dataProvider="fetchData")
	public void Createlead(String uName,String pwd,String compname,String firstname,String lastname, String data) 
	{
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		

		.clickCrm()
		//new MyHomePage()
		.clickmyleads()
		//new MyLeads()
		.Createleadclick()
		//new CreateLeads()
		.typeCompanyName(compname)
		.typeFirstName(firstname)
		.typeLastName(lastname).FindingLead().typeempid(data).Leadsearch(data).SearchId(data).ViewLead(data).DuplicateLead();
	}
}