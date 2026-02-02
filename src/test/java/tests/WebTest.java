package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebTest {

    @Test
    public void BSTest1(){
        open("/");
        $("span[data-target='qbsearch-input.inputButtonText']").shouldHave(text("Search or jump to..."));
    }
}