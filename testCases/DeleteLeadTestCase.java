package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import baseClass.CommonClass;
import pages.LoginPage;

public class DeleteLeadTestCase extends CommonClass{
	
	@Test
	public void deleteLeadTestCase() throws InterruptedException, IOException {
		
		LoginPage login = new LoginPage(driver);
		
		
		login.userName().passWord().clickLogin().clickCrmsfa().clickLead()
		.clickFindLeads().getFirstResultingLead().clickFirstResultingID().clickDelete()
		.clickFindLeads().enterCaputreID().clickFindLeads().takeScreenShotDelete().verifyMessage();
				
	}
	


}
