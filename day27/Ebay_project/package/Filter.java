package Ebay_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber_package.pageclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Filter {
	WebDriver driver;
	pageclass pc=new pageclass(driver);

@Given("home page should be open in default  browsers")
public void home_page_should_be_open_in_default_browsers() {
	driver=new ChromeDriver();
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
}

@When("click on search bar and search item")
public void click_on_search_bar_and_search_item() throws InterruptedException {
    pc=new pageclass(driver);
    pc.search_in();
    pc.send_in();
    pc.searchbtn_in();
}

@When("click on the filter buttons")
public void click_on_the_filter_buttons() {
	pc=new pageclass(driver);
	pc.filter_in();
    
}

@Then("filtered results should display matching item")
public void filtered_results_should_display_matching_item() {
	driver.close();
    
}




}
