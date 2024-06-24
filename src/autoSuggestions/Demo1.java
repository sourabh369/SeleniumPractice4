package autoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
		Thread.sleep(2000);
		List<WebElement> allOptions = driver.findElements(By.xpath("//div[@class='two-pane-results-container']//div"));
		String ExpectedResult = "iphone 15 plus";
		for(WebElement options : allOptions)
		{
			String ActualResult=options.getText();
			if(ActualResult.equalsIgnoreCase(ExpectedResult))
			{
				options.click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.close();
	}
	
}
