package selenium.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.Methods;

public class Odobrim extends Methods {
    public Odobrim(WebDriver driver) {

        super(driver);
    }
    public WebElement selectAmount(String key){
        id("amount").sendKeys(Keys.CONTROL+"a");
        id("amount").sendKeys(key);
        return id("amount");
    }
    public WebElement selectAmount(){
        return id("amount");
    }
    public WebElement selectTime(String key){
        id("period").sendKeys(Keys.CONTROL+"a");
        id("period").sendKeys(key);
        return id("period");
    }
    public WebElement selectTime(){
        return id("period");
    }
    // если 0 то редактируем сумму, а если 1 то редактируем срок кредита
    public WebElement clickEdit(int num){
        return listByCssSelector("[d='M11.2922 1.1587L10.8184 1.63257L14.2539 5.06811L14.7278 4.59424L11.2922 1.1587Z']").get(num);
    }


}
