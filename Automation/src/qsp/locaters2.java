package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locaters2 extends setProperty{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/eclipse-workspace/Automation/data/ff1.html");
		driver.findElement(By.linkText("youtube")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("you")).click();
		driver.close();
		
	}

}
