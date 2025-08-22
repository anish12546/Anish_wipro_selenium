package Ebay_package;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber_package.pageclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class chnageaddress {
	WebDriver driver;
	pageclass pc=new pageclass(driver);
	
	

@Given("address page should be open in default browsers")
public void address_page_should_be_open_in_default_browsers() {
    driver=new ChromeDriver();
    driver.get("https://accountsettings.ebay.com/uas");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
}

@When("click on address")
public void click_on_address() {
	pc=new pageclass(driver);
	//pc.login();
	pc.email_in();
	pc.con_in();
	pc.pass_in();
	pc.submit();
	pc.address_in();
    
}

@When("click on edit button to chnage address")
public void click_on_edit_button_to_chnage_address() throws InterruptedException {
   pc=new pageclass(driver);
   pc.changeadd_in();
}

@Then("successfully change address")
public void successfully_change_address() {
    driver.close();
}





}
