package org.example.habrtest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class MainPageTest {
    private WebDriver driver;
    @BeforeEach
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        // Fix the issue https://github.com/SeleniumHQ/selenium/issues/11750
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.habr.com/");
    }
    @AfterEach
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void changeLogTest() {
        WebElement userIcon = driver.findElement(By.xpath("//*[contains(text(),'Устройство сайта')]"));
        userIcon.click();
        WebElement rulesLink = driver.findElement(By.xpath("//*[contains(text(),'Правила сайта')]"));
        rulesLink.click();
        assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Changelog')]"))
        .isDisplayed(), "Changelog не найден");
    }
    @Test
    public void LogTest() {
        WebElement newXab = driver.findElement(By.xpath("//*[contains(text(),'Хабы')]"));
        newXab.click();
        assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Предложить хаб')]"))
        .isDisplayed(), "Предложить хаб не найден");
        WebElement elMenu = driver.findElement(By.xpath("//*[contains(text(),'Предложить хаб')]"));
        elMenu.click();
    }
    @Test
    public void testButton() {
        WebElement newHab = driver.findElement(By.xpath("//*[contains(text(),'Хабы')]"));
        newHab.click();
        WebElement upHab = driver.findElement(By.xpath("//*[contains(text(),'Предложить хаб')]"));
        upHab.click();
        assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Отправить')]"))
        .isDisplayed(), "Отправить не найден");
    }
}
