package c602.project.cucumberproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feature1Page {
	WebDriver driver;
public void openSite(){
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
public void closeBrowser(){
	driver.quit();
}
}
