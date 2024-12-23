package org.example.habrtest.pages;

import com.codeborne.selenide.SelenideElement;
import org.example.habrtest.AllureLoggerCustom;
import org.slf4j.LoggerFactory;

import static com.codeborne.selenide.Selenide.*;


// https://habr.com/ru/feed/
public class HabrTeamsPage {
    private final AllureLoggerCustom LOG = new AllureLoggerCustom(LoggerFactory.getLogger(HabrPages.class));

    private final SelenideElement changeLogTeam = $x("//*[contains(text(),'Changelog')]");
    private final SelenideElement hubsTeam = $x("//*[contains(text(),'Хабы')]");
    private final SelenideElement sendTeam = $x("//a[@class='tm-suggest-button']");

    public String getSendTeamTransition() {
        LOG.info("Перход в раздел Предложить хаб");
        sendTeam.click();
        sleep(1000);
        return webdriver().driver().url();
    }

    public String getChangeLogTeamTransition() {
        LOG.info("Перход в раздел Changelog");
        changeLogTeam.click();
        return webdriver().driver().url();
    }

    public String getHubsTeamTransition() {
        LOG.info("Перход в раздел кнопки Хабы");
        hubsTeam.click();
        return webdriver().driver().url();
    }

}
