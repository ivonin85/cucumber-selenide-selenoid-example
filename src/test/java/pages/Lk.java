package pages;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static junit.framework.TestCase.assertTrue;

public class Lk {
    String surname = "Сидоров";
    String name = "Сергей";
    String username;
    String originalName;
    public void clickEdit(String str){
        $(byText(str)).click();
    }

    public void selectName(String name){
        $$("input.field").get(1).clear();
        $$("input.field").get(1).sendKeys(name);
    }
    public void selectSurname(String surname){
        $$("input.field").get(0).clear();
        $$("input.field").get(0).sendKeys(surname);
    }
    public void clickSave(){
        executeJavaScript("document.querySelector('a.content-center__row-button.button-orange.button-orange--middle').scrollIntoView();");
        $("a.content-center__row-button.button-orange.button-orange--middle").click();
    }
    public void assertData(String originalName){
        username = $("span.content-title__name").text();

        assertTrue(username.equals(originalName));
    }
}
