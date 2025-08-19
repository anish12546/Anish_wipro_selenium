package day24;

import org.testng.annotations.Test;

import Testing_package.pageclass;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class multipletime {
	WebDriver driver;
	pageclass pc=new pageclass(driver);
	
	
    @Test
  public void search() throws InterruptedException {
    	for (int i = 1; i <= 5; i++) {
    	pc=new pageclass(driver);
    	pc.search_in();
    	}
	  
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
