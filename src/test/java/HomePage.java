import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    By clickLoginLocator = By.cssSelector("a.btnSignIn");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickLogin() {
        click(clickLoginLocator);
    }


}

