package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SoftAssertionTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }

    @Test
    void softAssertionPageIsPresent() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").$(byText("Wiki")).click();
        $(".wiki-more-pages-link > button").click();
        $(".wiki-rightbar").shouldHave(text("SoftAssertions"));
        $(".wiki-rightbar").$(byText("SoftAssertions")).click();
        $(".Layout-main").shouldHave(text("Using JUnit5 extend test class:"));
    }
}
