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

    public void webelementList(){

        listByClassName();
    }

    public void showGoogle (String name, String key){

        findByNameSendKeyAndClikcEnter(name, key);
    }
    public String showTemperature(){

        return id("wob_tm").getText();
    }

    public void displayTemperature(String alert){
        try {
            jsAlert(alert);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public WebElement sendText(){
        return id("source");
    }

    public WebElement getText(){

        return cssSelector(".tlid-translation.translation");
    }

    public void js1(){
        javaScript();
    }
    public void js2(){
        javaScriptTwo();
    }



}


