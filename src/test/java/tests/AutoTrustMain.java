package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Owner;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import tests.TestBase;

import java.time.Duration;


@Tag("checking")
public class AutoTrustMain extends TestBase {

    PagesAutoTrust pagesAutoTrust = new PagesAutoTrust();

    @Test
    @DisplayName("Валидация страницы авторизации")
    @Tag("smoke")
    @Owner("Daniil Ruban")
    void autoTrustMain() {
        pagesAutoTrust.openPage() // открыть сайт с авторизацией
                .autoBanner("Проверенный поставщик качественных автозапчастей")
                .loginForm("Вход в систему")
                .loginForm("Запомнить меня")
                .loginForm("Забыли пароль?")
                .loginForm("Войти");


    }

    @Test
    @DisplayName("Валидация кнопки контаков")
    @Tag("smoke")
    @Owner("Daniil Ruban")
    void helpButtonCheck() {
        pagesAutoTrust.openPage()
                .helpButton()
                .helpButtonBanner("Связаться с нами")
                .helpButtonBanner("Свяжитесь с нами удобным для вас способом")
                .helpButtonBanner("info@a-trast.ru")
                .helpButtonBanner("+7 (343) 226-08-80")
                .helpButtonBanner("Мы Вконтакте");

    }

    @Test
    @DisplayName("Наличие обязательных полей авторизации")
    @Tag("smoke")
    @Owner("Daniil Ruban")
    void loginCheck() {
        pagesAutoTrust.openPage()
                .entryButton()
                .validationString("Обязательное поле");
    }

    @Test
    @DisplayName("Ошибка при вводе логина и отсутствии пароля")
    @Tag("smoke")
    @Owner("Daniil Ruban")
    void yesloginCheck() {
        pagesAutoTrust.openPage()
                .loginString()
                .loginString("admin")
                .entryButton()
                .validationString("Обязательное поле");
    }
    @Test
    @DisplayName("Ошибка при вводе пароля и отсутствии логина")
    @Tag("smoke")
    @Owner("Daniil Ruban")
    void yesPasswordCheck() {
        pagesAutoTrust.openPage()
                .passwordString()
                .passwordString("password")
                .entryButton()
                .validationString("Обязательное поле");
    }
    @Test
    @DisplayName("Ошибка при вводе невалидных логина и пароля")
    @Tag("smoke")
    @Owner("Daniil Ruban")
    void invalidLogPasCheck() {
        pagesAutoTrust.openPage()
                .loginString()
                .loginString("admin")
                .passwordString()
                .passwordString("password")
                .entryButton()
                .invalidData("Неверный логин или пароль");
    }
}
