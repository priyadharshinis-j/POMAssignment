package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.CommonClass;

public class LoginPage extends CommonClass{
	 
	
	public LoginPage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public LoginPage userName() {
		
		WebElement userNameTextBox = driver.findElement(By.id("username"));
		userNameTextBox.sendKeys("DemoSalesManager");
		//LoginPage obj = new LoginPage();
		//return obj;
		
		//second way to return
		
		//return new LoginPage();
		
		return this;
		
	}
	

	
	public LoginPage passWord()
	{
		
		WebElement passwordTextBox = driver.findElement(By.id("password"));
		passwordTextBox.sendKeys("crmsfa");
		return this;
		
	}
	
	public CRMSFAPage clickLogin() throws InterruptedException
	{
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		Thread.sleep(3000);
		//WelcomePage obj = new WelcomePage();
		return new CRMSFAPage(driver);
	}

}
