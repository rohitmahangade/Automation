package com.Local.ehealthsystem.user.EMR.test;





import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PatientsHistory {
	
	 public WebDriver driver ; 
	
	@BeforeTest
	  public void beforeTest() {
		 System.out.println("launching Chrome browser"); 
         System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.get("http://192.168.0.78/");
         driver.manage().window().maximize();

	  }
 
	@Test
     public void EMR2() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[contains(text(),'Patient History')]")).click();
		Thread.sleep(2000);
     }

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}