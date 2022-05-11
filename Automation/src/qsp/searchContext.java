package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchContext extends setProperty {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bbc.com/");
		driver.findElement(By.xpath("//a[.='India News']/../../div/ul/li/div/div[2]/h3/a")).click();
		driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		List<WebElement> all = driver.findElements(By.xpath("//a[.='India News']/../../div/ul/li/div/div[2]/h3/a"));
		System.out.println("total number of news"+all.size());
		for(int i=0;i<all.size();i++)
		{
			
			System.out.println(all.get(i).getText());
			Thread.sleep(2000);
			all.get(3).click();
			Thread.sleep(10000);
			driver.navigate().back();
		}
		Thread.sleep(2000);
		all.get(3).click();
	driver.close();
	}

}
