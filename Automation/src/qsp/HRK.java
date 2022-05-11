package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRK extends setProperty{

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/men-tshirts");
		List<WebElement> price = driver.findElements(By.xpath("//h3[.='HRX by Hrithik Roshan']/../div/span/span[1]"));
		int count = price.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			System.out.println("hrk t-shirt price"+price.get(i).getText());
		}
		driver.close();
		
		
	}

}
