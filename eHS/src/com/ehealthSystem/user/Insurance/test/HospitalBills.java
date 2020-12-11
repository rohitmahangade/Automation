package com.ehealthSystem.user.Insurance.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HospitalBills {
	
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
		 driver.findElement(By.xpath("//span[contains(text(),'Insurance')]")).click(); //Insurance
	}
	
	@Test
	public void Hospital() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'Hospital Bills')]")).click();
		Thread.sleep(1000);
		Select Hospital=new Select(driver.findElement(By.xpath("//select[@id='ddlHospital']")));
		Hospital.selectByVisibleText("Ankur Hospital");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='BillNo']")).sendKeys("698254");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Amount']")).sendKeys("9000");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@id='']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[5]/td[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='fileupload1']")).sendKeys("C:\\Users\\Admin\\Downloads\\lab report.jpg");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Actions act =  new Actions(driver);
//		act.moveToElement(driver.findElement(By.xpath("//input[@id='saveBill']"))).click().perform();		
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@id='Cancel']")).click();
		Thread.sleep(1000);
		Actions act =  new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//input[@id='Cancel']"))).click().perform();	
		Thread.sleep(1000);
	}

}

