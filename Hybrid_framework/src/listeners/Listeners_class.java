package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners_class implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("tc execution is started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("tc executed Sucessfully");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("tc failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test case skipped");
	}
  
}
