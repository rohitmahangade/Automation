package com.ehealthSystem.user.EMR.test;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MedicalDataUpload {
	
public WebDriver driver ; 
	
	@BeforeTest
	  public void beforeTest() throws InterruptedException {
		 System.out.println("launching Chrome browser"); 
         System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.get("https://login.ehealthsystem.in/");
         driver.manage().window().maximize();
         driver.findElement(By.xpath("//input[@id='UserName exampleInputEmail2']")).sendKeys("May62937");  //Username
 		 Thread.sleep(1000);
 		 driver.findElement(By.xpath("//input[@id='Pwd exampleInputPassword2']")).sendKeys("Mayur@4232");   //Password
 		 Thread.sleep(1000);
         driver.findElement(By.xpath("//body/div[@id='wrap']/div[1]/div[1]/div[2]/form[1]/div[5]/button[1]")).click();  //Login
         Thread.sleep(1000);
         driver.findElement(By.xpath("//span[contains(text(),'Last Login Details')]")).click();
         Thread.sleep(1000);
 		 driver.findElement(By.xpath("//a[@onclick='showProgress();']//parent::li[@class='active']//following-sibling::li//a[@onclick='showProgress();']//span")).click(); //EMR
 		 Thread.sleep(1000);
 		 driver.findElement(By.xpath("//span[contains(text(),'Medical Data  Upload')]")).click();       //Medical Data Upload
		 Thread.sleep(2000);
	  }
 

	
	@Test(priority=1)
	public void Medication() throws InterruptedException, AWTException{
		
		driver.findElement(By.xpath("//img[@class='submit' and @title='Medication'] ")).click();
		Thread.sleep(1000);
		
//************************************** Medical Data Upload *********************************************************************		
		
		driver.findElement(By.xpath("//img[@id='NewAdd']")).click();       //Add 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='fileupload1']")).sendKeys("C:\\\\Users\\\\Admin\\\\Downloads\\\\ankit ack.pdf");  //upload file
		

		driver.findElement(By.xpath("//input[@id='txtDescrNew']")).sendKeys("Medication attachment");     //textBox
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//img[@id='SaveButtonforcardTransNew']")).click();               //Save Button
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@id='close']")).click();       //close button
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@class='submit' and @title='Medication'] ")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='/EMR/UserArea?WallRowId=67408']")).click();        //Edit Button
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[2]/span[1]/input[1]")).sendKeys("C:\\Users\\Admin\\Downloads\\StockDetails.xlsx");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='TextDecsriptionEdit']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='TextDecsriptionEdit']")).sendKeys("Medical report");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[@id='trfirstEdit+1']/td[2]/img[1]")).click();
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//img[@class='submit' and @title='Medication'] ")).click();
	    Thread.sleep(1000);
 //     driver.findElement(By.xpath("//a[@href='/EMR/OnLnkDownload_Click?WallRowId=YW5raXQgYWNrLnBkZg==']//parent::div[@class='arrang_img sioh']//preceding-sibling::div[@class='arrang_icon ']//img[@class='set_dl_img']")).click();    //Download
	    Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Medical Data  Upload')]")).click();       //Medical Data Upload
		Thread.sleep(1000);
//******************************************* Digital User Area ***********************************************************
		driver.findElement(By.xpath("//img[@class='submit' and @title='Medication'] ")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Digital User Area')]")).click();          
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='67425']")).click();                    
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[@id='_SaveDigital']")).click();               //Send Button
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Medical Data  Upload')]")).click();       //Medical Data Upload
		Thread.sleep(1000);
	}
	
    @Test(priority=2)
    public void Immunization() throws InterruptedException {
    	
    	driver.findElement(By.xpath("//img[@class='submit' and @title='Immunization']")).click();
    	Thread.sleep(1000);
    	
//****************************************** Medical data Upload ************************************************    	
    	
    	driver.findElement(By.xpath("//img[@id='NewAdd']")).click();            //Add
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='fileupload1']")).sendKeys("C:\\Users\\Admin\\Downloads\\pres.png");           //Upload
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='txtDescrNew']")).sendKeys("Immunization Schedule");                  //Textbox
    	Thread.sleep(1000);
