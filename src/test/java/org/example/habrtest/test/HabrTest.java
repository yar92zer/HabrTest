package org.example.habrtest.test;

import org.example.habrtest.pages.HabrPages;
import org.example.habrtest.pages.HabrTeamsPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MyExtension.class)
public class HabrTest extends BaseTest {
    private HabrPages HabrP;
    private HabrTeamsPage HabrTP;

    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();
        getDriver().get("https://habr.com/ru/feed/");
        HabrP = new HabrPages(getDriver());
        HabrTP = new HabrTeamsPage(getDriver());
    }

    @Test
    @DisplayName("Проверка активности кнопки Устройство сайта")
    public void siteDeviceIsActive() {
        Assertions.assertTrue(HabrP.getSiteDeviceIsActive(), "Устройство сайта кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Хабы")
    public void hubsIsActive() {
        Assertions.assertTrue(HabrP.getHubsIsActive(), "Хабы кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Войти")
    public void sendHubIsActive() {
        Assertions.assertTrue(HabrP.getSendHubIsActive(), "Войти кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Регистрация")
    public void registrationIsActive() {
        Assertions.assertTrue(HabrP.getRegistrationIsActive(), "Регистрация кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Статьи")
    public void articlesIsActive() {
        Assertions.assertTrue(HabrP.getArticlesIsActive(), "Статьи кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Новости")
    public void newsIsActive() {
        Assertions.assertTrue(HabrP.getNewsIsActive(), "Новости кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Компании")
    public void companiesIsActive() {
        Assertions.assertTrue(HabrP.getCompaniesIsActive(), "Компании кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Авторы")
    public void authorsIsActive() {
        Assertions.assertTrue(HabrP.getAuthorsIsActive(), "Авторы кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Песочница")
    public void sandboxIsActive() {
        Assertions.assertTrue(HabrP.getSandboxIsActive(), "Песочница кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки  Для авторов")
    public void forTheAuthorsIsActive() {
        Assertions.assertTrue(HabrP.getForTheAuthorsIsIsActive(), " Для авторов кнопка кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Для компаний")
    public void forCompanieIsActive() {
        Assertions.assertTrue(HabrP.getForCompaniesIsActive(), "Для компаний кнопка не активна ");

    }

    @Test
    @DisplayName("Проверка активности кнопки Документы")
    public void papersIsActive() {
        Assertions.assertTrue(HabrP.getPapersIsActive(), "Документы кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Соглашение")
    public void agreementIsActive() {
        Assertions.assertTrue(HabrP.getAgreementIsActive(), "Соглашение кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Конфиденциальность")
    public void privacyIsActive() {
        Assertions.assertTrue(HabrP.getPrivacyIsActive(), "Конфиденциальность кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Корпоративный блог")
    public void corporateBlogIsActive() {
        Assertions.assertTrue(HabrP.getCorporateBlogIsActiv(), "Корпоративный блог кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Медийная реклама")
    public void mediaAdvertisingIsActive() {
        Assertions.assertTrue(HabrP.getMediaAdvertisingIsActiv(), "Медийная реклам кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Нативные проекты")
    public void nativeProjectsIsActive() {
        Assertions.assertTrue(HabrP.getNativeProjectsIsActiv(), "Нативные проекты кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Образовательные программы")
    public void educationalProgramsIsActive() {
        Assertions.assertTrue(HabrP.getEducationalProgramsIsActiv(), "Образовательные программыкнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Стартапам Стартапам")
    public void startupsIsActive() {
        Assertions.assertTrue(HabrP.getStartupsIsActiv(), "Стартапам кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Техническая поддержка")
    public void supportIsActive() {
        Assertions.assertTrue(HabrP.getSupportIsActiv(), "Техническая поддержка кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Настройка языка")
    public void languageCustomizationIsActive() {
        Assertions.assertTrue(HabrP.getLanguageCustomIsActiv(), "Настройка языка кнопка не активна");
    }

    @Test
    @DisplayName("Открытие страницы Устройство сайта")
    public void siteDeviceTest() {
        String expectedUrl = "https://habr.com/ru/docs/help/";
        String actualUrl = HabrP.siteDeviceTransition();
        assertEquals(expectedUrl, actualUrl, "Итоговый URL не соответствует ожидаемому");
    }

    @Test
    @DisplayName("Проверка перехода в раздел Changelog")
    public void changelogTest() {
        String expectedUrl = "https://habr.com/ru/docs/changelog/";
        HabrP.siteDeviceTransition();
        String actualUrl = HabrTP.getChangeLogTeamTransition();
        assertEquals(expectedUrl, actualUrl, "Итоговый URL не соответствует ожидаемому");
    }

    @Test
    @DisplayName("Открытие страницы Хабы")
    public void hubsTest() {
        String expectedUrl = "https://habr.com/ru/hubs/";
        String actualUrl = HabrTP.getHubsTeamTransition();
        assertEquals(expectedUrl, actualUrl, "Итоговый URL не соответствует ожидаемому");
    }

    @Test
    @DisplayName("Проверка перехода в раздел Техническая поддержка")
    public void supportTest() {
        String expectedUrl = "https://habr.com/ru/feedback/?type=8&subj=suggest_hub";
        HabrTP.getHubsTeamTransition();
        String actualUrl = HabrTP.getSendTeamTransition();
        assertEquals(expectedUrl, actualUrl, "Итоговый URL не соответствует ожидаемому");
    }


}
