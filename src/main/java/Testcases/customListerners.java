package Testcases;


import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;



public class customListerners extends report implements ITestListener {
	
	ExtentTest test=null;

	public void onTestStart(ITestResult result) {
		 test=extent.createTest(result.getTestClass().getName());
		//System.out.println(test);
	}

	public void onTestSuccess(ITestResult result) {
		
		//test.log(Status.PASS, "Passed");
		
		
	}

	public void onTestFailure(ITestResult context) {
		//test.log(Status.FAIL, "failed");
		
	}
	
	
	

}
