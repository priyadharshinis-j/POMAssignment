package testCases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseClass.CommonClass;
import pages.LoginPage;

public class MergeTestCase extends CommonClass{
	@Test(dataProvider="importData")
	public void mergeTestCase(String fname) throws InterruptedException, IOException
	{
		LoginPage login = new LoginPage(driver);
		
		
		login.userName().passWord().clickLogin().clickCrmsfa().clickLead().clickMergeLeads()
		.clickWidget1(fname).clickWidget2(fname).clickMerge().clickFindLeads().assignResultingID(leadID).takeScreenShotMerge()
		.clickFindLeads().verifyMergeLeads();
		
	}
	@BeforeTest
	public void importData()
	{
		fileName="TestData";
		sheetName="MergeLead";
		
	}

}
