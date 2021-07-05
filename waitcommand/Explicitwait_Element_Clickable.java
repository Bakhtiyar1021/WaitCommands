package waitcommand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait_Element_Clickable {

	public static void main(String[] args) throws Exception 
	{
		
   /*  	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://practice.automationtesting.in/my-account/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		//Enable explicit wait on automation browser
		WebDriverWait wait=new WebDriverWait(driver, 20);

		
		//Wait element to be clickable..
		By Register_btn=By.xpath("By.xpath(\"//input[@value='Register']\")");
		wait.until(ExpectedConditions.elementToBeClickable(Register_btn));
		System.out.println("Register button status is clickable");  */
		
		
		
		 
	    	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		    driver.get("http://practice.automationtesting.in/my-account/");
		    driver.manage().window().maximize();
		    
		    WebDriverWait wait = new WebDriverWait(driver, 50);
		    
		    WebElement Register_Btn=driver.findElement(By.xpath("//input[@name='register']"));
		    wait.until(ExpectedConditions.elementToBeClickable(Register_Btn));
		    System.out.println("Register button status is clickable");
		
		 
		 
		 
	}

}
