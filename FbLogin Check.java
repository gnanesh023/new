package basic;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String defaultTitleString= "Facebook – log in or sign up";
		
		driver.findElement(By.id("email")).sendKeys("Example@email.com");	
		driver.findElement(By.id("pass")).sendKeys("ExamplePassword");
		driver.findElement(By.name("login")).click();

		
		String newTitleString=driver.getTitle();  //facebook
    
		if(newTitleString!=defaultTitleString) {
			System.out.print("Homepage Loaded");
		}	
		else {
			System.out.println("Log in Failed : Homepage not loaded");

		}
		
	}

}
