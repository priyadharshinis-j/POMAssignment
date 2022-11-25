package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.CommonClass;

public class ViewLeadPage extends CommonClass{
	
	public ViewLeadPage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public ViewLeadPage verifyFirstName()
	{
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(text);
		return this;
	}
	public ViewLeadPage getTitle()
	{
	//15. Get the Title of Resulting Page.
	String title = driver.getTitle();
	System.out.println("Title of the webpage is "+title);
	return this;
	}
	
	public LeadPage clickDelete() throws InterruptedException
	{
		//13.Click Delete
				WebElement clickDeleteButton = driver.findElement(By.xpath("//a[text()='Delete']"));
				clickDeleteButton.click();
				Thread.sleep(2000);
				return new LeadPage(driver);
	}
	public EditLeadPage clickEdit()
	{
		WebElement clickEdit = driver.findElement(By.xpath("//a[text()='Edit']"));
		clickEdit.click();
		return new EditLeadPage(driver);
	}
	
	public ViewLeadPage verifyChanges() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement confirmChanges = driver.findElement(By.id("viewLead_companyName_sp"));
		String updatedCompanyName = confirmChanges.getText();
		System.out.println("Updated Company Name "+updatedCompanyName);
		return this;
	}
	public DuplicateLeadPage clickDuplicateLead()
	{
		WebElement duplicateButton = driver.findElement(By.linkText("Duplicate Lead"));
		duplicateButton.click();
		return new DuplicateLeadPage(driver);
	}

	public ViewLeadPage takeScreenShotCreate() throws IOException
	{
		
			File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("./snap/shotCreate.jpg");
			FileUtils.copyFile(screenshotAs, dest);
			return this;
		
	
	}
public ViewLeadPage takeScreenShotEdit() throws IOException {
		
		
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snap/shotEdit.jpg");
		FileUtils.copyFile(screenshotAs, dest);
		return this;
	}

}
