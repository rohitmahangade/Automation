package com.Local.ehealthsystem.user.Consultation.test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BookAnAppointment {
	
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
			 driver.findElement(By.xpath("//span[contains(text(),'Consultation')]")).click(); //Consultation
		}
		
		@Test
		public void BookANAppointment() throws InterruptedException {
			driver.findElement(By.xpath("//div[@class='tab-heading']//h2[text()='My Appointments']//following-sibling::input[@value='Book an Appointment']")).click();  //Book An Appointment
			Thread.sleep(1000);
			Select Country=new Select(driver.findElement(By.xpath("//select[@id='country']")));  //Select country
			Country.selectByVisibleText("India");
			Thread.sleep(1000);
			Select State=new Select(driver.findElement(By.xpath("//select[@id='State']")));      //Select State
			State.selectByVisibleText("Maharashtra");
			Thread.sleep(1000);
			Select District=new Select(driver.findElement(By.xpath("//select[@id='Revenue']")));   //Select District
			District.selectByVisibleText("Pune");
			Thread.sleep(1000);
			Select City=new Select(driver.findElement(By.xpath("//select[@id='City']")));       //Select City
			City.selectByVisibleText("Pune");
			Thread.sleep(1000);
			Select Speciality=new Select(driver.findElement(By.xpath("//select[@id='Types']")));   //Select Speciality
			Speciality.selectByVisibleText("Gen Physician");
			Thread.sleep(1000);
			Select Doctor=new Select(driver.findElement(By.xpath("//select[@id='doctorname']")));  //Select Doctor
			Doctor.selectByVisibleText("Sourav Jha");
			Thread.sleep(1000);
			Select Hospital=new Select(driver.findElement(By.xpath("//select[@id='Hospital']")));   //Select Hospital
			Hospital.selectByVisibleText("Ncorde Hospital");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//img[@class='InsuDatePic']")).click();        //calender
			Thread.sleep(1000);
			Select Month=new Select(driver.findElement(By.xpath("//select[@name='MonthSelector']")));    //Select Month
			Month.selectByVisibleText("October");
			Thread.sleep(1000);
			Select Year=new Select(driver.findElement(By.xpath("//select[@name='YearSelector']")));   //Select Year
			Year.selectByVisibleText("2020");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//td[contains(text(),'19')]")).click();    //select date
			Thread.sleep(1000);
			Select Time=new Select(driver.findElement(By.xpath("//select[@id='StartTime']")));    //Select time
			Time.selectByVisibleText("06:00 PM");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//textarea[@id='OpdNotes']")).sendKeys("I've been Coughing a lot since yesterday.");   //Notes
			Thread.sleep(1000);
//			driver.findElement(By.xpath("//input[@id='saveAppointment']")).click();       //Save button
		} 

		@AfterTest
		public void afterTest() {
			driver.close();
		}
}

