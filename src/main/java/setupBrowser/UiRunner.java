package setupBrowser;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class UiRunner {

    @Parameters({"browser"})
    @BeforeClass(alwaysRun = true)
    public void SetUp(@Optional("local")String browser){
        SetupBrowser setupBrowser = new SetupBrowser();
        setupBrowser.start_browser(browser);
    }

    public void tearDown(){
        closeWebDriver();
    }

}

