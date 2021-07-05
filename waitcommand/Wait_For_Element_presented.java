package waitcommand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_For_Element_presented {

	private static Alert alert;

	public static void main(String[] args)
	{
		
		//Locate chrome browser in currnet system
	/*			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();						
				driver.get("http://demo.automationtesting.in/Alerts.html"); 
				driver.manage().window().maximize();  						
						
						
				WebElement Alert_link=driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
				Alert_link.click();  //This Line of code prompt alert at webpage.
				
				
				
				WebDriverWait wait=new WebDriverWait(driver, 30);
				Alert alert=wait.until(ExpectedConditions.alertIsPresent());
				
			
				System.out.println(alert.getText());    //Get text on alert and printing at console
				alert.accept();							//Close alert window  */
		
				
			
		
	    	    System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	        	WebDriver driver=new ChromeDriver();
	            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	            driver.get("http://demo.automationtesting.in/Alerts.html");
	            driver.manage().window().maximize();
	            
	            WebDriverWait wait = new WebDriverWait(driver, 50);
	        	
	        	WebElement Alert_Box = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
	            Alert_Box.click();
	            
	            Alert alert=wait.until(ExpectedConditions.alertIsPresent());
	            System.out.println(alert.getText());
	            alert.accept();
	            
	            
	            		
                
                
                
 				
	}

}
