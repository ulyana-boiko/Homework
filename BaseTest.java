package YandexMarket.project.test;

import YandexMarket.utils.ConfigFileReader;
import YandexMarket.framework.Browser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import static YandexMarket.utils.ConfigFileReader.configFileReader;

public class BaseTest {
    private final ConfigFileReader config = configFileReader;

    @BeforeClass
    public void before(){
        System.setProperty(config.getDriverAdapter(), config.getDriverPath());
        WebDriver driver = Browser.getDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Browser.getDriver().manage().window().maximize();
    }
}
