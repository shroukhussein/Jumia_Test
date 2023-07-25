package signUppages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProfileGender extends BasePage{
    private By gender=By.xpath("//body/div[1]/div[4]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]");
    private By choossemale=By.xpath("//li[@data-value='M']");
    private  By calender=By.xpath("//input[@id='input_birth_date']");
    private By accept_terms=By.xpath("//input[@id='acceptTC']");
    private By countinue_btn=By.xpath("//body/div[1]/div[4]/form[1]/div[1]/div[3]/div[1]/div[3]/div[2]/button[1]/span[3]");
    public ProfileGender(WebDriver driver) {
        super(driver);
    }
    public void clickOnDropdown(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(gender));
        driver.findElement(gender).click();
    }
    public void choosegender(){
        driver.findElement(choossemale).click();

    }
    public void openCalender(){
        driver.findElement(calender).sendKeys("07052005");
    }
    public void acceptTerms(){
        driver.findElement(accept_terms).click();
    }
    public SuccessAfterRegPage clickOnCountinue(){
        wait.until(ExpectedConditions.elementToBeClickable(countinue_btn));
        driver.findElement(countinue_btn).click();
        return new SuccessAfterRegPage(driver);
    }
}
