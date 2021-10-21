package setupBrowser;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class  SetupBrowser {

    public static String cookie_value;

    public static void start_browser(){
//        Configuration.remote = "http://localhost:4440/wd/hub";
        Configuration.browser = "chrome";
        Configuration.timeout = 5000;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true).
                includeSelenideSteps(false));

    }

    public static void close_browser(){
        closeWebDriver();
    }

}
