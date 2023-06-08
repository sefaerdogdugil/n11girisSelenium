import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

   By clickMailAddressLocator = By.id("email");
   By clickPasswordLocator = By.id("password");
   By loginLocator = By.id("loginButton");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void typeMailAddress() {
        find(clickMailAddressLocator).click();
        type(clickMailAddressLocator, "MAIL HERE ...@....com");
    }

    public void typePassword() {
        find(clickPasswordLocator).click();
        type(clickPasswordLocator, "PASSWORD HERE");
    }

    public void scrollPageDown(int count) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 0; i < count; i++) {
            js.executeScript("window.scrollBy(0, 250)");
        }
    }

    public void clickLogin() {
        find(loginLocator).click();
    }
}
