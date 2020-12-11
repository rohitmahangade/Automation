package com.ehealthSystem.user.Insurance.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyInsurance {
	
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
		 driver.findElement(By.xpath("//span[contains(text(),'Insurance')]")).click(); //Insurance
	}
	
	@Test(priority=1)
	  public void AddInsurance() throws InterruptedException {
		
//************************************************ Add Insurance *****************************************************************		
		
		driver.findElement(By.xpath("//input[@id='drpInsuranceCompany']")).sendKeys("Bajaj Allianz Life Insurance");  //Insurance company
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='drpContactDetails']")).sendKeys("1800 209 5858");   //Company contact number
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='drpInsuranceType']")).sendKeys("Term Insurance Plans");    //Insurance Type
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='drpHealthType']")).sendKeys("Bajaj Allianz Life Health Care Goal");    //Health Insurance Type
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='TPA']")).sendKeys("Family Health Plan Insurance TPA Pvt Ltd.(FHPL)");     //Thread Party Adminitrator
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='PolicyNo']")).sendKeys("439301022228");     //Policy No.
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='PreAmount']")).sendKeys("2000");    //Premium Amount
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span//input[@id='PStartDate']//following-sibling::span[@class='field-validation-valid']//following-sibling::img[@class='InsuDatePic']")).click();       //Policy Start Date
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[text()='20']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span//input[@id='PEndDate']//following-sibling::span[@class='field-validation-valid']//following-sibling::img[@class='InsuDatePic']")).click();       //Policy End Date
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[contains(text(),'25')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='TInsuranceAmount']")).sendKeys("200000");  //Total Insurance Amount
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='SaAmount']")).sendKeys("200000");   //Sum Assured Amount
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span//input[@id='PreDate']//following-sibling::span[@class='field-validation-valid']//following-sibling::img[@class='InsuDatePic']")).click();        //Premium Due Date
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[contains(text(),'30')]")).click();
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//img[@id='sub']")).click();   //Save Button
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//img[@id='Can']")).click();  //Cancel Button
//		Thread.sleep(1000);

	}
	
	@Test(priority=2)
	public void EditInsurance() throws InterruptedException {
		
//*********************************************** Edit Insurance ***************************************************************	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;   
		 js.executeScript("window.scrollBy(0,1000)");   //Scrolling
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td//a[@href='./../../Main/Insurance?RowId=MTI2MA==']//img[@id='insdisplayEdit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='drpInsuranceCompany']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='drpInsuranceCompany']")).sendKeys("HDFC Standard Life Insurance Co. Ltd.");  //Insurance company
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='drpContactDetails']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='drpContactDetails']")).sendKeys("1800 266 9777");   //Company contact number
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='drpInsuranceType']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='drpInsuranceType']")).sendKeys("Term Life Insurance");    //Insurance Type
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='drpHealthType']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='drpHealthType']")).sendKeys("HDFC Life Easy Health Plan");    //Health Insurance Type
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='TPA']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='TPA']")).sendKeys("New India Assurance Company");     //Thread Party Adminitrator
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='PolicyNo']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='PolicyNo']")).sendKeys("969691198686");     //Policy No.
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='PreAmount']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='PreAmount']")).sendKeys("1000");    //Premium Amount
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//img[@id='PStartDate']")).click();       //Policy Start Date
		Thread.sleep(1000);
//		((JavascriptExecutor) driver).executeScript("document.getElementById('PStartDate').style.display='block';");
		
		driver.findElement(By.xpath("//td[contains(text(),'25')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//tbody/tr[9]/td[2]/div[1]/span[1]/img[1]")).click();       //Policy End Date
		Thread.sleep(1000);
//		((JavascriptExecutor) driver).executeScript("document.getElementById('PEndDate').style.display='block';");

		driver.findElement(By.xpath("//td[contains(text(),'31')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='TInsuranceAmount']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='TInsuranceAmount']")).sendKeys("100000");  //Total Insurance Amount
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='SaAmount']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='SaAmount']")).sendKeys("100000");   //Sum Assured Amount
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//tbody/tr[12]/td[2]/div[1]/span[1]/img[1]")).click();        //Premium Due Date
		Thread.sleep(1000);
//		((JavascriptExecutor) driver).executeScript("document.getElementById('PreDate').style.display='block';");

		
		driver.findElement(By.xpath("//td[contains(text(),'31')]")).click();
		Thread.sleep(1000);
	//	driver.findElement(By.xpath("//img[@id='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@id='Cancel']")).click();
		Thread.sleep(1000);
	}
	

}
