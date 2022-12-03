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

		String defaultTitleString = "Facebook – log in or sign up";
		String wrongpassTitleString = "Log in to Facebook";
		String loggedinTitleString = "Facebook";

		driver.findElement(By.id("email")).sendKeys("TempMaile@gufum.com");
		driver.findElement(By.id("pass")).sendKeys("Admin123@");
		driver.findElement(By.name("login")).click();

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String newTitleString = driver.getTitle();
		if (newTitleString.equals(defaultTitleString)) {
			System.out.println("Log in Failed : Homepage not loaded");

		} else if (newTitleString.equals(wrongpassTitleString)) {
			System.out.print("Wrong Pass Word or failed to Log in");
		} else if (newTitleString.equals(loggedinTitleString)) {
			System.out.print("Loggedin  SucessFull");
		} else {
			System.out.print("None Of the Title Maching, Maybe Its logged in");
		}

		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
