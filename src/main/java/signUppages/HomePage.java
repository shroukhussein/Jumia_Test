package signUppages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    private By close_adv=By.xpath("//button[@aria-label='newsletter_popup_close-cta']");
    private By account=By.xpath("//label[@for='dpdw-login']");
    private By signIn=By.xpath("//a[@class='btn _prim -fw _md']");

    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void closeadvertisement(){
        driver.findElement(close_adv).click();
    }
    public void clickonaccount(){
        driver.findElement(account).click();
    }
    public RegisterPage clickonSignIn(){
        driver.findElement(signIn).click();
        return new RegisterPage(driver);
    }
}
