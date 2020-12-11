package com.ehealthSystem.user.Profile.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ManageAccount {
	
public WebDriver driver;
	
	@BeforeTest()
	public void beforetest() throws InterruptedException {
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
		
//		 Actions builder = new Actions(driver);
//		 WebElement element = driver.findElement(By.xpath("//a[@id='']"));
//		 builder.moveToElement(element).build().perform();
		 
//		 Select profile=new Select(driver.findElement(By.xpath("")));
//	 profile.selectByVisibleText("");
		 
		 Actions actions = new Actions(driver);
	        //Retrieve WebElement 'Music' to perform mouse hover 
	    	WebElement menuOption = driver.findElement(By.xpath("//a[text()='Mayu Sawant']"));     //User's Name
	    	//Mouse hover menuOption 'Music'
	    	actions.moveToElement(menuOption).perform();
	    	System.out.println("Done Mouse hover on 'Music' from Menu");	 
	}
	
	@Test()
	public void trans() throws InterruptedException {

//****************************************** Change Password *****************************************************************		
		
		driver.findElement(By.xpath("//a[text()='Manage Account']")).click();      //Manage Account
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='oldPassword']")).sendKeys("Mayur@4232");  //Old Password
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='newPassword']")).sendKeys("Mayur@4232");  //New Password
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Mayur@4232");  //ConfirmPassword
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//body[1]/div[4]/div[2]/div[2]/div[1]/div[1]/div[7]/div[5]/div[2]/form[1]/table[1]/tbody[1]/tr[4]/td[2]/input[1]")).click();  //Update Password
		Thread.sleep(1000);
		
//******************************************* Terminate your Account ****************************************************************

//		driver.findElement(By.xpath("//tbody/tr[8]/td[1]/input[1]")).click();  //Terminate Account
		
	}
	
	@AfterTest()
	public void aftertest() {
		driver.close();
	}
	

}
