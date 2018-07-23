package testNgannotations;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestNgannotations 
{
	@BeforeMethod
	
	public void BeforeMethod()
	  {
		  System.out.println("BeforeMethods");
	  }
	
    @Test
    public void beforesoft()
    {
		  Assert.assertEquals(2, 2);
		  SoftAssert assertion = new SoftAssert();
		  assertion.assertAll();
		  System.out.println("Running after failure");
	  }
	
	 @Test
	  public void test1() 
	   {
		System.out.println("Test method");
	   }
	  
	  @AfterMethod
	  public void AfterMethod()
	  {
		  System.out.println("AfterMethods");
	  }
	  
}
