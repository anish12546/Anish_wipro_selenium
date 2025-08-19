package day24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	WebDriver driver;

    @Test(dataProvider = "loginCredentials")
    public void loginTest(String username, String password) {
        System.out.println("Testing login with:");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
   	 WebDriver driver=new ChromeDriver();
 	
 
 	 
 	 driver.findElement(By.id("user_login")).click();
 	 driver.findElement(By.id("user_login")).sendKeys(username);
 	 driver.findElement(By.id("user_password")).click();
 	 driver.findElement(By.id("user_password")).sendKeys(password);
 	 driver.findElement(By.name("submit")).click();
    }


    @DataProvider(name = "loginCredentials")
    public Object[][] getData() {
        return new Object[][] {
            {"admin", "admin123"},       
            {"admin", "wrongpass"},     
            {"username", "password"}           
        };
    }
    
    @BeforeTest
    public void beforeTest() {
    	driver=new ChromeDriver();
    	 driver.get("http://zero.webappsecurity.com/login.html");
     	 driver.manage().window().maximize();
     	 

  	  
    }

    @AfterTest
    public void afterTest() {
  	  driver.close();
    }

}
