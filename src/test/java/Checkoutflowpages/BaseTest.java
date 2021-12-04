package Checkoutflowpages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public WebDriver driver;
    @BeforeMethod
    public void loginPage() {

        System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://spree-vapasi-prod.herokuapp.com/login");
        driver.manage().window().maximize();
    }



    @AfterMethod
    public void AfterMethod()
    {

        driver.close();
    }
    //@Test
    public void allwebpages() {
        LoginWebPage loginPage = new LoginWebPage();
        ProductWebPage product = new ProductWebPage();
        OrderwebPage orddr = new OrderwebPage();
        CheckoutPage chkord = new CheckoutPage();
        loginPage.Loginpg(driver);
        product.Cart(driver);
        orddr.Orderpage(driver);
        chkord.ChkoutPage(driver);

    }
    }
