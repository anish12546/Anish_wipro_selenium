package Ebay_package;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber_package.pageclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class rightclick {
	WebDriver driver;
	pageclass pc=new pageclass(driver);

@Given("the home page should be open in default browser")
public void the_home_page_should_be_open_in_default_browser() {
	 driver=new ChromeDriver();
	    driver.get("https://www.ebay.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@When("the user searches for a specific product")
public void the_user_searches_for_a_specific_product() {
   pc=new pageclass(driver);
   pc.product_in();
}



@When("the user right-clicks on the product image")
public void the_user_right_clicks_on_the_product_image() throws InterruptedException {
    pc=new pageclass(driver);
    pc.right_in();
}

@Then("the description of the selected product should be displayed")
public void the_description_of_the_selected_product_should_be_displayed() {
   driver.close();
}




}
