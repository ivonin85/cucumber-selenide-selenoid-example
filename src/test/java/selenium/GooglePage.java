package selenium;

import org.openqa.selenium.*;

public class GooglePage extends Methods {

    public GooglePage(WebDriver driver) {

        super(driver);
    }

    public void weatherSearch(String key){
        name("q").sendKeys(key);
        name("q").submit();
    }
    public String weatherResult(){
        return id("wob_tm").getText();


    }



}


