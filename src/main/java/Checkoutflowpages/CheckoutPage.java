package Checkoutflowpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    public void ChkoutPage(WebDriver driver){
        driver.findElement(By.id("checkout-link")).click();

        // driver.findElement(By.id("order_email")).sendKeys("deepanjali@gmail.com");
/*
            driver.findElement(By.id("order_bill_address_attributes_firstname")).sendKeys("Anjali");
            driver.findElement(By.id("order_bill_address_attributes_lastname")).sendKeys("BM");
            driver.findElement(By.id("order_bill_address_attributes_address1")).sendKeys("123,mega street");
            driver.findElement(By.id("order_bill_address_attributes_city")).sendKeys("Apex");
            WebElement stateselection = driver.findElement(By.id("order_bill_address_attributes_state_id"));
            Select selectopt = new Select(stateselection);
            selectopt.selectByVisibleText("North Carolina");
            driver.findElement(By.id("order_bill_address_attributes_zipcode")).sendKeys("27519");
WebElement countryselection = driver.findElement(By.id("order_bill_address_attributes_country_id"));
Select countrysel = new Select(countryselection);
            countrysel.selectByVisibleText("United States of America");

            driver.findElement(By.id("order_bill_address_attributes_phone")).sendKeys("9999999999");*/

        driver.findElement(By.cssSelector("[data-disable-with='Save and Continue']")).click();
        // driver.findElement(By.id("order_shipments_attributes_0_selected_shipping_rate_id_1142")).click();
        driver.findElement(By.cssSelector("[data-disable-with='Save and Continue']")).click();


    }
}
