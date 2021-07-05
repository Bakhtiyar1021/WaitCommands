package waitcommand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_For_The_Frame {

	public static void main(String[] args) 
	{
		
		
		//Locate chrome browser in currnet system
		/*		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();						
				driver.get("https://www.cleartrip.com/account/trips?src=manageTripsl"); 
				driver.manage().window().maximize();  	
						
						
						
				//Manage timegap until frame load webpage
				WebDriverWait wait=new WebDriverWait(driver, 100);
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("modal_window"));
				System.out.println("Frame loaded successfull");  */
				
				
				
		       System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        	   WebDriver driver=new ChromeDriver();	
               driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
               driver.get("https://www.cleartrip.com/account/trips?src=manageTripsl");
               driver.manage().window().maximize();
               
               WebDriverWait wait = new WebDriverWait(driver, 50);
          
               wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("modal_window"));
        	   System.out.println("Frame load successfull");
        	   
        	   
        	   
        	   
				
				
				
	}

}
