package signUppages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    Duration duration= Duration.ofSeconds(60);
    protected WebDriverWait wait ;
    public BasePage(WebDriver driver) {
        this.driver=driver;
        this.wait=new WebDriverWait(driver,duration);
    }
}
