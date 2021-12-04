package pagefactoryPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PfOrderConfirmationPage {
    @FindBy(css = "div[class='alert alert-notice']")
private WebElement confirmationMessage;

    public  PfOrderConfirmationPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
public void checkMessage(){
    String expectedOrderConfirmationMessage ="Your order has been processed successfully";
    String actualOrderConfirmationMessage =confirmationMessage.getText();
    Assert.assertEquals(actualOrderConfirmationMessage,expectedOrderConfirmationMessage,
            "Order confirmation message didn't matched");

    System.out.println("Order confirmation message matched");
}
}
