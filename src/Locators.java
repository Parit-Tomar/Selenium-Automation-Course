import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   //implicit wait- 2 sec time out
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\parit.tomar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com");
		driver.findElement(By.cssSelector("a[href='https://courses.rahulshettyacademy.com/sign_in'")).click();
		driver.findElement(By.id("email")).sendKeys("paritkumartomar8586");
		driver.findElement(By.name("password")).sendKeys("Cavisson@123");
		driver.findElement(By.name("commit")).click();
		System.out.println(driver.findElement(By.cssSelector("div.bodySmall")).getText());
		driver.findElement(By.linkText("Forgot Password")).click(); //this is nt working
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("parit");
		
	
		
		
		
	}

}
