package com.Local.ehealthsystem.doctor.Profile.test;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyProfile {
	
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
	
	@Test(priority=1)
	public void ProfileSettings() throws InterruptedException, AWTException {
		
//************************************** Profile Settings **************************************************************		
		
		driver.findElement(By.xpath("//img[@id='PatientEdit']")).click();                //Edit Button 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtedu']")).clear();            //Education
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtedu']")).sendKeys("MBBS");    //Education
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//img[@id='btnuploadimg1']")).sendKeys("C:\\Users\\Rohit\\Downloads\\download.jpg");
//		Thread.sleep(1000);
//		WebDriverWait wait1 = new WebDriverWait(driver, 10);
//		WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@id='btnuploadimg1']")));
//		element1.click();
		
//		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//	    StringSelection str = new StringSelection("C:\\\\Users\\\\Rohit\\\\Downloads\\\\download.jpg");
//	    clipboard.setContents(str, null);
//
//	    WebElement element = driver.findElement(By.xpath("//img[@id='btnuploadimg1']"));
//	    element.click();
//
//	    Robot robot = new Robot();
//	    robot.keyPress(KeyEvent.VK_CONTROL);
//	    robot.keyPress(KeyEvent.VK_V);
//	    Thread.sleep(1000);
//	    robot.keyRelease(KeyEvent.VK_CONTROL);
//	    robot.keyRelease(KeyEvent.VK_V);
//	    Thread.sleep(1000);
//	    robot.keyPress(KeyEvent.VK_ENTER);
//	    robot.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//img[@id='btnuploadimg1']")).click();          // Upload Photo
		String fileName="C:\\Users\\Rohit\\Downloads\\download.jpg";
		StringSelection contents=new StringSelection(fileName);
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		Clipboard clipBoard=toolkit.getSystemClipboard();
		clipBoard.setContents(contents, null);
		Thread.sleep(1000);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id='btnPhotoSave']")).click();     //Save Button of upload photo
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//img[@id='submit']")).click();        //Save button
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[5]/div[4]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/img[1]")).click();      //Closed Button
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[5]/div[4]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/img[1]")));
		element1.click();
	}  
	
	@Test(priority=2)
	public void Myidentifications() throws InterruptedException {
		
//**************************************** My Indentifications ********************************************************
		
		driver.findElement(By.xpath("//img[@id='IdentificationsEdit']")).click();   //Edit Button
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='IMANo']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='IMANo']")).sendKeys("123658945632457");   //IMA Number
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='pancardNO']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='pancardNO']")).sendKeys(" AAAPZ1234C");    //PAN Number
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='passPortNO']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='passPortNO']")).sendKeys("F569332654");    //Passport Number
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='adharCardNO']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='adharCardNO']")).sendKeys("986536615249");   //Adhar Card Number
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='voterCardNO']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='voterCardNO']")).sendKeys("ABC1546523");    //Voter Card Number
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='licenseNo']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='licenseNo']")).sendKeys("5624-8965-5623-569");    //License Number
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='licenseAuthority']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='licenseAuthority']")).sendKeys("MMV R 6");   //License Authority
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='uploadsign']")).sendKeys("C:\\Users\\Rohit\\Downloads\\signature.png");    //Upload Signature
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//img[@id='saveIdentifiaction']")).click();   //Save button of My Identifications
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[5]/div[6]/div[1]/div[1]/span[2]/img[1]")).click(); //Close Button
		
	}
	
	@Test(priority=3)
	public void ContactDetails() throws InterruptedException {
		
		JavascriptExecutor js6 = (JavascriptExecutor) driver;   
		 js6.executeScript("window.scrollBy(0,1000)");   //Scrolling
		 Thread.sleep(1000);
		
//***************************************** Contact Details *************************************************		
		driver.findElement(By.xpath("//img[@id='ContactdisplayEdit']")).click();    //Edit Button
		Thread.sleep(1000);
		Select Country=new Select(driver.findElement(By.xpath("//select[@id='Country']")));  //Select Country
		Country.selectByVisibleText("India");
		Thread.sleep(1000);
		Select State=new Select(driver.findElement(By.xpath("//select[@id='State']")));   //Select State
		State.selectByVisibleText("Maharashtra");
		Thread.sleep(1000);
		Select District=new Select(driver.findElement(By.xpath("//select[@id='Revenue']")));  //Select District
		District.selectByVisibleText("Satara");
		Thread.sleep(1000);
		Select City=new Select(driver.findElement(By.xpath("//select[@id='City']")));  //Select City
		City.selectByVisibleText("Wai");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtaddress']")).clear();    // Address
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtaddress']")).sendKeys("eHealthSystem,Pune");   //Address
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtPin']")).clear();        //Zipcode
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtPin']")).sendKeys("411041");    //Zipcode
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtmobile']")).clear();   //Mobile
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtmobile']")).sendKeys("7763598634");   //Mobile
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtphone']")).sendKeys("61230");  //Home
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtoffice']")).sendKeys("62");  //Office
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtemail']")).clear();  //Email1
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtemail']")).sendKeys("SauravJha@gmail.com");  //Email1
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtemail2']")).sendKeys("abc@gmail.com");  //Email2
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//img[@id='saveContactDetails']")).click();         //save Button
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[5]/div[8]/div[1]/div[1]/span[2]/img[1]")).click();  //Close button
	}
	
	@Test(priority=4)
	public void MyAttachments() throws InterruptedException {
		
		JavascriptExecutor js7 = (JavascriptExecutor) driver;   
		 js7.executeScript("window.scrollBy(0,1000)");   //Scrolling
		 Thread.sleep(1000);
		 
//******************************************* My Attachments **************************************************************
		 driver.findElement(By.xpath("//img[@src=\"/Content/Dynamic/Dimages/icon-download.png\"]")).click();     //Download 
		 
	}
	
	@AfterTest
	public void afterTest() {
		driver.close();
	}
}

