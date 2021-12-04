/*
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class SpreeTestWebsite {
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
    public void category() {

        driver.findElement(By.id("spree_user_email")).sendKeys("spree@spree.com");
        driver.findElement(By.id("spree_user_password")).sendKeys("22222222");
        driver.findElement(By.cssSelector("input[type='checkbox']")).click();
        driver.findElement(By.cssSelector("input[value='Login']")).click();

    }
@Test
        public void itemsselection() {
            WebElement dropdownbox = driver.findElement(By.id("taxon"));
            Select select = new Select(dropdownbox);
            select.selectByVisibleText("Categories");
            driver.findElement(By.cssSelector("input[value='Search']")).click();
            driver.findElement(By.cssSelector("span[title='Ruby on Rails Tote']")).click();
            driver.findElement(By.id("quantity")).clear();
            driver.findElement(By.id("quantity")).sendKeys("2");
            driver.findElement(By.id("add-to-cart-button")).click();
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            // driver.findElement(By.name("lead")).getText();
            String total = driver.findElement(By.cssSelector("td.lead.text-primary.cart-item-total")).getText();
            System.out.println(total);
            //WebElement totaltext = driver.findElement((By.cssSelector("td.lead.text-primary.cart-item-total")).getText();
            //getText() to obtain text
            //String s = totaltext.getText();
            Assert.assertEquals("$31.98", total);

        }
    }*/

