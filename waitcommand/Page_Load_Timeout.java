package waitcommand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page_Load_Timeout {

	public static void main(String[] args) 
	{
 
	/*	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
		
		/*
		 * This command manage until all pageobjects load at webpage. By Default
		 * Webdriver manage timeload during new pages opened..
		 */
		
		
	/*	driver.get("http://cleartrip.com");
		System.out.println("Page load successfull"); */

	
	 
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println("Page loaded successfully");
		
		
		
	}

}
