package waitcommand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SetScript_Timeout {

	public static void main(String[] args) 
	{
		
/*		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().setScriptTimeout(100, TimeUnit.SECONDS);
		
		/*
		 * This command manage asychronized source to load at webpage.
		 * 		[Mostly when ajax windows loading]
		 */
	/*	driver.get("http://makemytrip.com");
		System.out.println("Source synchonized"); */
		
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		System.out.println("source synchronized");
		
		
		
		
		
		
		
	}

}
