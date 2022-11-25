package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.CommonClass;

public class CRMSFAPage extends CommonClass {
	public CRMSFAPage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	
	public HomePage clickCrmsfa()
	{
		WebElement linkText = driver.findElement(By.linkText("CRM/SFA"));
		linkText.click();
		return new HomePage(driver);
	}
	
	public LoginPage clickLogout()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage(driver);
	}

}
