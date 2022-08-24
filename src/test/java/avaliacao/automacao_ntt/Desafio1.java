package avaliacao.automacao_ntt;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Desafio1 {
	
	private WebDriver browser;

	@BeforeEach
	public void openUrl() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
    	browser = new ChromeDriver();
    	browser.manage().deleteAllCookies();
    	browser.manage().window().maximize();
    	browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS).pageLoadTimeout(40, TimeUnit.SECONDS);
    	browser.navigate().to("https://www.kabum.com.br/");
	}
	
	@AfterEach
	public void close() {
		browser.close();
	}
	
    @Test
    public void testGetIten() throws InterruptedException {
       	browser.findElement(By.cssSelector("#input-busca")).sendKeys("Prime Ninja KaBuM!");
       	Thread.sleep(2000);
    	browser.findElement(By.cssSelector(".sc-fytwQQ.sc-DdwlG.fhYSYI.eJUnzk")).click();
    	String price = browser.findElement(By.xpath("/html/body/div[2]/main/"
    			+ "article/section/div[2]/div[1]/div/div/div[2]/div/div[2]/div/h4")).getText();
    	    	
    	Thread.sleep(2000);
    	browser.findElement(By.cssSelector(".sc-dDaJoQ.bnJfOK")).click();
    	String priceFinal = browser.findElement(By.xpath("//*[@id=\"__next\"]/"
    			+ "div[1]/section/div/div[2]/div[2]/div[3]/strong")).getText();
    	
    	Assertions.assertTrue(price.equals(priceFinal));
    	
    	Thread.sleep(2000);
     
    }

}
