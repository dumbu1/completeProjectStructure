package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	private static WebDriver driver;
	private static String browser;
	private static String url;

	public static WebDriver openBrowser() {

		ChromeOptions obj_ChromeOptions;
		FirefoxOptions obj_FirefoxOptions;

		browser=PropertyReader.getPropertyValue("browserurl", "browser");

		switch (browser) {
		case "chrome":

			obj_ChromeOptions=new ChromeOptions();
			obj_ChromeOptions.addArguments("InCognito");
			obj_ChromeOptions.addArguments("start-maximized");

			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(obj_ChromeOptions);
			break;


		case "firefox":

			obj_FirefoxOptions=new FirefoxOptions();
			obj_FirefoxOptions.addArguments("InCognito");
			obj_FirefoxOptions.addArguments("start-maximized");

			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver(obj_FirefoxOptions);
			break;

		default:

			obj_ChromeOptions=new ChromeOptions();
			obj_ChromeOptions.addArguments("InCognito");
			obj_ChromeOptions.addArguments("start-maximized");

			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(obj_ChromeOptions);
			break;
		}
		
		return driver;

	}
	
	
	public static WebDriver openUrl() {
		url=PropertyReader.getPropertyValue("browserandurl", "url");
		
		openBrowser().get(url);
		return driver;
		
	}

	public static WebDriver getDriver() {
		return driver;
	}

}
