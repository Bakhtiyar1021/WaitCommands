package waitcommand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Text_Presented_At_Element_Value {

	public static void main(String[] args) 
	{
		
   /* 	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver, 30);

		
		WebElement Mobile_Number=driver.findElement(By.xpath("//input[@data-reactid='202']"));
		Mobile_Number.clear();
		Mobile_Number.sendKeys("9030248855");
		
		//Manage timegap until expected value presented at editbox
		By Element_location=By.xpath("//input[@data-reactid='213']");
		wait.until(ExpectedConditions.textToBePresentInElementValue(Element_location, "BSNL"));
		System.out.println("BSNL input available at editbox");   */
		
		
  	 	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
	    
        WebElement Mobile_Number = driver.findElement(By.xpath("//input[@data-reactid='202']"));
        Mobile_Number.clear();
        Mobile_Number.sendKeys("9989745543");
        
        By Element = By.xpath("//input[@data-reactid='213']");		
        wait.until(ExpectedConditions.textToBePresentInElementLocated(Element, "BSNL"));
        System.out.println("BSNL input available at editbox");  
        
         
        
		
	}

}
