package Test_selemium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Ebay_project1 {
	WebDriver driver;
	
  @Test(priority=1)
  public void login() throws InterruptedException {
	  WebElement login=driver.findElement(By.linkText("Sign in"));
	  login.click();
	 Thread.sleep(8000);
	  
	  WebElement sing=driver.findElement(By.id("userid"));
	  sing.sendKeys("anishjadhav585@gmail.com");
	  Thread.sleep(5000);
	  
	  WebElement cont=driver.findElement(By.id("signin-continue-btn"));
	  cont.click();
	  Thread.sleep(5000);
	  
	  WebElement password=driver.findElement(By.id("pass"));
	  password.sendKeys("12102002a");
	  Thread.sleep(3000);
	  
	  WebElement signin=driver.findElement(By.id("sgnBt"));
	  signin.click();
	  Thread.sleep(2000);
	  
  }
  @Test (priority=2)
  public void search() throws InterruptedException {
	  
	  String searchitem[]= {"watch","phone","book"};
	  for(String item:searchitem) {
		  WebElement search=driver.findElement(By.id("gh-ac"));
		  search.clear();
		  search.sendKeys(item);
		  search.sendKeys(Keys.ENTER);
		  Thread.sleep(1000);
		  
	  }
	  
	  
  }
@Test (priority=3)
  
  public void adddeletetocart() throws InterruptedException {
      Actions act = new Actions(driver);

      driver.navigate().to("https://www.ebay.com/itm/357452864391?_skw=watch...");
      Thread.sleep(2000);
      
     driver.findElement(By.cssSelector("a[id=\"atcBtn_btn_1\"]")).click();
     Thread.sleep(2000);

      WebElement clk = driver.findElement(By.cssSelector("a[href=\"https://cart.ebay.com?_trksid=p4540640.m167481.l8876\"]"));
      act.click(clk).perform();

      Thread.sleep(2000);

      driver.get("https://cart.ebay.com/");
      Thread.sleep(2000);

	  WebElement remove=driver.findElement(By.cssSelector("button[data-test-id=\"cart-remove-item\"]"));
	  act.click(remove).perform();
	  Thread.sleep(2000);
  }





 @Test(priority=4)
 
 public void changeaddress() throws InterruptedException {
	 Actions act1=new Actions(driver);
	
	 driver.navigate().to("https://accountsettings.ebay.com/uas");
	 
	 
	 WebElement address=driver.findElement(By.cssSelector("a[href=\"https://accountsettings.ebay.com/uas/addresses\"]"));
	 address.click();
	 Thread.sleep(2000);
	 
	 WebElement edit=driver.findElement(By.cssSelector("a[aria-label=\"Edit Registration address, email and phone number opens in new window or tab.\"]"));
	 edit.click();
	 Thread.sleep(2000);
	 WebElement editbut=driver.findElement(By.cssSelector("button[id=\"individual_personal_info_address_edit_button\"]"));
	 editbut.click();
	 Thread.sleep(2000);
	 
	 driver.findElement(By.cssSelector("select>option[value=\"IN\"]")).click();
	 Thread.sleep(2000);
	 
	 WebElement change=driver.findElement(By.cssSelector("input[aria-label=\"Street address\"]"));
	 change.clear();
	 change.sendKeys("sec 7 ");
	 change.sendKeys(Keys.ENTER);
	 Thread.sleep(2000);
	 
	 driver.findElement(By.cssSelector("select>option[value=\"MH\"]")).click();
	 
//	 WebElement city=driver.findElement(By.cssSelector("input[id=\"city\"]"));
//	 city.clear();
//	 city.sendKeys("Mumbai");
//	 city.sendKeys(Keys.ENTER);
//	 Thread.sleep(2000);
	 
	 
	
	
	 Thread.sleep(7000);
	 
 }
 @Test(priority=5)
 public void loginname() throws InterruptedException {
	 driver.navigate().to("https://accountsettings.ebay.com/uas");
	 
	 WebElement personal=driver.findElement(By.cssSelector("a[href=\"https://accountsettings.ebay.com/profile\"]"));
	 personal.click();
	 Thread.sleep(2000);
	 
	 WebElement edit=driver.findElement(By.cssSelector("button[id=\"individual_username_edit_button\"]"));
	 edit.click();
	 Thread.sleep(2000);
	 
	 WebElement username=driver.findElement(By.cssSelector("input[aria-describedby=\"user_name-inline_error\"]"));
	 username.clear();
	 username.sendKeys("anish123");
	 username.sendKeys(Keys.ENTER);
	 Thread.sleep(2000);
	 
	 
 }
 
 
 @Test (priority=6)
 public void shopcategory() throws InterruptedException {
	 
	 WebElement shopcat=driver.findElement(By.cssSelector("span[class=\"gh-categories__title\"]"));
	 shopcat.click();
	 
	 WebElement autopart=driver.findElement(By.cssSelector("a[href=\"https://www.ebay.com/b/Auto-Parts-Accessories/6028/bn_569479\"]"));
	 autopart.click();
	 
	 WebElement select=driver.findElement(By.cssSelector("img[src=\"https://i.ebayimg.com/thumbs/images/g/qpoAAeSwuKNok19K/s-l1600.webp\"]"));
	 select.click();
	 
	 
	 Thread.sleep(7000);
 }
	 
 @Test(priority=7)
 
 public void rightclick() throws InterruptedException {
	 driver.navigate().to("https://www.ebay.com/itm/232307414185?itmmeta=01K2KER3FX403TSYW5BSB2DGQ6&hash=item361699d4a9:g:Pz0AAOSwIWVY9-gA&itmprp=enc%3AAQAKAAAA4MHg7L1Zz0LA5DYYmRTS30k6TpqJYBH%2F1Qw3a2IMr%2B0oMux47i0SIlka57tH3QUi27PkpVC0OEcKaLeORVefOVFMJoyclMOCa%2F6jzdH0%2B369ovldjJqeKhR%2BS0MhkmF6uC344xAbNtagkYzbGWsUX4EAoE87ruda1RccqYGBmM8Y%2BWz8nExtQq79bsDRBFBj7f5FxJZQdJB7qPJQmxDsafa2eCemVKNuSdT%2Fw81bpk4AKDlHx2Z5R%2FRXKtMQ%2FcjDdKuU5XEypV1TgdDuzghBDAOU6QwoTWWJbxqlhAKt%2FD4k%7Ctkp%3ABFBM9Ljg7pRm");
	 Actions act1=new Actions(driver);
	 Thread.sleep(2000);
	 
	 WebElement product=driver.findElement(By.cssSelector("img[src=\"https://i.ebayimg.com/images/g/Pz0AAOSwIWVY9-gA/s-l500.webp\"]"));
	 act1.contextClick(product).perform();
	 Thread.sleep(2000);
 }
 
 @Test(priority=8)
 public void allcategory() throws InterruptedException {
	 
	 WebElement allcat=driver.findElement(By.cssSelector("select>option[value=\"550\"]"));
	 allcat.click();
	 Thread.sleep(2000);
	 
	 WebElement search=driver.findElement(By.cssSelector("span[class=\"gh-search-button__label\"]"));
	 search.click();
	 Thread.sleep(2000);
	 
 }
 
 @Test(priority=9)
	public void languageChange() throws InterruptedException {
//		flag country
		
		WebElement country = driver.findElement(By.cssSelector("button[class=\"gf-flag__button\"]"));
		country.sendKeys(Keys.ENTER);
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("China")).click();
		
		
//		
		
	}
 
 
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  driver=new ChromeDriver();
	  driver.get("https://www.ebay.com");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
