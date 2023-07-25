package tests;

import cartPages.HomeAferLogin;
import org.testng.Assert;
import org.testng.annotations.Test;
import signUppages.*;

public class RegisterTest extends BaseTest{
    RegisterPage reg;
    CompleteRegPage sign;
    ProfileDetailsPage profile;
    ProfileGender gender;
    SuccessAfterRegPage success;
    HomeAferLogin login_home;
    String mail="test"+Math.random()+"@gmail.com";
    String pass="12345678_Qwertyuio";
    String f_name="Shrouk";
    String l_name="Hussein";
    String phone="01005897458";

    @Test
    public void Testregisteration() throws InterruptedException {
        home.clickonaccount();
        reg=home.clickonSignIn();
        reg.enterEmail(mail);
        sign=reg.clickonContinue();
        sign.enterPass(pass);
        sign.enterConfirnPass(pass);
        profile=sign.clickoncontinue();
        profile.setFirstname(f_name);
        profile.setLastname(l_name);
        profile.setphone(phone);
        gender=profile.clickoncontinue();
        gender.clickOnDropdown();
        gender.choosegender();
        gender.openCalender();
        gender.acceptTerms();
        success=gender.clickOnCountinue();
        Assert.assertEquals(success.getMsg(),f_name+", Your account has been created!");


    }
}
