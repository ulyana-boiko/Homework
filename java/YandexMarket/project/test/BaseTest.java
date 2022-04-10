package YandexMarket.project.test;

import YandexMarket.utils.ConfigFileReader;
import org.testng.annotations.BeforeClass;

import static YandexMarket.utils.ConfigFileReader.configFileReader;

public class BaseTest {
    private ConfigFileReader config = configFileReader.configFileReader;
    @BeforeClass
    public void before(){
        System.setProperty(config.getDriverAdapter(), config.getDriverPath());
    }
}
