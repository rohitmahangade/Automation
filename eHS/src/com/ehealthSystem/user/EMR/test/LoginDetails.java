package com.ehealthSystem.user.EMR.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginDetails {
	
public WebDriver driver ; 
	
	@BeforeTest
	  public void beforeTest() throws InterruptedException {
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
 		 driver.findElement(By.xpath("//a[@onclick='showProgress();']//parent::li[@class='active']//following-sibling::li//a[@onclick='showProgress();']//span")).click(); //EMR
 		 Thread.sleep(1000);
 		 driver.findElement(By.xpath("//span[contains(text(),'Login Details')]")).click();       //Login Dtails
		 Thread.sleep(2000);
		 
	  }
	
	@Test
	public void EMR() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;   
		 js.executeScript("window.scrollBy(0,1000)");   //Scrolling
		 Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'2')]")).click();      // 2nd page
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();    // Next Page
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Last Page')]")).click();  // Last Page
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Previous')]")).click();    // Previous Page
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'First Page')]")).click();   // First Page
		Thread.sleep(2000);
	}

}

