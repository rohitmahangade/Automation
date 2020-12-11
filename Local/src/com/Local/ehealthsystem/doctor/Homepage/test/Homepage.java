package com.Local.ehealthsystem.doctor.Homepage.test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Homepage {

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
		
//*************************************************** Walk in Patient *****************************************************************
		driver.findElement(By.xpath("//input[@id='txtPatCardNo']")).sendKeys("0091989667413044");  //eHealthCard No.
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtPatientPwd']")).sendKeys("Mayur@4232");     //Password
		Thread.sleep(1000);
		Select OPDtime=new Select(driver.findElement(By.xpath("//select[@id='OpdFrmTime']")));    //Select OPD Time
		OPDtime.selectByVisibleText("01:30 PM");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='walkAppSave']")).click();     //Show EMR button
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
//*************************************************** Emergency Access *************************************************************		
		driver.findElement(By.xpath("//input[@id='usrCardNo']")).sendKeys("0091989667413044");  //eHealthcard No.
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='btnOTP']")).click();  //Generate OTP
		Thread.sleep(1000);
		
//**************************************************** Share Appointment *************************************************************
		Select ShareAppo=new Select(driver.findElement(By.xpath("//select[@id='recName']")));      //Receptionist
		ShareAppo.selectByVisibleText("Select");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='recShare']")).click();          //Share button
		Thread.sleep(1000);
		
//**************************************************** Monthly Overview **************************************************************
		driver.findElement(By.xpath("//td[contains(text(),'31')]")).click();         //Date
		Thread.sleep(1000);
		
//**************************************************** My Stats(Monthly Overview) *****************************************************
//		driver.findElement(By.xpath("//*[@id=\"highcharts-0\"]/svg/g[1]/g[1]/path[2]")).click();
//		Thread.sleep(1000);
		
		
//***************************************************** Online Chat *******************************************************************
		Select Country=new Select(driver.findElement(By.xpath("//select[@id='patientCountry']")));   //Select Country
		Country.selectByVisibleText("India");
		Thread.sleep(1000);
		Select State=new Select(driver.findElement(By.xpath("//select[@id='patientState']")));  //Select State
		State.selectByVisibleText("Maharashtra");
		Thread.sleep(1000);
		Select District=new Select(driver.findElement(By.xpath("//select[@id='patientRevenue']")));   //Select District
		District.selectByVisibleText("Pune");
		Thread.sleep(1000);
		Select City=new Select(driver.findElement(By.xpath("//select[@id='patientCity']")));   //Select City
		City.selectByVisibleText("Pune");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@id='PatientSearch']")).click();   //Search Button
		Thread.sleep(1000);
		
//***************************************************** Schedule *********************************************************************
		WebDriverWait some_element = new WebDriverWait(driver,100); 
		some_element.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='Today1']")));
		//		driver.findElement(By.xpath("//label[@id='Today1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Mr. Mayu Sawant')]")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		Select Action=new Select(driver.findElement(By.xpath("//select[@id='StatusName5489']")));
		Action.selectByVisibleText("Treated");
		Thread.sleep(1000);
		
	}
	@AfterTest
	public void afterTest() {
		driver.close();
	}
}
