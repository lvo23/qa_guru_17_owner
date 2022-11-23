package com.lvo23.tests;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.lvo23.tests.pages.MainGitHubPage;

/**
 * @author Vlad Litvinov
 */
public class GitHubTests extends TestBase {

    MainGitHubPage mainGitHubPage = new MainGitHubPage();

    @Test
    @DisplayName("Проверяем, что страница с инфой для предприятий открылась")
    void checkEnterpriseSolutionPageIsOpened() {

        mainGitHubPage.openPage().solutionsHover().onEnterpriseClick();
        step("Проверяем, что страница с инфой для предприятий открылась", () -> {
            $("h1").shouldHave(text("Build like the best"));
        });
    }

}
