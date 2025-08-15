package Sele_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Action2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demoqa.com/select-menu");
	       driver.manage().window().maximize();

	        
	driver.findElement(By.id("oldSelectMenu")).click();
	Thread.sleep(500);
	driver.findElement(By.cssSelector("select>option[value=\"1\"]")).click();
	 
	
	
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
	
	}

}
