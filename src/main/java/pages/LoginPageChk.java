package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageChk {
    public void loginpages(WebDriver driver) {

        driver.findElement(By.id("spree_user_email")).sendKeys("spree@spree.com");
        driver.findElement(By.id("spree_user_password")).sendKeys("22222222");
        driver.findElement(By.cssSelector("input[type='checkbox']")).click();
        driver.findElement(By.cssSelector("input[value='Login']")).click();
    }
}
