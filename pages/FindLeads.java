package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.CommonClass;

public class FindLeads extends CommonClass {
	
	public static String resultingLead;
	public FindLeads(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public FindLeads getFirstResultingLead()
	{
		//11.Capture lead ID of First Resulting lead
				WebElement firstResultingLead = driver.findElement(By.xpath("(//div[contains(@class,'cell-inner')]/child::a[@class='linktext'])[1]"));
				resultingLead = firstResultingLead.getText();
				System.out.println("Lead ID of First Resulting Lead "+resultingLead);
				return this;
	}
	
	public ViewLeadPage clickFirstResultingID() throws InterruptedException
	{
		//12.Click First Resulting lead
				WebElement clickFirstResultingLead = driver.findElement(By.xpath("(//div[contains(@class,'cell-inner')]/child::a[@class='linktext'])[1]"));
				clickFirstResultingLead.click();
				Thread.sleep(3000);
				return new ViewLeadPage(driver);
	}
	
	public FindLeads enterCaputreID() throws InterruptedException
	{
		//15.Enter captured lead ID
				WebElement enterCaptureLeadID = driver.findElement(By.xpath("//input[@name='id']"));
				enterCaptureLeadID.sendKeys(resultingLead);
				Thread.sleep(2000);
				return this;
	}
	
	public FindLeads clickFindLeads() throws InterruptedException
	{
		//16.Click find leads button
				WebElement click_FindLeadsButton = driver.findElement(By.xpath("//button[text()='Find Leads']"));
				click_FindLeadsButton.click();
				Thread.sleep(2000);
				return this;
	}
	
	public FindLeads verifyMessage()
	{
		//17.Verify message "No records to display" in the Lead List. This message confirms the successful deletion
				WebElement verifyMessage = driver.findElement(By.xpath("//div[text()='No records to display']"));
				String recordsDisplay = verifyMessage.getText();
				System.out.println("Successful Deletion "+recordsDisplay);
				return this;
	}
	public FindLeads enterFirstName() {
		
		WebElement firstNameField = driver.findElement(By.xpath("(//div[@class='x-form-element']/child::input[@name='firstName'])[3]"));
		firstNameField.sendKeys("Priyadharshini");
		return this;
		
	}
	public FindLeads assignResultingID(String leadID) {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		return this;
	}
	
	public FindLeads verifyMergeLeads()
	{
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		
		return this;
	}

public FindLeads takeScreenShotDelete() throws IOException {
		
		
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snap/shotDelete.jpg");
		FileUtils.copyFile(screenshotAs, dest);
		return this;
	}

public FindLeads takeScreenShotMerge() throws IOException {
	
	
	File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
	File dest = new File("./snap/shotMerge.jpg");
	FileUtils.copyFile(screenshotAs, dest);
	return this;
}
}
