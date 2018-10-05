package Pages;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import junit.framework.Assert;

//public static 

public class Test1 {
	
	@Test(enabled=false,description="Test1_SampleTest_Results")
	public void sampleTest()
	{
	String Test1 = "Test1:Results";
	System.out.println(Test1);
	Assert.assertEquals(Test1,"Test1:Results");
	}
	@Test(dependsOnMethods= {"sampleTest"})
	public void sampletTest2()
	{    
		String Test2 = "Test1:Results1";
		
		System.out.println(Test2);
		SoftAssert Softassertion=new SoftAssert();
		Softassertion.assertEquals(Test2,"Test1:Results1");
			   // Softassertion.assertAll();
		
	}

}