//    	driver.findElement(By.xpath("//img[@id='SaveButtonforcardTransNew']")).click();                //Save Button
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//img[@id='close']")).click();                   //Close
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//img[@class='submit' and @title='Immunization']")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//img[@id='btnEditShow']")).click();                   //Edit
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[2]/span[1]/input[1]")).sendKeys("C:\\Users\\Admin\\Downloads\\ankit ack.pdf");                  
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='TextDecsriptionEdit']")).clear();                
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='TextDecsriptionEdit']")).sendKeys("Immu"); 
    	Thread.sleep(1000);
 //   	driver.findElement(By.xpath("//img[@id='SaveButtonforcardTrans']")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//tbody/tr[@id='trfirstEdit+1']/td[2]/img[1]")).click();                   //close
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//img[@class='submit' and @title='Immunization']")).click();
    	Thread.sleep(1000);    	
    	
    	driver.findElement(By.xpath("//a[@href='/EMR/OnLnkDownload_Click?WallRowId=dGluZ3JlIGFjay5wZGY=']//parent::div[@class='arrang_img sioh']//preceding-sibling::div[@class='arrang_icon ']//img[@class='set_dl_img']")).click();     //Download
    	Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.xpath("//span[contains(text(),'Medical Data  Upload')]")).click();       //Medical Data Upload
		Thread.sleep(1000);
    	
//********************************************* Digital User Area ******************************************************************    	
    	
    	driver.findElement(By.xpath("//img[@class='submit' and @title='Immunization']")).click();       //Medical Data Upload
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Digital User Area')]")).click();       
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='67407']")).click();       
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[@id='_SaveDigital']")).click();       //Send
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Medical Data  Upload')]")).click();       //Medical Data Upload
		Thread.sleep(1000);
    }
    
    @Test(priority=3)
    public void Allergies() throws InterruptedException {
    	driver.findElement(By.xpath("//img[@class='submit' and @title='Allergy']")).click();
    	Thread.sleep(1000);
    	
  //******************************************** Add Allergies ***************************************************  	
    	
    	driver.findElement(By.xpath("//img[@id='NewAdd']")).click();           //Add Allergies
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='fileupload1']")).sendKeys("C:\\Users\\Admin\\Downloads\\ankit ack.pdf");      //File Upload
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='txtDescrNew']")).sendKeys("Fever");                      //TextBox
    	Thread.sleep(1000);
 //   	driver.findElement(By.xpath("//img[@id='SaveButtonforcardTransNew']")).click();                //Save Button
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//img[@id='close']")).click();                    //Close Button
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//img[@class='submit' and @title='Allergy']")).click();
    	Thread.sleep(1000);
    	
//************************************************ Edit Allergies **************************************************
    	driver.findElement(By.xpath("//img[@id='btnEditShow']")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[2]/span[1]/input[1]")).sendKeys("C:\\Users\\Admin\\Downloads\\pres.png");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='TextDecsriptionEdit']")).clear();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='TextDecsriptionEdit']")).sendKeys("Cold");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//tbody/tr[@id='trfirstEdit+1']/td[2]/img[1]")).click();
    	Thread.sleep(1000);
//***************************************** Download Allergies ***********************************************************   
    	driver.findElement(By.xpath("//img[@class='submit' and @title='Allergy']")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//a[@href='/EMR/OnLnkDownload_Click?WallRowId=Y2FwdHVyZTE1OTIxOTEzNjk0NjQuanBlZw==']//parent::div[@class='arrang_img sioh']//preceding-sibling::div[@class='arrang_icon ']//img[@class='set_dl_img']")).click();  //Download
    	Thread.sleep(1000);
    	
		driver.navigate().back();
		driver.findElement(By.xpath("//span[contains(text(),'Medical Data  Upload')]")).click();       //Medical Data Upload
		Thread.sleep(1000);
    }
  
    @Test(priority=4)
    public void Blood() throws InterruptedException {
    	
    	driver.findElement(By.xpath("//img[@class='submit' and @title='Lab Reports']")).click();
    	Thread.sleep(1000);
    	
  //******************************************** Add Blood ***************************************************  	
    	
    	driver.findElement(By.xpath("//img[@id='NewAdd']")).click();           //Add Blood
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='fileupload1']")).sendKeys("C:\\Users\\Admin\\Downloads\\ankit ack.pdf");      //File Upload
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='txtDescrNew']")).sendKeys("Blood Report");                      //TextBox
    	Thread.sleep(1000);
 //   	driver.findElement(By.xpath("//img[@id='SaveButtonforcardTransNew']")).click();                //Save Button
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//img[@id='close']")).click();                    //Close Button
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//img[@class='submit' and @title='Lab Reports']")).click();
    	Thread.sleep(1000);
    	
