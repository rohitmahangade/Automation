package com.ehealthSystem.receptionist.Settings.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Settings {
	
public WebDriver driver;
	
	@BeforeTest()
	public void beforetest() throws InterruptedException{
		System.out.println("Lauching chrome Driver");
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://login.ehealthsystem.in/index");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='UserName exampleInputEmail2']")).sendKeys("Archana");    //Username of Receptionist
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Pwd exampleInputPassword2']")).sendKeys("Abc@123");       //Password of Receptionist
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='wrap']/div[1]/div[1]/div[2]/form[1]/div[5]/button[1]")).click();   //Login button
	}

	@Test
	public void setting() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Settings')]")).click();    //Reports
		Thread.sleep(1000);
		
	}
}
