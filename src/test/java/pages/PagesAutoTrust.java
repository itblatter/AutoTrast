package pages;


import com.codeborne.selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import io.qameta.allure.Step;
import org.openqa.selenium.devtools.v85.page.Page;
import static com.codeborne.selenide.Selenide.*;

public class PagesAutoTrust {

    private final SelenideElement
            loginForm = $("#auth-form-login").closest("form"),
            autoBanner = $$("div").findBy(text("Проверенный поставщик качественных")),
            loginString = $("#auth-form-login"),
            passwordString = $("#auth-form-password"),
            hidenButton = $(".css-otmbbu.est9fan1"),
            rememberButton = $(".css-17h2mrt.eh443m60"),
            wronngPasswordButton = $(".css-qbyfb8.e1t26v1m0"),
            entryButton = $(".css-1qkgdek.eh443m60"),
            aTrustButton = $(".css-d2v28b.eh443m60"),
            helpButton = $("#login-helpers-icon");


@Step("Открыть главную страницу")
public PagesAutoTrust openPage() {
    open("https://dev.a-trast.ru/login");
    return this;
}

@Step("Проверка рекламного баннера")
public PagesAutoTrust autoBanner(String value) {
    autoBanner.shouldHave(text(value));
    return this;
}

@Step("Проверка формы авторизации")
public PagesAutoTrust loginForm(String value) {
    loginForm.shouldBe(visible);
    return this;
}

@Step("Проверка строки логина")
public PagesAutoTrust loginString(String value) {
    loginString.shouldBe(visible).shouldHave(text(value));
    return this;
}

public PagesAutoTrust loginString() {
    loginString.shouldBe(visible);
    return this;
}

@Step("Проверка строки пароля")
public PagesAutoTrust passwordString(String value) {
    passwordString.shouldBe(visible).shouldHave(text(value));
    return this;
}

public PagesAutoTrust passwordString() {
    passwordString.shouldBe(visible);
    return this;
}

@Step("Проверка кнопки скрытия пароля")
public PagesAutoTrust hiddenButton(String value) {
    hidenButton.shouldBe(visible).click();
    return this;
}

public PagesAutoTrust hiddenButton() {
    hidenButton.shouldBe(visible).click();
    return this;
}

@Step("Проверка кнопки запомнить меня")
public PagesAutoTrust rememberButton(String value) {
    rememberButton.shouldBe(visible).shouldHave(text(value));
    return this;
}

public PagesAutoTrust rememberButton() {
    rememberButton.shouldBe(visible);
    return this;
}

@Step("Проверка кнопки забыли пароль")
public PagesAutoTrust wrongPasswordButton(String value) {
    wronngPasswordButton.shouldBe(visible).shouldHave(text(value));
    return this;
}

public PagesAutoTrust wrongPasswordButton() {
    wronngPasswordButton.shouldBe(visible);
    return this;
}

@Step ("Проверка кнопки войти")
public PagesAutoTrust entryButton(String value) {
    entryButton.shouldBe(visible).shouldHave(text(value));
    return this;
}

public PagesAutoTrust entryButton() {
    entryButton.shouldBe(visible);
    return this;
}

@Step ("Проверка кнопки основная страница")
public PagesAutoTrust aTrustButton(String value) {
    aTrustButton.shouldBe(visible).click();
    return this;
}

public PagesAutoTrust aTrustButton() {
    aTrustButton.shouldBe(visible).click();
    return this;
}

@Step ("Проверка кнопки контактов")
public PagesAutoTrust helpButton(String value) {
    helpButton.shouldBe(visible).hover().shouldHave(text(value));
    return this;
}

public PagesAutoTrust helpButton() {
    helpButton.shouldBe(visible).hover();
    return this;
}

}
