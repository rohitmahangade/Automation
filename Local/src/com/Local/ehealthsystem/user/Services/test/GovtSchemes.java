package com.Local.ehealthsystem.user.Services.test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GovtSchemes {
public WebDriver driver;
	
	@BeforeTest()
	public void aftertest() throws InterruptedException {
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
		 driver.findElement(By.xpath("//span[contains(text(),'Services')]")).click(); //Services
		 Thread.sleep(1000);
	}
	
	@Test()
	public void Gov() throws InterruptedException {
//		driver.findElement(By.xpath("//span[contains(text(),'Govt Schemes')]")).click();       //Generic Medicine
//		Thread.sleep(1000);
		
//		WebElement element=driver.findElement(By.xpath("//span[contains(text(),'Govt Schemes')]"));
//		element.click();
		
//		WebElement dashboardTab;
//		public void clickOnDashboardTab()
//	    {
//	        dashboardTab.click();
//	    }
		
//		String s = "abcd";
//
//		foo(null);
//		
//	}
//
//	// Using a try-catch block:
//	static void foo(String x){
//		try {
//			System.out.println("First character: " + x.charAt(0));
//		}
//		catch(NullPointerException e) {
//			System.out.println("NullPointerException thrown!");
//		}
//		
  }
	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
