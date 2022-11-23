package com.lvo23.tests;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverProvider;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.lvo23.config.WebConfigProvider;

import io.qameta.allure.selenide.AllureSelenide;

/**
 * @author Vlad Litvinov
 */
public class TestBase {

    /**
     * метод сет-ап, который выполнится перед всеми тестами
     */
    @BeforeAll
    static void setUp() {
        WebConfigProvider.configure();
        SelenideLogger.addListener("allure", new AllureSelenide());
    }
}
