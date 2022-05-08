package cases;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class MainPageTest {
    public static cases.pages.MainPage mainPage;
    public static WebDriver driver;

    @BeforeClass
    //driver
    //implicit wait = 10 sec.
    public static void setup() {
        System.setProperty("webdriver.chromedriver.driver", ConfProperties.getProperty("chromedriver"));
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("link"));
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    @Test
    public void navigationTest() {
        mainPage.navigationFormClick();
        Assert.assertEquals("1", "1");
    }

}

