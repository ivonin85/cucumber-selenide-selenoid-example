package selenium.pages;

import org.openqa.selenium.*;
import selenium.Methods;

public class GoogleSearch extends Methods {

    public GoogleSearch(WebDriver driver) {

        super(driver);
    }

    public void weatherSearch(String key) {
        name("q").sendKeys(key);
        name("q").submit();
    }

    public String weatherResult() {
        return id("wob_tm").getText();

    }

    public void listOfTitles() {
        listByClassName("LC20lb");
        for (WebElement element : listByClassName("LC20lb"))
            System.out.println(element.getText());
    }

    public void showGoogle(String key) {
        name("q").sendKeys(key);
        name("q").submit();
    }

    public String showTemperature() {

        return id("wob_tm").getText();
    }

    public void displayTemperature(String alert) {
        try {
            javaScript("alert('" + alert + "');");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}


