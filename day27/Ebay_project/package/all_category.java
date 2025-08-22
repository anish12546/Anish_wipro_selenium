package Ebay_package;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber_package.pageclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class all_category {
	WebDriver driver;
	pageclass pc=new pageclass(driver);

@Given("home page should be open in default browser")
public void home_page_should_be_open_in_default_browser() {
	 driver=new ChromeDriver();
	    driver.get("https://www.ebay.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@When("click on all-category")
public void click_on_all_category() throws InterruptedException {
pc=new pageclass(driver);
pc.all_category();
}



@When("click on search button")
public void click_on_search_button() throws InterruptedException {
    pc=new pageclass(driver);
    pc.searchbtn_in();
}

@Then("successfully see item by all-category")
public void successfully_see_item_by_all_category() {
    driver.close();
}




}
