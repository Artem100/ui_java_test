package setupBrowser;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.Parameters;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class  SetupBrowser {

//    private String browser;
//
//    @Parameters("browser")
//    private static String getBrowser(String browser){
//        return this.browser = browser;
//    }

//    @Parameters("browser")
    public static void start_browser(){
//        if (getBrowser() = "Remote"){
//            Configuration.remote = "http://localhost:4440/wd/hub";
//            }
//        else if (getBrowser() == "local") {
//            Configuration.browser = "chrome";
//            }
//        Configuration.remote = "http://selenium:4444/wd/hub";
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
