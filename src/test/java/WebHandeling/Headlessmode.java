package WebHandeling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headlessmode {

	public static void main(String[] args) 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Java");
		List<WebElement> li=driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]//li"));
		System.out.println(li.size());
		for(WebElement i:li)
		{
			System.out.println(i.getText());
			if(i.getText().equals("java"))
			{
				i.click();
				break;
			}
		}
		

	}
}
