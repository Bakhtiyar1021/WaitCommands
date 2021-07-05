package waitcommand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait_Object_Invisiblity {

	public static void main(String[] args)
	{
		
	/*	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		
		
		//Enable explicit wait on automation browser
		WebDriverWait wait=new WebDriverWait(driver, 100);
		
		
		//wait for Element to hidden.. [Recomended for pageobject syntax]
		WebElement Element=driver.findElement(By.xpath("//input[@id='email']"));
		wait.until(ExpectedConditions.invisibilityOf(Element));
		System.out.println("Timeout Released object is hidden at webpage");
		
		
		By Pwd_locator=By.xpath("//input[@id='pass']");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(Pwd_locator));
		System.out.println("Timeout released password object hidden at webpage"); */

		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		 WebDriverWait wait = new WebDriverWait(driver, 50);
		
		 By Email_Element = By.xpath("//input[@id='email']");
	     wait.until(ExpectedConditions.invisibilityOfElementLocated(Email_Element));
	     System.out.println("Timeout Released Element object hidden at webpage");
	     
	     
	     By Password_Locator = By.xpath("//input[@id='pass']");
 	     wait.until(ExpectedConditions.invisibilityOfElementLocated(Password_Locator));
         System.out.println("Timeout Released Password object hidden at webpage"); 	     
 	     
         
		
		
	}
	

}
