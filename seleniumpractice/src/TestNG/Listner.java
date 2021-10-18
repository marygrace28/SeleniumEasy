package TestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner implements ITestListener {
	
public void onTestStart(ITestResult result)
{
	System.out.println("this is start of execution");
}

public void onTestSuccess(ITestResult result)
{
	System.out.println("this is after passed");
}

public void onTestFailure(ITestResult result)
{
	System.out.println("this is after fail");
}

public void onTestSkipped(ITestResult result)
{
	System.out.println("this is when something got skipped");
}

public void onTestFailedButWithinSuccessPercentage(ITestResult result)
{
	System.out.println("this is @ pass % = ");
}

public void onFinish(ITestResult result)
{
	
	System.out.println("this is at finish");
}
	
	

}