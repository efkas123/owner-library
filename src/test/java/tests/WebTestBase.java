package tests;


import config.ConfigProvider;
import config.WebConfig;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.closeWebDriver;

public class WebTestBase {

    private static final WebConfig config = ConfigProvider.webConfig();


    @BeforeAll
    static void SetUp() {
        browser = config.browser();
        baseUrl = config.baseUrl();
        browserVersion = config.browserVersion();
        pageLoadStrategy = "eager";

        if (config.isRemote()) {
            remote = config.remoteUrl();
        }
    }

    @AfterAll
    static void TearDown() {
        closeWebDriver();
    }

}