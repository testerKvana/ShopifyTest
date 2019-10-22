package shopifyTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utility.Constant;
public class themespage {
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","/Users/apple/Downloads/chromedriver 2");
	  WebDriver  driver  ;
	  driver = new ChromeDriver();
	  
	  driver.get("https://developers.shopify.com");
	  driver.findElement(By.xpath("//a[@class='marketing-nav__item marketing-nav__item--user'][contains(text(),'Log in')]")) .click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//input[@id='account_email']")).sendKeys(Constant.Username);
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/form[1]/button[1]")).click();
	  driver.findElement(By.xpath("//input[@id='account_password']")).sendKeys(Constant.Password);
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/form[1]/button[1]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//span[contains(text(),'Stores')]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//span[contains(text(),'Kvana12')]")).click();
	  Thread.sleep(2000);
	 driver.findElement(By.xpath("//div[@class='ui-title-bar__actions-group']//a[@class='ui-button ui-button--primary ui-title-bar__action'][contains(text(),'Log in')]")).click();
	 Thread.sleep(5000);
}
	  
	  
  }

