package org.example.habrtest.pages;

import org.example.habrtest.AllureLoggerCustom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;


// https://habr.com/ru/feed/
public class HabrPages {

    private final AllureLoggerCustom LOG = new AllureLoggerCustom(LoggerFactory.getLogger(HabrPages.class));
    WebDriver driver;

    @FindBy(xpath = "//a[contains(text(),'Устройство сайта')]")
    private WebElement siteDeviceButton;

    @FindBy(xpath = "//*[contains(text(),'Хабы')]")
    private WebElement hubsButton;

    @FindBy(xpath = "//a[contains(text(),'Войти')]")
    private WebElement sendHubButton;

    @FindBy(xpath = "//a[contains(text(),'Регистрация')]")
    private WebElement registrationButton;

    @FindBy(xpath = "//a[contains(text(),'Статьи')]")
    private WebElement articlesButton;

    @FindBy(xpath = "//a[contains(text(),'Новости')]")
    private WebElement newsButton;

    @FindBy(xpath = "//a[contains(text(),'Компании')]")
    private WebElement companiesButton;

    @FindBy(xpath = "//a[contains(text(),'Авторы')]")
    private WebElement authorsButton;

    @FindBy(xpath = "//a[contains(text(),'Песочница')]")
    private WebElement sandboxButton;

    @FindBy(xpath = "//a[contains(text(),'Для авторов')]")
    private WebElement forTheAuthorsButton;

    @FindBy(xpath = "//a[contains(text(),'Для компаний')]")
    private WebElement forCompaniesButton;

    @FindBy(xpath = "//a[contains(text(),'Документы')]")
    private WebElement papersButton;

    @FindBy(xpath = "//a[contains(text(),'Соглашение')]")
    private WebElement agreementButton;

    @FindBy(xpath = "//a[contains(text(),'Конфиденциальность')]")
    private WebElement privacyButton;

    @FindBy(xpath = "//a[contains(text(),'Корпоративный блог')]")
    private WebElement corporateBlogButton;

    @FindBy(xpath = "//a[contains(text(),'Медийная реклама')]")
    private WebElement mediaAdvertisingButton;

    @FindBy(xpath = "//a[contains(text(),'Нативные проекты')]")
    private WebElement nativeProjectsButton;

    @FindBy(xpath = "//a[contains(text(),'Образовательные программы')]")
    private WebElement educationalProgramsButton;

    @FindBy(xpath = "//a[contains(text(),'Стартапам')]")
    private WebElement startupsButton;

    @FindBy(xpath = "//a[@class='tm-footer__link']")
    private WebElement supportButton;

    @FindBy(xpath = "//button[@class='tm-footer__link']")
    private WebElement languageCustomizationButton;


    public boolean getLanguageCustomIsActiv() {
        LOG.info("Проверка доступности кнопки Настройка языка");
        return languageCustomizationButton.isDisplayed();
    }


    public boolean getSupportIsActiv() {
        LOG.info("Проверка доступности кнопки Техническая поддержка");
        return supportButton.isDisplayed();
    }

    public boolean getStartupsIsActiv() {
        LOG.info("Проверка доступности кнопки Стартапам");
        return startupsButton.isDisplayed();
    }

    public boolean getEducationalProgramsIsActiv() {
        LOG.info("Проверка доступности кнопки Образовательные программы");
        return educationalProgramsButton.isDisplayed();
    }

    public boolean getNativeProjectsIsActiv() {
        LOG.info("Проверка доступности кнопки Нативные проекты");
        return nativeProjectsButton.isDisplayed();
    }

    public boolean getMediaAdvertisingIsActiv() {
        LOG.info("Проверка доступности кнопки Медийная реклама");
        return mediaAdvertisingButton.isDisplayed();
    }

    public boolean getCorporateBlogIsActiv() {
        LOG.info("Проверка доступности кнопки Корпоративный блог");
        return corporateBlogButton.isDisplayed();
    }


    public boolean getPrivacyIsActive() {
        LOG.info("Проверка доступности кнопки Конфиденциальность");
        return privacyButton.isDisplayed();
    }

    public boolean getAgreementIsActive() {
        LOG.info("Проверка доступности кнопки Соглашение");
        return agreementButton.isDisplayed();
    }

    public boolean getPapersIsActive() {
        LOG.info("Проверка доступности кнопки Документы");
        return papersButton.isDisplayed();
    }

    public boolean getForCompaniesIsActive() {
        LOG.info("Проверка доступности кнопки Для компаний");
        return forCompaniesButton.isDisplayed();
    }


    public boolean getForTheAuthorsIsActive() {
        LOG.info("Проверка доступности кнопки Для авторов");
        return forTheAuthorsButton.isDisplayed();
    }

    public boolean getSandboxIsActive() {
        LOG.info("Проверка доступности кнопки Песочница");
        return sandboxButton.isDisplayed();
    }

    public boolean getAuthorsIsActive() {
        LOG.info("Проверка доступности кнопки Авторы");
        return authorsButton.isDisplayed();
    }

    public boolean getCompaniesIsActive() {
        LOG.info("Проверка доступности кнопки Компании ");
        return companiesButton.isDisplayed();
    }

    public boolean getNewsIsActive() {
        LOG.info("Проверка доступности кнопки Новости");
        return newsButton.isDisplayed();
    }

    public boolean getArticlesIsActive() {
        LOG.info("Проверка доступности кнопки Статьи");
        return articlesButton.isDisplayed();
    }

    public boolean getRegistrationIsActive() {
        LOG.info("Проверка доступности кнопки Регистрация");
        return registrationButton.isDisplayed();
    }

    public boolean getSendHubIsActive() {
        LOG.info("Проверка доступности кнопки Войти");
        return sendHubButton.isDisplayed();
    }

    public boolean getSiteDeviceIsActive() {
        LOG.info("Проверка доступности кнопки Устройство сайта");
        return siteDeviceButton.isEnabled();
    }

    public boolean getHubsIsActive() {
        LOG.info("Проверка доступности кнопки Хабы");
        return hubsButton.isEnabled();
    }


    public String siteDeviceTransition() {
        LOG.info("Переход на страницу Устройство сайта");
        siteDeviceButton.click();
        return driver.getCurrentUrl();
    }

    public HabrPages(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


}
