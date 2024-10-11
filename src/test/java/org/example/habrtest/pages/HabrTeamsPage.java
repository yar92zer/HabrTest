package org.example.habrtest.pages;

import org.example.habrtest.test.AllureLoggerCustom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;


// https://habr.com/ru/feed/
public class HabrTeamsPage {
    private final AllureLoggerCustom LOG = new AllureLoggerCustom(LoggerFactory.getLogger(HabrPages.class));
    WebDriver driver;

    @FindBy(xpath = "//*[contains(text(),'Changelog')]")
    private WebElement changeLogTeam;

    @FindBy(xpath = "//*[contains(text(),'Хабы')]")
    private WebElement hubsTeam;

    @FindBy(xpath = "//a[@class='tm-suggest-button']")
    private WebElement sendTeam;

    public String getSendTeamTransition() {
        LOG.info("Перход в раздел Предложить хаб");
        sendTeam.click();
        return getUrl();
    }

    public String getChangeLogTeamTransition() {
        LOG.info("Перход в раздел Changelog");
        changeLogTeam.click();
        return getUrl();
    }

    public String getHubsTeamTransition() {
        LOG.info("Перход в раздел кнопки Хабы");
        hubsTeam.click();
        return getUrl();
    }


    public HabrTeamsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public String getUrl() {
        String url = driver.getCurrentUrl();
        LOG.info("Текущий адрес URL: " + url);
        return url;
    }
}
