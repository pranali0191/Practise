package WebHandeling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Helper;

public class FBDrops {
	
	

	public static void main(String[] args)
	{
		
			
		
		
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement ele1=driver.findElement(By.name("birthday_day"));
		Helper.helper(ele1,"28");
		Helper.screenshot(driver);
		
		/*Select dd=new Select(ele1);
		List<WebElement> options=dd.getOptions();
	
		for(WebElement i:options)
		{
			System.out.println(i.getText());
			if(i.getText().contains("10"))
			{
				i.click();			}
		}
	}*/

}
}
