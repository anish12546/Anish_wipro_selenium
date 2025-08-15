package Sele_package;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Action1 {
	public static void main(String args[]) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		
		
		
		//double click
		WebElement doubleclick=driver.findElement(By.id("doubleClickBtn"));
		act.doubleClick(doubleclick).perform();
		Thread.sleep(2000);
		
		WebElement rightclick=driver.findElement(By.id("rightClickBtn"));
		act.contextClick(rightclick).perform();
		Thread.sleep(2000);
		
		 WebElement singleClickBtn = driver.findElement(By.xpath("//*[@id=\"uQTnU\"]"));
	     singleClickBtn.click();
	     Thread.sleep(2000);
		
	     //draganddropp
	     	driver.get("https://demoqa.com/droppable");
	        driver.manage().window().maximize();
	        WebElement source=driver.findElement(By.id("draggable"));
	        WebElement target=driver.findElement(By.id("droppable"));
	        act.dragAndDrop(source, target).perform();
	        Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
