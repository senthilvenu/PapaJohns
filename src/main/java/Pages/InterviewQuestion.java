package Pages;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.testng.internal.Utils;

public class InterviewQuestion {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		ChromeOptions chromeOptions= new ChromeOptions();
		chromeOptions.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver","C:\\eclipse-committers-oxygen-1a-win32-x86_64\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(chromeOptions);	
		driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");			
		// 2.type of assertion
		//i. Hard Assertion
		String Day= driver.findElement(By.xpath("//label[@id='gwt-debug-cwCheckBox-Monday-label']")).getText();
		System.out.println(Day);
		Assert.assertEquals(Day, "Monday");
		//ii.Soft Assertion		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(Day, "Wednesday");
		soft.assertAll();		
		
		 //5.Wait
		 /****implict wait*****/
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 /******Explict Wati********/
		 WebDriverWait Explict=new WebDriverWait(driver, 30);
		 Explict.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='GNHGC04CHF GNHGC04CJF GNHGC04CBG'][1]")));
		 driver.findElement(By.xpath("//div[@class='GNHGC04CHF GNHGC04CJF GNHGC04CBG'][1]")).click();
		 //6.Mouse Hover
		  Actions act=new Actions(driver);
		  act.moveToElement(driver.findElement(By.xpath("//div[@class='GNHGC04CKF'][1]"))).build().perform();
		  act.click();
		 // 7.Screen shot		  
		  TakesScreenshot ts= (TakesScreenshot)driver;
		 File fs= ts.getScreenshotAs(OutputType.FILE);
		 Utils.copyFile(fs, new File("C:\\User\\Siva\\Test"));
		 //
		 
		 driver.manage().window().maximize();
		
		 //JavascriptExecutor JS= (JavascriptExecutor) driver;
		 //JS.executeScript("Document.getElementByID("login")").click();	 
		  		 
		

	}

	public static void otherTest() {
		
			//1. Alert popup
				/*String text =driver.switchTo().alert().getText();
				System.out.println(text);
				driver.switchTo().alert().dismiss();*/
		
		//3.Frame		
				driver.switchTo().frame(1);
				driver.switchTo().frame("name");
				driver.switchTo().frame(driver.findElement(By.xpath("Xpath")));
				//4.Window Handles
				/*** single window****/
				String windHan=driver.getWindowHandle();
				driver.switchTo().window(windHan);
				/**Multiple Window***/
				Set<String> Parentwind=driver.getWindowHandles();
				Iterator<String> prarnt = Parentwind.iterator();
				  String parentwind=prarnt.next();
				  driver.switchTo().window(parentwind);
				 String Childwind= prarnt.next();
				 driver.switchTo().window(Childwind);
				 driver.switchTo().defaultContent();
		
	}

}
