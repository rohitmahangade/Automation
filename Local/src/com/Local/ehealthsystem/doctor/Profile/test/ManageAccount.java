package com.Local.ehealthsystem.doctor.Profile.test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ManageAccount {

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
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Last Login Details')]")).click();
		Thread.sleep(1000);
		Actions actions = new Actions(driver);
        //Retrieve WebElement 'Music' to perform mouse hover 
    	WebElement menuOption = driver.findElement(By.xpath("//a[contains(text(),'Sourav Jha')]"));     //Mouse hover on profile
    	//Mouse hover menuOption 'Music'
    	actions.moveToElement(menuOption).perform();
    	System.out.println("Done Mouse hover on 'Profile' from Menu");	
    	Thread.sleep(1000);
    	
	}
	
	@Test
	public void manageAccount() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[contains(text(),'Manage Account')]")).click();    //Manage Account
//		WebDriverWait wait1 = new WebDriverWait(driver, 10);
//		WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Manage Account')]")));
//		element1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='oldPassword']")).sendKeys("Abc@123");    //Old Password
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='newPassword']")).sendKeys("India@13");   //New Password
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("India@13");   //Confirm Password
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@id='submit']")).click();      //Update Password
	}
	
	@AfterTest
	public void afterTest() {
		driver.close();
	}
}

