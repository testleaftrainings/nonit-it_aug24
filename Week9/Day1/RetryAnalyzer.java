package week9.day1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{
	
	//false- it will not retry
	//true - it will retry
	
	int count=0;
     public boolean retry(ITestResult result) {
		if(count<2) {
			count++;
			return true;
		}
		
return false;
	}

}
