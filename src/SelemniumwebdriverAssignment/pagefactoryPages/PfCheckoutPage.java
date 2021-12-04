package pagefactoryPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PfCheckoutPage {

    @FindBy(id = "id='order_email'")
    private WebElement emailAddress;
    @FindBy(id = "order_bill_address_attributes_firstname")
    private WebElement firstName;
    @FindBy(id = "order_bill_address_attributes_lastname")
    private WebElement lastName;
    @FindBy(id = "order_bill_address_attributes_address1")
    private WebElement addressOne;
    @FindBy(id = "order_bill_address_attributes_city")
    private WebElement city;
    @FindBy(id = "order_bill_address_attributes_state_id")
    private WebElement dropDownState;
    @FindBy(id = "order_bill_address_attributes_zipcode")
    private WebElement zipcode;
    @FindBy(id = "order_bill_address_attributes_country_id")
    private WebElement dropDownCountry;
    @FindBy(id = "order_bill_address_attributes_phone")
    private WebElement phone;
    @FindBy(css = "input[value='Save and Continue']")
    private WebElement saveNContinueButton;
    @FindBy(id = "order_bill_address_id_298")
    private WebElement shippingAddressradiobuttonselected;
    @FindBy(css = "[data-disable-with='Save and Continue']")
    private WebElement savecontinuebutton;
    @FindBy(id = "save_user_address")
    private WebElement saveMyAddressCheckboxChecked;
    @FindBy(css = "[data-disable-with='Save and Continue']")
    private WebElement deliverytabsavencontinue;

    //@FindBy( id="order_shipments_attributes_-10_selected_shipping_rate_id_1382")
    @FindBy(id = "order_shipments_attributes_-10_selected_shipping_rate_id_1552")
    private WebElement UPSOneDayradiobutton;
    @FindBy(css = "input[name='commit']")
    private WebElement billingadressySaveButton;

    public PfCheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void fillAddress() {
        firstName.sendKeys("Anjali");
        lastName.sendKeys("BM");
        addressOne.sendKeys("123,mega street");
        city.sendKeys("Apex");
        WebElement dropdownState = dropDownState;
        Select selectState = new Select(dropdownState);
        selectState.selectByVisibleText("North Carolina");
        zipcode.sendKeys("27519");

        WebElement Country = dropDownCountry;
        Select selectcountry = new Select(dropDownCountry);
        selectcountry.selectByVisibleText("United States of America");
        phone.sendKeys("9999999999");
        saveNContinueButton.click();
        //shippingAddressradiobuttonselected.click();
    }

    public void billaddresssave() throws InterruptedException {
        savecontinuebutton.click();
        Thread.sleep(3000);
    }

    public void billadd2() throws InterruptedException {
        billingadressySaveButton.click();
        Thread.sleep(3000);
    }

    public void deliveryTab() throws InterruptedException{

        deliverytabsavencontinue.click();
        Thread.sleep(3000);
    }
}