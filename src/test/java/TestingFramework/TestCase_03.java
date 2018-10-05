package TestingFramework;
import org.testng.annotations.Test;
import Pages.Test3;

public class TestCase_03 {

	@Test(groups= {"Sanity"})
	 public void TestCase()
	   {
		   Test3 t3=new Test3();
		  t3.sampleTest3();
		  t3.sampletTest_3();
	   }
	
}
