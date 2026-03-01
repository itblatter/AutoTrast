package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Owner;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tests.TestBase;


@Tag("checking")
public class AutoTrustMain extends TestBase {

    PagesAutoTrust pagesAutoTrust = new PagesAutoTrust();

    @Test
    @DisplayName("Проверка страницы авторизации")
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


}
