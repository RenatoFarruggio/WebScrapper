package DSBot;

import java.io.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class Website {
	
	
	public WebDriver driver = new FirefoxDriver();
	
	public void login(){
		driver.navigate().to("https://www.die-staemme.de/");
		
		driver.findElement(By.id("user")).sendKeys("Punocchio");
		driver.findElement(By.id("password")).sendKeys("811Otaner");
		driver.findElement(By.id("js_login_button")).click();
		driver.findElement(By.xpath("//span[text()='Welt 130']")).click();
		System.out.println(driver.manage().getCookies());
	}
	
	
}
