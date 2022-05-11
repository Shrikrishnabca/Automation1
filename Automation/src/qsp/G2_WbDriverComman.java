package qsp;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class G2_WbDriverComman {
	public void waitForPageLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void customwait(WebElement element) {
		int i = 0;
		while(i<=100) {
			try {
				element.isDisplayed();
			}
			catch (NoSuchElementException e) {
				i++;
			}
		}
	}
	public void selectOption(WebElement element,int i) {
		Select s = new Select(element);
		s.selectByIndex(i);
	}
	public void selectOption(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
}
