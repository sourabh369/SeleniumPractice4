package autoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Virat Kohli");
		Thread.sleep(2000);
		List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		String expectedText = "Virat Kohli Centuries";
		for(WebElement options: allOptions)
		{
			String ActualText=options.getText();
			if(ActualText.equalsIgnoreCase(expectedText))
			{
				options.click();
				break;
			}
		}
		Thread.sleep(4000);
		driver.close();
		
	}
	
}
