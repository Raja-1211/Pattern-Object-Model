package testCaseAiEditor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AIEditorBase 
{

	WebDriver driver;
	
	public void StartApp()
	{
		System.getProperty("webdriver.driver.chromedriver","./drivers/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("pro.qa.cmlmediasoft.com");
	}
	
	public WebElement Projcreation(WebElement ele, String locator, String locvalue)
	{
		try {
			switch(locator) 
			{
			case("id"): return driver.findElement(By.id(locvalue)); 
			case("link"): return driver.findElement(By.linkText(locvalue));
			case("xpath"):return driver.findElement(By.xpath(locvalue));
			case("name"): return driver.findElement(By.className(locvalue));
			case("class"): return driver.findElement(By.name(locvalue));
			case("tag"):return driver.findElement(By.tagName(locvalue));
			}
		} catch (NoSuchElementException e) 
		{
			System.out.println("No such Element exception found");
		} catch (WebDriverException e) 
		{
			System.out.println("Webdriver exception found");
		}
		return null;
	}
			
}

