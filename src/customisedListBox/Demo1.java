package customisedListBox;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Demo1 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
		Actions act = new Actions(driver);
		act.click(Month).perform();
		for(int i=1;i<=4;i++)
		{
			act.keyDown(Keys.DOWN).perform();
			Thread.sleep(1000);
		}
		act.keyDown(Keys.ENTER).perform();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\srane\\Desktop\\Automation\\Screenshots\\Selenium SS\\customList.png");
		FileHandler.copy(src, dest);
		Thread.sleep(2000);
		driver.close();
	}
	
}
