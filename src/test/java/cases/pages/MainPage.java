package cases.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public WebDriver driver;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /*
     * Navigation button locators
     */
    @FindBy(xpath = "//*[@id=\"navbar\"]/div/nav/a[1]") //TODO name and text location
    private WebElement navigationSluzby;
    @FindBy(xpath = "//*[@id=\"navbar\"]/div/nav/a[2]") //TODO name and text location
    private WebElement navigationSpoluprace;
    @FindBy(xpath = "//*[@id=\"navbar\"]/div/nav/a[3]") //TODO name and text location
    private WebElement navigationForm;

    /*
     * Sections locators
     */
    @FindBy(xpath = "//*[@id=\"sluzby\"]/div[1]/h2[1]")
    private WebElement sectionSluzby;
    @FindBy(xpath = "//*[@id=\"spoluprace\"]/div[1]/h2[1]/strong")
    private WebElement sectionSpoluprace;
    @FindBy(xpath = "//*[@id=\"form\"]/div[1]/h2/strong")
    private WebElement sectionForm;

    /*
     * Form send message locators
     */
    @FindBy(xpath = "//*[@id=\"name\"]")
    private WebElement formName;
    @FindBy(xpath = "//*[@id=\"Email\"]")
    private WebElement formEmail;
    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement formPhone;
    @FindBy(xpath = "//*[@id=\"field\"]")
    private WebElement formMessage;
    @FindBy(xpath = "//*[@id=\"wf-form-Contact-form\"]/div[2]/input")
    private WebElement buttonSend;

    public void navigationSluzbyClick() {
        navigationSluzby.click();
    }

    public void navigationSpolupraceClick() {
        navigationSpoluprace.click();
    }

    public void navigationFormClick() {
        navigationForm.click();
    }

    public String getSectionSluzbyText() {
        return sectionSluzby.getText();
    }

    public String getSectionSpolupraceText() {
        return sectionSpoluprace.getText();
    }

    public String getSectionFormText() {
        return sectionForm.getText();
    }

    public void sendMessage(String name, String email, String phone, String message) {
        formName.sendKeys(name);
        formEmail.sendKeys(email);
        formPhone.sendKeys(phone);
        formMessage.sendKeys(message);

        buttonSend.click();
    }
}
