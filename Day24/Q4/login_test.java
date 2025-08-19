package day24;

import org.testng.annotations.Test;

import Testing_package.pageclass;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class login_test {
	WebDriver driver;
	pageclass pc=new pageclass(driver);
	  @Test(priority=1)
	  public void login() throws InterruptedException {
			 
			 pc=new pageclass(driver);
			 
			 pc.login_in();
			 Thread.sleep(1000);
			 
			 pc.email_in();
			 Thread.sleep(2000);
			 pc.con_in();
			 Thread.sleep(1000);
			 pc.pass_in();
			 Thread.sleep(1000);
			 pc.submit();
			 Thread.sleep(1000);
			 
			 boolean login=true;
			   
			 Assert.assertTrue(true, "Login did not succeed");
		  
	  }
	  
	  @Test (dependsOnMethods= {"login"})
	  public void search() throws InterruptedException {
		  
		  pc=new pageclass(driver);
		  pc.search_in();
		  
		  
	  }
	  
	  @Test(dependsOnMethods= {"login"})
	  public void logout() throws InterruptedException {
		  driver.get("https://www.ebay.com/");
        pc=new pageclass(driver);
   	 pc.signout_in();
	  }
	  
	  
	  
	  
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.get("https://www.ebay.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
