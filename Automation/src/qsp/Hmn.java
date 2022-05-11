package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hmn extends setProperty {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/shop/kids");
		List<WebElement> price = driver.findElements(By.xpath(""));
		int count=price.size();
		System.out.println("total number of HMN shirts for kids"+count);
		for(int i=0;i<count;i++)
		{
			System.out.println("price of HMN shirts"+price.get(i).getText());
		}
		driver.close();
			}

}
