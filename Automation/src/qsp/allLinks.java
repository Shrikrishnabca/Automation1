package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class allLinks extends setProperty {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bbc.com/");
		List<WebElement> allLink = driver.findElements(By.xpath("//h2[.='Latest Business News']/../ul/li"));
System.out.println(allLink.size());
for(int i=0;i<allLink.size();i++)
{
	
	allLink.get(i).click();
	

  }
driver.close();
}

	}

