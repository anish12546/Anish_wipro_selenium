package Sele_package;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alterassignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		   WebDriver driver = new ChromeDriver();
	        driver.get("https://demoqa.com/alerts"); 
	        driver.manage().window().maximize();
	        
	        WebElement alertButton = driver.findElement(By.id("alertButton"));
	        alertButton.click();
	        Alert alert = driver.switchTo().alert();
	        System.out.println(alert.getText());
	        alert.accept();
	        
	        //time
	        WebElement timerAlert = driver.findElement(By.id("timerAlertButton"));
	        timerAlert.click();
	        Thread.sleep(5000); 
	        Alert alert2 = driver.switchTo().alert();
	        System.out.println(alert2.getText());
	        alert2.accept();
	        
	        //confirmbox
	        Thread.sleep(3000);
	        WebElement confirmAlert = driver.findElement(By.id("confirmButton"));
	        confirmAlert.click();
	        Thread.sleep(4000);
	        Alert alert1 = driver.switchTo().alert();
	        System.out.println(alert1.getText());
	        alert1.dismiss();
	        
	        //prompt
	        Thread.sleep(3000);
	        WebElement promptAlert = driver.findElement(By.id("promtButton")); // Note: Typo fixed from "promptButton"
	        promptAlert.click();
	        Thread.sleep(4000);
	        Alert alert11 = driver.switchTo().alert();
	        alert11.sendKeys("anish");
	        System.out.println(alert11.getText());
	        alert11.accept();
	        
	        driver.close();

	}

}
