package signUppages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegisterPage extends BasePage{
    private By email=By.id("input_identifierValue");
    public By continue_btn=By.xpath("//button[@class='mdc-button mdc-button--touch mdc-button--raised access-btn']");
    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    public void enterEmail(String mail){
        wait.until(ExpectedConditions.visibilityOfElementLocated(email));
        driver.findElement(email).sendKeys(mail);
    }
    public CompleteRegPage clickonContinue(){
        driver.findElement(continue_btn).click();
        return new CompleteRegPage(driver);
    }
}
