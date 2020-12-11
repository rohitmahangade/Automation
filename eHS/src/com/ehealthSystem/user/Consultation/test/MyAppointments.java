package com.ehealthSystem.user.Consultation.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyAppointments {
	
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
		 driver.findElement(By.xpath("//span[contains(text(),'Consultation')]")).click(); //Consultation
	}
	
	@Test
	public void Appointments() throws InterruptedException {
		
//********************************************** Recent Appointments ***************************************************
		Select Date=new Select(driver.findElement(By.xpath("//select[@id='appoint1']")));      //Select Date
		Date.selectByVisibleText("13-Oct-2020");
		Thread.sleep(2000);
		Select Status=new Select(driver.findElement(By.xpath("//select[@id='status1']")));       //Select Status
		Status.selectByVisibleText("Treated");
		Thread.sleep(2000);
		
//********************************************* Previous Appointments *************************************************		
		JavascriptExecutor js = (JavascriptExecutor) driver;   
		 js.executeScript("window.scrollBy(0,1000)");   //Scrolling
		Select Date1=new Select(driver.findElement(By.xpath("//select[@id='appoint2']")));          //Select Date
		Date1.selectByVisibleText("03-Sep-2020");
		JavascriptExecutor js1 = (JavascriptExecutor) driver;   
		 js1.executeScript("window.scrollBy(0,1000)");   //Scrolling
		 Thread.sleep(2000);
		Select Status1=new Select(driver.findElement(By.xpath("//select[@id='status1']")));       //Select Status
		Status1.selectByVisibleText("Requested");
		Thread.sleep(1000);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;   
		 js3.executeScript("window.scrollBy(0,1000)");   //Scrolling
		 
//*********************************************** Show more result *****************************************************
		 driver.findElement(By.xpath("//li[@class='active']//a[@onclick='showProgress();']//span[text()='Consultation']")).click();
		 Thread.sleep(1000);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 JavascriptExecutor js4 = (JavascriptExecutor) driver;   
		 js4.executeScript("window.scrollBy(0,1000)");   //Scrolling
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//center//input[@type='button' and @value='Show More Results']")).click();
		 Thread.sleep(1000);
		 
		 
	}
}

