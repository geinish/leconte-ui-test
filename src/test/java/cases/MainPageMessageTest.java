package cases;

import org.junit.Assert;
import org.junit.Test;
import junitparams.FileParameters;
import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;


@RunWith(JUnitParamsRunner.class)
public class MainPageMessageTest extends TestMainPageBase{
    @Test
    @FileParameters("src/test/resources/messages.csv")
    public void sendingMessage(String name, String email, String phone, String message, String expectedResult, String caseName){
        mainPage.sendMessage(name, email, phone, message);

        if (expectedResult.equals("Success")) {
            Assert.assertTrue("Case: " + caseName + "Expected result: " + expectedResult, mainPage.driver.getPageSource().contains("The form was submitted successfully."));
        }
        else {
            Assert.assertTrue("Case: " + caseName + "Expected result: " + expectedResult, !mainPage.driver.getPageSource().contains("The form was submitted successfully."));
        }
    }
}
