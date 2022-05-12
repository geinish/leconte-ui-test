package cases;

import cases.pages.MainPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;


public class TestMainPageBase {
    public static cases.pages.MainPage mainPage;

    @Before
    public void setup() {
        System.setProperty("webdriver.chromedriver.driver", ConfProperties.getPropertyChromeDriver());
        WebDriver driver = new ChromeDriver();
        mainPage = new MainPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(ConfProperties.getPropertyMainPageLink());
    }

    @After
    public void quit() {
        mainPage.driver.quit();
    }
}
