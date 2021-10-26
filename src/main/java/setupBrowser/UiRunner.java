package setupBrowser;

import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class UiRunner {

    @BeforeClass(alwaysRun = true)
    public void SetUp(){
        SetupBrowser setupBrowser = new SetupBrowser();
        setupBrowser.start_browser();
    }

    public void tearDown(){
        closeWebDriver();
    }

}

