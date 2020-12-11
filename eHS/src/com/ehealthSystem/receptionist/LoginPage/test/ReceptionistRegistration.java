package com.ehealthSystem.receptionist.LoginPage.test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ReceptionistRegistration {

public WebDriver driver;
	
	@BeforeTest()
	public void aftertest() throws InterruptedException {
		 System.out.println("launching Chrome browser"); 
		 System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://login.ehealthsystem.in/");
		 driver.manage().window().maximize();
		 
	}
	
	@Test(priority=1)
	public void SelectProfessional() throws InterruptedException, IOException {
		
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();    //Register button
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h4[@id='Professional']")).click();             //Select Professional
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='5']")).click();          //Select Receptionist
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();     //Proceed Button
		Thread.sleep(1000);
	}
	
	@Test(priority=2)
	public void fillpersonalinfo() throws InterruptedException, IOException, TesseractException {
		driver.findElement(By.xpath("//input[@id='Search']")).sendKeys("eHealthSystem");        //Select Orgnization Name
		Thread.sleep(1000);
		Select Title= new Select(driver.findElement(By.xpath("//select[@id='getusergroup']")));  //Select Title
		Title.selectByVisibleText("Miss");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='uName']")).sendKeys("Archana Sharma");      //Professional's Name
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='UserId']")).sendKeys("Archan");     //Select User ID
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Abc@123");    //Password
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='confpass']")).sendKeys("Abc@123");    //Confirm Password
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\Rohit\\Downloads\\Receptionist.jpg");   //Upload Photo
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='UploadImage']")).click();       //Upload button
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='first_button']")).click();    //Continue Button
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='education']")).sendKeys("BE");    //Education
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;   
		 js.executeScript("window.scrollBy(0,1000)");   //Scrolling
		 Thread.sleep(1000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/form[1]/div[1]/div[1]/div[6]/div[1]/span[1]/span[1]")).click(); //Calender of date of birth 
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@class='datetimepicker-minutes']//table//thead//tr//th[@class='switch' and text()='18 November 2020']")).click(); 
//		Thread.sleep(1000);
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[4]/div[3]/table[1]/thead[1]/tr[1]/th[2]")));
		element1.click();
		
		driver.findElement(By.xpath("//body[1]/div[4]/div[4]/table[1]/thead[1]/tr[1]/th[2]")).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[contains(text(),'2020-2029')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body[1]/div[4]/div[5]/table[1]/thead[1]/tr[1]/th[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body[1]/div[4]/div[5]/table[1]/thead[1]/tr[1]/th[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body[1]/div[4]/div[5]/table[1]/thead[1]/tr[1]/th[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'1997')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Feb')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[6]")).click();
		Thread.sleep(1000);
		
		Select BloodGrp=new Select(driver.findElement(By.xpath("//select[@id='getblgroup']")));  //Blood Group
		BloodGrp.selectByVisibleText("B Rh Positive");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/form[1]/div[1]/div[1]/div[9]/div[1]/label[2]/input[1]")).click();  //Gender
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Continue ..')]")).click();   //Continue Button
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='street_number']")).sendKeys("A.P.Pasarni, Tal-Wai Dist-Satara");    //Address
		Thread.sleep(1000);
		Select Country=new Select(driver.findElement(By.xpath("//select[@id='Country']")));  //Select Country
		Country.selectByVisibleText("India");
		Thread.sleep(1000);
		Select State=new Select(driver.findElement(By.xpath("//select[@id='State']")));  //Select State
		State.selectByVisibleText("Maharashtra");
		Thread.sleep(1000);
		Select District=new Select(driver.findElement(By.xpath("//select[@id='Revenue']")));  //Select District
		District.selectByVisibleText("Satara");
		Thread.sleep(1000);
		Select City=new Select(driver.findElement(By.xpath("//select[@id='City']")));  //Select City
		City.selectByVisibleText("Wai");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='postal_code']")).sendKeys("412803");  //Pincode
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='home_phone']")).sendKeys("612305575");  //Home phone
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='office_phone']")).sendKeys("5475757575");  //Office phone
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='mobile_phone']")).sendKeys("7758904393");  //Mobile Number
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("mahangaderohit15@gmail.com");  //Email id
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Email2']")).sendKeys("rohitmahangade17@gmail.com");  //Alternate Email id
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='DocUpload']")).sendKeys("C:\\Users\\Rohit\\Downloads\\unnamed.png");  //Upload Document
		Thread.sleep(5000);
		
		File src=driver.findElement(By.xpath("//img[@id='CaptchaImage']")).getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"/screenshots/captcha.png";
		FileHandler.copy(src, new File(path));
		
		ITesseract image=new Tesseract();
		image.setDatapath("E:\\Selenium\\tessdata\\tessdata-master");
		String imagetext=image.doOCR(new File(path));
//		System.out.println(imagetext);
		String finalText=imagetext.replaceAll("[^a-zA-Z]", "");
		System.out.println("Final Captcha is "+finalText);
		driver.findElement(By.xpath("//input[@id='CaptchaInputText']")).sendKeys(finalText);
		
//		File imageFile = new File(path);
//
//		Tesseract instance = new Tesseract();
//
//		try {
//
//			instance.setDatapath("C:\\Program Files (x86)\\Tesseract-OCR\\tessdata");
//
//			instance.setLanguage("eng");
//
//			String result = instance.doOCR(imageFile);
//
//			System.out.println(result);
//
//	
//
//			} catch (TesseractException e) {
//
//			System.err.println(e.getMessage());
//
//		}
	
		
//		// or any locator strategy that you find suitable 
//        WebElement locOfOrder = driver.findElement(By.xpath("//img[@id='CaptchaImage']"));
//        Actions act = new Actions(driver);
//        act.moveToElement(locOfOrder).doubleClick().build().perform();
//        // catch here is double click on the text will by default select the text 
//        // now apply copy command 
//		driver.findElement(By.xpath("//img[@id='CaptchaImage']")).sendKeys(Keys.chord(Keys.CONTROL,"c"));   //CaptchaImg
//		Thread.sleep(1000);
//		// now apply the command to paste
//		driver.findElement (By.xpath("//input[@id='CaptchaInputText']")).sendKeys(Keys.chord(Keys.CONTROL, "v"));  //CaptchaTextbox
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@id='check']")).click();  //Agree checkbox
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[@id='btnsubmit']")).click();  //Submit Button
//		Thread.sleep(1000);
		
	}
}