//************************************************ Edit Blood **************************************************
    	driver.findElement(By.xpath("//img[@id='btnEditShow']")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[2]/span[1]/input[1]")).sendKeys("C:\\Users\\Admin\\Downloads\\pres.png");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='TextDecsriptionEdit']")).clear();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='TextDecsriptionEdit']")).sendKeys("New Blood Report");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//tbody/tr[@id='trfirstEdit+1']/td[2]/img[1]")).click();
    	Thread.sleep(1000);
//***************************************** Download Blood ***********************************************************   
    	driver.findElement(By.xpath("//img[@class='submit' and @title='Lab Reports']")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//a[@href='/EMR/OnLnkDownload_Click?WallRowId=Y2FwdHVyZTE1OTIxOTEyMDE1NjguanBlZw==']//parent::div[@class='arrang_img sioh']//preceding-sibling::div[@class='arrang_icon ']//img[@class='set_dl_img']")).click();  //Download
    	Thread.sleep(1000);
    
		driver.navigate().back();
		driver.findElement(By.xpath("//span[contains(text(),'Medical Data  Upload')]")).click();       //Medical Data Upload
		Thread.sleep(1000);
    }
   
    @Test(priority=5)
    public void TestReport() throws InterruptedException {
    	
    	driver.findElement(By.xpath("//img[@class='submit' and @title='Labtest']")).click();
    	Thread.sleep(1000);
    	
//****************************************** Medical data Upload ************************************************    	
    	
    	driver.findElement(By.xpath("//img[@id='NewAdd']")).click();            //Add
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='fileupload1']")).sendKeys("C:\\Users\\Admin\\Desktop\\HR.txt");           //Upload
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='txtDescrNew']")).sendKeys("Immunization Schedule");                  //Textbox
    	Thread.sleep(1000);
//    	driver.findElement(By.xpath("//img[@id='SaveButtonforcardTransNew']")).click();                //Save Button
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//img[@id='close']")).click();                   //Close
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//img[@class='submit' and @title='Labtest']")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//img[@id='btnEditShow']")).click();                   //Edit
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[2]/span[1]/input[1]")).sendKeys("C:\\\\Users\\\\Admin\\\\Desktop\\\\AWS.txt");                  
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='TextDecsriptionEdit']")).clear();                
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='TextDecsriptionEdit']")).sendKeys("Immu"); 
    	Thread.sleep(1000);
 //   	driver.findElement(By.xpath("//img[@id='SaveButtonforcardTrans']")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//tbody/tr[@id='trfirstEdit+1']/td[2]/img[1]")).click();                   //close
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//img[@class='submit' and @title='Labtest']")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//div[@class='arrang_icon ']//img")).click();                   //Download
    	Thread.sleep(1000);
    	driver.navigate().back();
    	driver.findElement(By.xpath("//span[contains(text(),'Medical Data  Upload')]")).click();       //Medical Data Upload
		Thread.sleep(1000);
//********************************************* Digital User Area ******************************************************************    	
    	
    	driver.findElement(By.xpath("//img[@class='submit' and @title='Immunization']")).click();       //Medical Data Upload
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Digital User Area')]")).click();       
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='67407']")).click();       
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[@id='_SaveDigital']")).click();       //Send
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Medical Data  Upload')]")).click();       //Medical Data Upload
		Thread.sleep(1000);
    }
  
	@Test(priority=6)
	public void CTScan() throws InterruptedException {
		
    	driver.findElement(By.xpath("//img[@class='submit' and @title='CT-Scan']")).click();
    	Thread.sleep(1000);
    	
  //******************************************** Add CTScan ***************************************************  	
    	
    	driver.findElement(By.xpath("//img[@id='NewAdd']")).click();           //Add CTScan
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='fileupload1']")).sendKeys("C:\\Users\\Admin\\Downloads\\ankit ack.pdf");      //File Upload
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='txtDescrNew']")).sendKeys("CT-Scan Report");                      //TextBox
    	Thread.sleep(1000);
 //   	driver.findElement(By.xpath("//img[@id='SaveButtonforcardTransNew']")).click();                //Save Button
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//img[@id='close']")).click();                    //Close Button
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//img[@class='submit' and @title='CT-Scan']")).click();
    	Thread.sleep(1000);
    	
