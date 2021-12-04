package Checkoutflowpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginWebPage {
    public void Loginpg (WebDriver driver){
        driver.findElement(By.id("spree_user_email")).sendKeys("tom@gmail.com");
        driver.findElement(By.id("spree_user_password")).sendKeys("55555555");
        driver.findElement(By.cssSelector("input[type='checkbox']")).click();
        driver.findElement(By.cssSelector("input[value='Login']")).click();
    }
}
