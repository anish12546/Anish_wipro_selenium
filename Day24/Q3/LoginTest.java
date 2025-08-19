package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

public class LoginTest {

    @Test
    @Parameters({"username", "password"})
    public void loginTest(@Optional("admin") String user,
                          @Optional("admin123") String pass) {

        System.out.println("Enter username and password:");
        System.out.println("Username: " + user);
        System.out.println("Password: " + pass);

        if (user.equals("admin") && pass.equals("admin123")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
    }



  
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
