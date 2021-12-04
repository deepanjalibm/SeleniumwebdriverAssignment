package Checkoutflowpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class OrderwebPage
{
    public void Orderpage(WebDriver driver) {
        WebElement radiobutton = driver.findElement(By.xpath("//input[@id='order_payments_attributes__payment_method_id_3']"));
        radiobutton.click();
        driver.findElement(By.cssSelector("[data-disable-with='Save and Continue']")).click();
        //WebDriverWait wait = new WebDriverWait(driver,30);
        // WebElement commit = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("commit")));

        String orderconfirmationMessage = driver.findElement(By.cssSelector("div[class='alert alert-notice']")).getText();
        Assert.assertEquals(orderconfirmationMessage, "Your order has been processed successfully");

            System.out.println("Order confirmation message matched");

    }
}




