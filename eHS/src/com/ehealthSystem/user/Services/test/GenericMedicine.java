package com.ehealthSystem.user.Services.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GenericMedicine {
public WebDriver driver;
	
	@BeforeTest()
	public void aftertest() throws InterruptedException {
		 System.out.println("launching Chrome browser"); 
		 System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://login.ehealthsystem.in/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@id='UserName exampleInputEmail2']")).sendKeys("May62937");  //Username
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@id='Pwd exampleInputPassword2']")).sendKeys("Mayur@4232");   //Password
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//body/div[@id='wrap']/div[1]/div[1]/div[2]/form[1]/div[5]/button[1]")).click();  //Login
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[contains(text(),'Last Login Details')]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[contains(text(),'Services')]")).click(); //Services
		 Thread.sleep(1000);
	}
	
	@Test()
	public void Generic() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'Generic Medicine')]")).click();       //Generic Medicine
		Thread.sleep(1000);
		
	}

}
