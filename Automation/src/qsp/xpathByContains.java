package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByContains extends setProperty {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/eclipse-workspace/Automation/data/ff.html");
		driver.findElement(By.xpath("//a[contains(.,'Goo')]")).click();//text function contains
		driver.navigate().back();
		driver.findElement(By.xpath("//a[contains(@name,n)]")).click();//attribute by contains function
		driver.close();
		

	}

}
