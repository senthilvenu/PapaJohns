package Pages;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import junit.framework.Assert;

//public static 

@Listeners(Pages.listeners.class)
public class Test1 {
			
	@Test(enabled=true)
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
