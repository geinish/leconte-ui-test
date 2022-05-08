package cases;

import cases.ConfProperties;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;



public class MainPageTest {
    public static pages.MainPage mainPage;
    public static WebDriver driver;

    @BeforeClass
    //driver
    //implicit wait = 10 sec.
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void navigationTest() {
        mainPage.navigationFormClick();
        Assert.assertEquals("1","1");
    }
}