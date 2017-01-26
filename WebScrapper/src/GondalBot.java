import java.io.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GondalBot {
	
	public WebDriver driver = new FirefoxDriver();

	/**
	 * Open the test website.
	 */
	public void openTestSite() {
		driver.navigate().to("http://testing-ground.scraping.pro/login");
	}
	
	public void openSite(String link) {
		driver.navigate().to(link);
	}

	/**
	 * 
	 * @param username
	 * @param Password
	 * 
	 *            Logins into the website, by entering provided username and
	 *            password
	 */
	public void login(String username, String Password) {

		WebElement userName_editbox = driver.findElement(By.id("SignupName"));
		WebElement password_editbox = driver.findElement(By.id("SignupPass"));
		WebElement submit_button = driver.findElement(By.className("submit_login"));

		userName_editbox.sendKeys(username);
		password_editbox.sendKeys(Password);
		submit_button.click();

	}

	/**
	 * grabs the status text and saves that into status.txt file
	 * 
	 * @throws IOException
	 */
	public void getText() throws IOException {
		String text = driver.findElement(By.xpath("//div[@id='case_login']/h3")).getText();
		Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("status.txt"), "utf-8"));
		writer.write(text);
		writer.close();

	}
	

	public void closeBrowser() {
		driver.close();
	}

	public void pause(int t){
		try {
			Thread.sleep(t);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/Users/Renato Farruggio/Documents/Java Stuff/geckodriver.exe");
		GondalBot GondalBot = new GondalBot();
		GondalBot.openSite("http://kamor.gondal.de/");
		GondalBot.login("Pinocchio", "811Otaner");
		GondalBot.pause(500);
		GondalBot.openSite("http://kamor.gondal.de/quests/start");
		GondalBot.pause(500);
		
		
		GondalBot.closeBrowser();
	}

}
