package com.Local.ehealthsystem.doctor.Profile.test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OPD { 
	
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
    	driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();           //My Profile
		Thread.sleep(1000);
	}
	
	@Test
	public void opd() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'OPD')]")).click();       //OPD
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@name=\"8533\"]")).click();       //Edit Button
		Thread.sleep(1000);
		Select Day=new Select(driver.findElement(By.xpath("//select[@id='ddlEditDay']")));   //Day
		Day.selectByVisibleText("Saturday");
		Thread.sleep(1000);
		Select Hospital=new Select(driver.findElement(By.xpath("//select[@id='ddlEditGenHospi']")));   //Hospital Name
		Hospital.selectByVisibleText("Sadhu Vaswani College of Nursing");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtEditopdname']")).clear();    //OPD Name
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtEditopdname']")).sendKeys("OPD4");  //OPD Name
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtEditshortname']")).clear();    //OPD Short Name
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtEditshortname']")).sendKeys("opd4");  //OPD Short Name
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='dtpEditstartdate']")).clear();    //OPD Start Date
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='dtpEditstartdate']")).sendKeys("06-NOV-2020");  //OPD Start Date
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='dtpEditenddate']")).clear();    //OPD END Date
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='dtpEditenddate']")).sendKeys("09-NOV-2020");  //OPD END Date
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='editTimeFrm']")).clear();    //OPD Start Time
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='editTimeFrm']")).sendKeys("07:00 AM");  //OPD Start Time
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='EditTimeTo']")).clear();    //OPD END Time
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='EditTimeTo']")).sendKeys("07:00 PM");  //OPD END Time
		Thread.sleep(1000);
		Select Status=new Select(driver.findElement(By.xpath("//select[@id='ddlEditstatus']")));   //OPD Status
		Status.selectByVisibleText("InActive");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id='txtEditRemark']")).sendKeys("Remark");   //Remark
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[10]/div[1]/img[2]")).click();  //Save Button
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[10]/div[1]/img[1]")).click();  //Close Button

	}
	
	@AfterTest
	public void afterTest() {
		driver.close();
	}

}

