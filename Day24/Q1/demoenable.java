package day24;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Testing_package.pageclass;



public class demoenable {
	WebDriver driver;
	pageclass pc=new pageclass(driver);
	
	//shop by cat
	
  @Test(enabled = true)
  public void shopall() throws InterruptedException {
	  pc=new pageclass(driver);
	  pc.shopcart_in();
      
  }
  
  //search
  @Test(enabled = false)
  public void search() throws InterruptedException {
      pc=new pageclass(driver);
      pc.search_in();
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
