package com.ehealthSystem.user.LoginPage.test;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.io.ssl.ALPNProcessor.Client;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Register {
public WebDriver driver;
	
	@BeforeTest()
	public void aftertest() throws InterruptedException {
		 System.out.println("launching Chrome browser"); 
		 System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://login.ehealthsystem.in/");
		 driver.manage().window().maximize();
		 
	}
	
	@Test()
	public void rgister() throws InterruptedException, IOException {
		
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();    //Register button
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();   //Proceed button
		 Thread.sleep(1000);
		 Select Title=new Select(driver.findElement(By.xpath("//select[@id='getusergroup']")));   //Select Title
		 Title.selectByVisibleText("Mr.");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@id='Fname']")).sendKeys("Rohit");   //FirstName
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@id='Lname']")).sendKeys("Mahangade");    //LastName
		 Thread.sleep(1000);
		 Select Country=new Select(driver.findElement(By.xpath("//select[@id='Country']")));   //Select Country
		 Country.selectByVisibleText("India");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@id='Phone2']")).sendKeys("7758904393");    //Mobile No.
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("mahangaderohit15@gmail.com");  //Email
		 Thread.sleep(1000);
//		 driver.findElement(By.xpath("//input[@id='CaptchaInputText']")).sendKeys("MUDAH");   //Enter code
		 
//		 driver.findElement(By.xpath("//img[@id='CaptchaImage']")).sendKeys("UEMYS");
//		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		            String captcha;   
//		            System.out.println("Please Enter the CAPTCHA Code:: ");
//		            captcha = br.readLine();
//		            System.out.println("Entered  CAPTCHA Code is:: "+captcha);
//		            driver.findElement(By.xpath("//input[@id='CaptchaInputText']")).sendKeys("UEMYS");
		 
//		 WebElement passportNo = driver.findElement(By.xpath("//img[@id='CaptchaImage']"));
//			// Clear the default placeholder or any value present
//			passportNo.clear();
//			// Enter/type the value to the text box
//			passportNo.sendKeys("UEMYS");
//			//prompting user to enter captcha			
//			String captchaVal = JOptionPane.showInputDialog("UEMYS");
//			//Type the entered captcha to the text box
//			driver.findElement(By.xpath("//input[@id='CaptchaInputText']")).sendKeys(captchaVal);			
		
//		 String capchavalue = driver.findElement(By.xpath("//img[@id='CaptchaImage']")).getText();
//		 int firstinteger= Integer.parseInt(capchavalue.substring(0, 5));
//		 int secondinteger= Integer.parseInt(capchavalue.substring(5, 6));
//		 int calc= firstinteger+secondinteger;
//		 String final_value= String.valueOf(calc);
//		 driver.findElement(By.xpath("//input[@id='CaptchaInputText']")).sendKeys(final_value);
		 
		 String capchavalue = driver.findElement(By.xpath("//img[@id='CaptchaImage']")).getText().trim();
		 String removespace = capchavalue.replaceAll("\\s+", "");
		 String[] parts = removespace.split("\\+");
		 String part1 = parts[0];
		 String part2 = parts[1];
		 String[] parts1 = part2.split("\\=");
		 String part11 = parts1[0];
		 int summation = Integer.parseInt(part1) + Integer.parseInt(part11);
		 String final_value = String.valueOf(summation);
		 driver.findElement(By.xpath("//input[@id='CaptchaInputText']")).sendKeys(final_value);
		 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@id='check']")).click();  // check box of Agree
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[@id='btnsubmit']")).click();  //Submit Button
		 Thread.sleep(1000);

		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		 driver.findElement(By.xpath("//button[contains(text(),'Cancel & Re-register')]")).click();  // Cancel and Register
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//body/div[@id='wrap']/div[1]/div[2]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/button[1]")).click();  //Proceed
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[@id='login-1']")).click();    //Login
	
	}
}

