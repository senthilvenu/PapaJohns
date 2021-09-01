package TestingFramework;

import org.testng.annotations.Test;

import Pages.Test2;

public class TestCase_02 {
	
	
	 @Test(groups= {"Regression"})
	 public void TestCase()
	   {
		   Test2 t2=new Test2();
		  t2.sampleTest();
		  t2.sampletTest2();
		 System.out.println("Code changes in git hub");
	   }

}
