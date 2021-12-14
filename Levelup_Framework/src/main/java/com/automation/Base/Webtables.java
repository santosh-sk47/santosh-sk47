package com.automation.Base;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Webtables {
	
	@Test
	

	public  void tables() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/table.html");
		WebElement webtable = driver.findElement(By.id("table_id"));
		//Getting the table rows
		List<WebElement> tablerows = webtable.findElements(By.tagName("tr"));
		
		//Size of rows
		System.out.println("No of rows :  "  +tablerows.size());
		
		driver.close();
		
		
		
	}

}
