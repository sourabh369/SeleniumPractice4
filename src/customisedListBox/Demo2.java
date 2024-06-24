package customisedListBox;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Demo2 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		WebElement listBox = driver.findElement(By.xpath("(//div[@class=' css-tlfecz-indicatorContainer'])[1]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", listBox);
		Actions act = new Actions(driver);
		act.click(listBox).perform();
		Thread.sleep(2000);
		for(int i=1;i<=3;i++)
		{
			act.keyDown(Keys.DOWN).perform();
			Thread.sleep(1000);
		}
		act.keyDown(Keys.ENTER).perform();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\srane\\Desktop\\Automation\\Screenshots\\Selenium SS\\listbox.png");
		FileHandler.copy(src, dest);
		Thread.sleep(2000);
		driver.close();
		
	}
	
}
