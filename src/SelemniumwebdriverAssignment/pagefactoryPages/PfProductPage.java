package pagefactoryPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class PfProductPage {
    @FindBy(css = "a[href=\"/t/bags\"]")
    private WebElement selectCategoryBag;
    //@FindBy(css = "span[title=\"Ruby on Rails Tote\"]")
    @FindBy(css = "span[title=\"Spree Tote\"]")
    private WebElement clickOnProductlink;
    @FindBy(id = "taxon")
    private WebElement linkElement;
    @FindBy(css = "input[value='Search']")
    private WebElement clickSearchButton;

    //@FindBy(css = "span[title=\"Ruby on Rails Tote\"]")
    //private WebElement clickOnProductName;
    @FindBy(id = "quantity")
    private WebElement qty;
    @FindBy(id = "add-to-cart-button")
    private WebElement addToCart;



    public PfProductPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void selectInCategory() {
        selectCategoryBag.click();
    }

    public void productlink() {
        clickOnProductlink.click();
    }

    /* public void productdropdown(){
         WebElement productdropdown = linkElement;
         Select select = new Select(productdropdown);
         select.selectByValue("1");
         clickSearchButton.click();
         //driver.findElement(By.cssSelector("input[value='Search']")).click();
        // clickOnProductName.click();
        // driver.findElement(By.cssSelector("span[title='Ruby on Rails Tote']")).click();

     }*/
    public void quantityclear() {
        qty.clear();
        qty.sendKeys("2");
    }

    public void cart()  throws InterruptedException{
        addToCart.click();
        Thread.sleep(3000);
        //driver.findElement(By.id("add-to-cart-button")).click();
       // driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }


}
