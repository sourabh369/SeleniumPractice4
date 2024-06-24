package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement table = driver.findElement(By.xpath("(//table[@id='product'])[2]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", table);
		int rowSize = driver.findElements(By.xpath("(//table[@id='product'])[2]//tr")).size();
		System.out.println("---------------------");
		System.out.println(rowSize);
		int colSize = driver.findElements(By.xpath("(//table[@id='product'])[2]//td")).size();
		System.out.println("---------------------");
		System.out.println(colSize);
		String text = driver.findElement(By.xpath("((//table[@id='product'])[2]//td)[19]")).getText();
		System.out.println("---------------------");
		System.out.println(text);
		Thread.sleep(2000);
		driver.close();
	}
	
}
