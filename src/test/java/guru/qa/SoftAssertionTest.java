package guru.qa;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SoftAssertionTest {

    @Test
    void softAssertionPageIsPresent() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").$(byText("Wiki")).click();
        $(".wiki-more-pages-link").click();
        $("#wiki-pages-box").$(byTagName("a")).shouldHave(Condition.text("SoftAssertions"));

    }
}
