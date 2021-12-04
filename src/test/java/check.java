import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


    import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;
//import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.mustache.Value;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.Assert.assertEquals;

public class check {

        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("http://spree-vapasi-prod.herokuapp.com/login");
            driver.manage().window().maximize();

            //Login Page
            driver.findElement(By.id("spree_user_email")).sendKeys("deepanjali@gmail.com");
            driver.findElement(By.id("spree_user_password")).sendKeys("12345678");
            driver.findElement(By.cssSelector("input[type='checkbox']")).click();
            driver.findElement(By.cssSelector("input[value='Login']")).click();

            //Productpage
            WebElement dropdownbox = driver.findElement(By.id("taxon"));
            Select select = new Select(dropdownbox);
            select.selectByVisibleText("Categories");
            driver.findElement(By.cssSelector("input[value='Search']")).click();
            driver.findElement(By.cssSelector("span[title='Ruby on Rails Tote']")).click();
            driver.findElement(By.id("add-to-cart-button")).click();
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            // String total = driver.findElement(By.cssSelector("td.lead.text-primary.cart-item-total")).getText();
            //System.out.println(total);

            //getText() to obtain text

            //Assert.assertEquals("$31.98", total);

            //checkout Page
            driver.findElement(By.id("checkout-link")).click();

       // driver.findElement(By.id("order_email")).sendKeys("deepanjali@gmail.com");
/*
            driver.findElement(By.id("order_bill_address_attributes_firstname")).sendKeys("Anjali");
            driver.findElement(By.id("order_bill_address_attributes_lastname")).sendKeys("BM");
            driver.findElement(By.id("order_bill_address_attributes_address1")).sendKeys("123,mega street");
            driver.findElement(By.id("order_bill_address_attributes_city")).sendKeys("Apex");
//from findelement prog
           // WebElement dropdownbox = driver.findElement(By.id("taxon"));
            //Select select = new Select(dropdownbox);
            //select.selectByVisibleText("Categories");
            //driver.findElement(By.cssSelector("input[value='Search']")).click();

            //driver.findElement(By.cssSelector("[data-disable-with='Continue']")).click();

            WebElement stateselection = driver.findElement(By.id("order_bill_address_attributes_state_id"));
            Select selectopt = new Select(stateselection);
            selectopt.selectByVisibleText("North Carolina");
            driver.findElement(By.id("order_bill_address_attributes_zipcode")).sendKeys("27519");
WebElement countryselection = driver.findElement(By.id("order_bill_address_attributes_country_id"));
Select countrysel = new Select(countryselection);
            countrysel.selectByVisibleText("United States of America");

            driver.findElement(By.id("order_bill_address_attributes_phone")).sendKeys("9999999999");*/
          // driver.findElement(By.id("save_user_address")).;
            driver.findElement(By.cssSelector("[data-disable-with='Save and Continue']")).click();


           // driver.findElement(By.id("order_shipments_attributes_0_selected_shipping_rate_id_1142")).click();
            driver.findElement(By.cssSelector("[data-disable-with='Save and Continue']")).click();

            // Orderconfirmation Page
            WebElement radiobutton = driver.findElement(By.xpath("//input[@id='order_payments_attributes__payment_method_id_3']"));
            radiobutton.click();
            driver.findElement(By.cssSelector("[data-disable-with='Save and Continue']")).click();


            //WebDriverWait wait = new WebDriverWait(driver,30);
           // WebElement commit = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("commit")));

           // String orderconfirmationMessage = driver.findElement(By.cssSelector("div.alert alert-notice")).getText();
            //Assert.assertEquals(orderconfirmationMessage, "Your order has been processed successfully");

           /* String ActualrderconfirmationMessage = driver.findElement(By.cssSelector("div.alert alert-notice"));
            String ExpectedTrderconfirmationMessage = "Your order has been processed successfully";
            Assert.assertEquals(ExpectedTrderconfirmationMessage, ActualrderconfirmationMessage);

            // System.out.println(orderconfirmationMessage);*/

            driver.close();

        }

    }




