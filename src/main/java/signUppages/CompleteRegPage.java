package signUppages;

import cartPages.HomeAferLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class CompleteRegPage extends BasePage{

    private By pass=By.xpath("//input[@name='password']  ");
    private By confirmpass=By.xpath("//input[@class=\"mdc-text-field__input confirm-password-input\"]");
    //private By countine_btn=By.xpath("//span[@class='mdc-button__touch']");
    private By countine_btn=By.xpath("//body/div[1]/div[4]/form[1]/div[1]/div[1]/div[5]/div[1]/button[1]/span[3]");
    private By login_pass=By.xpath("//input[@name='password']");
    private By loginBtn=By.xpath("//body/div[1]/div[4]/form[1]/div[1]/div[4]/div[2]/button[1]/span[3]");

    public CompleteRegPage(WebDriver driver) {
        super(driver);
    }
    public void enterPass(String password){
        wait.until(ExpectedConditions.visibilityOfElementLocated(pass));
        driver.findElement(pass).sendKeys(password);
    }
    public void enterConfirnPass(String pass){
        driver.findElement(confirmpass).sendKeys(pass);

    }
    public ProfileDetailsPage clickoncontinue() throws InterruptedException {
       Thread.sleep(2000);
        driver.findElement(countine_btn).click();
        return new ProfileDetailsPage(driver);
    }
    public void enterLoginPass(String pass){
        driver.findElement(login_pass).sendKeys(pass);
    }
    public HomeAferLogin login(){
        driver.findElement(loginBtn).click();
        return new HomeAferLogin(driver);
    }

}
