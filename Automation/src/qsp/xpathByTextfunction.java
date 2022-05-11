package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByTextfunction extends setProperty {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/eclipse-workspace/Automation/data/ff.html");
		driver.findElement(By.xpath("//a[.='Google2']")).click();
		driver.navigate().back();
		String attribute = driver.findElement(By.xpath("//span[.='bengaluru']")).getAttribute("name");
		System.out.println(attribute);
		driver.close();
		
	

	}

}
