package cartPages;

import cartPages.ItemsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import signUppages.BasePage;

public class HomeAferLogin extends BasePage {
    Actions action = new Actions(driver);
    //private By shirt=By.xpath("//a[contains(text(),'Shirts')]");
    WebElement fashion= driver.findElement(By.xpath("//span[contains(text(),'Fashion')]"));
    WebElement shirt=driver.findElement(By.xpath("//a[contains(text(),'Shirts')]"));
    public HomeAferLogin(WebDriver driver) {
        super(driver);
    }
    public void hoveronFashion(){
        wait.until(ExpectedConditions.visibilityOf(fashion));
        action.moveToElement(fashion).perform();
    }
    public ItemsPage chooseShirt(){
        wait.until(ExpectedConditions.visibilityOf(shirt));
        action.moveToElement(shirt).perform();
        action.click(shirt).perform();
        return new ItemsPage(driver);

    }
}
