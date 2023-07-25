package signUppages;

import cartPages.HomeAferLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessAfterRegPage extends BasePage{
    private By msg=By.xpath("//body[1]/div[1]/div[4]/form[1]/div[1]/div[1]/div[1]/h2[1]");

    public SuccessAfterRegPage(WebDriver driver) {
        super(driver);
    }
    public String getMsg(){
       return driver.findElement(msg).getText();
    }

}
