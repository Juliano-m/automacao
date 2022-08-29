package avaliacao.automacao_ntt;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Desafio2 {

	private WebDriver browser;
		
	@BeforeEach
	public void openUrl() {
		browser = new BrowserFactory().createWebDriver();
    	browser.manage().window().maximize();
    	browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS).pageLoadTimeout(5, TimeUnit.SECONDS);
    	browser.navigate().to("https://demo.automationtesting.in/Alerts.html");
	}
	
	@AfterEach
	public void close() {
		browser.manage().deleteAllCookies();
		browser.close();
	}
	
    @Test
    public void testAlert() throws InterruptedException {
       	browser.findElement(By.cssSelector(".analystic[href='#OKTab']")).click();
    	browser.findElement(By.cssSelector(".btn.btn-danger")).click();
    	
    	WebDriverWait wait = new WebDriverWait(browser, 3);
    	wait.until(ExpectedConditions.  alertIsPresent());
    	Alert alert = browser.switchTo().alert();
    	String text = alert.getText();
    	
    	Thread.sleep(2000);
    	
    	alert.accept();
     
    	Assertions.assertThrows(NoSuchElementException.class,
    			() -> browser.findElement(By.xpath("//*[@id=\"OKTab\"]/script/text()")));
    
    }

	

}
