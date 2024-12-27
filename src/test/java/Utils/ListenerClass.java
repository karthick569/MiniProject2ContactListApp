package Utils;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import Base.ProjectSpecificationsMethods;

public class ListenerClass extends ProjectSpecificationsMethods implements ITestListener
{
    @Override
	public void onTestSuccess(ITestResult result)
	{
		test.log (Status.PASS,"Test Passed");
	}
 
    @Override
	public void onTestFailure(ITestResult result)
	{   
	String filepath=null;	
	   test.fail( result.getThrowable());
       try {
		filepath =screenshot(result.getMethod().getMethodName());
	} catch (IOException e)
       {

		e.printStackTrace();
	    }
      
       test.addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	

	

}
