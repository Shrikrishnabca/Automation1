package qsp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver2 extends setProperty {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://nxtgenaiacademy.com/multiplewindows/");
		driver.findElement(By.xpath("//button[contains(@name,'newbrowserwindow')]")).click();
		driver.findElement(By.xpath("//button[contains(@name,'newbrowserwindow')]")).click();
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		System.out.println(child.size());
System.out.println(parent);
System.out.println(child);
driver.quit();

	}

}
