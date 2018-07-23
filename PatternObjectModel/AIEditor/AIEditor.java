package AIEditor;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class AIEditor 
{
  WebDriver driver;
	
  @Test
  public void f() 
  {
	  
  }
  
  @BeforeClass
  public void beforeClass() 
  {
	  System.getProperty("webdriver.driver.chromedriver","./drivers/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("pro.qa.cmlmediasoft.com");
  }

  @AfterClass
  public void afterClass() 
  {
   System.out.println("Brands have been selected");
  }

}
