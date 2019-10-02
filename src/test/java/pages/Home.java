package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static data.Data.EMAIL;
import static data.Data.PASS;
import static junit.framework.TestCase.assertTrue;

public class Home {
    String email = "urait301@mail.ru";
    String pass = "123456789";
    String surname = "Сидоров";
    String name = "Сергей";
    String username;
    String originalName;
    String queryResult;

    // закрыть laravel
    public void closeLaravel(){
        if ($(By.className("phpdebugbar-close-btn")).isDisplayed())
            $(By.className("phpdebugbar-close-btn")).click();
    }

    public void loginPass(){
        $(".header-login__text").click();
        $("input#email.field.content-center-form__field").sendKeys(EMAIL);
        $("input#password.field.content-center-form__field").sendKeys(PASS);
        $(".button-orange.content-center-form__enter-button").click();
    }
    public void lkLink(){

        $("a.header-user__name").click();
    }
    public void searchQuery(String searchQuery){
        $(byName("words")).sendKeys(searchQuery);
        $(byText("Искать")).click();
    }

    public void assertResult(String searchQuery){

        assertTrue(searchQuery.equals($("span.search-result-filters__descr").getAttribute("innerText")));
    }

    public void selectSubCategory(String category, String subCategory) {
        $(".header-menu__link.header-menu__link--catalog").click();
        $(By.partialLinkText(category)).hover();
        $(By.partialLinkText(subCategory)).click();
    }

    public void goToCart(){
        $("a.cart-button").click();
    }
    public void goToHome(){
        $("a.logo.logo--header").click();
    }

}
