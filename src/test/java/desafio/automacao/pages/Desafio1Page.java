package desafio.automacao.pages;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Desafio1Page {
	
	private static WebDriver browser;

	@BeforeEach
	public void openUrl() {
		browser = new BrowserFactory().createWebDriver();
       	browser.manage().window().maximize();
    	browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS).pageLoadTimeout(50, TimeUnit.SECONDS);
    	browser.navigate().to("https://www.kabum.com.br/");
	}
	
	@AfterEach
	public void close() {
		browser.manage().deleteAllCookies();
		browser.close();
	}
	
    @Test
    public void testGetIten() throws InterruptedException {
       	browser.findElement(By.id("input-busca")).sendKeys("Prime Ninja KaBuM!");
       	Thread.sleep(2000);
       	browser.findElement(By.id("input-busca")).submit();
    	String price = browser.findElement(By.xpath("//*[@id=\"listing\"]"
    			+ "/div[3]/div/div[2]/div[1]/main/div/a/div/div[2]/span[2]")).getText();
    	    	
    	Thread.sleep(2000);
    	browser.findElement(By.xpath("//*[@id=\"listing\"]"
    			+ "/div[3]/div/div[2]/div[1]/main/div/div[2]/div[2]/button")).click();
    	String priceFinal = browser.findElement(By.xpath("//*[@id=\"__next\"]"
    			+ "/div[1]/div[1]/div[1]/div/div/div[1]/div[2]/div[3]/strong")).getText();
    	
    	Assertions.assertTrue(price.equals(priceFinal));
    	
    	Thread.sleep(2000);
    	    	
    	    	
    }

}
