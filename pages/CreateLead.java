package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.CommonClass;

public class CreateLead extends CommonClass {
	
	
	
	public CreateLead(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public CreateLead enterCompanyName(String cname)
	{
		WebElement companyNameField = driver.findElement(By.id("createLeadForm_companyName"));
		companyNameField.sendKeys(cname);
		//Thread.sleep(3000);
		return this;
	}
	
	public CreateLead enterFirstName(String fname)
	{
		
		//8. Enter FirstName Field Using id Locator
		WebElement firstNameField = driver.findElement(By.id("createLeadForm_firstName"));
		firstNameField.sendKeys(fname);
		//Thread.sleep(3000);
		return this;
	}
		public CreateLead enterLastName(String lname)
		{
		//9. Enter LastName Field Using id Locator
		WebElement lastNameField = driver.findElement(By.id("createLeadForm_lastName"));
		lastNameField.sendKeys(lname);
		//Thread.sleep(3000);
		return this;
		}
		
		public CreateLead enterLocalName()
		{
		//10. Enter FirstName(Local) Field Using id Locator
		WebElement firstNameLocalField = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstNameLocalField.sendKeys("Priyadharshini");
		//Thread.sleep(3000);
		return this;
		}
		
		public CreateLead enterDepartmentField()
		{
		//11. Enter Department Field Using any Locator of Your Choice
		WebElement departmentField = driver.findElement(By.name("departmentName"));
		departmentField.sendKeys("Software Testing");
		//Thread.sleep(3000);
		return this;
		}
		
		public CreateLead enterDescription()
		{
			
		//12. Enter Description Field Using any Locator of your choice 
		WebElement descriptionField = driver.findElement(By.id("createLeadForm_description"));
		descriptionField.sendKeys("Selenium Automation Testing Practice");
		//Thread.sleep(3000);
		return this;
		}
		
		public CreateLead enterEmail()
		{
		//13. Enter your email in the E-mail address Field using the locator of your choice
		WebElement emailIdField = driver.findElement(By.id("createLeadForm_primaryEmail"));
		emailIdField.sendKeys("priyadharshini.ceg@gmail.com");
		//Thread.sleep(3000);
		return this;
		}
		
		public ViewLeadPage clickButton()
		{
		//14. Click on Create Button
		WebElement clickCreateLeadButton = driver.findElement(By.name("submitButton"));
		clickCreateLeadButton.click();
		//Thread.sleep(3000);
		return new ViewLeadPage(driver);
		
		}
		
		
		
	}


