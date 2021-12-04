package Checkoutflowpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class ProductWebPage
{
    public void Cart(WebDriver driver){
        WebElement dropdownbox = driver.findElement(By.id("taxon"));
        Select select = new Select(dropdownbox);
        select.selectByVisibleText("Categories");
        driver.findElement(By.cssSelector("input[value='Search']")).click();
        driver.findElement(By.cssSelector("span[title='Ruby on Rails Tote']")).click();
        driver.findElement(By.id("add-to-cart-button")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
}
