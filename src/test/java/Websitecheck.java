/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Websitecheck {

            public static void main(String[] args) throws InterruptedException {
                System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
                WebDriver driver = new ChromeDriver();
                driver.get("http://spree-vapasi-prod.herokuapp.com/login");



                driver.manage().window().maximize();
                driver.findElement(By.id("spree_user_email")).sendKeys("deepanjali@gmail.com");
                driver.findElement(By.id("spree_user_password")).sendKeys("12345678");
                driver.findElement(By.cssSelector("input[type='checkbox']")).click();
                driver.findElement(By.cssSelector("input[value='Login']")).click();
            }
            @Test
            public void itemsselection(WebDriver driver) {
                WebElement dropdownbox = driver.findElement(By.id("taxon"));
                Select select = new Select(dropdownbox);
                select.selectByVisibleText("Categories");
                driver.findElement(By.cssSelector("input[value='Search']")).click();
                driver.findElement(By.cssSelector("span[title='Ruby on Rails Tote']")).click();
            }
@Test
            public void addcart(WebDriver driver) {

                driver.findElement(By.id("add-to-cart-button")).click();
                driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                // String total = driver.findElement(By.cssSelector("td.lead.text-primary.cart-item-total")).getText();
                //System.out.println(total);

                //getText() to obtain text

                //Assert.assertEquals("$31.98", total);
                driver.findElement(By.id("checkout-link")).click();
            }
@Test
            public void RegistrationPage(WebDriver driver)
            { driver.findElement(By.id("order_email")).sendKeys("deepanjali@gmail.com");

                driver.findElement(By.cssSelector("[data-disable-with='Continue']")).click();

            }
            @Test
            public void Ccheckoutpage(WebDriver driver) {
                driver.findElement(By.id("order_bill_address_attributes_firstname")).sendKeys("Anjali");
                driver.findElement(By.id("order_bill_address_attributes_lastname")).sendKeys("BM");
                driver.findElement(By.id("order_bill_address_attributes_address1")).sendKeys("123,mega street");
                driver.findElement(By.id("order_bill_address_attributes_city")).sendKeys("Apex");

            }
            @Test
            public void stateselection(WebDriver driver) {
                WebElement stateselection = driver.findElement(By.id("address"));

                //WebElement stateselection = driver.findElement(By.id("order_bill_address_attributes_state_id");("North Carolina"));
                Select selectopt = new Select(stateselection);
                selectopt.selectByVisibleText("North Carolina");
                driver.findElement(By.id("order_bill_address_attributes_zipcode")).sendKeys("27519");
                selectopt.selectByVisibleText("North Carolina");
                driver.findElement(By.id("order_bill_address_attributes_phone")).sendKeys("9999999999");
                driver.findElement(By.cssSelector("[data-disable-with='Save and Continue']")).click();


            }
            @Test
            public void checkoutpage(WebDriver driver) {
                driver.findElement(By.id("order_shipments_attributes_0_selected_shipping_rate_id_1142")).click();
                driver.findElement(By.cssSelector("[data-disable-with='Save and Continue']")).click();

            }
            @Test
            public void paymentpage(WebDriver driver) {
                driver.findElement(By.id("order_payments_attributes__payment_method_id_3")).click();
                driver.findElement(By.cssSelector("[data-disable-with='Save and Continue']")).click();
            }
           @AfterMethod
    public void AfterMethod()
    {

        driver.close();
    }
            @Test
            public void orderpage(WebDriver driver){
                String ordermsg = driver.findElement(By.cssSelector("Your order has been processed successfully")).getText();
                System.out.println(ordermsg);

            }

        }
*/

