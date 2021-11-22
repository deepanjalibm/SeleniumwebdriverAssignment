package pagefactoryPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PfShopingcartPage {

    @FindBy(id="checkout-link")
    private WebElement clickchkbutton;
//@FindBy(css = "btn btn-lg btn-success")
  //  private WebElement chkbtn;


    public PfShopingcartPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    public void ChkoutPage() throws InterruptedException{
        clickchkbutton.click();
        Thread.sleep(3000);

       // driver.findElement(By.id("checkout-link")).click();
    }
}