package Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutocompleteteGooglePlacesDRopdwon {

	bhgkhh
		actions act=new actions();
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.twoplugs.com/newsearchserviceneed");
		
		
		
		
	      WebElement box=	driver.findElement(By.id("autocomplete"));
	      box.clear();
	
		  box.sendKeys("American");
		  String value= box.getAttribute("value");
	    	

		  while (value!=null)
		   {
				
				if (value.contains("American Fork"))
	    		{
					box.sendKeys(Keys.ENTER);
				System.out.println(value+" is clicked");
					break;
				}
			
				else 
			   {
				box.sendKeys(Keys.ARROW_DOWN);
				value= box.getAttribute("value");
				
			   }
		   
		   
		   
		   }
		
		
		
		
		
		
		
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
