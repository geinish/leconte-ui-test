package cases;

import cases.pages.MainPage;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class MainPageNavigationTest {
    public static cases.pages.MainPage mainPage;
    public static WebDriver driver;

    @BeforeClass
    //driver
    //implicit wait = 10 sec.
    public static void setup() {
        System.setProperty("webdriver.chromedriver.driver", ConfProperties.getProperty("chromedriver"));
        WebDriver driver = new ChromeDriver();
        mainPage = new MainPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("link"));
    }

    @AfterClass
    public static void quit() {
        mainPage.driver.quit();
    }

    @Test
    public void shouldBeSpolupraceNavigation() {
        mainPage.navigationSpolupraceClick();
        Assert.assertEquals("When User click SPOLUPRÁCE S NÁMI Then User see the section Spoluprace", "NÁBOR PRACOVNÍKŮ NEBYL NIKDY SNAZŠÍ", mainPage.getSectionSpolupraceText());
        Assert.assertEquals("When User click SPOLUPRÁCE S NÁMI Then User redirected to #spoluprace","https://www.leconte.cz/#spoluprace", mainPage.driver.getCurrentUrl());
    }

    @Test
    public void shouldBeSFormNavigation() {
        mainPage.navigationFormClick();
        Assert.assertEquals("When User click KONTAKT Then User see the form for messaging", "KONTAKTUJTE NÁS", mainPage.getSectionFormText());
        Assert.assertEquals("When User click KONTAKT Then User redirected to #form", "https://www.leconte.cz/#form", mainPage.driver.getCurrentUrl());
    }

    @Test
    public void shouldBeSSluzbyNavigation() {
        mainPage.navigationSluzbyClick();
        Assert.assertEquals("When User click O NÁS Then User see the section sluzby", "NAŠE SLUŽBY", mainPage.getSectionSluzbyText());
        Assert.assertEquals("When User click O NÁS Then User redirected to #sluzby", "https://www.leconte.cz/#sluzby", mainPage.driver.getCurrentUrl());
    }
}