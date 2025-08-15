package Sele_package;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Project {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();

		
//		driver.get("https://demoqa.com/droppable");
//		driver.manage().window().maximize();
//		Actions act=new Actions(driver);
//		
//		 
//        WebElement source=driver.findElement(By.id("draggable"));
//        WebElement target=driver.findElement(By.id("droppable"));
//        act.dragAndDrop(source, target).perform();
//        Thread.sleep(2000);
//        
//        driver.get("https://demoqa.com/alerts");
//        WebElement promptalert=driver.findElement(By.id("promtButton"));
//        promptalert.click();
//        Thread.sleep(3000);
//        Alert alert1=driver.switchTo().alert();
//        alert1.sendKeys("anish");
//        alert1.accept();
//        
//        
        driver.get("https://demoqa.com/select-menu");
        Thread.sleep(1000);
//        
        
        WebElement multiselect = driver.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div"));
        multiselect.click();
        Thread.sleep(1000);

        // Select Green
        WebElement greenOption = driver.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[1]/div[1]/div/div[1]"));
        greenOption.click();
        Thread.sleep(1000);

        // Re-open dropdown and select Blue
        multiselect = driver.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div"));
        multiselect.click();
        Thread.sleep(1000);

        WebElement blueOption = driver.findElement(By.xpath("//div[contains(@class,'css-12jo7m5')]//div[text()='Blue']"));
        blueOption.click();
        Thread.sleep(1000);

        // Re-open dropdown and select Black
        multiselect.click();
        WebElement blackOption = driver.findElement(By.xpath("//div[contains(@class,'css-12jo7m5')]//div[text()='Black']"));
        blackOption.click();
        Thread.sleep(1000);

        driver.quit();
        
        

        

	}

}
