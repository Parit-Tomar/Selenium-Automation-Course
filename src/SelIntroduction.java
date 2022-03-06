import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		//Invoking Browser
		//Chrome - Chrome Driver ->Methods {get, close}
		
		//WebDriver methods + class methods
		//chromedriver.exe --> Chrome Browser
		//webdriver.chrome.driver --> value of path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\parit.tomar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//firefox launch
		//webdriver.gecko.driver --> value of path
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\parit.tomar\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		//WebDriver driver2=new FirefoxDriver();
		
		//Microsoft Edge launc
		//webdriver.msedge.driver --> value of path
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\parit.tomar\\Downloads\\msedge-v0.30.0-win64\\msedgedriver.exe");
		//WebDriver driver3=new EdgeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		

	}

}
