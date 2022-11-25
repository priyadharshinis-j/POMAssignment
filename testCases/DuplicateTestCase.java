package testCases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseClass.CommonClass;
import pages.LoginPage;

public class DuplicateTestCase extends CommonClass{
	
	@Test(dataProvider="importData")
	public void duplicateTestCase(String cname,String fname,String lname) throws InterruptedException, IOException
	{
		
		LoginPage login = new LoginPage(driver);
		
		login.userName().passWord().clickLogin().clickCrmsfa().clickLead().clickCreateLead().enterCompanyName(cname).enterFirstName(fname)
		.enterLastName(lname).enterLocalName().enterDepartmentField().enterDescription().enterEmail()
		.clickButton().clickDuplicateLead().enterCompanyName().enterFirstName().clickCreateButton().takeScreenShotDuplicate();
			
	}
	
	@BeforeTest
	public void importData()
	{
		fileName="TestData";
		sheetName="CreateLead";
	
		
	}

}
