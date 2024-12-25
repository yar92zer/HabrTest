package org.example.habrtest.test;


import com.codeborne.selenide.Configuration;
import org.example.habrtest.pages.HabrPages;
import org.example.habrtest.pages.HabrTeamsPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class HabrTest {
    private HabrPages habrPages;
    private HabrTeamsPage habrTeamsPage;

    @BeforeAll
    public static void setUpAll() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://habr.com";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
    }

    @BeforeEach
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.setCapability("browserVersion", "127.0");
        options.setCapability("selenoid:options", new HashMap<String, Object>() {{
            /* How to add test badge */
            put("name", "Test badge...");

            /* How to set session timeout */
            put("sessionTimeout", "15m");

            put("enableVNC", "true");

            /* How to set timezone */
            put("env", new ArrayList<String>() {{
                add("TZ=UTC");
            }});

            /* How to add "trash" button */
            put("labels", new HashMap<String, Object>() {{
                put("manual", "true");
            }});

            /* How to enable video recording */
            put("enableVideo", true);
        }});
        RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
        open("/ru/feed/");

        habrPages = new HabrPages();
        habrTeamsPage = new HabrTeamsPage();
    }

    @Test
    @DisplayName("Проверка активности кнопки Устройство сайта")
    public void siteDeviceIsActive() {
        assertTrue(habrPages.getSiteDeviceIsActive(), "Устройство сайта кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Хабы")
    public void hubsIsActive() {
        assertTrue(habrPages.getHubsIsActive(), "Хабы кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Войти")
    public void sendHubIsActive() {
        assertTrue(habrPages.getSendHubIsActive(), "Войти кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Регистрация")
    public void registrationIsActive() {
        assertTrue(habrPages.getRegistrationIsActive(), "Регистрация кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Статьи")
    public void articlesIsActive() {
        assertTrue(habrPages.getArticlesIsActive(), "Статьи кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Новости")
    public void newsIsActive() {
        assertTrue(habrPages.getNewsIsActive(), "Новости кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Компании")
    public void companiesIsActive() {
        assertTrue(habrPages.getCompaniesIsActive(), "Компании кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Авторы")
    public void authorsIsActive() {
        assertTrue(habrPages.getAuthorsIsActive(), "Авторы кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Песочница")
    public void sandboxIsActive() {
        assertTrue(habrPages.getSandboxIsActive(), "Песочница кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки  Для авторов")
    public void forTheAuthorsIsActive() {
        assertTrue(habrPages.getForTheAuthorsIsActive(), " Для авторов кнопка кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Для компаний")
    public void forCompanieIsActive() {
        assertTrue(habrPages.getForCompaniesIsActive(), "Для компаний кнопка не активна ");
    }

    @Test
    @DisplayName("Проверка активности кнопки Документы")
    public void papersIsActive() {
        assertTrue(habrPages.getPapersIsActive(), "Документы кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Соглашение")
    public void agreementIsActive() {
        assertTrue(habrPages.getAgreementIsActive(), "Соглашение кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Конфиденциальность")
    public void privacyIsActive() {
        assertTrue(habrPages.getPrivacyIsActive(), "Конфиденциальность кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Корпоративный блог")
    public void corporateBlogIsActive() {
        assertTrue(habrPages.getCorporateBlogIsActiv(), "Корпоративный блог кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Медийная реклама")
    public void mediaAdvertisingIsActive() {
        assertTrue(habrPages.getMediaAdvertisingIsActiv(), "Медийная реклам кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Нативные проекты")
    public void nativeProjectsIsActive() {
        assertTrue(habrPages.getNativeProjectsIsActiv(), "Нативные проекты кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Образовательные программы")
    public void educationalProgramsIsActive() {
        assertTrue(habrPages.getEducationalProgramsIsActiv(), "Образовательные программыкнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Стартапам Стартапам")
    public void startupsIsActive() {
        assertTrue(habrPages.getStartupsIsActiv(), "Стартапам кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Техническая поддержка")
    public void supportIsActive() {
        assertTrue(habrPages.getSupportIsActiv(), "Техническая поддержка кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Настройка языка")
    public void languageCustomizationIsActive() {
        assertTrue(habrPages.getLanguageCustomIsActiv(), "Настройка языка кнопка не активна");
    }

    @Test
    @DisplayName("Открытие страницы Устройство сайта")
    public void siteDeviceTest() {
        String expectedUrl = "https://habr.com/ru/docs/help/";
        String actualUrl = habrPages.siteDeviceTransition();
        assertEquals(expectedUrl, actualUrl, "Итоговый URL не соответствует ожидаемому");
    }

    @Test
    @DisplayName("Проверка перехода в раздел Changelog")
    public void changelogTest() {
        String expectedUrl = "https://habr.com/ru/docs/changelog/";
        habrPages.siteDeviceTransition();
        String actualUrl = habrTeamsPage.getChangeLogTeamTransition();
        assertEquals(expectedUrl, actualUrl, "Итоговый URL не соответствует ожидаемому");
    }

    @Test
    @DisplayName("Открытие страницы Хабы")
    public void hubsTest() {
        String expectedUrl = "https://habr.com/ru/hubs/";
        String actualUrl = habrTeamsPage.getHubsTeamTransition();
        assertEquals(expectedUrl, actualUrl, "Итоговый URL не соответствует ожидаемому");
    }

    @Test
    @DisplayName("Проверка перехода в раздел Техническая поддержка")
    public void supportTest() {
        String expectedUrl = "https://habr.com/ru/feedback/?type=8&subj=suggest_hub";
        habrTeamsPage.getHubsTeamTransition();
        String actualUrl = habrTeamsPage.getSendTeamTransition();
        assertEquals(expectedUrl, actualUrl, "Итоговый URL не соответствует ожидаемому");
    }


}
