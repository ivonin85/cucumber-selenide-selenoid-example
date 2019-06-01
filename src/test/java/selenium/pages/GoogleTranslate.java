package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.Methods;

public class GoogleTranslate extends Methods {
    public GoogleTranslate(WebDriver driver) {
        super(driver);
    }
    public WebElement sendText(){

        return id("source");
    }

    public WebElement getText(){

        return cssSelector(".tlid-translation.translation");
    }

    public void selectLanguage()throws InterruptedException{
        xPath("//div[@class='tl-more tlid-open-target-language-list']").click();
        Thread.sleep(1500);
        //actionByClassName(".page.tlid-language-picker-page.language-picker-page");
        //System.out.println(className("language_list_item_wrapper.language_list_item_wrapper-en.item-emphasized").getText());
        javaScript("document.querySelector('.language_list_item_wrapper.language_list_item_wrapper-en.item-emphasized').click();");
    }
    public void selLang(String language){
        xPath("//div[@class='tl-more tlid-open-target-language-list']").click();
        id("tl_list-search-box").sendKeys(language);
        id("tl_list-search-box").sendKeys(Keys.ENTER);


    }
}
