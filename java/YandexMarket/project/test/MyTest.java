package YandexMarket.project.test;

import YandexMarket.framework.alert.MyAlert;
import YandexMarket.project.pages.WelcomePage;
import YandexMarket.utils.ConfigFileReader;
import org.testng.annotations.Test;

public class MyTest extends BaseTest {
    @Test
    public void firstTest() {
        WelcomePage welcomePage = new WelcomePage();
        MyAlert myAlert = new MyAlert();
        welcomePage.open();
        welcomePage.clickJsAlert();
        myAlert.accept();
        welcomePage.clickJsConfirm();
        myAlert.dismiss();
        welcomePage.clickJsPrompt();
        myAlert.sendText();
    }
}

