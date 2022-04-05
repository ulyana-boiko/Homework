package YandexMarket.project.pages;

import YandexMarket.Creds;
import YandexMarket.utils.ConfigFileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static YandexMarket.utils.ConfigFileReader.configFileReader;

public class AutorisationPage extends Creds {
    private ConfigFileReader config = configFileReader;
    private WebDriver driver;
    public AutorisationPage(WebDriver driver) {
        this.driver = driver;
    }
    private By loginIn = By.xpath("//*[@id=\"passp-field-login\"]");
    public void loginInput(){
        driver.findElement(loginIn).sendKeys(config.getLogin());
    }
    private By loginClick = By.xpath("//*[@id=\"passp:sign-in\"]");
    public void loginClickButton(){
        driver.findElement(loginClick).click();
    }
    private By passwordIn = By.xpath("//*[@id=\"passp-field-passwd\"]");
    public void passwordInput(){
        driver.findElement(passwordIn).sendKeys(config.getPassword());
    }
    private By passwordClick = By.xpath("//*[@id=\"passp:sign-in\"]");
    public void passwordClickButton(){
        driver.findElement(passwordClick).click();
    }
}