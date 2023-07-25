package signUppages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProfileDetailsPage extends BasePage{
    private By f_name= By.id("input_first_name");
    private By l_name=By.id("input_last_name");
    //private By phone_num=By.id("phone");
    private By phone_num=By.xpath("//body/div[1]/div[4]/form[1]/div[1]/div[2]/div[4]/div[2]/label[1]/input[1]");
    private By countine_btn=By.xpath("//button[@class='mdc-button mdc-button--touch mdc-button--raised to-personal-details-part-2 mdc-ripple-upgraded']");

    public ProfileDetailsPage(WebDriver driver) {
        super(driver);
    }

    public void setFirstname(String firstname) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(f_name));
       driver.findElement(f_name).sendKeys(firstname);
    }
    public void setLastname(String lasttname) {
        driver.findElement(l_name).sendKeys(lasttname);
    }
    public void setphone(String phone) {
        wait.until(ExpectedConditions.elementToBeClickable(phone_num));
        driver.findElement(phone_num).sendKeys(phone);
    }
    public ProfileGender clickoncontinue(){

        driver.findElement(countine_btn).click();
        return new ProfileGender(driver);
    }
}
