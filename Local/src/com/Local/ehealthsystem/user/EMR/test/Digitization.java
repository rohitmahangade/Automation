package com.Local.ehealthsystem.user.EMR.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Digitization {

	
		
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
		 		 driver.findElement(By.xpath("//span[contains(text(),'Digitization')]")).click();       //Digitization
				 Thread.sleep(2000);
				 
			  }
				
			@Test
			public void EMR() throws InterruptedException {
				
		//********************************************** Apply for Digitization ***************************************************
				driver.findElement(By.xpath("//tr[@id='trSecondRW+9']//preceding-sibling::tr//td[@align='left']//div[@class='arrang_img sioh']//a[@data-toggle='modal']")).click();  //ankit ack(1)
				Thread.sleep(1000);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				Select DOCtype=new Select(driver.findElement(By.xpath("//select[@id='SelectReqType']")));      //Select Documet Type
				DOCtype.selectByVisibleText("Test Report");
				Thread.sleep(1000);
//				driver.findElement(By.xpath("//button[contains(text(),'Assign')]")).click();       //Assign Button
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[1]/div[12]/div[6]/div[1]/div[1]")).click();  //Close Button
//				Thread.sleep(1000);
//				Actions act =  new Actions(driver);
//				act.moveToElement(driver.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[1]/div[12]/div[6]/div[1]/div[1]"))).click().perform();
				Thread.sleep(1000);try {
				     driver.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[1]/div[12]/div[6]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
				  } catch (Exception e) {
				     JavascriptExecutor executor = (JavascriptExecutor) driver;
				     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[1]/div[12]/div[6]/div[1]/div[1]/div[1]/button[1]/span[1]")));
				  }
				
		//*********************************************** Self Document Digitization ************************************************
				driver.findElement(By.xpath("//a[contains(text(),'Self Document Digitization')]")).click();
				Thread.sleep(1000);
				Select Show=new Select(driver.findElement(By.xpath("//select[@name='example_length']")));
				Show.selectByVisibleText("50");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Immunization");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//a[@class='btn icon-btn btn-danger']")).click();
			}
			
			@AfterTest
			public void aftertest() {
				driver.close();
			}
		

}
