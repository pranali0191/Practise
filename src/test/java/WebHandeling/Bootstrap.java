package WebHandeling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Bootstrap {

	public static void main(String[] args)
	
	{	ChromeOptions option =new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		
		WebElement ele=driver.findElement(By.id("src"));
		ele.click();
		ele.sendKeys("Pune");
		List<WebElement> li=driver.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']//li//text[@class='placeHolderMainText']"));
		
		 for(WebElement i:li)
		 {
			 System.out.println(i.getText());
			 if(i.getText().contains("Swargate"))
			 {
				 i.click();
				 break;
			 }
		 }
	}

}
