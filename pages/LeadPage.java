package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.CommonClass;

public class LeadPage extends CommonClass{
	public LeadPage (ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	


	public CreateLead clickCreateLead()
	{
		WebElement createLeadLink = driver.findElement(By.linkText("Create Lead"));
		createLeadLink.click();
		return new CreateLead(driver);
	}
	
	public FindLeads clickFindLeads() throws InterruptedException
	{
				//10.Click find leads button
				WebElement clickFindLeadsButton = driver.findElement(By.xpath("//a[text()='Find Leads']"));
				clickFindLeadsButton.click();
				Thread.sleep(4000);
				return new FindLeads(driver);
	}
	
	public MergeLeadPage clickMergeLeads()
	{
		driver.findElement(By.linkText("Merge Leads")).click();
		return new MergeLeadPage(driver);
		
	}

	
}
