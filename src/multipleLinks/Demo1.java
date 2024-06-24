package multipleLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
		WebElement ele = driver.findElement(By.xpath("//div[text()='Get to Know Us']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", ele);
		List<WebElement> allLinks = driver.findElements(By.xpath("//li[@class='nav_first']"));
		for(WebElement link: allLinks)
		{
			String text = link.getText();
			System.out.println(text);
			System.out.println("---------------");
			String classatt = link.getAttribute("class");
			System.out.println(classatt);
		}
		Thread.sleep(2000);
		driver.close();
	}
	
}
