package WebHandeling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.partialLinkText("In")).click();
		
		
		
		
		//Login
		driver.findElement(By.name("email-name")).sendKeys("p@gmail.com");
		driver.findElement(By.name("password-name")).sendKeys("admin123");
		driver.findElement(By.id("remember")).click();
		driver.findElement(By.name("submit-name")).click();
		
		//Total headings are
		
		List<WebElement> heading=driver.findElements(By.xpath("//thead//tr//th"));
		System.out.println("Total options are "+heading.size());
		
		//Print heading
		for(WebElement i:heading)
		{
			System.out.println(i.getText());
		}
		
		//total rowa nd print them
		List<WebElement> rows=driver.findElements(By.xpath("//tbody//tr"));
		System.out.println("Total rows are "+rows.size());
		
		//total cells
		List<WebElement> columns=driver.findElements(By.xpath("//tbody//tr[1]//td"));
		System.out.println("Total rows are "+columns.size());
		
		

	}

}
