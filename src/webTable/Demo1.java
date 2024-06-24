package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0 , 1000)", "");
		int Size = driver.findElements(By.xpath("//table[@id='product']//tr")).size();
		System.out.println(Size);
		int colSize = driver.findElements(By.xpath("//table[@id='product']//td")).size();
		System.out.println(colSize);
		String text = driver.findElement(By.xpath("(//table[@id='product']//td)[5]")).getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.close();
	}
	
}
