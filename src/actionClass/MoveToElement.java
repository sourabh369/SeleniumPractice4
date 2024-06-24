package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement ele = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		WebElement yourAccText = driver.findElement(By.xpath("//span[text()='Your Account']"));
		act.click(yourAccText).perform();
		Thread.sleep(2000);
		driver.close();
	}
	
}
