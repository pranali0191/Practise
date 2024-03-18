package WebHandeling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		//Selectbased
		
		WebElement ele=driver.findElement(By.name("url"));
		Select dd=new Select(ele);
		System.out.println(dd.isMultiple());
		
		//Singleselection
		dd.selectByIndex(1);
		Thread.sleep(2000);
		dd.selectByVisibleText("Amazon Devices");
		Thread.sleep(2000);
		dd.selectByValue("search-alias=fashion");
		Thread.sleep(2000);
		
		List<WebElement> allopt=dd.getOptions();
		System.out.println("Total Options are "+allopt.size());
		for(WebElement i:allopt)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Video"))
			{
				i.click();
				break;
			}
		}
		
	}

}
