package com.Chary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Selinium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://rahulshettyacademy.com/locatorspractice/");
     // driver.findElement(By.id("inputUsername")).sendKeys("abcgd");
     //driver.findElement(By.cssSelector("input.Username")).sendKeys("abhjjs");
      driver.findElement(By.cssSelector("#inputUsername")).sendKeys("jaojjas");
      driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
      driver.findElement(By.className("submit")).click();
      Thread.sleep(20);
     // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    System.out.println(driver.findElement(By.tagName("p")).getText());
    Assert.assertEquals((driver.findElement(By.tagName("p")).getText()),"You are successfully logged in.");
	
	}

}
