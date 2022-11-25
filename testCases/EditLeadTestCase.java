package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import baseClass.CommonClass;
import pages.LoginPage;

public class EditLeadTestCase extends CommonClass {
	@Test
	public void editLeadTestCase() throws InterruptedException, IOException
	{
		LoginPage login = new LoginPage(driver);
		
		
		login.userName().passWord().clickLogin().clickCrmsfa().clickLead().clickFindLeads()
		.enterFirstName().clickFindLeads().clickFirstResultingID().getTitle().clickEdit().changeCompanyName()
		.clickUpdate().takeScreenShotEdit().verifyChanges();
		
	}
	
	

}
