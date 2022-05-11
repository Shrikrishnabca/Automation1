package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters extends setProperty {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\HP\\eclipse-workspace\\Automation\\data\\ff.html");
		String text = driver.findElement(By.tagName("span")).getText();
		System.out.println(text);
		driver.findElement(By.id("d2")).click();
		driver.navigate().back();
		driver.findElement(By.className("c1")).click();
		driver.close();
	}

}
