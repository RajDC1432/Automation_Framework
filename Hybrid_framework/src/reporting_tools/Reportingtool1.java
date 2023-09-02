package reporting_tools;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reportingtool1 
{
@Test
public void test1()
{
	ExtentReports report=new ExtentReports("./repo/r.html",false);
	ExtentTest log1=report.startTest("testcase1");
	log1.log(LogStatus.PASS,"Test case passed");
	log1.log(LogStatus.FAIL,"Testcase failed");
	log1.log(LogStatus.SKIP,"testcase skipped");
	report.endTest(log1);
	report.flush();
}
}
