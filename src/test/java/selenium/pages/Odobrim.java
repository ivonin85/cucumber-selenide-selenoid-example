package selenium.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.Methods;

public class Odobrim extends Methods {
    public Odobrim(WebDriver driver) {
        super(driver);
    }

    public void amount(String key) {
        id("amount").click();
        id("amount").sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), key);
    }

    public WebElement amount() {
        return id("amount");
    }

    public void time(String key) {
        id("period").click();
        id("period").sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), key);
    }

    public WebElement time() {
        return id("period");
    }

    public void choiceFree() {
        cssSelector("[class='sc-hqyNC ga_btn_podbor_credit LandingFormstyled__LandingFormButton-sc-1tfivmc-3 doHXgy']").click();
    }
}
