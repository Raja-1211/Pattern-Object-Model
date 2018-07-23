package testCaseAiEditor;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestcaseAiEditor extends AIEditorBase
{
	
	@BeforeSuite
	public void Brand()
	{
		System.out.println("Brands application test has been started");
	}
	
	@BeforeMethod()
	public void BeforeMethods()
	{
		System.out.println("Before Methods");
	}
	
    @Test(priority=1)
	public void Login()
	{
	StartApp();
	}
    
    @Test(priority=2)
    public void ProjectCreation()
    {
    	
    }
    
    
    
}
