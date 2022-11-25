package baseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonClass {
	
	public  ChromeDriver driver;
	public static String leadID;
	public String fileName;
	public String sheetName;
	@Parameters({"url"})
	
	@BeforeMethod()
	public void precondition(String url)
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.get(url);
		
		
	}
	
	@DataProvider(name="importData")
	public String[][] setDataFile() throws IOException
	{
		return utils.ImportData.excelData(fileName,sheetName);
	}
	
	@AfterMethod()
	public void postCondition()
	{
		driver.close();
	}
	

}
