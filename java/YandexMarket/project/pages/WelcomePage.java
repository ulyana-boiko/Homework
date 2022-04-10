package YandexMarket.project.pages;

import YandexMarket.framework.browser.Browser;
import YandexMarket.utils.ConfigFileReader;
import org.openqa.selenium.By;

public class WelcomePage extends BasePage {
    private Browser browser = Browser.BROWSER;
    private static ConfigFileReader config = ConfigFileReader.configFileReader;
    private By jsAlert = By.xpath("\"//*[@id=\\\"content\\\"]/div/ul/li[1]/button\"");
    private By jsConfirm = By.xpath("\"//*[@id=\\\"content\\\"]/div/ul/li[2]/button\"");
    private By jsPrompt = By.xpath("\"//*[@id=\\\"content\\\"]/div/ul/li[3]/button\"");

    public WelcomePage(){
    }

    public void open(){
        browser.goTo(config.getApplicationUrl());
    }

    public void clickJsAlert(){
        browser.findElement(jsAlert).click();
    }
    public void clickJsConfirm(){
        browser.findElement(jsConfirm).click();
    }
    public void clickJsPrompt(){
        browser.findElement(jsPrompt).click();
    }
}

