package pagefactoryPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckoutflowPf {
    public WebDriver driver;
    @BeforeMethod
    public void loginPage() {

        System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://spree-vapasi-prod.herokuapp.com/login");
        driver.manage().window().maximize();
    }
   @AfterMethod
    public void AfterMethod()
    {

        driver.close();
    }
    @Test
    public void checkoutflow() throws InterruptedException {

        PFLoginPage  loginpg = new PFLoginPage(driver);
        PfProductPage productsel = new PfProductPage(driver);
        PfShopingcartPage shopingcheck = new PfShopingcartPage(driver);
        PfCheckoutPage checkout = new PfCheckoutPage(driver);
        PfPaymentPage payment = new PfPaymentPage(driver);
        PfOrderConfirmationPage confirmationPage = new PfOrderConfirmationPage (driver);

loginpg.Loginpg("email","password");
        productsel.selectInCategory();
                productsel.productlink();
       // productsel.quantityclear();
        productsel.cart();
        shopingcheck.ChkoutPage();
       //checkout.fillAddress();
      // checkout.billadd2();
       checkout.billaddresssave();
       checkout.deliveryTab();
        payment.paymentpage();
        confirmationPage.checkMessage();

    }
}


