package Testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class report {
	
	public ExtentReports extent ;
	
	@BeforeTest
	public void SetUp()
	{
		
		ExtentSparkReporter sparkreport=new ExtentSparkReporter(System.getProperty("User.dir") + "report\\report.html");
		
		sparkreport.config().setDocumentTitle("Test report");
		sparkreport.config().setReportName("Extent Report");
		
		extent=new ExtentReports();
		extent.attachReporter(sparkreport);
		//as
		
	}

	
	@Test
	public void test()
	{
		extent.createTest("Ashwini");
		System.out.println("adasd");
		
	}
	
	
	@AfterTest
	
	public void tearUp()
	{
		extent.flush();
	}
	
}
