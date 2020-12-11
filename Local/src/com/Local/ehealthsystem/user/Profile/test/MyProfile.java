package com.Local.ehealthsystem.user.Profile.test;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyProfile {
	
public WebDriver driver;
	
	@BeforeTest()
	public void aftertest() throws InterruptedException {
		 System.out.println("launching Chrome browser"); 
		 System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://192.168.0.78/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@id='UserName exampleInputEmail2']")).sendKeys("May62937");  //Username
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@id='Pwd exampleInputPassword2']")).sendKeys("Mayur@4232");   //Password
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//body/div[@id='wrap']/div[1]/div[1]/div[2]/form[1]/div[5]/button[1]")).click();  //Login
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[contains(text(),'Last Login Details')]")).click();
		 Thread.sleep(1000);
		
//		 Actions builder = new Actions(driver);
//		 WebElement element = driver.findElement(By.xpath("//a[@id='']"));
//		 builder.moveToElement(element).build().perform();
		 
//		 Select profile=new Select(driver.findElement(By.xpath("")));
//	 profile.selectByVisibleText("");
		 
		 Actions actions = new Actions(driver);
	        //Retrieve WebElement 'Music' to perform mouse hover 
	    	WebElement menuOption = driver.findElement(By.xpath("//a[text()='Mayu Sawant']"));
	    	//Mouse hover menuOption 'Music'
	    	actions.moveToElement(menuOption).perform();
	    	System.out.println("Done Mouse hover on 'Music' from Menu");	 
	}
	
	@Test()
	public void profile() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[text()='My Profile']")).click();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
