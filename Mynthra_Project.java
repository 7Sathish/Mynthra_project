package com.Mynthra_Mini_Project;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Mynthra_Project {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vpssu\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");

		WebElement men = driver.findElement(By.xpath("//a[text()='Men'][1]"));
		WebElement cs = driver.findElement(By.xpath("//a[text()='Casual Shirts']"));

		Actions ac = new Actions(driver);
		ac.moveToElement(men).build().perform();
		Thread.sleep(2000);
		ac.moveToElement(cs).build().perform();
		ac.click().build().perform();

		driver.findElement(By.xpath("//h4[text()='Men Slim Fit Casual Shirt'][1]")).click();
		Thread.sleep(2000);

		Set<String> Handles = driver.getWindowHandles();
		System.out.println(Handles.size());

		for (String handler : Handles) {
			driver.switchTo().window(handler);
		}

		driver.findElement(
				By.xpath("(//button[@class='size-buttons-size-button size-buttons-size-button-default'])[3]")).click();
		driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
		driver.findElement(By.xpath("//span[text()='Bag']")).click();

		WebElement placeorder = driver.findElement(By.xpath("(//button[@role='button'])[4]"));
		ac.doubleClick(placeorder).build().perform();

		WebElement login = driver.findElement(By.xpath("//input[@type='tel']"));
		login.sendKeys("123673882");

		driver.findElement(By.xpath("//div[text()='CONTINUE']")).click();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\vpssu\\eclipse-workspace\\Selenium_Testing\\Screenshot//mynthra.png");
		FileHandler.copy(source, Destination);
		
		driver.close();

	}

}
