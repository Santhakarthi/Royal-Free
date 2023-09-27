package com.hms.Admin;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteDoctorDetailsAdminModuleTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver/domain/Hospital_Management_System/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//a[text()='Click Here'])[3]")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		driver.findElement(By.xpath("//ul[@class='main-navigation-menu']/descendant::span[text()=' Doctors ']")).click();
        driver.findElement(By.xpath("//ul[@class='main-navigation-menu']/descendant::span[text()=' Manage Doctors ']")).click();
        driver.findElement(By.xpath("(//a[@class='btn btn-transparent btn-xs tooltips'])[1]")).click();
        Alert a=driver.switchTo().alert();
        a.accept();
       
   String res=driver.findElement(By.xpath("//div[@class='col-md-12']/descendant::p[contains(text(),'data deleted !!')]")).getText();
String actual="data deleted !!";
if(actual.contains(res))
{
	System.out.println("data is deleted sucessfully");
}
else {
	System.out.println("data isnot deleted sucessfully");
}
	}

}
