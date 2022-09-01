package desafio.automacao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	public WebDriver createWebDriver() {
		String webdriver = System.getProperty("browser", "chrome");
		switch (webdriver) {
			case "firefox":
				return initFirefoxDriver();
			case "chrome":
				return initChromeDriver();
			default:
				return initChromeDriver();
		}
	}

	private  WebDriver initChromeDriver() {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver_1.exe");
		return new ChromeDriver();
	}

	private  WebDriver initFirefoxDriver() {
		System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
		return new FirefoxDriver();
	}
}
