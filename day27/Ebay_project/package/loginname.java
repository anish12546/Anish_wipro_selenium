package Ebay_package;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber_package.pageclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginname {
	WebDriver driver;
	pageclass pc=new pageclass(driver);

@Given("pfofile page should be open in default browsers")
public void pfofile_page_should_be_open_in_default_browsers() {
   driver=new ChromeDriver();
   driver.get("https://accountsettings.ebay.com/uas");
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@When("click on personal information")
public void click_on_personal_information() {
    pc=new pageclass(driver);
    pc.email_in();
	pc.con_in();
	pc.pass_in();
	pc.submit();
    pc.personal_in();
}

@When("click on edit button to change username")
public void click_on_edit_button_to_change_username() {
  pc=new pageclass(driver);
  pc.editusername_in();
}

@Then("successfully change username")
public void successfully_change_username() {
    driver.close();
}



}
