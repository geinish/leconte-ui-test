package cases;

import cases.pages.MainPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import junitparams.FileParameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;


@RunWith(JUnitParamsRunner.class)
public class MainPageMessageTest {
    public static cases.pages.MainPage mainPage;
    public static WebDriver driver;

    @Before
    //driver
    //implicit wait = 10 sec.
    public void setup() {
        System.setProperty("webdriver.chromedriver.driver", ConfProperties.getProperty("chromedriver"));
        WebDriver driver = new ChromeDriver();
        mainPage = new MainPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("link"));
    }

    @After
    public void quit() {
        mainPage.driver.quit();
    }

    @Test
    @FileParameters("src/test/resources/messages.csv")
    public void sendingMessage(String name, String email, String phone, String message, String expectedResult, String caseName){
        mainPage.sendMessage(name, email, phone, message);
        //Assert.assertEquals("https://formspree.io/thanks?language=en", mainPage.driver.getCurrentUrl());
        if (expectedResult.equals("Success")) {
            Assert.assertTrue("Case: " + caseName + "Expected result: " + expectedResult, mainPage.driver.getPageSource().contains("The form was submitted successfully."));
        }
        else {
            Assert.assertTrue("Case: " + caseName + "Expected result: " + expectedResult, !mainPage.driver.getPageSource().contains("The form was submitted successfully."));
        }

    }
}
