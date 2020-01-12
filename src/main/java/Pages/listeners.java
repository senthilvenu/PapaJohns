package Pages;
 import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeners implements ITestListener {

	public void onFinish(ITestResult result) {
		System.out.println("Completed Test cases:" + result.getName());		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}


	public void onTestFailure(ITestResult result) {
		System.out.println("Failure Test cases:" + result.getName());
		
	}


	public void onTestStart(ITestResult result) {
		System.out.println("Test Cases Started :" + result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case passed :" + result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Cases skipped :" + result.getName());
		
	}
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}
}