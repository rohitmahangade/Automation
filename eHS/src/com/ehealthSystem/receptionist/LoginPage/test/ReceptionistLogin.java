package com.ehealthSystem.receptionist.LoginPage.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReceptionistLogin {
	
public WebDriver driver;
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("Lunching Chrome Driver");
		System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\Selenium\\\\\\\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://login.ehealthsystem.in/index");
		driver.manage().window().maximize();
	}
	
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='UserName exampleInputEmail2']")).sendKeys("Archana");    //Username of Receptionist
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Pwd exampleInputPassword2']")).sendKeys("Abc@123");       //Password of Receptionist
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='wrap']/div[1]/div[1]/div[2]/form[1]/div[5]/button[1]")).click();   //Login button
	}
	
	@AfterTest
	public void afterTest() {
		 driver.close();
	}

}
