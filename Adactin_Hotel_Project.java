package com.Adactin_Mini_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin_Hotel_Project {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vpssu\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		
		driver.findElement(By.xpath("//a[text()='New User Register Here']")).click();
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Sathish745");
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("sk22*sk22");
		
		WebElement repwd = driver.findElement(By.id("re_password"));
		repwd.sendKeys("sk22*sk22");
		
		WebElement fn = driver.findElement(By.id("full_name"));
		fn.sendKeys("Sathish Kumar");
		
		WebElement email = driver.findElement(By.id("email_add"));
		email.sendKeys("nightwolf01246@gmail.com"); 
		Thread.sleep(15000);  
		
		WebElement tnc = driver.findElement(By.id("tnc_box"));
		Thread.sleep(5000);
		tnc.click();
		
		WebElement reg = driver.findElement(By.id("Submit"));
		Thread.sleep(5000);
		reg.click();
		Thread.sleep(20000);

	}

}
