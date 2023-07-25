package cartPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import signUppages.BasePage;

public class ItemsPage extends BasePage {
    private By first_item= By.xpath("//body/div[@id='jm']/main[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[6]/article[1]/a[1]/img[1]");
    public ItemsPage(WebDriver driver) {
        super(driver);
    }
    public ItemDetailsPage selectfirstItem(){
        driver.findElement(first_item).click();
        return new ItemDetailsPage(driver);
    }
}
