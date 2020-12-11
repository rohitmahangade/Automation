package com.Local.ehealthsystem.user.EMR.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExportEMR {

public WebDriver driver ; 
	
	@BeforeTest
	  public void beforeTest() throws InterruptedException {
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
 		 driver.findElement(By.xpath("//a[@onclick='showProgress();']//parent::li[@class='active']//following-sibling::li//a[@onclick='showProgress();']//span")).click(); //EMR
 		 Thread.sleep(1000);
 		 driver.findElement(By.xpath("//span[contains(text(),'Export EMR')]")).click();       //Export EMR
		 Thread.sleep(2000);
	  }
	
	@Test
	public void EMR() throws InterruptedException {
		
//************************************************* Export EMR ******************************************************		
		driver.findElement(By.xpath("//input[@id='strPass']")).sendKeys("Mayur@4232");       //Enter password for PDF
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td//input[@id='btnProceed' and @style]")).click();             //Proceed btn
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='radioDoct2']")).click();           // Forword through Mail
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='strPass']")).sendKeys("Mayur@4232");       //Enter password for PDF
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='strEmail']")).sendKeys("mahangaderohit15@gmail.com");       //Enter password for PDF
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td//input[@id='btnProceed' and @style]")).click();             //Proceed btn
		Thread.sleep(1000);
		
//************************************************ Translator ******************************************************
		Select Lang=new Select(driver.findElement(By.xpath("//select[@id='Lang_name']")));     //Select Language
		Lang.selectByVisibleText("Marathi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtPass']")).sendKeys("Mayur@4232");             //Enter Password
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='btnlanProceed']")).click();          //Proceed btn
		Thread.sleep(1000);
//		driver.navigate().back();
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}
}
