package utils;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportSample {
	
	public static void main(String[] args) throws IOException {
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/results.html");
		reporter.setAppendExisting(true);
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		ExtentTest test = extent.createTest("CreateTestCase", "Functionality of the positive Credentials");
		test.assignAuthor("Priyadharshini");
		test.assignCategory("Functional");
		
		ExtentTest test1 = extent.createTest("DeleteLeadTestCase", "Functionality of the positive Credentials");
		test.assignAuthor("Priyadharshini");
		test.assignCategory("Functional");
		
		ExtentTest test2 = extent.createTest("EditLeadTestCase", "Functionality of the positive Credentials");
		test.assignAuthor("Saroj");
		test.assignCategory("Functional");
		
		ExtentTest test3 = extent.createTest("MergerLeadTestCase", "Functionality of the positive Credentials");
		test.assignAuthor("Priyadharshini");
		test.assignCategory("Functional");
		
		ExtentTest test4 = extent.createTest("DuplicateLeadTestCase", "Functionality of the positive Credentials");
		test.assignAuthor("Saroj");
		test.assignCategory("Functional");
		
		
		
		
		test.pass("CreateLead Successfully", MediaEntityBuilder.createScreenCaptureFromPath(".././snap/shotCreate.jpg").build());
		test1.pass("Deleted Successfully", MediaEntityBuilder.createScreenCaptureFromPath(".././snap/shotDelete.jpg").build());
		test2.pass("Edited Successfully", MediaEntityBuilder.createScreenCaptureFromPath(".././snap/shotEdit.jpg").build());
		test3.pass("Merged Successfully", MediaEntityBuilder.createScreenCaptureFromPath(".././snap/shotMerge.jpg").build());
		test4.pass("Duplicated Successfully", MediaEntityBuilder.createScreenCaptureFromPath(".././snap/shotDuplicate.jpg").build());
		
		extent.flush();
		
		
		
		
		
		
	}
	
	

}
