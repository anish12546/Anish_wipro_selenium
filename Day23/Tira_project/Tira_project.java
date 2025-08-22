package Test_selemium;

import org.testng.annotations.Test;

import Testing_package.PageClasss;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Tira_project {
	WebDriver driver;
	PageClasss pc=new PageClasss(driver);
	
  @Test(priority=1)
  public void login() throws InterruptedException {
	  pc=new PageClasss(driver);
	  
	  pc.login_in();
	  
  }
  
  @Test(priority=2)
  public void search() throws InterruptedException {
	  pc=new PageClasss(driver);
	  
	  pc.search_in();
	  
  }
  
  @Test(priority=4)
//add to cart and remove
	public void addToCartAndRemove() throws InterruptedException {
	  pc=new PageClasss(driver);
	  pc.add();
		
		

	}
  
  @Test(priority=8)
  public void address() throws InterruptedException {
	  
	  pc=new PageClasss(driver);
	 // driver.navigate().to("https://www.tirabeauty.com/profile/address");
	  
	  pc.address_in();
  }
  
  @Test(priority=5)
  public void brand() throws InterruptedException {
	  
	  pc=new PageClasss(driver);
	  pc.brands_in();
	  
  }
  
  @Test(priority=3)
  public void whishlist() throws InterruptedException {
	  pc=new PageClasss(driver);
	  //pc.login_in();
	  pc.whishlist_in();
	 // pc.login_in();
	  pc.seewishlist_in();
	  
  }
  
  @Test(priority=6)
  public void date() throws InterruptedException {
	  pc=new PageClasss(driver);
	 // pc.login_in();
		driver.navigate().to("https://www.tirabeauty.com/profile/details");
	  pc.profile_in();
	  
  }
  
  @Test(priority=7) 
  public void store() throws InterruptedException {
	  pc=new PageClasss(driver);
	 // pc.login_in();
	  driver.navigate().to("https://www.tirabeauty.com/c/store-locator");
	  pc.store_in();
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.get("https://www.tirabeauty.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
