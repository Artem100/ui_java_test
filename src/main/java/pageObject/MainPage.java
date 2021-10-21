package pageObject;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private static final SelenideElement TEXT_FIELD = $("input[name='q']");
    private static final SelenideElement SUBMIT_BUTTON = $("div.FPdoLc>center input[name='btnK']");


    @Step("*Text* field input text")
    public void textFieldInput(String value){
        TEXT_FIELD.setValue(value);
    }

    @Step("*Submit* button click")
    public void submitButtonClick(){
        SUBMIT_BUTTON.click();
    }


}
