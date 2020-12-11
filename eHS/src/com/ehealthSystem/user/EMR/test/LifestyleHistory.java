package com.ehealthSystem.user.EMR.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LifestyleHistory {
	
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
			driver.findElement(By.xpath("//span[contains(text(),'Lifestyle History')]")).click();  //Lifestyle History
			Thread.sleep(1000);
			driver.findElement(By.xpath("//img[@title='Edit']")).click();
			Thread.sleep(1000);
		}	
//************************************************ Smoking **********************************************************************			
		@Test(priority=2)
	     public void EMR() throws InterruptedException {	
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			 WebElement slider = driver.findElement(By.xpath("//div[@id='defaultslide_bs']"));
//		        Actions move = new Actions(driver);
//		        Action action = (Action) move.dragAndDropBy(slider, 30, 0).build();
//		        action.perform();
//			    Thread.sleep(1000);
			    
//			    WebElement e = driver.findElement(By.xpath("//div[@id='defaultslide_bs']"));
//			    Actions move = new Actions(driver);
//			    move.moveToElement(e).clickAndHold().moveByOffset(0,50).release().perform();
			    
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement a = driver.findElement(By.xpath("//tbody/tr[3]/td[1]/div[1]/div[1]/div[2]/a[1]"));
			js.executeScript("arguments[0].setAttribute('style', 'left: 20%;')",a);
			
			Thread.sleep(1000);
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			WebElement a1 = driver.findElement(By.xpath("//tbody/tr[3]/td[1]/div[1]/div[1]/div[2]/a[1]"));
			js1.executeScript("arguments[0].setAttribute('style', 'left: 40%;')",a1);
			
			Thread.sleep(1000);
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			WebElement a2 = driver.findElement(By.xpath("//tbody/tr[3]/td[1]/div[1]/div[1]/div[2]/a[1]"));
			js2.executeScript("arguments[0].setAttribute('style', 'left: 60%;')",a2);
			
			Thread.sleep(1000);
			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			WebElement a3 = driver.findElement(By.xpath("//tbody/tr[3]/td[1]/div[1]/div[1]/div[2]/a[1]"));
			js3.executeScript("arguments[0].setAttribute('style', 'left: 80%;')",a3);
			
			Thread.sleep(1000);
			JavascriptExecutor js4 = (JavascriptExecutor) driver;
			WebElement a4 = driver.findElement(By.xpath("//tbody/tr[3]/td[1]/div[1]/div[1]/div[2]/a[1]"));
			js4.executeScript("arguments[0].setAttribute('style', 'left: 100%;')",a4);
			
//		    Action action1 = (Action) move.dragAndDropBy(slider, 20, 0).build();
//	        action1.perform();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//div[text()='Rarely 1-2/ month']")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//div[text()='Occasionally 3-5/ week']")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//div[text()='Frequently 5/ day']")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//div[text()='Very frequently 25/ day']")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//div[text()='Occasionally 3-5/ week']")).click();
//			Thread.sleep(1000);
			
//************************************************ Alcohol ************************************************************************
			
			JavascriptExecutor AH = (JavascriptExecutor) driver;
			WebElement b = driver.findElement(By.xpath("//tbody/tr[5]/td[1]/div[1]/div[1]/div[2]/a[1]"));
			AH.executeScript("arguments[0].setAttribute('style', 'left: 20%;')",b);
			
			Thread.sleep(1000);
			JavascriptExecutor AH1 = (JavascriptExecutor) driver;
			WebElement b1 = driver.findElement(By.xpath("//tbody/tr[5]/td[1]/div[1]/div[1]/div[2]/a[1]"));
			AH1.executeScript("arguments[0].setAttribute('style', 'left: 40%;')",b1);
			
			Thread.sleep(1000);
			JavascriptExecutor AH2 = (JavascriptExecutor) driver;
			WebElement b2 = driver.findElement(By.xpath("//tbody/tr[5]/td[1]/div[1]/div[1]/div[2]/a[1]"));
			AH2.executeScript("arguments[0].setAttribute('style', 'left: 60%;')",b2);
			
			Thread.sleep(1000);
			JavascriptExecutor AH3 = (JavascriptExecutor) driver;
			WebElement b3 = driver.findElement(By.xpath("//tbody/tr[5]/td[1]/div[1]/div[1]/div[2]/a[1]"));
			AH3.executeScript("arguments[0].setAttribute('style', 'left: 80%;')",b3);
			
			Thread.sleep(1000);
			JavascriptExecutor AH4 = (JavascriptExecutor) driver;
			WebElement b4 = driver.findElement(By.xpath("//tbody/tr[5]/td[1]/div[1]/div[1]/div[2]/a[1]"));
			AH4.executeScript("arguments[0].setAttribute('style', 'left: 100%;')",b4);
			Thread.sleep(1000);
//			driver.findElement(By.xpath("//div[text()=' Very Rarely On Occasions   ']")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//div[text()=' Rarely 1/2 times in 3 months   ']")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//div[text()=' Occasionally 1/2 time in a month   ']")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//div[text()=' Frequently 2/3 in a week   ']")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//div[text()=' Very frequently   ']")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//div[text()=' Rarely 1/2 times in 3 months   ']")).click();
//			Thread.sleep(1000);
//			JavascriptExecutor js = (JavascriptExecutor) driver;   
//			 js.executeScript("window.scrollBy(0,1000)");   //Scrolling
			
//**************************************************** Diet ****************************************************************
			Select Diet=new Select(driver.findElement(By.xpath("//select[@id='Diet']")));
			Diet.selectByVisibleText("Veg");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='FamilyLife']")).sendKeys("Milk,Eggs and Dry Fruits");
			Thread.sleep(1000);
			
//************************************************ Exercise ****************************************************************		
			driver.findElement(By.xpath("//input[@id='Exercise']")).sendKeys("Pushups, Pullups and cardio");
			Thread.sleep(1000);
			
//************************************************ Occupation ****************************************************			
			driver.findElement(By.xpath("//input[@id='Occupation']")).sendKeys("job");
			Thread.sleep(1000);
			
//************************************************ Pets ********************************************************		
			driver.findElement(By.xpath("//input[@id='Pets']")).sendKeys("Cat, Dog");
			Thread.sleep(1000);
			
//************************************************** Save Button *************************************************
			driver.findElement(By.xpath("//img[@id='savedata']")).click();
	     }

//	    @AfterTest
//	    public void afterTest() {//span[contains(text(),'Patient History')].
//	    }

		
}
