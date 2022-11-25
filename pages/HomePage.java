package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.CommonClass;

public class HomePage extends CommonClass{
	public HomePage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	
	public LeadPage clickLead()
	{
		driver.findElement(By.linkText("Leads")).click();
		
		return new LeadPage(driver);
	}

}
