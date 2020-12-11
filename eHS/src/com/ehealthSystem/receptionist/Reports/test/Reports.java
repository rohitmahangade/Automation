package com.ehealthSystem.receptionist.Reports.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Reports {
	
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
	public void report() throws InterruptedException {
		
		driver.findElement(By.xpath("//span[contains(text(),'Reports')]")).click();    //Reports
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='radioAppo']")).click();      //Radio button of appointments
		Thread.sleep(1000);
		Select App=new Select(driver.findElement(By.xpath("//select[@id='AppointAll']")));  //Select Today
		App.selectByVisibleText("All");
		Thread.sleep(1000);
		Select Doctor=new Select(driver.findElement(By.xpath("//select[@id='Appoint']")));   //Select Doctor
		Doctor.selectByVisibleText("Neeraj N Desai");
		Thread.sleep(1000);
		Select Status=new Select(driver.findElement(By.xpath("//select[@id='AppointStatus']")));  //Select Status
		Status.selectByVisibleText("Requested");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@id='Search' and @onclick='appsearchclick();']")).click();   //Search Button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='AppointmentReport']/div[1]/div[1]/div[2]/img[1]")).click();  //Close button of appointment report
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='radiobill']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='cardno']")).sendKeys("0091989667413044");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/img[1]")).click();
	}
	
	@AfterTest
	public void aftertest() {
		driver.close();
	}
}
