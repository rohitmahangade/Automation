package com.Local.ehealthsystem.doctor.MyPatient.test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyPatient {
	
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
	}
	
	@Test
	public void myPatient() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'My Patient')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='cardNosearch']")).sendKeys("0091989667413044");       //eHealthCardNo.
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='patNameSearch']")).sendKeys("Mayur Sawant");         //Patient Name
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='mobNoSearch']")).sendKeys("8888083860");           //Mobile Number
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@id='btnSearch']")).click();       //Search Button
		Thread.sleep(1000);
	}
	@AfterTest
	public void afterTest() {
		driver.close();
	}
}