package Ebay_package;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber_package.pageclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class shopbycategory {
	WebDriver driver;
	pageclass pc=new pageclass(driver);
	

@Given("home page should be open in default browsers")
public void home_page_should_be_open_in_default_browsers() {
    driver=new ChromeDriver();
    driver.get("https://www.ebay.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
}

@When("click on shop-by-category")
public void click_on_shop_by_category() throws InterruptedException {
    pc=new pageclass(driver);
    pc.shopbycategory_in();
}

@When("click on a autopart")
public void click_on_a_autopart() throws InterruptedException {
    pc=new pageclass(driver);
    pc.autopart_in();
}

@Then("successfully see item by shop-by-category")
public void successfully_see_item_by_shop_by_category() {
    driver.close();
}




}
