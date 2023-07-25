package cartPages;

import cartPages.CartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import signUppages.BasePage;

import java.util.concurrent.TimeUnit;

public class ItemDetailsPage extends BasePage {
    private By cart= By.xpath("//button[@class='add btn _prim -pea _i -fw']");
    private By increaseBtn=By.xpath("//button[@value='in']");
    private By viewcart=By.xpath("//a[contains(text(),'View Cart and Checkout')]");
    private By icrease=By.xpath("//body/div[@id='jm']/main[1]/div[1]/section[1]/div[1]/div[2]/div[3]/div[3]/div[1]/button[2]");
    public ItemDetailsPage(WebDriver driver) {
        super(driver);
    }
    public void addItemToCart() {
        //Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        try {
            driver.findElement(cart).click();
        }catch (Exception e){
            driver.findElement(icrease).click();
        }

    }
    public void icreasetheitem() {
        wait.until(ExpectedConditions.elementToBeClickable(increaseBtn));
        driver.findElement(increaseBtn).click();
    }
    public CartPage viewCart() throws InterruptedException {
        Thread.sleep(3000);
       // driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(viewcart));
        driver.findElement(viewcart).click();
        return new CartPage(driver);
    }
}
