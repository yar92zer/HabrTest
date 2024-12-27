package org.example.habrtest.pages;

import com.codeborne.selenide.SelenideElement;
import org.example.habrtest.AllureLoggerCustom;
import org.slf4j.LoggerFactory;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

// https://habr.com/ru/feed/
public class HabrPages {

    private final AllureLoggerCustom LOG = new AllureLoggerCustom(LoggerFactory.getLogger(HabrPages.class));

    private final SelenideElement siteDeviceButton = $x("//a[contains(text(),'Устройство сайта')]");

    private final SelenideElement hubsButton = $x("//*[contains(text(),'Хабы')]");

    private final SelenideElement sendHubButton = $x("//a[contains(text(),'Войти')]");

    private final SelenideElement registrationButton = $x("//a[contains(text(),'Регистрация')]");

    private final SelenideElement articlesButton = $x("//a[contains(text(),'Статьи')]");

    private final SelenideElement newsButton = $x("//a[contains(text(),'Новости')]");

    private final SelenideElement companiesButton = $x("//a[contains(text(),'Компании')]");

    private final SelenideElement authorsButton = $x("//a[contains(text(),'Авторы')]");

    private final SelenideElement sandboxButton = $x("//a[contains(text(),'Песочница')]");

    private final SelenideElement forTheAuthorsButton = $x("//a[contains(text(),'Для авторов')]");

    private final SelenideElement forCompaniesButton = $x("//a[contains(text(),'Для компаний')]");

    private final SelenideElement papersButton = $x("//a[contains(text(),'Документы')]");

    private final SelenideElement agreementButton = $x("//a[contains(text(),'Соглашение')]");

    private final SelenideElement privacyButton = $x("//a[contains(text(),'Конфиденциальность')]");

    private final SelenideElement corporateBlogButton = $x("//a[contains(text(),'Корпоративный блог')]");

    private final SelenideElement mediaAdvertisingButton = $x("//a[contains(text(),'Медийная реклама')]");

    private final SelenideElement nativeProjectsButton = $x("//a[contains(text(),'Нативные проекты')]");

    private final SelenideElement educationalProgramsButton = $x("//a[contains(text(),'Образовательные программы')]");

    private final SelenideElement startupsButton = $x("//a[contains(text(),'Стартапам')]");

    private final SelenideElement supportButton = $x("//a[@class='tm-footer__link']");

    private final SelenideElement languageCustomizationButton = $x("//button[@class='tm-footer__link']");


    public boolean getLanguageCustomIsActive() {
        LOG.info("Проверка видимости кнопки Настройка языка");
        return languageCustomizationButton.isDisplayed();
    }


    public boolean getSupportIsActive() {
        LOG.info("Проверка видимости кнопки Техническая поддержка");
        return supportButton.isDisplayed();
    }

    public boolean getStartupsIsActive() {
        LOG.info("Проверка видимости кнопки Стартапам");
        return startupsButton.isDisplayed();
    }

    public boolean getEducationalProgramsIsActive() {
        LOG.info("Проверка видимости кнопки Образовательные программы");
        return educationalProgramsButton.isDisplayed();
    }

    public boolean getNativeProjectsIsActive() {
        LOG.info("Проверка видимости кнопки Нативные проекты");
        return nativeProjectsButton.isDisplayed();
    }

    public boolean getMediaAdvertisingIsActive() {
        LOG.info("Проверка видимости кнопки Медийная реклама");
        return mediaAdvertisingButton.isDisplayed();
    }

    public boolean getCorporateBlogIsActive() {
        LOG.info("Проверка видимости кнопки Корпоративный блог");
        return corporateBlogButton.isDisplayed();
    }


    public boolean getPrivacyIsActive() {
        LOG.info("Проверка видимости кнопки Конфиденциальность");
        return privacyButton.isDisplayed();
    }

    public boolean getAgreementIsActive() {
        LOG.info("Проверка видимости кнопки Соглашение");
        return agreementButton.isDisplayed();
    }

    public boolean getPapersIsActive() {
        LOG.info("Проверка видимости кнопки Документы");
        return papersButton.isDisplayed();
    }

    public boolean getForCompaniesIsActive() {
        LOG.info("Проверка видимости кнопки Для компаний");
        return forCompaniesButton.isDisplayed();
    }


    public boolean getForTheAuthorsIsActive() {
        LOG.info("Проверка видимости кнопки Для авторов");
        return forTheAuthorsButton.isDisplayed();
    }

    public boolean getSandboxIsActive() {
        LOG.info("Проверка видимости кнопки Песочница");
        return sandboxButton.isDisplayed();
    }

    public boolean getAuthorsIsActive() {
        LOG.info("Проверка видимости кнопки Авторы");
        return authorsButton.isDisplayed();
    }

    public boolean getCompaniesIsActive() {
        LOG.info("Проверка видимости кнопки Компании ");
        return companiesButton.isDisplayed();
    }

    public boolean getNewsIsActive() {
        LOG.info("Проверка видимости кнопки Новости");
        return newsButton.isDisplayed();
    }

    public boolean getArticlesIsActive() {
        LOG.info("Проверка видимости кнопки Статьи");
        return articlesButton.isDisplayed();
    }

    public boolean getRegistrationIsActive() {
        LOG.info("Проверка видимости кнопки Регистрация");
        return registrationButton.isDisplayed();
    }

    public boolean getSendHubIsActive() {
        LOG.info("Проверка видимости кнопки Войти");
        return sendHubButton.isDisplayed();
    }

    public boolean getSiteDeviceIsActive() {
        LOG.info("Проверка видимости кнопки Устройство сайта");
        return siteDeviceButton.isDisplayed();
    }

    public boolean getHubsIsActive() {
        LOG.info("Проверка видимости кнопки Хабы");
        return hubsButton.isDisplayed();
    }


    public String siteDeviceTransition() {
        LOG.info("Переход на страницу Устройство сайта");
        siteDeviceButton.shouldBe(visible);
        siteDeviceButton.click();
        sleep(10000);
        return webdriver().driver().url();
    }
}
