package tests;

import cartPages.CartPage;
import cartPages.HomeAferLogin;
import cartPages.ItemDetailsPage;
import cartPages.ItemsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import signUppages.*;

public class CartTest extends BaseTest{
    RegisterPage reg;
    CompleteRegPage sign;
    HomeAferLogin login_home;
    ItemsPage item;
    CartPage cart;
    ItemDetailsPage itemDetail;
    @Test
    public void testCart() throws InterruptedException {
        home.clickonaccount();
        reg=home.clickonSignIn();
        reg.enterEmail("test700@gmail.com");
        sign=reg.clickonContinue();
        sign.enterLoginPass("12345678_Qwertyuio");
        login_home=sign.login();
        login_home.hoveronFashion();
        item=login_home.chooseShirt();
        itemDetail=item.selectfirstItem();
        itemDetail.addItemToCart();
        itemDetail.icreasetheitem();
        itemDetail.icreasetheitem();
        cart=itemDetail.viewCart();
        cart.icreaseItemInCart();
        Assert.assertEquals(cart.getSuccessMsg(),"Product added successfully");
        Assert.assertEquals(cart.getsubtotal(),cart.calculateThePrice());
    }
}
