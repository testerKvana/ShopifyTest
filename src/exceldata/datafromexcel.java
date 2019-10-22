package exceldata;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DataConfig.ExcelDataConfig;

public class datafromexcel {
	static WebDriver  driver  ;
	 @Test(dataProvider="shopifydata")
  
  public void f(String username,String Password) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","/Users/apple/Downloads/chromedriver 2");
	  driver = new ChromeDriver();
	  driver.get("https://developers.shopify.com");
	  driver.findElement(By.xpath("//a[@class='marketing-nav__item marketing-nav__item--user'][contains(text(),'Log in')]"))
	  .click();
	  driver.findElement(By.xpath("//input[@id='account_email']")).sendKeys(username);
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/form[1]/button[1]")).click();
	  driver.findElement(By.xpath("//input[@id='account_password']")).sendKeys(Password);
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/form[1]/button[1]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//span[contains(text(),'Stores')]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//span[contains(text(),'Kvana12')]")).click();
	  Thread.sleep(2000);
	 driver.findElement(By.xpath("//span[contains(text(),'kvana12.myshopify.com')]")).click();
	 Thread.sleep(5000);
	 
  }

	 @AfterMethod
public static void testmethod() throws InterruptedException{
	  ((JavascriptExecutor)driver).executeScript("window.open()");
	  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tabs.get(1));
	  
	 driver.get("https://kvana12.myshopify.com/collections/all");
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//body[@id='products']/div[@id='PageContainer']/main[@class='main-content']/div[@class='wrapper']/div[@id='shopify-section-collection-template']/div[@id='CollectionSection']/div[@class='grid grid-collage']/div[1]/div[1]/div[2]/div[1]/a[1]")).click();
	 driver.findElement(By.xpath("//button[@id='AddToCart--product-template']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[@name='checkout']")).click();
	 driver.findElement(By.id("checkout_email_or_phone")).sendKeys("thiru.kvana@gmail.com");
	 driver.findElement(By.id("checkout_shipping_address_first_name")).sendKeys("Kvana");
	 driver.findElement(By.id("checkout_shipping_address_last_name")).sendKeys("12");
	 driver.findElement(By.id("checkout_shipping_address_address1")).sendKeys("Hyd");
	 driver.findElement(By.id("checkout_shipping_address_address2")).sendKeys("Hyd");
	 driver.findElement(By.id("checkout_shipping_address_city")).sendKeys("Hyd");
     driver.findElement(By.id("checkout_shipping_address_country")).sendKeys("India");
     driver.findElement(By.id("checkout_shipping_address_province")).sendKeys("Telangana");
     driver.findElement(By.id("checkout_shipping_address_zip")).sendKeys("500060");
     driver.findElement(By.id("continue_button")).click();
     driver.findElement(By.id("continue_button")).click();
     Thread.sleep(5000);
     
     
 
	   
  }
@DataProvider(name="shopifydata")

	public Object[][] passdata()
	{

		ExcelDataConfig Config  =new ExcelDataConfig("/Users/apple/Documents/workspace/shopifyTest/data/Data.xlsx");
		int rows = Config.getRowCount(0);
		Object [][] data= new Object[rows][2];
		for(int i=0;i<rows;i++)
	    {
			
			data[i][0]=Config.getData(0, i, 0);
			data[i][1]=Config.getData(0, i, 1);
	    }
		return data;

	}
	  
  }

