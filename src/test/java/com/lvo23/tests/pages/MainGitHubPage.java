package com.lvo23.tests.pages;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;


/**
 * @author Vlad Litvinov
 */
public class MainGitHubPage {

    public MainGitHubPage openPage() {
        step("Открываем главную страницу", () -> {
            open("/");
        });
        return this;
    }

    public MainGitHubPage solutionsHover() {
        step("Наводим курсором на Solutions", () -> {
            $(byText("Solutions")).hover();
        });
        return this;
    }

    public MainGitHubPage onEnterpriseClick() {
        step("Кликаем на Enterprise", () -> {
            $(byText("Enterprise")).click();
        });
        return this;
    }



}
