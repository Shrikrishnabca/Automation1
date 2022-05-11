package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector extends setProperty {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/eclipse-workspace/Automation/data/ff.html");
		driver.findElement(By.xpath("/html/body/a[1]")).click();//absolute path
		driver.navigate().back();
		driver.findElement(By.xpath("//a[1]")).click();//relative path
		
driver.close();
	}

}
