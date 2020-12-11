package com.Local.ehealthsystem.user.EMR.test;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Medication {
	
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
		driver.findElement(By.xpath("//a[@onclick='showProgress();']//parent::li[@class='active']//following-sibling::li//a[@onclick='showProgress();']//span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Medication')]")).click();
		Thread.sleep(1000);
		
//************************************************** Precriptions ***********************************************************************
		
		Select Doctor=new Select(driver.findElement(By.cssSelector("#Doctor")));
		Doctor.selectByVisibleText("Sourav Jha");
		Thread.sleep(1000);
		Select Medicine=new Select(driver.findElement(By.xpath("//select[@id='Medicin' and @name='medicin']")));
		Medicine.selectByVisibleText("AZICIN -250");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@id='MedicationId1']")).click();
		Thread.sleep(1000);
		Select month=new Select(driver.findElement(By.xpath("//select[@name='MonthSelector' ]")));
		month.selectByVisibleText("July");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[text()='2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@id='rpt']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div.header-outer:nth-child(5) div.main-wrapper:nth-child(13) div.VTabbedPanels:nth-child(5) div.TabbedPanelsContentGroup div.TabbedPanelsContent:nth-child(12) div.popup_box8:nth-child(12) div.med_popup_main8.pdd_top:nth-child(1) div.popup_main_head8:nth-child(1) div.popupBoxClose8:nth-child(2) > img:nth-child(1)")).click();
		Thread.sleep(1000);
		
//*********************************************** Request Precriptions ************************************************************		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@id='request_link']")).click();                //request medicines
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Confirm Items']")).click();       //confirm items
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='selPharmacy']")).click();          //search Pharmacy
		Thread.sleep(1000);
		Select country=new Select(driver.findElement(By.xpath("//select[@id='Country']")));          //select country
		country.selectByVisibleText("India");
		Thread.sleep(1000);
		Select State=new Select(driver.findElement(By.xpath("//select[@id='State']")));               //select state
		State.selectByVisibleText("Maharashtra");
		Thread.sleep(1000);
		Select District=new Select(driver.findElement(By.xpath("//select[@id='Revenue']")));           //select district
		District.selectByVisibleText("Pune");
		Thread.sleep(1000);
		Select City=new Select(driver.findElement(By.xpath("//select[@id='City']")));              //select City
		City.selectByVisibleText("Pune");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Search']")).click();                           //Search button
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"HspId737\"]")).click();                            // pharmacy name
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ClsImage' and text()='Confirm Pharmacy/Lab']")).click();           //confirm pharmacy/lab
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Confirm Details']")).click();                 //confirm details
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Confirm Request']")).click();              //confirm request
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Back to EMR']")).click();                   //back to EMR
		Thread.sleep(1000);
     }

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}

