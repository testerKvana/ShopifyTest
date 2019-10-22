package shopifyTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utility.Constant;

public class addstore {
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
	  driver.findElement(By.linkText("Add store")).click();
	  driver.findElement(By.className("Polaris-RadioButton__Backdrop")).click();
	  driver.findElement(By.xpath("//input[@id='PolarisTextField1']")).sendKeys("Kvana31");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@id='PolarisTextField4']")).sendKeys("Kvana@123");
	  driver.findElement(By.xpath("//input[@id='PolarisTextField5']")).sendKeys("Kvana@123");
	 driver.findElement(By.xpath("//input[@id='PolarisTextField6']")).sendKeys("Hyderabad");
	 driver.findElement(By.xpath("//input[@id='PolarisTextField8']")).sendKeys("500050");
	 driver.findElement(By.cssSelector("body.page-layout.fresh-ui:nth-child(2) div.ui-app-frame:nth-child(2) main.ui-app-frame__main div.Polaris-Frame main.Polaris-Frame__Main div.Polaris-Frame__Content:nth-child(2) div.Polaris-Page div.Polaris-Page__Content div.Polaris-Layout div.Polaris-Layout__AnnotatedSection:nth-child(9) div.Polaris-Layout__AnnotationWrapper div.Polaris-Layout__AnnotationContent div.Polaris-Card div.Polaris-Card__Section div.Polaris-FormLayout div.Polaris-FormLayout__Item fieldset.Polaris-ChoiceList ul.Polaris-ChoiceList__Choices li:nth-child(3) label.Polaris-Choice > span.Polaris-Choice__Label")).
	 click();
	 driver.findElement(By.xpath("//div[@class='Polaris-Stack Polaris-Stack--spacingTight Polaris-Stack--distributionEqualSpacing']//button[@class='Polaris-Button Polaris-Button--primary']")).click();
	 Thread.sleep(7000);
	 driver.quit();
	
  }
}