//************************************************ Edit CTScan **************************************************
    	driver.findElement(By.xpath("//img[@id='btnEditShow']")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[2]/span[1]/input[1]")).sendKeys("C:\\Users\\Admin\\Downloads\\pres.png");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='TextDecsriptionEdit']")).clear();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='TextDecsriptionEdit']")).sendKeys("New CT-Scan Report");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//tbody/tr[@id='trfirstEdit+1']/td[2]/img[1]")).click();
    	Thread.sleep(1000);
////***************************************** Download CTScan ***********************************************************   
    	driver.findElement(By.xpath("//img[@class='submit' and @title='CT-Scan']")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//a[@href='/EMR/OnLnkDownload_Click?WallRowId=Y2FwdHVyZTE1OTIxOTEyMzAzNDcuanBlZw==']//parent::div[@class='arrang_img sioh']//preceding-sibling::div[@class='arrang_icon ']//img[@class='set_dl_img']")).click();  //Download
    	Thread.sleep(1000);
    
		driver.navigate().back();
		driver.findElement(By.xpath("//span[contains(text(),'Medical Data  Upload')]")).click();       //Medical Data Upload
		Thread.sleep(1000);
		
	}

	@Test(priority=7)
	public void MRI() throws InterruptedException {
		
    	driver.findElement(By.xpath("//img[@class='submit' and @title='MRI']")).click();
    	Thread.sleep(1000);
    	
  //******************************************** Add MRI ***************************************************  	
    	
    	driver.findElement(By.xpath("//img[@id='NewAdd']")).click();           //Add MRI
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='fileupload1']")).sendKeys("C:\\Users\\Admin\\Downloads\\ankit ack.pdf");      //File Upload
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='txtDescrNew']")).sendKeys("MRI Report");                      //TextBox
    	Thread.sleep(1000);
//    	driver.findElement(By.xpath("//img[@id='SaveButtonforcardTransNew']")).click();                //Save Button
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//img[@id='close']")).click();                    //Close Button
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//img[@class='submit' and @title='MRI']")).click();
    	Thread.sleep(1000);
    	
//************************************************ Edit MRI **************************************************
    	driver.findElement(By.xpath("//img[@id='btnEditShow']")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[2]/span[1]/input[1]")).sendKeys("C:\\Users\\Admin\\Downloads\\pres.png");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='TextDecsriptionEdit']")).clear();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='TextDecsriptionEdit']")).sendKeys("New MRI Report");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//tbody/tr[@id='trfirstEdit+1']/td[2]/img[1]")).click();
    	Thread.sleep(1000);
///***************************************** Download MRI ***********************************************************   
    	driver.findElement(By.xpath("//img[@class='submit' and @title='MRI']")).click();
    	Thread.sleep(1000);
//    driver.findElement(By.xpath("//a[@href='/EMR/OnLnkDownload_Click?WallRowId=YW5raXQgYWNrMi5wZGY=']//parent::div[@class='arrang_img sioh']//preceding-sibling::div[@class='arrang_icon ']//img[@class='set_dl_img']")).click();  //Download
    	Thread.sleep(1000);
    
	driver.navigate().back();
		driver.findElement(By.xpath("//span[contains(text(),'Medical Data  Upload')]")).click();       //Medical Data Upload
		Thread.sleep(1000);
		
	}

	@Test(priority=8)
	public void Sonography() throws InterruptedException {
		
    	driver.findElement(By.xpath("//img[@class='submit' and @title='Sonography']")).click();
    	Thread.sleep(1000);
    	
  //******************************************** Add Sonography ***************************************************  	
    	
    	driver.findElement(By.xpath("//img[@id='NewAdd']")).click();           //Add Sonography
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='fileupload1']")).sendKeys("C:\\Users\\Admin\\Downloads\\lab report.jpg");      //File Upload
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='txtDescrNew']")).sendKeys("Sonography Report");                      //TextBox
    	Thread.sleep(1000);
 //   	driver.findElement(By.xpath("//img[@id='SaveButtonforcardTransNew']")).click();                //Save Button
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//img[@id='close']")).click();                    //Close Button
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//img[@class='submit' and @title='Sonography']")).click();
    	Thread.sleep(1000);
    	
