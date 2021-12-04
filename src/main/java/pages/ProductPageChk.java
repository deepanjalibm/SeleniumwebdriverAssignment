package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class ProductPageChk {
    public void addcart(WebDriver driver) {

        driver.findElement(By.id("add-to-cart-button")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        String total = driver.findElement(By.cssSelector("td.lead.text-primary.cart-item-total")).getText();
        System.out.println(total);

        Assert.assertEquals("$31.98", total);


    }
}
