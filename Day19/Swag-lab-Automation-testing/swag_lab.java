package Sele_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swag_lab {
	//login page
	
	public static void login(WebDriver driver, String user, String pass, String textexecution) throws InterruptedException {
		System.out.println("manual test :"+textexecution);
		//username
		WebElement username=driver.findElement(By.id("user-name"));
		username.click();
		username.sendKeys(user);
		
		//password
		WebElement password=driver.findElement(By.id("password"));
		password.click();
		password.sendKeys(pass);
		
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		
	}
	//add to cart
	
	public static void addtocart(WebDriver driver, String firstname, String lastname, String pincode, String textexecution) throws InterruptedException {
		System.out.println("manual test :"+textexecution);
		//add to cart
		Thread.sleep(2000);
		WebElement addcart1=driver.findElement(By.cssSelector("button[id=\"add-to-cart-sauce-labs-backpack\"]"));
		addcart1.click();
		Thread.sleep(2000);
		
		WebElement cart=driver.findElement(By.cssSelector("a[class=\"shopping_cart_link\"]"));
		cart.click();
		Thread.sleep(2000);
		
		WebElement checkoutbtn=driver.findElement(By.cssSelector("button[id=\"checkout\"]"));
		checkoutbtn.click();
		Thread.sleep(2000);
		
	
		WebElement fname=driver.findElement(By.name("firstName"));
		fname.click();
		fname.sendKeys(firstname);
		Thread.sleep(2000);
		
		WebElement lname=driver.findElement(By.name("lastName"));
		lname.click();
		lname.sendKeys(lastname);
		Thread.sleep(2000);
		
		WebElement postalcode=driver.findElement(By.name("postalCode"));
		postalcode.click();
		postalcode.sendKeys(pincode);
		Thread.sleep(2000);
		
		driver.findElement(By.name("continue")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("finish")).click();
		Thread.sleep(2000);
		
	}
	//logout
	public static void checkout(WebDriver driver, String textexecution ) throws InterruptedException {
		System.out.println("manual test :"+textexecution);
		
		WebElement edit=driver.findElement(By.cssSelector("button[id=\"react-burger-menu-btn\"]"));
		edit.click();
		Thread.sleep(2000);
		
		WebElement logout=driver.findElement(By.id("logout_sidebar_link"));
		logout.click();
		Thread.sleep(2000);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		System.out.println("Welcome to swag lab page !");
		
		login(driver,"standard_user","secret_sauce","login successfully");
		addtocart(driver,"anish","jadhav","1234","add to cart successfully");
		checkout(driver,"logout successfully");
		driver.close();
		
		
		

	}

}
//ouptut
Welcome to swag lab page !
manual test :login successfully
manual test :add to cart successfully
manual test :logout successfully

