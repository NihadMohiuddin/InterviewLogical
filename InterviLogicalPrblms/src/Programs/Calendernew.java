package Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendernew {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.redbus.in/");
		
	  
		
		String Expmonth="Dec";
		String Expyear="2030";
		
		
		 driver.findElement(By.id("onward_cal")).click();
		
		
		Thread.sleep(2000);
	

	
	 while (true)
	 {
		
		String txtmonthyear=driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[2]")).getText();
		 String[] a1= txtmonthyear.split(" ");
		 String montxt=a1[0];
		 String yeartxt=a1[1];
		 
		 if (montxt.equals(Expmonth)&&yeartxt.equals(Expyear)) 
		 {
			break;
		} 
		 else 
		 {
           driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
     
		 }
		 
		 
		
	 }
		
		
		
		
		
	}
	
	
}
