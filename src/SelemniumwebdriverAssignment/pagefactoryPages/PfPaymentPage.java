package pagefactoryPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PfPaymentPage {
    @FindBy(id = "order_payments_attributes__payment_method_id_3")
    private WebElement paymentbycheck;
    @FindBy(css ="[data-disable-with='Save and Continue']" )
    private WebElement clickonsavecontinuebutton;

    public  PfPaymentPage(WebDriver driver){

        PageFactory.initElements(driver,this);
    }
    public void paymentpage(  ) {

        paymentbycheck.click();
        clickonsavecontinuebutton.click();
        //WebElement radiobutton = driver.findElement(By.xpath("//input[@id='order_payments_attributes__payment_method_id_3']"));
        //radiobutton.click();
        //driver.findElement(By.cssSelector("[data-disable-with='Save and Continue']")).click();
}
}