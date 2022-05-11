package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Libaskurtha extends setProperty{

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/women-kurtas-kurtis-suits");
		List<WebElement> libas = driver.findElements(By.xpath("//h3[.='Libas']/../div/span[1]/span[1]"));
		int count = libas.size();
		System.out.println("total number of libas"+count);
		for(int i=0;i<count;i++)
		{
			System.out.println("price of libas"+libas.get(i).getText());
		}
		driver.close();

	}

}
