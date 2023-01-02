package org.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public void windowsMaximize() {
		driver.manage().window().maximize();

	}

	public void loadUrl(String url) {
		driver.get(url);

	}

	public void insertData(WebElement element, String data) {
		element.sendKeys(data);

	}

	public void selectByIndex(WebElement element, int number) {
		Select select = new Select(element);
		select.selectByIndex(number);

	}

	public void getTextMessage(WebElement element) {
		System.out.println(element.getText());

	}

	public String currentUrl() {
		return driver.getCurrentUrl();

	}

	public void implicityWaits(long seconds) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public void click(WebElement element) {
		element.click();

	}

	public void getAttributeValue(WebElement element) {

	}

	public void close() {
		driver.quit();

	}
}
