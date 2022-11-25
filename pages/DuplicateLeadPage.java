package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.CommonClass;

public class DuplicateLeadPage extends CommonClass{
	
	public DuplicateLeadPage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public DuplicateLeadPage enterCompanyName()
	{
		WebElement clearCompanyNameField =  driver.findElement(By.id("createLeadForm_companyName"));
		clearCompanyNameField.clear();
		clearCompanyNameField.sendKeys("TestLeaf");
		return this;
	}
	public DuplicateLeadPage enterFirstName()
	{
		
		WebElement clearFirstNameField = driver.findElement(By.id("createLeadForm_firstName"));
		clearFirstNameField.clear();
		clearFirstNameField.sendKeys("Priyadharshini");
		return this;
	}
	
	public DuplicateLeadPage clickCreateButton()
	{
		WebElement clickCreateLeadButton2 = driver.findElement(By.name("submitButton"));
		clickCreateLeadButton2.click();
		return this;
		
	}
	
public DuplicateLeadPage takeScreenShotDuplicate() throws IOException {
		
		
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snap/shotDuplicate.jpg");
		FileUtils.copyFile(screenshotAs, dest);
		return this;
	}

}
