package YandexMarket.project.test;

import YandexMarket.utils.ConfigFileReader;
import YandexMarket.framework.Browser;
import YandexMarket.project.pages.AutorisationPage;
import YandexMarket.project.pages.Catalog;
import YandexMarket.project.pages.WelcomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static YandexMarket.utils.ConfigFileReader.configFileReader;

public class MyTest extends BaseTest {
    private final ConfigFileReader config = configFileReader;
    @Test
    public void firstTest() {
        WebDriver driver = Browser.getDriver();
        driver.get(config.getApplicationUrl());
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.clickSignIn();
        AutorisationPage autorisation = new AutorisationPage(driver);
        autorisation.loginInput();
        autorisation.loginClickButton();
        autorisation.passwordInput();
        autorisation.passwordClickButton();
        Catalog catalog = new Catalog(driver);
        catalog.catalogClickButton();
        catalog.catalogCountPrint();
        catalog.sectionRandom();
    }
}