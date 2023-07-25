package cartPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import signUppages.BasePage;

public class LoginPage extends BasePage {
    private By login_pass=By.xpath("//input[@name='password']");
    private By loginBtn=By.xpath("//body/div[1]/div[4]/form[1]/div[1]/div[4]/div[2]/button[1]/span[3]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void enterLoginPass(String pass){
        driver.findElement(login_pass).sendKeys(pass);
    }
    public void login(){
        driver.findElement(loginBtn).click();
    }
}
