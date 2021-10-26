import dataTest.DataTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject.BasePage;
import pageObject.MainPage;
import setupBrowser.SetupBrowser;

import static com.codeborne.selenide.Selenide.open;


public class SimpleTest extends BasePage {

    @BeforeMethod
    public static void start(){
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

}
