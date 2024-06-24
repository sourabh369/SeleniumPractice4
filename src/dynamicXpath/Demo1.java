package dynamicXpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iPhone15");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		WebElement ele = driver.findElement(By.xpath("//span[text()='73,100']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", ele);
		String text = driver.findElement(By.xpath("((//div[@class='a-section'])[2]//span)[47]")).getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.close();
	}
	
}
