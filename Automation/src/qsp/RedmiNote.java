package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedmiNote extends setProperty{

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("redmi note 9");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> a = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		List<WebElement> b = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		int count1 = a.size();
		int count2 = b.size();
		System.out.println(count1);
		System.out.println(count2);
		for(int i=0;i<count1;i++)
		{
			
			System.out.println(a.get(i).getText()+"and price is"+b.get(i).getText());
		}
		
	}

}
