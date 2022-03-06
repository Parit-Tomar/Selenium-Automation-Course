import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebElementSortingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\parit.tomar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		List<String> price;
		
		driver.findElement(By.xpath("//tr/th[1]")).click();
		//Capture all the elements of column in list
		List<WebElement> elementList=driver.findElements(By.xpath("//tr/td[1]"));
		//convert text of all web element into new(orignal) list
		List<String> orignalList=elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		//sort on the orignal list
		List<String> sortedList=orignalList.stream().sorted().collect(Collectors.toList());
		//compare orignal list to sorted list
		Assert.assertTrue(orignalList.equals(sortedList));
		do
		{
			
		List<WebElement> elementListnext=driver.findElements(By.xpath("//tr/td[1]"));
		//scan the veg name column with get text and once u get rice--> print the price of rice
		price=elementListnext.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
		price.forEach(a->System.out.println(a));
		
		if(price.size()<1)
		{
		driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}
		
		}while(price.size()<1);

	}

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		String pricevalue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		return pricevalue;
	}

}
