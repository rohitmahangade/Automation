package com.ehealthSystem.receptionist.DoctorDashboard.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DoctorDashboard {
	
public WebDriver driver;
	
	@BeforeTest
	public void beforeTest() throws InterruptedException{
		System.out.println("Lunching Chrome Driver");
		System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\Selenium\\\\\\\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://login.ehealthsystem.in/index");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='UserName exampleInputEmail2']")).sendKeys("Archana");    //Username of Receptionist
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Pwd exampleInputPassword2']")).sendKeys("Abc@123");       //Password of Receptionist
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='wrap']/div[1]/div[1]/div[2]/form[1]/div[5]/button[1]")).click();   //Login button
	}
	
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'Doctor Dashboard')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Last Login Details')]")).click();
		Thread.sleep(1000);
		Select Doctor=new Select(driver.findElement(By.xpath("//select[@id='ddlDoctorName']")));
		Doctor.selectByVisibleText("Neeraj N Desai");
		Thread.sleep(1000);

//*********************************** Walk in Patient ************************************************************		
		driver.findElement(By.xpath("//input[@id='txtPatCardNo']")).sendKeys("0091989667413044");     //Card No.
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtPatientPwd']")).sendKeys("Mayur@4232");    //password
//		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Select OTPtime=new Select(driver.findElement(By.xpath("//div//div//select[@id='OpdFrmTime']")));   //Select OTP Time
		OTPtime.selectByValue("05:00 PM");
//		driver.findElement(By.xpath("//select[@id='OpdFrmTime']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//option[contains(text(),'04:40 PM')]")).click();
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@type=\"submit\" and @id=\"walkAppSave\"] ")).click();   // Show EMR Button
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//input[@type=\"submit\" and @id=\"walkAppSave\"] "))).click().build().perform();
		Thread.sleep(1000);
//		driver.navigate().back();
		
//************************************ Monthly Overview *************************************************************		
		JavascriptExecutor js = (JavascriptExecutor) driver;   
		 js.executeScript("window.scrollBy(0,1000)");   //Scrolling
		 WebElement checkoutLink = driver.findElement(By.xpath("//td[contains(text(),'19')]"));
		 checkoutLink.click();
		
//************************************************** Schedule ***********************************************************	
		 driver.findElement(By.xpath("//label[@id='Tomorrow']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//label[@id='Today1']")).click();
	}
	
//	@AfterTest
//	public void afterTest() {
//		 driver.close();
//	}


}
