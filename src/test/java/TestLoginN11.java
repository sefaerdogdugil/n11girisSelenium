import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class TestLoginN11 extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;

    @Test
    @Order(1)
    public void click_MainpageLogin() {
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        homePage.clickLogin();
    }

    @Test
    @Order(2)
    public void scroll_Down() {
        loginPage = new LoginPage(driver);
        loginPage.scrollPageDown(2);
    }

    @Test
    @Order(3)
    public void type_MailAddress() {
        loginPage = new LoginPage(driver);
        loginPage.typeMailAddress();
    }

    @Test
    @Order(4)
    public void type_Password() {
        loginPage = new LoginPage(driver);
        loginPage.typePassword();
    }
    @Test
    @Order(5)
    public void click_login(){
        loginPage = new LoginPage(driver);
        loginPage.clickLogin();
    }
}
