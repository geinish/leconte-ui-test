package cases;

import org.junit.Assert;
import org.junit.Test;

public class MainPageNavigationTest extends TestMainPageBase{
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