//************************************************ Edit Sonography **************************************************
    	driver.findElement(By.xpath("//img[@id='btnEditShow']")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[2]/span[1]/input[1]")).sendKeys("C:\\Users\\Admin\\Downloads\\pres.png");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='TextDecsriptionEdit']")).clear();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='TextDecsriptionEdit']")).sendKeys("New Sonography Report");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//tbody/tr[@id='trfirstEdit+1']/td[2]/img[1]")).click();
    	Thread.sleep(1000);
////***************************************** Download Sonography ***********************************************************   
    	driver.findElement(By.xpath("//img[@class='submit' and @title='Sonography']")).click();
    	Thread.sleep(1000);
//    	driver.findElement(By.xpath("//a[@href='/EMR/OnLnkDownload_Click?WallRowId=bGFiIHJlcG9ydC5qcGc=']//parent::div[@class='arrang_img sioh']//preceding-sibling::div[@class='arrang_icon ']//img[@class='set_dl_img']")).click();  //Download
    	Thread.sleep(1000);
    
		driver.navigate().back();
		driver.findElement(By.xpath("//span[contains(text(),'Medical Data  Upload')]")).click();       //Medical Data Upload
		Thread.sleep(1000);
		
	}

	@Test(priority=9)
	public void XRay() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;   
		 js.executeScript("window.scrollBy(0,500)");   //Scrolling
		 Thread.sleep(2000);
    	driver.findElement(By.xpath("//img[@class='submit' and @title='X-Ray']")).click();
    	Thread.sleep(2000);
    	
  //******************************************** Add X-Ray ***************************************************  	
    	
    	driver.findElement(By.xpath("//img[@id='NewAdd']")).click();           //Add X-Ray
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='fileupload1']")).sendKeys("C:\\Users\\Admin\\Downloads\\lab report.jpg");      //File Upload
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='txtDescrNew']")).sendKeys("X-Ray Report");                      //TextBox
    	Thread.sleep(1000);
 //   	driver.findElement(By.xpath("//img[@id='SaveButtonforcardTransNew']")).click();                //Save Button
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//img[@id='close']")).click();                    //Close Button
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//img[@class='submit' and @title='X-Ray']")).click();
    	Thread.sleep(1000);
    	
//************************************************ Edit X-Ray **************************************************
    	driver.findElement(By.xpath("//img[@id='btnEditShow']")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[2]/span[1]/input[1]")).sendKeys("C:\\Users\\Admin\\Downloads\\pres.png");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='TextDecsriptionEdit']")).clear();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='TextDecsriptionEdit']")).sendKeys("New X-Ray Report");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//tbody/tr[@id='trfirstEdit+1']/td[2]/img[1]")).click();
    	Thread.sleep(1000);
////***************************************** Download X-Ray ***********************************************************   
    	driver.findElement(By.xpath("//img[@class='submit' and @title='X-Ray']")).click();
    	Thread.sleep(1000);
//    	driver.findElement(By.xpath("//a[@href='/EMR/OnLnkDownload_Click?WallRowId=Y2Ftc2Nhbm5lciAwNi0wNi0yMDIwIDE2LjA4LjE4LnBkZg==']//parent::div[@class='arrang_img sioh']//preceding-sibling::div[@class='arrang_icon ']//img[@class='set_dl_img']")).click();  //Download
    	Thread.sleep(1000);
    
		driver.navigate().back();
		driver.findElement(By.xpath("//span[contains(text(),'Medical Data  Upload')]")).click();       //Medical Data Upload
		Thread.sleep(1000);
		
	}
	
	
	@Test(priority=10)
	public void StressTest() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;   
		 js.executeScript("window.scrollBy(0,500)");   //Scrolling
		 Thread.sleep(2000);
    	driver.findElement(By.xpath("//img[@class='submit' and @title='Stresstest']")).click();
    	Thread.sleep(2000);
    	
  //******************************************** Add Stress test ***************************************************  	
    	
    	driver.findElement(By.xpath("//img[@id='NewAdd']")).click();           //Add Stress test
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='fileupload1']")).sendKeys("C:\\Users\\Admin\\Downloads\\receiptbig-rock.pdf");      //File Upload
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='txtDescrNew']")).sendKeys("Stress test Report");                      //TextBox
    	Thread.sleep(1000);
 //   	driver.findElement(By.xpath("//img[@id='SaveButtonforcardTransNew']")).click();                //Save Button
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//img[@id='close']")).click();                    //Close Button
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//img[@class='submit' and @title='Stresstest']")).click();
    	Thread.sleep(1000);
    	
