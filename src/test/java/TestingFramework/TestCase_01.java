package TestingFramework;

import org.testng.annotations.Test;

import Pages.Test1;

public class TestCase_01 
{
   @Test(groups= {"Sanity"})
   public void TestCase()
   {
	   Test1 t1=new Test1();
	  t1.sampleTest();
	  t1.sampletTest2();
	   
	   
   }
}
