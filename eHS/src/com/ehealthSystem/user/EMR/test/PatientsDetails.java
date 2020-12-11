package com.ehealthSystem.user.EMR.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;

public class PatientsDetails {
	
//	public String baseUrl = "https://login.ehealthsystem.in/";
//    String driverPath = "E:\\Selenium\\chromedriver.exe";
    public WebDriver driver ; 
    
	@BeforeTest
	  public void beforeTest() {
		 System.out.println("launching Chrome browser"); 
         System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.get("https://login.ehealthsystem.in/");
         driver.manage().window().maximize();
	  }
 
	@Test(priority=1)
      public void Login() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='UserName exampleInputEmail2']")).sendKeys("May62937");  //Username
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Pwd exampleInputPassword2']")).sendKeys("Mayur@4232");   //Password
		Thread.sleep(1000);
        driver.findElement(By.xpath("//body/div[@id='wrap']/div[1]/div[1]/div[2]/form[1]/div[5]/button[1]")).click();  //Login
        driver.findElement(By.xpath("//span[contains(text(),'Last Login Details')]")).click();
      }
	
	@Test(priority=2)
    public void EMR1() throws InterruptedException {
//		WebElement element=driver.findElement(By.linkText("Mayu Sawant"));
//		element.click();
//        driver.findElement(By.linkText("My Profile")).click();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//a[@onclick='showProgress();']//parent::li[@class='active']//following-sibling::li//a[@onclick='showProgress();']//span"));  //EMR
		element.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;   
		 js.executeScript("window.scrollBy(0,1000)");   //Scrolling
		 
//********************************************** Add Vital Sings **********************************************************************		 
        driver.findElement(By.xpath("//img[@id='Vitalsadd']")).click();   // plus button of vital signs
		Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='Height']")).sendKeys("172");   //height
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Weight']")).sendKeys("63");    //weight
		Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='Temp']")).sendKeys("98");    //Temp
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Bloodp']")).sendKeys("55");    //Blood pressure
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Diastolic']")).sendKeys("50");    //weight
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Pulse']")).sendKeys("72");    //Pulse
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Respiration']")).sendKeys("52");    //Respiration
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Oxygon']")).sendKeys("26");    //Oxygon
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@id='saveVitalrecord']")).click();
		Thread.sleep(1000);
//************************************************ Edit Vital Sings **********************************************************************	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;   
		 js1.executeScript("window.scrollBy(0,1000)");   //Scrolling
		 
		driver.findElement(By.xpath("//img[@id='VitalsEdit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='height']")).clear();   //height
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='height']")).sendKeys("180");   //height
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='weight']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='weight']")).sendKeys("80");    //weight
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@id='Temp1']")).clear();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@id='Temp1']")).sendKeys("40");    //Temp
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='BP']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='BP']")).sendKeys("90");    //Blood pressure
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Dia']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Dia']")).sendKeys("30");    //weight
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='pulse']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='pulse']")).sendKeys("80");    //Pulse
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Respiration1']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Respiration1']")).sendKeys("65");    //Respiration
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Oxygen']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Oxygen']")).sendKeys("55");    //Oxygon
		
//******************************************************** Close Vital sings *********************************************************** 	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@id='closeEditvital']")).click();
		
//******************************************************** Add Allergies **************************************************************		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;   
		 js2.executeScript("window.scrollBy(0,1000)");   //Scrolling
		 
		driver.findElement(By.xpath("//img[@id='Allergyadd']")).click(); 
		Select Name = new Select(driver.findElement(By.xpath("//select[@id='AType']")));
		Name.selectByVisibleText("Dust");
		Thread.sleep(1000);
		Select Allergen = new Select(driver.findElement(By.xpath("//select[@id='AMaster']")));
		Allergen.selectByVisibleText("BarnDust");
		Thread.sleep(1000);
		Select Severity = new Select(driver.findElement(By.xpath("//select[@id='list']")));
		Severity.selectByVisibleText("Low");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ANotes']")).sendKeys("Week");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@id='saveAllergyNew']")).click();
		
//******************************************************** Edit Allergies ****************************************************************	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		JavascriptExecutor js4 = (JavascriptExecutor) driver;   
		 js4.executeScript("window.scrollBy(0,1000)");   //Scrolling
		Thread.sleep(1000); 
	    driver.findElement(By.xpath("//img[@id='AllergyEdit']")).click();
	    Select EditName = new Select(driver.findElement(By.xpath("//select[@id='AllergyType0']")));
		EditName.selectByVisibleText("Tress");
		Thread.sleep(1000);
		Select EditAllergen = new Select(driver.findElement(By.xpath("//select[@id='Allergym0']")));
		EditAllergen.selectByValue("64");
		Thread.sleep(1000);
		Select EditSeverity = new Select(driver.findElement(By.cssSelector("#numlist")));
		EditSeverity.selectByVisibleText("Medium");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Notes0']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Notes0']")).sendKeys("Not much good");

		
//******************************************************* close Allergies *****************************************************************
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@id='closeEditAllergy']")).click(); 
		
//******************************************************* Add Biomedical Implants *********************************************************
		JavascriptExecutor js5 = (JavascriptExecutor) driver;   
		 js5.executeScript("window.scrollBy(0,1000)");   //Scrolling
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@id='Medicaladd']")).click();  
		Thread.sleep(1000);
		Select BIName = new Select(driver.findElement(By.xpath("//select[@id='pd_BiomedicalImplants1_eqip_nm']")));
		BIName.selectByVisibleText("Pacemaker");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='reason11']")).sendKeys("A pacemaker is a small, battery-operated device");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@id='implantdate11']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[contains(text(),'10')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@id='saveMedicalDevice']")).click();
		
//***************************************************** Edit Biomedical Implants **************************************************************		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		JavascriptExecutor js6 = (JavascriptExecutor) driver;   
		 js6.executeScript("window.scrollBy(0,1000)");   //Scrolling
		 Thread.sleep(1000);
		 
		driver.findElement(By.xpath("//img[@id='MedicalEdit']")).click();
		Thread.sleep(1000);
		Select EditBIName = new Select(driver.findElement(By.xpath("//select[@id='equipmenttypes0']")));
		EditBIName.selectByVisibleText("FACIAL IMPLANT");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='reason0']")).sendKeys("A facial implant is a procedure in which synthetic materials");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@id='implantdate']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[contains(text(),'11')]")).click();
		
//**************************************************** Close Biomedical Implants **************************************************************		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@id='closeEditmedical']")).click();
		

    }
	
//    @AfterTest
 //   public void afterTest() {
//   }

}
