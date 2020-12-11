package com.ehealthSystem.doctor.LoginPage.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DoctorRegistration {
	
public WebDriver driver;
	
	@BeforeTest()
	public void aftertest() throws InterruptedException {
		 System.out.println("launching Chrome browser"); 
		 System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://login.ehealthsystem.in/");
		 driver.manage().window().maximize();
		 
	}
	
	@Test()
	public void rgister() throws InterruptedException, IOException {
		
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();    //Register button
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h4[@id='Professional']")).click();             //Select Professional
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='2']")).click();          //Select Doctor
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();     //Proceed Button
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Search']")).sendKeys("eHealthSystem");        //Select Orgnization Name
		Thread.sleep(1000);
		Select Title= new Select(driver.findElement(By.xpath("//select[@id='getusergroup']")));  //Select Title
		Title.selectByVisibleText("Dr.");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='uName']")).sendKeys("Sourav Jha");      //Professional's Name
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='UserId']")).sendKeys("sou22");     //Select User ID
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Abc@123");    //Password
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='confpass']")).sendKeys("Abc@123");    //Confirm Password
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\Rohit\\Downloads\\download.jpg");   //Upload Photo
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='UploadImage']")).click();       //Upload button
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='first_button']")).click();    //Continue Button
		Thread.sleep(1000);
		
		
	}
	

}
