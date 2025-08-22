package Testing_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageClasss {
	
	WebDriver driver;
	
	By login=By.cssSelector("span[class=\"login-cta\"]");
	By number=By.cssSelector("input[name=\"mobile-number\"]");
	By boxclick=By.cssSelector("img[alt=\"checkbox\"]");
	By otp=By.cssSelector("button[class=\"custom-btn primary lg no-tap-highlight\"]");
	
	//search
	By search=By.cssSelector("input[placeholder=\"Search\"]");
	
	//addtocart
	By link=By.partialLinkText("FENTY BEAUTY Gloss");
    By shade=By.cssSelector("img[src=\"https://cdn.tirabeauty.com/v2/billowing-snowflake-434234/tira-p/wrkr/products/pictures/item/free/resize-w:40/fenty-beauty/1179475/0/JLL6U0eoUB-1179475_Swatch.jpg\"]");
    By add=By.linkText("Add to Bag");
    
    //add
    By select2=By.xpath("//*[text()='Add to Bag']");
    By cart=By.cssSelector("img[title=\"Cart\"]");

	//address
    By profile=By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[3]/div[2]/div/a/div/img");
    
    By address=By.linkText(" + Add New Address ");
    
    //product
    By Brands=By.linkText("Brands");
	By search1=By.cssSelector("input[placeholder=\"Search Brands\"]");
	By click1=By.linkText("Lakme");
	By selectproduct=By.linkText("Foundation");
	
	//whishlist
	//By wishlist1=By.linkText("Save to Wishlist");
	By wishlist =By.xpath("//*[contains(text(),'Save to Wishlist')]");
	By wishcart=By.cssSelector("img[title=\"Wishlist\"]");
	
	//profile-date
	By year=By.cssSelector("input[placeholder=\"dd/mm/yyyy\"]");
	By date=By.cssSelector("td[title=\"2025-08-01\"]");
	
	//store
	By store=By.cssSelector("div[class=\"city-store-count-info\"]");
	By citysel=By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/div/ul/div[4]/li/span[1]");

	public PageClasss(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void login_in() throws InterruptedException {
		driver.findElement(login).click();
		Thread.sleep(1000);
		driver.findElement(number).click();
		driver.findElement(number).sendKeys("8591109849");
		Thread.sleep(1000);
		driver.findElement(boxclick).click();
		Thread.sleep(1000);
		driver.findElement(otp).click();
		Thread.sleep(7000);
		
	}
	
	public void search_in() throws InterruptedException {
		String searchitem[]= {"lipstick", "maskaera", "serum"};
		for(String searchproduct:searchitem) {
			driver.findElement(search).clear();
			driver.findElement(search).sendKeys(searchproduct);
			driver.findElement(search).click();
			Thread.sleep(1000);
			
		}
	}
	
	
//	public void addtocart_in() throws InterruptedException {
//		driver.findElement(search).clear();
//		driver.findElement(search).sendKeys("lipstick");
//		Thread.sleep(2000);
//		driver.findElement(search).sendKeys(Keys.ENTER);
//		Thread.sleep(4000);
//		driver.findElement(link).click();
//		Thread.sleep(2000);
//		
//		
//		driver.findElement(add).click();
//		Thread.sleep(2000);
//		
//		
//		
//	}

	
	public void add() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.navigate().to(
				"https://www.tirabeauty.com/product/minimalist-10-niacinamide-face-serum-reduces-blemishes--oil---30ml-klghrqnheu6u");
		
		
		
		js.executeScript("window.scrollBy(0, 200);");
		Thread.sleep(1000);

		WebElement addToBag = wait.until(ExpectedConditions.elementToBeClickable(select2));
		addToBag.click();
		Thread.sleep(1000);
		
		 driver.findElement(cart).click(); 
		Thread.sleep(1000);
		
		WebElement minusButton = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".qty-control > button.operator")));
		minusButton.click();

		Thread.sleep(2000);
		WebElement removeConfirm = driver.findElement(By.cssSelector("button[class=\"remove\"]"));
		removeConfirm.click();
		Thread.sleep(1000);

		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.navigate().to("https://www.tirabeauty.com");
		
		
		
		
	}
	
	
	
	public void address_in() throws InterruptedException {
		driver.findElement(profile).click();
		Thread.sleep(1000);
		driver.findElement(address).click();
		Thread.sleep(1000);
	}
	
	public void brands_in() throws InterruptedException {
		driver.findElement(Brands).click();
		Thread.sleep(1000);
		driver.findElement(search1).sendKeys("lakme");
		driver.findElement(search1).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(click1).click();
		Thread.sleep(4000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0, 500);");
		 
		driver.findElement(selectproduct).click();
		Thread.sleep(4000);
		
	}
	
	
	public void whishlist_in() throws InterruptedException {
	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    // Go to product page
	    driver.navigate().to("https://www.tirabeauty.com/product/minimalist-10-niacinamide-face-serum-reduces-blemishes--oil---30ml-klghrqnheu6u");

	    // Wait for the page to load
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));

	    // Scroll down
	    js.executeScript("window.scrollBy(0, 200);");
	    Thread.sleep(1000);

	    // Wait for the wishlist button
	    WebElement wishlistBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(wishlist));
	    wait.until(ExpectedConditions.elementToBeClickable(wishlistBtn));

	    // Scroll to the button
	   // js.executeScript("arguments[0].scrollIntoView(true);", wishlistBtn);
	    Thread.sleep(500);

	    // Try clicking
	    try {
	        wishlistBtn.click(); // Try normal click
	    } catch (Exception e) {
	        System.out.println("Normal click failed, trying JS click...");
	        js.executeScript("arguments[0].click();", wishlistBtn); // JS fallback
	    }

	    Thread.sleep(2000); // Wait after clicking

	    // Navigate back to home
	    driver.navigate().to("https://www.tirabeauty.com/");
	}

	
	public void seewishlist_in() throws InterruptedException {
		
		driver.findElement(wishcart).click();
		Thread.sleep(2000);
		
	}
	
	
	public void profile_in() throws InterruptedException {
		driver.findElement(year).click();
       	Thread.sleep(2000);
		driver.findElement(date).click();
		Thread.sleep(2000);
		
	}
	
	
	
	public void store_in() throws InterruptedException {
		driver.findElement(store).click();
		Thread.sleep(2000);
		driver.findElement(citysel).click();
		Thread.sleep(2000);
		
		
	}
	

}
