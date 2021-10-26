package setupBrowser;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class  SetupBrowser {

    public void start_browser(String browser) {
        if (browser.equals("remote")) {
            Configuration.browser = "chrome";
            Configuration.remote = "http://localhost:4440/wd/hub";
            Configuration.timeout = 5000;
            Configuration.clickViaJs = true;
            Configuration.startMaximized = true;
            Configuration.headless = false;
            SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true).
                    includeSelenideSteps(false));
        }
        if (browser.equals("Chrome")) {
            Configuration.browser = browser;
        } else {
            Configuration.browser = "chrome";
            Configuration.timeout = 5000;
            Configuration.browserSize = "1920x1080";
            Configuration.headless = false;
            SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true).
                    includeSelenideSteps(false));
        }
    }

}
