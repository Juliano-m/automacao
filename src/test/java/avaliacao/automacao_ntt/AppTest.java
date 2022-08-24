package avaliacao.automacao_ntt;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {

    @Test
    public void abreEndereco() {
    	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
    	WebDriver browser = new ChromeDriver();
    	browser.navigate().to("https://demo.automationtesting.in/Alerts.html");
    	
      
    }

}
