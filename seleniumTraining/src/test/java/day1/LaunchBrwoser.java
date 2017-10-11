package day1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchBrwoser {

	public static void main(String[] args)
	{
		System.out.println("hello folks...");
		DesiredCapabilities desiredCapabilities=DesiredCapabilities.firefox();
		WebDriver driver;
		try {
		driver = new RemoteWebDriver(new URL("http://192.168.32.138:4444//wd/hub"), desiredCapabilities);
		
		driver.get("http://192.168.60.232:9030/login.php");
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.findElement(By.xpath(".//*[@id='txtUserName']")).click();
		driver.findElement(By.xpath(".//*[@id='txtUserName']")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Admin@123");
		
		driver.findElement(By.id("Login")).click();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.quit();
		
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	
}
