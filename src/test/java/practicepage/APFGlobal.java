package practicepage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class APFGlobal  extends APUtility
{
	ExtentSparkReporter HeroReporter;
	ExtentReports reports;
	ExtentTest test;
	WebDriver driver;
	@BeforeTest
	 public void Dreports() 
	 {
		 HeroReporter = new ExtentSparkReporter("D:\\AutomationBlog\\firefoxForm\\Form4") ;
		 reports = new ExtentReports();
		reports.attachReporter(HeroReporter);
		
		// add environments
		reports.setSystemInfo("Browser", "firefox");
		reports.setSystemInfo("OS", "Windows");
		reports.setSystemInfo("Tool", "Eclipse");
		reports.setSystemInfo("Language", "Java");
		
		 // configuration to change look and feel
		  HeroReporter.config().setDocumentTitle("Automation Blog spot form");
		  HeroReporter.config().setReportName("Blog report");
		  HeroReporter.config().setTheme(Theme.STANDARD);
		  HeroReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')' ");
	} 
   @BeforeClass
   public void launch() 
   {
	   WebDriverManager.firefoxdriver().setup();
	   driver = new FirefoxDriver();
	   driver.get(url);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   driver.manage().window().maximize();
   }
   @AfterMethod
   public void gettestresult(ITestResult result)
   {
  	    if(result.getStatus()== ITestResult.FAILURE) {
  	    	test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " fail" , ExtentColor.RED));
  	    } else if(result.getStatus()== ITestResult.SUCCESS) {
  	    	test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " PASS" , ExtentColor.GREEN));
  	    }
  	    else if(result.getStatus()== ITestResult.SKIP) {
  	    	test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " SKIP" , ExtentColor.BROWN));
  	    }
   }
   @AfterTest
   public void tearDown() {
  	   reports.flush();
   }
}
