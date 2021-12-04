package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//pom take pages from Pages folder
public class TestAllWindow
{
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
    public void allitem() {

        LoginPageChk loginPage = new LoginPageChk();
        CategoryPageChk itemsselection = new CategoryPageChk();
        ProductPageChk addcart = new ProductPageChk();
       loginPage.loginpages(driver);
        itemsselection.itemsselection(driver);
        addcart.addcart(driver);


    }
}
