package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement scrollElement = driver.findElement(By.xpath("(//div[@id='shoppingCart4'])[2]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", scrollElement);
		WebElement dragFromElement = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement dragToElement = driver.findElement(By.xpath("//ol[@class='field13 ui-droppable ui-sortable']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(dragFromElement, dragToElement).perform();
		Thread.sleep(2000);
		driver.close();
	}
	
}
