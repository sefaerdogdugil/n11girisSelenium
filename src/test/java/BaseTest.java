import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll; // Make sure to import the correct AfterAll
import org.junit.jupiter.api.BeforeAll; // Ensure you're importing the correct BeforeAll
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BaseTest {
  WebDriver driver;

  @BeforeAll
  public void setUp() {
    WebDriverManager.chromedriver().setup(); // Setup ChromeDriver
    driver = new ChromeDriver(); // Initialize the ChromeDriver
    driver.get("https://www.n11.com/"); // Open the website
    driver.manage().window().maximize(); // Maximize the browser window
  }

  @AfterAll // Ensure the teardown method is uncommented and properly defined
  public void tearDown() {
    if (driver != null) {
      driver.quit(); // Close the browser and cleanup
    }
  }
}
