package cartPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import signUppages.BasePage;

import java.util.concurrent.TimeUnit;

public class CartPage extends BasePage {
    double count;
    double priceOfItems;
    double itemssubtotal;
    private By increaseBtn=By.xpath("//button[@value='in']");
    private By successMsg=By.cssSelector("body:nth-child(2) div:nth-child(2) aside.noti:nth-child(1) > div.msg._success");
    private By orginalPrice=By.xpath("//div[@class='old']");
    private By itemcount=By.xpath("//span[@class='-w-32 -mas -m -fs14 -tac -lh-1']");
    private By priceofItem=By.xpath("//body/div[@id='jm']/main[1]/div[1]/div[1]/article[1]/article[1]/a[1]/div[3]/div[1]");
    private By subtotal=By.xpath("//p[@class='-fs20 -plm -tar']");
    public CartPage(WebDriver driver) {
        super(driver);
    }
    public void icreaseItemInCart() {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(increaseBtn));
        driver.findElement(increaseBtn).click();
        //Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public String getSuccessMsg(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(successMsg));
        return driver.findElement(successMsg).getText();
    }
    public double getCountOfItem(){
        String itemscount=driver.findElement(itemcount).getText();
        count=Double.parseDouble(itemscount);
        return count;
    }
    public double getPriceOfItem(){
        String input= driver.findElement(priceofItem).getText();
        String numericString = input.replaceAll("[^\\d.]", "");
        priceOfItems = Double.parseDouble(numericString);
        return priceOfItems;
    }
    public double getsubtotal(){
        String input= driver.findElement(subtotal).getText();
        String numericString = input.replaceAll("[^\\d.]", "");
        itemssubtotal = Double.parseDouble(numericString);
        return itemssubtotal;
    }
    public double calculateThePrice(){
        double total=getPriceOfItem()*getCountOfItem();
        return total;
    }


}
