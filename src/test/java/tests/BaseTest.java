package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import signUppages.HomePage;

public class BaseTest {
    WebDriver driver;
    HomePage home;
    @BeforeTest
    public void opendriver(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.jumia.com.eg/");
        home=new HomePage(driver);
        home.closeadvertisement();
    }
   @AfterTest
     public void closedriver(){
        driver.close();
    }
}
