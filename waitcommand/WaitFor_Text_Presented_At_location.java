package waitcommand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFor_Text_Presented_At_location {

	public static void main(String[] args) 
	{
		
	/*	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://outlook.live.com/owa/");
		driver.manage().window().maximize();
		
		//Create object for explicit wait
		WebDriverWait wait=new WebDriverWait(driver, 100);
		
		
		WebElement Signin_btn=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		Signin_btn.click();
		
		
		
		WebElement Email=driver.findElement(By.xpath("//input[@id='i0116']"));
		Email.clear();
		Email.sendKeys("sunilreddy@outlook.com"+Keys.ENTER);
		
		
		//Manage timegap until expected text visible at location..
		By Text_location=By.id("displayName");
		wait.until(ExpectedConditions.textToBePresentInElementLocated(Text_location, "pranil@gmail.com"));
		System.out.println("timeout released required text visible at location");  */
		
		
		
	 
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://outlook.live.com/owa/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		
		WebElement SignIn_Btn=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		SignIn_Btn.click();
		
        WebElement Email_Element=driver.findElement(By.xpath("//input[@id='i0116']"));         
 		Email_Element.clear();
        Email_Element.sendKeys("sunilreddy@outlook.com"+Keys.ENTER);
        
        WebElement Text_Location = driver.findElement(By.id("displayName"));
        wait.until(ExpectedConditions.textToBePresentInElement(Text_Location, "displayName"));
        System.out.println("Timeout Released required text visible at location");
 		

		
		
	}

}
