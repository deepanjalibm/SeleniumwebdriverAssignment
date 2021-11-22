package pagefactoryPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PFLoginPage {
    @FindBy(linkText = "Login")
    private WebElement login;
    @FindBy(id = "spree_user_email")
    private WebElement emailText;
    @FindBy(name = "spree_user[password]")
    private WebElement passwordText;
    @FindBy(css = "input[type='checkbox']")
    private WebElement rememberMeCheckBox;
    @FindBy(css = "[value='Login']")
    private WebElement clickLoginButton;

    public PFLoginPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }
        public void Loginpg (String email, String password){
            emailText.sendKeys("sam@sam.com");
            passwordText.sendKeys("33333333");
            rememberMeCheckBox.click();
            clickLoginButton.click();
        }
    }


