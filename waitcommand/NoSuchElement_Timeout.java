package waitcommand;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NoSuchElement_Timeout {

	public static void main(String[] args) 
	{
	
	/*	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		long start_time=System.currentTimeMillis();
		
	 	try {
			
			driver.findElement(By.id("email"));
			System.out.println("Object identified");
			
	 	} catch (Exception e) {
			
		}
		
		
		long End_time=System.currentTimeMillis();
		System.out.println("Elasped time in ms "+(End_time-start_time));  */

	 
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    
	    WebDriverWait wait = new WebDriverWait(driver, 50);
	    
	    long Start_Time=System.currentTimeMillis();
	    
	    try {
	    	
	    	driver.findElement(By.id("email")).sendKeys("Mehdi");
	    	driver.findElement(By.id("pass")).sendKeys("5543");
	    	System.out.println("Object identified");
	    	
	    	
	    } catch (Exception e) {
	    	
		}
 		
	    long End_Time=System.currentTimeMillis();
	    System.out.println("Elasped time in ms "+(End_Time-Start_Time));
		 
	    
		 
		 
		
		
	}

}

	 