//************************************************ Edit Stress test **************************************************
    	driver.findElement(By.xpath("//img[@id='btnEditShow']")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[2]/span[1]/input[1]")).sendKeys("C:\\Users\\Admin\\Downloads\\pres.png");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='TextDecsriptionEdit']")).clear();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='TextDecsriptionEdit']")).sendKeys("New Stress test Report");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//tbody/tr[@id='trfirstEdit+1']/td[2]/img[1]")).click();
    	Thread.sleep(1000);
////***************************************** Download Stress test ***********************************************************   
    	driver.findElement(By.xpath("//img[@class='submit' and @title='Stresstest']")).click();
    	Thread.sleep(1000);
 //   	driver.findElement(By.xpath("//a[@href='/EMR/OnLnkDownload_Click?WallRowId=cmVjZWlwdGJpZy1yb2NrLnBkZg==']//parent::div[@class='arrang_img sioh']//preceding-sibling::div[@class='arrang_icon ']//img[@class='set_dl_img']")).click();  //Download
    	Thread.sleep(1000);
    
		driver.navigate().back();
		driver.findElement(By.xpath("//span[contains(text(),'Medical Data  Upload')]")).click();       //Medical Data Upload
		Thread.sleep(1000);
		
	}

	@Test(priority=11)
	public void Other() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;   
		 js.executeScript("window.scrollBy(0,500)");   //Scrolling
		 Thread.sleep(2000);
    	driver.findElement(By.xpath("//img[@class='submit' and @title='Other']")).click();
    	Thread.sleep(2000);
    	
  //******************************************** Add Other ***************************************************  	
    	
    	driver.findElement(By.xpath("//img[@id='NewAdd']")).click();           //Add Other
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='fileupload1']")).sendKeys("C:\\Users\\Admin\\Downloads\\receiptbig-rock.pdf");      //File Upload
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='txtDescrNew']")).sendKeys("Other Report");                      //TextBox
    	Thread.sleep(1000);
 //   	driver.findElement(By.xpath("//img[@id='SaveButtonforcardTransNew']")).click();                //Save Button
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//img[@id='close']")).click();                    //Close Button
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//img[@class='submit' and @title='Other']")).click();
    	Thread.sleep(1000);
    	
//************************************************ Edit Other **************************************************
    	driver.findElement(By.xpath("//img[@id='btnEditShow']")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[2]/span[1]/input[1]")).sendKeys("C:\\Users\\Admin\\Downloads\\pres.png");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='TextDecsriptionEdit']")).clear();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='TextDecsriptionEdit']")).sendKeys("New Other Report");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//tbody/tr[@id='trfirstEdit+1']/td[2]/img[1]")).click();
    	Thread.sleep(1000);
////***************************************** Download Other ***********************************************************   
    	driver.findElement(By.xpath("//img[@class='submit' and @title='Other']")).click();
    	Thread.sleep(1000);
//    	driver.findElement(By.xpath("//a [@href='/EMR/OnLnkDownload_Click?WallRowId=YW5raXQgYWNrICgxKS5wZGY=']//parent::div[@class='arrang_img sioh']//preceding-sibling::div[@class='arrang_icon ']//img[@class='set_dl_img']")).click();  //Download
    	Thread.sleep(1000);
    
		driver.navigate().back();
		driver.findElement(By.xpath("//span[contains(text(),'Medical Data  Upload')]")).click();       //Medical Data Upload
		Thread.sleep(1000);
		
	}
}

