package TestingFramework;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.Test1;

@Listeners(Pages.listeners.class)
public class TestCase_01 
{
	private	 Logger log=LogManager.getLogger(TestCase_01.class.getName());
   @Test(groups= {"Sanity"})
   public void TestCase()
   {
	   Test1 t1=new Test1();
	   log.info("Referenece Value created for Test case1");
	  t1.sampleTest();
	  log.info("Login the page" );
	  t1.sampletTest2();
	  log.info("application created");
	  System.out.println("Testing Github");  
	   
	   
   }
}
