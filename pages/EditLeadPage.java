package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.CommonClass;

public class EditLeadPage extends CommonClass{
	
	public EditLeadPage(ChromeDriver driver)
	{
		this.driver=driver;
		
	}
	
	public EditLeadPage changeCompanyName()
	{
		WebElement updateCompanyName = driver.findElement(By.id("updateLeadForm_companyName"));
		updateCompanyName.clear();
		updateCompanyName.sendKeys("Test_Leaf");
		return this;
	}
	
	public ViewLeadPage clickUpdate()
	{
		WebElement clickUpdateButton = driver.findElement(By.xpath("//input[@type='submit']"));
		clickUpdateButton.click();
		return new ViewLeadPage(driver);
	}

}
