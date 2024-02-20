package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class framescls {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\seleniumrelated\\chromedriver120\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//alerts n frames
		//driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		//driver.manage().window().maximize();
		
		/*driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();
		driver.switchTo().alert().accept(); */
		
		//confirm and frames
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		//driver.switchTo().frame("iframeResult");
		//driver.findElement(By.xpath("/html/body/button")).click();
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		//to get the text "you pressed ok"
		//String text = driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		//System.out.println(text);
		//to get the text "you pressed cancel" in console
		//String text2 = driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		//System.out.println(text2);
		
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("/html/body/button")).click();
		driver.switchTo().alert().sendKeys("Welcome");
	    driver.switchTo().alert().accept();
	    String text = driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		System.out.println(text);
		
		
	}

}
