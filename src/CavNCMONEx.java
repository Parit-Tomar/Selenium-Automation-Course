import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CavNCMONEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//SSl certificates

		//Desired capabilities=
		//general chrome profile
		DesiredCapabilities ch= new DesiredCapabilities();
		//ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		//Belows to your local browser
		ChromeOptions c= new ChromeOptions();
		c.merge(ch);
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\parit.tomar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.get("https://ncmon1.cav-test.com/UnifiedDashboard");
		driver.get("https://10.10.30.71/UnifiedDashboard/index.html");
		// UI Login
		driver.findElement(By.xpath("//span[contains(.,'TRY OUT THE NEW PLATFORM!')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("parit");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Cavisson@123");
		driver.findElement(By.xpath("//span[contains(.,'SIGN IN')]")).click();
		Thread.sleep(5000);
		// Dashboard redirection to Alert
		// driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-clickable
		// icons8 icons8-notification']")).click();
		driver.findElement(By.cssSelector("button[ptooltip='Events']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'View All')]")).click();
		Thread.sleep(5000);
		// Active Alert
		// driver.findElement(By.cssSelector(".ng-tns-c65-338.ui-dropdown.ui-widget.ui-state-default.ui-corner-all.ui-dropdown-open")).click();
		/*
		 * driver.findElement(By.cssSelector("p-dropdown[placeholder$='Level0']")).click
		 * ();
		 * //driver.findElement(By.cssSelector("div[class*='ui-dropdown-open']")).click(
		 * );
		 * //driver.findElement(By.xpath("//span[normalize-space()='Level2']")).click();
		 * driver.findElement(By.cssSelector("li[aria-label='Level2']")).click();
		 * driver.findElement(By.xpath("(//div[@role='checkbox'])[2]")).click();
		 * driver.findElement(By.cssSelector("button[ptooltip='Force clear event']")).
		 * click();
		 */
		// System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Alert
		// event(s) cleared sucessfully')]")).getText());
		// Rule List and rule addition
		driver.findElement(By.xpath("//button[.='RULES LIST']")).click();
		driver.findElement(By.xpath("//span[contains(text(), 'Add Rule')]")).click();
		driver.findElement(By.xpath("//span[contains(text(), 'Select Metric group')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[contains(text(), 'SysStats Linux Exten')])[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(), 'Select Metric name')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(), 'CPU Que')]")).click();
		driver.findElement(By.xpath("//span[contains(text(), 'Select Metric attr')]")).click();
		driver.findElement(By.xpath("//span[contains(text(), 'Avg')]")).click();
		driver.findElement(
				By.cssSelector("p-radiobutton[value='Specified'] span[class$='ui-radiobutton-icon ui-clickable']"))
				.click();
		driver.findElement(By.cssSelector("button[label='Select']")).click();
		Thread.sleep(5000);
		driver.findElement(
				By.cssSelector("p-radiobutton[name='groupname'] span[class='ui-radiobutton-icon ui-clickable']"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//p-treetabletoggler[@class='ng-star-inserted'])[3]")).click();
		driver.findElement(By.xpath("(//div[@role='checkbox'])[4]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'APPLY')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'ADD METRICS')]")).click();
		// below 2 check later
		// driver.findElement(By.cssSelector("div[role='button']
		// span[class='ui-dropdown-trigger-icon ui-clickable ng-tns-c65-298 icons8
		// icons8-expand-arrow']")).click();
		// driver.findElement(By.xpath("//span[contains(text(),'sum of
		// every')]")).click();
		driver.findElement(By.xpath("(//input[@id='input'])[1]")).sendKeys("7");
		driver.findElement(By.xpath("(//input[@id='input'])[2]")).sendKeys("50");
		driver.findElement(By.xpath("(//input[@id='input'])[3]")).sendKeys("25");
		driver.findElement(By.xpath("(//input[@id='input'])[4]")).sendKeys("2");
		driver.findElement(By.cssSelector("input[placeholder='High CPU Utilization']")).sendKeys("RuleA1");
		driver.findElement(By.xpath("//span[contains(text(), 'Apply')]")).click();

	}

}
