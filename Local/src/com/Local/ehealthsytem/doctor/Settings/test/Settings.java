package com.Local.ehealthsytem.doctor.Settings.test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Settings {
	
	

	
	public WebDriver driver;
		
		@BeforeTest
		public void beforeTest() throws InterruptedException{
			System.out.println("Lunching Chrome Driver");
			System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\Selenium\\\\\\\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("http://192.168.0.78/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id='UserName exampleInputEmail2']")).sendKeys("sou22");    //Username of doctor
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='Pwd exampleInputPassword2']")).sendKeys("Abc@123");       //Password of Ddoctor
			Thread.sleep(1000);
			driver.findElement(By.xpath("//body/div[@id='wrap']/div[1]/div[1]/div[2]/form[1]/div[5]/button[1]")).click();   //Login button
		}
		
		@Test
		public void homepage() throws InterruptedException {
			driver.findElement(By.xpath("//span[contains(text(),'Last Login Details')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[contains(text(),'Settings')]")).click();
		}
		
		@AfterTest
		public void afterTest() {
			driver.close();
		}
}

