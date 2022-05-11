package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class samsung extends setProperty {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("samsung tv");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();

		List<WebElement> a = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> b = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		System.out.println(a.size());
		System.out.println(b.size());
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i).getText()+"price is"+b.get(i).getText());
		}
		driver.close();
	}

}
