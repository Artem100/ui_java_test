import dataTest.DataTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject.MainPage;
import setupBrowser.SetupBrowser;

import static com.codeborne.selenide.Selenide.open;
import static setupBrowser.SetupBrowser.close_browser;

public class SimpleTest {

    MainPage mainPage = new MainPage();

    @BeforeMethod
    public static void start(){
        SetupBrowser.start_browser();
        open("https://google.com/");
    }

    @Test
    public void test_01(){
        mainPage.textFieldInput(DataTest.search1());
        mainPage.submitButtonClick();
    }

    @Test
    public void test_02(){
        mainPage.textFieldInput(DataTest.search1());
        mainPage.submitButtonClick();
    }

    @AfterMethod
    public void closeBrowser(){ close_browser(); }
}
